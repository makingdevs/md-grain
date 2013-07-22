import com.makingdevs.Course
import com.makingdevs.Category

class BootStrap {

  def init = { servletContext ->
   if(!Category.count()) {
     def category1 = new Category(name:"Experto en Springframework").save(flush:true)
     def category2 = new Category(name:"Técnicas y métodos ágiles").save(flush:true)
     def category3 = new Category(name:"Artesanía de software").save(flush:true)
     def category4 = new Category(name:"El ecosistema Groovy").save(flush:true)
     def category5 = new Category(name:"Desarrollo web con Javascript").save(flush:true)
     def category6 = new Category(name:"Desarrollo con Scala").save(flush:true)

     def course1 = new Course(name:'Diseño de aplicaciones con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-ESSENTIALS') 
     def course2 = new Course(name:'Acceso a datos con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-DATA_ACCESS') 
     def course3 = new Course(name:'Desarrollo web con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-WEB') 
     def course4 = new Course(name:'JEE e integración con Springframework', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-JEE') 
     def course5 = new Course(name:'El lenguaje dinámico Groovy', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GROOVY') 
     def course6 = new Course(name:'Productividad con Groovy', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GROOVY-INTERMEDIATE') 
     def course7 = new Course(name:'Desarrollo de aplicaciones con Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS') 
     def course8 = new Course(name:'Productividad con Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS-INTERMEDIATE') 
     def course9 = new Course(name:'Construyendo software con Gradle', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRADLE') 
     def course10 = new Course(name:'Técnicas y métodos de integración continua', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-CI') 
     def course11 = new Course(name:'Diseñando software con TDD y ATDD', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-TDDATDD') 
     def course12 = new Course(name:'Testing de aplicaciones', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-TESTING') 
     def course13 = new Course(name:'Procesamiento con Spring Batch', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-BATCH') 
     def course14 = new Course(name:'Seguridad en aplicaciones Java con Spring Security', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SPRING-SECURITY') 
     def course15 = new Course(name:'Principios ágiles para desarrolladores de software', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-ESSENTIALS') 
     def course16 = new Course(name:'Programación funcional aplicada', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'AGILE-FP')
     def course17 = new Course(name:'Modularización y plugins en Grails', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'GRAILS-PLUGINS')
     def course18 = new Course(name:'Desarrollo web con jQuery', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-JQUERY')
     def course19 = new Course(name:'Desarrollo de Single Page Applications', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-BACKBONE')
     def course20 = new Course(name:'CoffeeScript en aplicaciones web', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'JAVASCRIPT-COFFEESCRIPT')
     def course21 = new Course(name:'Fundamentos del lenguaje Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-ESSENTIAL')
     def course22 = new Course(name:'Programación avanzada con Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-ESSENTIAL')
     def course23 = new Course(name:'Desarrollo web con Scala', overview:'overview',audience:'audience',prerequisites:'prerequisites',goal:'goal',courseKey:'SCALA-WEB')

   }
  }
  def destroy = {
  }
}
