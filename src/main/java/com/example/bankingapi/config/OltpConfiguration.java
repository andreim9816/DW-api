package com.example.bankingapi.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "oltpEntityManagerFactory",
        transactionManagerRef = "oltpTransactionManager",
        basePackages = {
                "com.example.bankingapi.repository.oltp"
        }
)
public class OltpConfiguration {

    @Primary
    @Bean(name = "oltpDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource oltpDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "oltpEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("oltpDataSource") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.hbm2ddl.auto", "update");

        return builder
                .dataSource(dataSource)
                .packages("com.example.bankingapi.domain.oltp")
                .persistenceUnit("oltp")
                .properties(properties)
                .build();
    }

    @Primary
    @Bean(name = "oltpTransactionManager")
    public PlatformTransactionManager oltpTransactionManager(
            @Qualifier("oltpEntityManagerFactory") EntityManagerFactory oltpEntityManagerFactory) {
        return new JpaTransactionManager(oltpEntityManagerFactory);
    }

}
