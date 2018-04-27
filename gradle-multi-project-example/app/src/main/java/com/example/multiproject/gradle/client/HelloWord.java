package com.example.multiproject.gradle.client;

import com.example.multiproject.gradle.core.MessageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWord {

    private static final Logger LOGGER = LogManager.getLogger(HelloWord.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        LOGGER.info(messageService.getMessage());
    }
}
