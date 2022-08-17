package org.chudoba.spring.web.controller;


import lombok.extern.java.Log;
import org.chudoba.spring.web.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MailmeController {

    private static Logger logger = Logger.getLogger(MailmeController.class.getName());
    private EmailService emailService;

    public MailmeController(EmailService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/mailme")
    public String getMailmePage() {
        logger.log(Level.INFO, this.getClass().getName() + " GET controller called");
        return "mailme";
    }

    @PostMapping("/mailme")
    public String sendEmail(ModelMap model, String emailAddress, String emailText){
        emailService.sendEmail(emailAddress, emailText);
        return "redirect:/";
    }
}
