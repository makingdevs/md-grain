import java.nio.charset.Charset

def basePath = System.getenv("CATALINA_BASE") ?: "."

appender('ROLLING',RollingFileAppender) {
  encoder(PatternLayoutEncoder){
    charset = Charset.forName('UTF-8')
    pattern = '%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n'
  }
  rollingPolicy(TimeBasedRollingPolicy){
    FileNamePattern = "${basePath}/logs/md-grain.log"
  }
}

logger 'grails.app.controllers', DEBUG, ['ROLLING'], false
logger 'grails.app.services', DEBUG, ['ROLLING'], false
logger('org.springframework', WARN)
root(WARN, ['ROLLING'])

