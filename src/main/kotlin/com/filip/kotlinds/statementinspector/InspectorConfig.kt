package com.filip.kotlinds.statementinspector

import org.hibernate.cfg.AvailableSettings
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InspectorConfig {

    @Bean
    fun hibernateCustomizer(
        customStatementInspector: CustomStatementInspector
    ): HibernatePropertiesCustomizer {
        return HibernatePropertiesCustomizer { hibernateProperties ->
            hibernateProperties[AvailableSettings.STATEMENT_INSPECTOR] = customStatementInspector
        }
    }
}