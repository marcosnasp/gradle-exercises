package com.example.multiproject.gradle.client;

import com.example.multiproject.gradle.core.MessageService;
import org.apache.log4j.Logger;

public class HelloWord {

    public static final Logger LOGGER = Logger.getLogger(HelloWord.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        System.out.println(messageService.getMessage());
    }
}
