package com.deng.springbootrabbitmq.sercice;

import com.deng.springbootrabbitmq.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "atguigu.news")
    public void Listener(Book book) {
        System.out.print("监测到了一个消息" + book);
    }

}
