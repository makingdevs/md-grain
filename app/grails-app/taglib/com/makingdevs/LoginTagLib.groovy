package com.makingdevs

import grails.plugin.springsecurity.SpringSecurityUtils
import org.springframework.security.core.context.SecurityContextHolder as SCH

class LoginTagLib {

  def authenticationTrustResolver

  def loginForm = { attrs, body ->

    def config = SpringSecurityUtils.securityConfig
    String postUrl = "${request.contextPath}${config.apf.filterProcessesUrl}"
    def rememberMe = authenticationTrustResolver.isRememberMe(SCH.context?.authentication)

    out << """
              <a href="#" class="top-sign-in">Ingresa</a>
              <div class='login-box'>
                <a class='close login-box-close' href='#'>&times;</a>
                <h4 class='login-box-head'>Accede a tu cuenta</h4>
                <form action='${postUrl}' method='POST' id='loginForm' autocomplete='off'>
                  <div class='control-group'>
                    <label>Correo</label>
                    <input type='text' class='span3' name='username' id='username' placeholder='me@me.com'/>
                  </div>
                  <div class='control-group'>
                    <label>Contraseña</label>
                    <input type='password' class='span3' name='password' id='password' placeholder='Contraseña...'/>
                  </div>
                  <div class='control-group'>
                    <div class="controls">
                      <label class="checkbox">
                        <input type='checkbox' name='${config.rememberMe.parameter}' id='remember_me' ${rememberMe ? 'checked="checked"' : '' } />
                        Recordarme
                      </label>
                      <label>
                        ${g.link([controller:'forgot',action:'index']){'¿Olvidaste tu contraseña?'}}
                      </label>
                    </div>
                  </div>
                  <div class='login-actions'>
                    <input type='submit' id="submit" class='btn btn-primary' value='Entrar'/>
                  </div>
                </form>
                ${g.render(template:'/gmailLogin/buttonGmail')}
                <br/>
                ${facebookAuth.connect(permissions:'email,user_about_me')}
                <br/>
                <a href='${createLink(controller:'twitterLogin')}' class='btn btn-primary btn-sm'><i class='icon-twitter'></i> twitter</a>
                <a href='${createLink(controller:'githubLogin')}' class='btn btn-default btn-sm'><i class='icon-github'></i> github</a>
              </div>

    """
  }
}
