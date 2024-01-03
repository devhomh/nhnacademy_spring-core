package com.nhnacademy.edu.springframework.messagesender.message;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    public SmsMessageSender() {
        System.out.println("SmsMsg Initiated");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
