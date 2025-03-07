package com.org.springBootDemo;

import org.apache.catalina.Server;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;


public class LogDemo {
    private final static Log log  = LogFactory.getLog(LogDemo.class);

    public static void temp(){
        log.warn("Warning log new");
        log.error("ERROR log new");
    }
}
