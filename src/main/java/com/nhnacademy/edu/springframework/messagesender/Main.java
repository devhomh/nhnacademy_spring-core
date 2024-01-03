package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("jinwoo7654@naver.com", "010-2722-4734");
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework")){
            MessageSendService service = context.getBean("messageService", MessageSendService.class);
            service.doSendMessage(user, "hello");
        }
    }
}
