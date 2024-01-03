package com.nhnacademy.edu.springframework.messagesender.message;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {
    void sendMessage(User user, String message);
}
