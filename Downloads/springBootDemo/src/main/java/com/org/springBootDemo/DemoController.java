package com.org.springBootDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
public class DemoController {
    private final static Log log  = LogFactory.getLog(DemoController.class);

    @Autowired
    private DemoService demoService;

    @Autowired
    @Qualifier("personServiceImpl")
    private PersonService personService;

    @Autowired
    private ConfigTestClass configTestClass;

    @GetMapping("/demo") //path
    public String getDemo(){
        return "demo";
    }

    @GetMapping("/dynamic-content") //path
    public ModelAndView getDynamicContent(){
        log.info(personService.getPersonList().get(0).getName());
        return demoService.demo();

    }

    @GetMapping("/test")
    public boolean isMapperThere(){
      //  System.out.println(configTestClass.name);
        return true;
    }

}
