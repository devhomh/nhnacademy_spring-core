package com.nhnacademy.edu.springframework.messagesender.message;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender{
    public EmailMessageSender() {
        System.out.println("EmailMsg Initiated");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
    }
}
