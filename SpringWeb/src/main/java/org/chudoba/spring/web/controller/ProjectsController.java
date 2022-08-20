package org.chudoba.spring.web.controller;


import org.chudoba.spring.web.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ProjectsController {

    private static Logger logger = Logger.getLogger(ProjectsController.class.getName());
    private EmailService emailService;

    public ProjectsController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/projects")
    public String getMailmePage() {
        logger.log(Level.INFO, this.getClass().getName() + " GET controller called");
        return "projects";
    }
    /* Not needed for projects yet
    @PostMapping("/projects")
    public String sendEmail(ModelMap model, String emailAddress, String emailText){
        emailService.sendEmail(emailAddress, emailText);
        return "redirect:/";
    }
    */
}
