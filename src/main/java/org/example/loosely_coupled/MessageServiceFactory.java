package org.example.loosely_coupled;

import org.example.loosely_coupled.services.MessageService;
import org.example.loosely_coupled.services.MessengerMessageService;
import org.example.loosely_coupled.services.TextMessageService;

public class MessageServiceFactory {

    public MessageService getMessageService(String serviceType) {

        if (serviceType.equals("text")) {
            return new TextMessageService();
        } else if (serviceType.equals("messenger")) {
            return new MessengerMessageService();
        } else {
            throw new RuntimeException("No such message service exists!");
        }
    }
}
