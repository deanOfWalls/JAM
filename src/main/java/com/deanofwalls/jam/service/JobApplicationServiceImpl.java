package com.deanofwalls.jam.service;

public class JobApplicationServiceImpl {

    public String helloWorld() {
        String hello =  "Hello world";
        return hello;
    }

    public String goodbyeWorld() {
        String goodbye = "Goodbye world";
        return goodbye;
    }

    public String welcome(String name) {
        String welcome = "Welcome, " + name;
        return welcome;
    }
}
