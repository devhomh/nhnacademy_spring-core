package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }
}
