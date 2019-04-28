package com.deng.springbootrabbitmq.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MessageConverter messageConverter() {
        System.out.print("这是自定义的一个消息转换器");
        return new Jackson2JsonMessageConverter();
    }

}
