package com.cb.dubbo.demo.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
 
@ImportResource("classpath:consumer.xml")
@SpringBootApplication
public class ConsumerApp {
    public static void main( String[] args )
    {
    	SpringApplication.run(ConsumerApp.class, args);
        System.out.println( "消费者调用服务成功!" );
    }
}