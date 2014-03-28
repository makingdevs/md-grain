import grails.util.Environment

grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

//grails.plugin.location.questionable='../../questionable'
//grails.project.war.file = "target/${appName}-${appVersion}.war"

//grails.plugin.location.'Payable' = "../../Payable"

grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven" // or ivy

grails.project.dependency.resolution = {
  // inherit Grails' default dependencies
  inherits("global") {
    // specify dependency exclusions here; for example, uncomment this to disable ehcache:
    // excludes 'ehcache'
  }
  log "error" 
  checksums true 
  legacyResolve false 

  repositories {
    inherits true

    grailsPlugins()
    grailsHome()
    grailsCentral()

    mavenLocal()
    mavenCentral()
    mavenRepo "http://makingdevs.com:8081/nexus/content/repositories/thirdparty"

  }

  dependencies {
    compile 'mysql:mysql-connector-java:5.1.22'
  }

  plugins {
    compile ":scaffolding:2.0.1"
    compile ":hibernate:3.6.10.4" // or ":hibernate4:4.1.11.4"
    compile ":jquery:1.10.2.2"
    compile ":resources:1.2"
    compile ":cache-headers:1.1.5"
    compile ":lesscss-resources:1.3.3"
    compile ':spring-security-core:1.2.7.3'
    compile ":google-analytics-tracker:0.1"
    if(Environment.current == Environment.PRODUCTION){
      compile ":zipped-resources:1.0"
      compile ":cached-resources:1.0"
      //compile ":yui-minify-resources:0.1.5"  
    }

    build ":tomcat:7.0.47"
    compile ":grails-melody:1.48.0"
    compile ":database-migration:1.3.8"
    compile ':cache:1.1.1'
    compile ":mail:1.0.1"
    compile 'com.makingdevs:profile:0.1.6'
    compile 'com.payable:payable:0.2.17'
    compile ':questionable:0.1.7'
    compile ":avatar:0.6.3"

  }
}
