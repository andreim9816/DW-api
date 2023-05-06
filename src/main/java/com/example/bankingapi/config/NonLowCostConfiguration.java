package com.example.bankingapi.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        entityManagerFactoryRef = "nonlowcostEntityManagerFactory",
        transactionManagerRef = "nonlowcostTransactionManager",
        basePackages = {
                "com.example.bankingapi.repository.nonlowcost"
        }
)
public class NonLowCostConfiguration {

    @Bean(name = "nonlowcostDataSource")
    @ConfigurationProperties(prefix = "nonlowcost.datasource")
    public DataSource nonlowcostDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "nonlowcostEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("nonlowcostDataSource") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.hbm2ddl.auto", "update");

        return builder
                .dataSource(dataSource)
                .packages("com.example.bankingapi.domain")
                .persistenceUnit("nonlowcost")
                .properties(properties)
                .build();
    }

    @Bean(name = "nonlowcostTransactionManager")
    public PlatformTransactionManager nonlowcostTransactionManager(
            @Qualifier("nonlowcostEntityManagerFactory") EntityManagerFactory customerEntityManagerFactory) {
        return new JpaTransactionManager(customerEntityManagerFactory);
    }

}
