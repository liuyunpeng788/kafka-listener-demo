package com.fosun.stargazer.kafka.listendemo;

import com.fosun.stargazer.kafka.listendemo.service.ConsumerService;
import com.fosun.stargazer.kafka.listendemo.service.ProduceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="mailto:liumch@fosun.com">刘梦超</a>
 * @date 2019/3/13 15:47
 * @description: 生产者测试
 * @modified: TODO
 * @version: 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {
    @Autowired
    ProduceService produceService;

    @Autowired
    ConsumerService consumerService;

    @Test
    public void sendMsg(){
        produceService.produceMsg();
    }


}
