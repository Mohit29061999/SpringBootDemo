package com.org.springBootDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Config {

    public  ConfigTestClass configTestClass;

    public ConfigTestClass getConfigTestClass() {
        return configTestClass;
    }

    @Autowired
    public void setConfigTestClass(ConfigTestClass configTestClass) {
        this.configTestClass = configTestClass;
    }




    //    @Bean
//    public ConfigTestClass getConfigClass(){
//        return new ConfigTestClass("temp");
//    }
}
