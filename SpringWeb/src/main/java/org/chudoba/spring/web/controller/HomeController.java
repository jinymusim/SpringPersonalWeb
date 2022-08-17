package org.chudoba.spring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class HomeController {
    private static Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String getHomePage(){
        logger.log(Level.INFO, this.getClass().getName() + " GET controller called");
        return "index";
    }
}
