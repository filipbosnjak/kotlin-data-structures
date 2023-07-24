package com.filip.kotlinds.transactionsdemo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource


@Configuration
@EnableTransactionManagement
class TransactionConfig {

    @Bean
    fun transactionManager(
        dataSource: DataSource
    ): PlatformTransactionManager? {
        return DataSourceTransactionManager(dataSource)
    }
}
