package org.example.learnSpring.services;

import org.springframework.stereotype.Component;

@Component // to mark this class as a candidate for "auto-detection" by Spring
public class TextMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }
}
