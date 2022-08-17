package org.chudoba.spring.web.service;


import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class EmailService {
    private static Logger logger = Logger.getLogger(EmailService.class.getName());

    public void sendEmail(String emailAddress, String emailText){
        logger.log(Level.INFO, "Request to send email received");
    }
}
