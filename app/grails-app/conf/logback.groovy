import java.nio.charset.Charset

def basePath = System.getenv("CATALINA_BASE") ?: "."

appender('FILE',FileAppender) {
  file = "${basePath}/logs/md-grain.log"
  append = true
  encoder(PatternLayoutEncoder){
    charset = Charset.forName('UTF-8')
    pattern = '%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n'
  }
}

logger 'grails.app.controllers', DEBUG, ['FILE'], false
logger 'grails.app.services', DEBUG, ['FILE'], false
logger('org.springframework', WARN)
root(WARN, ['FILE'])

