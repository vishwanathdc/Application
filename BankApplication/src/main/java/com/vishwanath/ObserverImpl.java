package com.vishwanath;

import org.springframework.stereotype.Component;

@Component
public class ObserverImpl implements Observer {
    private String notification;

    @Override
    public void update(String title) {
        System.out.println("this is a SMS notification");
        System.out.println( "you have " + title);
    }
}
