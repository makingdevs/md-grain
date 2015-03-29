package com.makingdevs



import grails.test.mixin.*
import spock.lang.*

@TestFor(CourseSessionController)
@Mock(CourseSession)
class CourseSessionControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.courseSessionInstanceList
            model.courseSessionInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.courseSessionInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def courseSession = new CourseSession()
            courseSession.validate()
            controller.save(courseSession)

        then:"The create view is rendered again with the correct model"
            model.courseSessionInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            courseSession = new CourseSession(params)

            controller.save(courseSession)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/courseSession/show/1'
            controller.flash.message != null
            CourseSession.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def courseSession = new CourseSession(params)
            controller.show(courseSession)

        then:"A model is populated containing the domain instance"
            model.courseSessionInstance == courseSession
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def courseSession = new CourseSession(params)
            controller.edit(courseSession)

        then:"A model is populated containing the domain instance"
            model.courseSessionInstance == courseSession
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/courseSession/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def courseSession = new CourseSession()
            courseSession.validate()
            controller.update(courseSession)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.courseSessionInstance == courseSession

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            courseSession = new CourseSession(params).save(flush: true)
            controller.update(courseSession)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/courseSession/show/$courseSession.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/courseSession/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def courseSession = new CourseSession(params).save(flush: true)

        then:"It exists"
            CourseSession.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(courseSession)

        then:"The instance is deleted"
            CourseSession.count() == 0
            response.redirectedUrl == '/courseSession/index'
            flash.message != null
    }
}
