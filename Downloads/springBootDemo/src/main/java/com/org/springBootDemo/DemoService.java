package com.org.springBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DemoService {



    public ModelAndView demo(){
        ModelAndView modelAndView = new ModelAndView("dynamic-content.html");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("mohit",1));
        modelAndView.getModelMap().put("personList",persons);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD mm:hh:ss");
        modelAndView.getModelMap().put("date",simpleDateFormat.format(new Date()));
        return modelAndView;
    }
}
