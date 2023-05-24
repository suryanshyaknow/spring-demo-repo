package org.example.learnSpring.services;

public class TelegramMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Telegram: " + message);
    }
}
