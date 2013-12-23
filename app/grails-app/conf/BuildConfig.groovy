import grails.util.Environment

grails.servlet.version = "2.5"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

//grails.project.fork = [
//  run: [maxMemory:1024, minMemory:64, debug:false, maxPerm:256]
//]

//grails.plugin.location.'Payable' = "../../Payable"

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
    mavenRepo name: "MakingDevs", root: "http://makingdevs.com:8081/nexus/content/repositories/thirdparty"

  }

  dependencies {
    runtime 'mysql:mysql-connector-java:5.1.22'
    test("org.spockframework:spock-grails-support:0.7-groovy-2.0"){
      exclude 'hamcrest-core'
    }
  }

  plugins {
    runtime ":hibernate:$grailsVersion"
    runtime ":jquery:1.8.3"
    runtime ":resources:1.2"
    runtime ":cache-headers:1.1.5"
    compile ":lesscss-resources:1.3.3"
    compile ':spring-security-core:1.2.7.3'
    test(":spock:0.7") {
      exclude "spock-grails-support"
    }
    compile ":google-analytics-tracker:0.1"
    if(Environment.current == Environment.PRODUCTION){
      runtime ":zipped-resources:1.0"
      runtime ":cached-resources:1.0"
      runtime ":yui-minify-resources:0.1.5"  
    }

    build ":tomcat:$grailsVersion"
    runtime ":database-migration:1.3.6"
    compile ':cache:1.0.1'
    compile ":mail:1.0.1"
    compile 'com.makingdevs:profile:latest.integration'
    compile 'com.payable:payable:latest.integration'
  }
}
