package com.makingdevs

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CourseSessionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CourseSession.list(params), model:[courseSessionInstanceCount: CourseSession.count()]
    }

    def show(CourseSession courseSessionInstance) {
        respond courseSessionInstance
    }

    def create() {
        respond new CourseSession(params)
    }

    @Transactional
    def save(CourseSession courseSessionInstance) {
        if (courseSessionInstance == null) {
            notFound()
            return
        }

        if (courseSessionInstance.hasErrors()) {
            respond courseSessionInstance.errors, view:'create'
            return
        }

        courseSessionInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'courseSessionInstance.label', default: 'CourseSession'), courseSessionInstance.id])
                redirect courseSessionInstance
            }
            '*' { respond courseSessionInstance, [status: CREATED] }
        }
    }

    def edit(CourseSession courseSessionInstance) {
        respond courseSessionInstance
    }

    @Transactional
    def update(CourseSession courseSessionInstance) {
        if (courseSessionInstance == null) {
            notFound()
            return
        }

        if (courseSessionInstance.hasErrors()) {
            respond courseSessionInstance.errors, view:'edit'
            return
        }

        courseSessionInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CourseSession.label', default: 'CourseSession'), courseSessionInstance.id])
                redirect courseSessionInstance
            }
            '*'{ respond courseSessionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CourseSession courseSessionInstance) {

        if (courseSessionInstance == null) {
            notFound()
            return
        }

        courseSessionInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CourseSession.label', default: 'CourseSession'), courseSessionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseSessionInstance.label', default: 'CourseSession'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
