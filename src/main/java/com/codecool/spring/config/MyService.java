package com.codecool.spring.config;

public class MyService {

    private final DBClass db;

    public MyService(DBClass db) {
        this.db = db;
    }

    public String serve() {
        System.out.println("Starting to serve.");
        String result = db.doSomeWork();
        System.out.println("Finishing to serve.");
        return result;
    }
}
