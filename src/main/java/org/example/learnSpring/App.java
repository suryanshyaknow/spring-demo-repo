package org.example.learnSpring;

import org.example.learnSpring.services.MessageService;
import org.example.learnSpring.services.TelegramMessageService;
import org.example.learnSpring.services.TextMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        /*
         * This class needs the `TextMessageService` object.
         *
         * Since we intend to employ IoC through and through Spring here,
         * we just can't simply afford to create its object manually.
         *
         * Rather, we'll be giving control to the Spring.
         */

        // Injecting the dependency
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example.learnSpring");
        MessageService messageService = (TextMessageService) applicationContext.getBean("textMessageService");
        messageService.sendMessage("Hey, Saiyans!");

        MessageService telegramMessageService = (TelegramMessageService) applicationContext.getBean("telegramMessageService");
        telegramMessageService.sendMessage("Hey, y'all!");


    }
}
