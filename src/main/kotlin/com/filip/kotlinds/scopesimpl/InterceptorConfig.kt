package com.filip.kotlinds.scopesimpl

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


/**
 * Register REST requests interceptor
 */
@Configuration
class InterceptorConfig(
    private val scopeCheckInterceptor: ScopeCheckInterceptor
): WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(scopeCheckInterceptor)
        super.addInterceptors(registry)
    }
}