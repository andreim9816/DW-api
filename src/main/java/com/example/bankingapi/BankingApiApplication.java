package com.example.bankingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {"com.example.bankingapi.domain"})
public class BankingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingApiApplication.class, args);
    }

}
