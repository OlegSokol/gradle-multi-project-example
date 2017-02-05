package com.gradleexample.client;

import com.gradleexample.core.MessageService;
import org.apache.log4j.Logger;

public class HelloWorld {
    private static final Logger LOG = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
        LOG.info("Received message - " + message);
    }
}
