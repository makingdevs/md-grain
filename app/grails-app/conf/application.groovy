// grails.plugin.databasemigration.updateOnStart = true
// grails.plugin.databasemigration.updateOnStartFileNames = ['changelog.groovy']

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.makingdevs.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.makingdevs.UserRole'
grails.plugin.springsecurity.authority.className = 'com.makingdevs.Role'

//grails.plugin.springsecurity.securityConfigType = "Requestmap"
//grails.plugin.springsecurity.requestMap.className = 'com.makingdevs.Requestmap'
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = false


grails.plugin.springsecurity.controllerAnnotations.staticRules = [
  [pattern: '/',               access: ['permitAll']],
  [pattern: '/error',          access: ['permitAll']],
  [pattern: '/index',          access: ['permitAll']],
  [pattern: '/index.gsp',      access: ['permitAll']],
  [pattern: '/shutdown',       access: ['permitAll']],
  [pattern: '/assets/**',      access: ['permitAll']],
  [pattern: '/**/js/**',       access: ['permitAll']],
  [pattern: '/**/css/**',      access: ['permitAll']],
  [pattern: '/**/images/**',   access: ['permitAll']],
  [pattern: '/**/favicon.ico', access: ['permitAll']]
]
