package org.example.loosely_coupled.services;

public class MessengerMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Messenger: " + message);
    }
}
