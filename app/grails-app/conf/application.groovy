grails.views.default.codec = "html"
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
grails.plugin.databasemigration.updateOnStart = true
grails.plugin.databasemigration.updateOnStartFileNames = ['changelog.groovy']
// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.makingdevs.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.makingdevs.UserRole'
grails.plugin.springsecurity.authority.className = 'com.makingdevs.Role'

grails.plugin.springsecurity.securityConfigType = "Requestmap"
grails.plugin.springsecurity.requestMap.className = 'com.makingdevs.Requestmap'

grails.plugin.springsecurity.facebook.domain.classname='com.makingdevs.FacebookUser'
grails.plugin.springsecurity.facebook.filter.type='redirect'
grails.plugin.springsecurity.facebook.facebook.permissions='email'
grails.plugin.springsecurity.password.algorithm = 'SHA-256'
grails.logging.jul.usebridge = true
grails.plugin.springsecurity.debug.useFilter = true
