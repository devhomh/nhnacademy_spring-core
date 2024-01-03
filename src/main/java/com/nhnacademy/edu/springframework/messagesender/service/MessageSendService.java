package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@SMS MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }
}
