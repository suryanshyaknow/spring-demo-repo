package org.example.loosely_coupled.services;

public class TextMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }
}
