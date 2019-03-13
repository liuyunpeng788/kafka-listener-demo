package com.fosun.stargazer.kafka.listendemo.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:liumch@fosun.com">刘梦超</a>
 * @date 2019/3/13 15:37
 * @description: TODO
 * @modified: TODO
 * @version: 1.0
 **/
@Service
public class ProduceService {
    @Autowired
    KafkaTemplate<String,String > kafkaTemplate;

    public void produceMsg(){
        for (int i = 0 ;i<100;i++){
            kafkaTemplate.sendDefault("i:" + i + " 我爱你，我的祖国");
        }
        kafkaTemplate.flush();
    }
}
