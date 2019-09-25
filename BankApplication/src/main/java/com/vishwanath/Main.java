package com.vishwanath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("bank application");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
        BankAccount bankAccount = (BankAccount) context.getBean(BankAccount.class);
        ShowMenu showMenu = context.getBean(ShowMenu.class);
        showMenu.Menu();
    }
}
