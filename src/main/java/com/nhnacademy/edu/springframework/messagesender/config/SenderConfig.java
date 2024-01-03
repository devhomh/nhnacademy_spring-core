package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.message.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.message.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {
    @Bean
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }
}
