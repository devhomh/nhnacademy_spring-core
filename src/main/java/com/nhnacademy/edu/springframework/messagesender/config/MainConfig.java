package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.message.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
    @Bean
    @SMS
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }
}
