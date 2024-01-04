package com.nhnacademy.edu.springframework.messagesender.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(void com.nhnacademy.edu.springframework.messagesender.message.MessageSender.sendMessage(..)))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable{
        StopWatch stopWatch = new StopWatch();

        try {
            stopWatch.start();

            return pjp.proceed();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
