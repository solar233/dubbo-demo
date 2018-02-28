package org.study.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.service.TestService;

public class Consumer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        System.out.println("consumer");
        TestService testService = context.getBean(TestService.class);
        System.out.println(testService.say());
    }

}
