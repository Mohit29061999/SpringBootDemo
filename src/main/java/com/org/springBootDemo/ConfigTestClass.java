package com.org.springBootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigTestClass {


   public  String name;


    public ConfigTestClass(@Value("${name}") String name ) {
    this.name = name;
    }
}
