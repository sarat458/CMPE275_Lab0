package com.cmpe275.lab0;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class HelloWorld implements Greeter{
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGreeting(){
        return "Hello World from "+name+"!";
    }
}
