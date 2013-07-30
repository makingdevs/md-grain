import com.makingdevs.Course
import com.makingdevs.Category
package com.makingdevs.Role

class BootStrap {

  def init = { servletContext ->
    createCategoriesAndCourses()
    createRoles()

  }
  def destroy = {
  }

  private def createCategoriesAndCourses(){
    if(!Category.count()) {
      def category1 = new Category(name:"Experto en Springframework",description:"Encuentra todos los elementos necesarios para crear aplicaciones robustas y bien diseñadas en la plataforma Java usando la suite de herramientas de Springframework; aprende desde lo esencial hasta los subproyectos de Spring que te permitirán resolver prácticamente cualquier necesidad de negocio.").save(flush:true)
      def category2 = new Category(name:"Técnicas y métodos ágiles",description:"Aplica métodos que te permitan crear mejor software y funcionalidades que den satisfacción y valor a los usuarios. Crea elementos de comunicación y adquiere el conocimiento para ser disciplinado mientras desarrollas y a la vez transmites tus ideas.").save(flush:true)
      def category3 = new Category(name:"El ecosistema Groovy",description:"Diviertete usando un lenguaje dinñamico en la JVM, se más productivo y abre nuevos panoramas tecnológicos, aprovecha el conocimiento que tienes sobre la plataforma Java y se más expresivo en el código que desarrollas.").save(flush:true)
      def category4 = new Category(name:"Desarrollo web con Javascript",description:"Crea mejores experiencias de usuario, aprende a usar Javascript para muchas otras cosas más de las que pensabas. Usa herramientas que te faciliten crear interacciones útiles y mejoren la experiencia con la que los usuarios usan tus aplicaciones.").save(flush:true)
      def category5 = new Category(name:"Desarrollo con Scala",description:"Conoce otros paradigmas y combinalos, usa el poder de la JVM aplicando elementos de programación funcional, crea aplicaciones que sean escalables de forma natural.").save(flush:true)

      def course1 = new Course(name:'Diseño de aplicaciones con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-ESSENTIALS').save(flush:true) 
      def course2 = new Course(name:'Acceso a datos con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-DATA_ACCESS').save(flush:true) 
      def course3 = new Course(name:'Desarrollo web con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-WEB').save(flush:true) 
      def course4 = new Course(name:'JEE e integración con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-JEE').save(flush:true) 
      def course5 = new Course(name:'El lenguaje dinámico Groovy', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GROOVY').save(flush:true) 
      def course6 = new Course(name:'Productividad con Groovy', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GROOVY-INTERMEDIATE').save(flush:true) 
      def course7 = new Course(name:'Desarrollo de aplicaciones con Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS').save(flush:true) 
      def course8 = new Course(name:'Productividad con Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS-INTERMEDIATE').save(flush:true) 
      def course9 = new Course(name:'Construyendo software con Gradle', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRADLE').save(flush:true) 
      def course10 = new Course(name:'Técnicas y métodos de integración continua', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-CI').save(flush:true) 
      def course11 = new Course(name:'Diseñando software con TDD y ATDD', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-TDDATDD').save(flush:true) 
      def course12 = new Course(name:'Testing de aplicaciones', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-TESTING').save(flush:true) 
      def course13 = new Course(name:'Procesamiento con Spring Batch', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-BATCH').save(flush:true) 
      def course14 = new Course(name:'Seguridad en aplicaciones Java con Spring Security', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-SECURITY').save(flush:true) 
      def course15 = new Course(name:'Principios ágiles para desarrolladores de software', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-ESSENTIALS').save(flush:true) 
      def course16 = new Course(name:'Programación funcional aplicada', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-FP').save(flush:true)
      def course17 = new Course(name:'Modularización y plugins en Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS-PLUGINS').save(flush:true)
      def course18 = new Course(name:'Desarrollo web con jQuery', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-JQUERY').save(flush:true)
      def course19 = new Course(name:'Desarrollo de Single Page Applications', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-BACKBONE').save(flush:true)
      def course20 = new Course(name:'CoffeeScript en aplicaciones web', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-COFFEE').save(flush:true)
      def course21 = new Course(name:'Fundamentos del lenguaje Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-ESSENTIAL').save(flush:true)
      def course22 = new Course(name:'Programación avanzada con Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-INTERMEDIATE').save(flush:true)
      def course23 = new Course(name:'Desarrollo web con Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-WEB').save(flush:true)
      def course24 = new Course(name:'Aplicaciones web con Springframework y jQuery', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-WEBJQUERY').save(flush:true)
      category1.addToCourses(course1).addToCourses(course2).addToCourses(course3).addToCourses(course4).addToCourses(course13).addToCourses(course14).addToCourses(course24)
      category1.save(flush:true)
      category2.addToCourses(course10).addToCourses(course11).addToCourses(course12).addToCourses(course15).addToCourses(course16)
      category2.save(flush:true)
      category3.addToCourses(course5).addToCourses(course6).addToCourses(course7).addToCourses(course8).addToCourses(course9).addToCourses(course17)
      category3.save(flush:true)
      category4.addToCourses(course18).addToCourses(course19).addToCourses(course20).addToCourses(course24)
      category4.save(flush:true)
      category5.addToCourses(course21).addToCourses(course22).addToCourses(course23)
      category5.save(flush:true)
    }
  }

  def createRoles(){
    if(!Role.count()){
      new Role(authority:"ROLE_STUDENT").save(flush:true)
      new Role(authority:"ROLE_INSTRUCTOR").save(flush:true)
      new Role(authority:"ROLE_ADMINISTRATOR").save(flush:true)
    }
  }
}
