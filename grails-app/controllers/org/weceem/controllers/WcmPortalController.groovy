package org.weceem.controllers

import org.springframework.security.access.annotation.Secured

/**
 * @author Sergei Shushkevich
 */
class WcmPortalController {

    static defaultAction = 'content'

    @Secured(['ROLE_ADMIN'])
    def content() {
        redirect(controller:'wcmRepository', action:'treeTable')
    }
    
    def design = {
        render(view: 'design', plugin:'weceem')
    }

    def administration = {
        render(view: 'administration', plugin:'weceem')
    }
    
    def comingsoon = {
        render(view: 'comingsoon', plugin:'weceem')
    }
    
    def licenses = {
        render(view: 'licenses', plugin:'weceem')
    }
}