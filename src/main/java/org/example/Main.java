package org.example;

import org.example.services.TextMessageService;

public class Main {
    public static void main(String[] args) {

        TextMessageService textMessageService = new TextMessageService();
        textMessageService.sendMessage("Hey Saiyans!");
    }
}