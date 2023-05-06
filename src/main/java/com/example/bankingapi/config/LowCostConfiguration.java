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
        entityManagerFactoryRef = "lowCostEntityManagerFactory",
        transactionManagerRef = "lowCostTransactionManager",
        basePackages = {
                "com.example.bankingapi.repository.lowcost"
        }
)
public class LowCostConfiguration {

    @Primary
    @Bean(name = "lowCostDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource lowCostDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "lowCostEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("lowCostDataSource") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.hbm2ddl.auto", "update");

        return builder
                .dataSource(dataSource)
                .packages("com.example.bankingapi.domain")
                .persistenceUnit("lowcost")
                .properties(properties)
                .build();
    }

    @Primary
    @Bean(name = "lowCostTransactionManager")
    public PlatformTransactionManager lowCostTransactionManager(
            @Qualifier("lowCostEntityManagerFactory") EntityManagerFactory lowCostEntityManagerFactory) {
        return new JpaTransactionManager(lowCostEntityManagerFactory);
    }

}
