package com.rwto.designpattern.creational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author renmw
 * @create 2023/11/7 10:11
 **/
@SpringBootTest
public class BuilderTest {

    @Test
    public void builderTest(){
        RabbitMQClient client = new RabbitMQClient.Builder()
                .setHost("192.168.11.111")
                .setMode(1)
                .setPort(5672)
                .setQueue("queue-test")
                .build();

        client.sendMsg("this is test");
    }

    /**
     * lombok @Builder 注解使用
     */
    @Test
    public void builder2Test(){
        RabbitMQClient2 client = RabbitMQClient2.builder()
                .host("192.168.11.111")
                .mode(1)
                .port(5672)
                .queue("queue-test")
                .build();

        client.sendMsg("this is test");
    }

}
