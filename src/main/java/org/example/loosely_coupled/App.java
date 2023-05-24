package org.example.loosely_coupled;

import org.example.loosely_coupled.services.MessageService;

public class App {

    public static void main(String[] args) {

        // Usage of a factory class here is facilitating the "loose coupling"
        MessageServiceFactory messageServiceFactory = new MessageServiceFactory();
        MessageService messageService = messageServiceFactory.getMessageService("messenger");
        messageService.sendMessage("Hey Saiyans!");
    }
}