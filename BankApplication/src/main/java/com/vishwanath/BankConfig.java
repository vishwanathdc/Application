package com.vishwanath;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.vishwanath")
@PropertySource("classpath:config/bank.properties")
public class BankConfig {
    @Value("${bank.interestRate}")
    private double interestRate;

    @Bean
    @interestRate
    public double interestRate(){
        return interestRate;
    }
}
