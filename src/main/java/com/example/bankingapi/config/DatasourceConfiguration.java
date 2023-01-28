//package com.example.bankingapi.config;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DatasourceConfiguration {
//
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties oltpDatasourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @ConfigurationProperties("spring.datasource.warehouse")
//    public DataSourceProperties warehouseDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @Primary
//    public DataSource oltpDataSource() {
//        return oltpDatasourceProperties()
//                .initializeDataSourceBuilder()
//                .build();
//    }
//
//    @Bean
//    public DataSource warehouseDataSource() {
//        return warehouseDataSourceProperties()
//                .initializeDataSourceBuilder()
//                .build();
//    }
//}
