package com.filip.kotlinds.statementinspector

import org.hibernate.resource.jdbc.spi.StatementInspector
import org.springframework.stereotype.Component

@Component
class CustomStatementInspector: StatementInspector {
    override fun inspect(sql: String?): String {
        println(sql)
        return sql ?: ""
    }
}