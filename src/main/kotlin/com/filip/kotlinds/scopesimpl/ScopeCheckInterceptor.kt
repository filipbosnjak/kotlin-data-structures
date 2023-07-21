package com.filip.kotlinds.scopesimpl

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.HandlerInterceptor


/**
 * Implement request interception
 */
@Component
class ScopeCheckInterceptor: HandlerInterceptor {

    private val logger: Logger = LoggerFactory.getLogger(ScopeCheckInterceptor::class.java)

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        logger.info(handler.toString()) // Logs: com.filip.kotlinds.scopesimpl.UserController#users()

        if (handler is HandlerMethod) {
            val scope = handler.getMethodAnnotation(RequiresScope::class.java)?.scope
            logger.info(scope?.scopeName)

            /**
             * Here we can have a service that is intercepting the request initially and sets
             * security context. There we can e.g. extract security scopes from JWT token and then check it here
             */
        }
        return super.preHandle(request, response, handler)
    }
}