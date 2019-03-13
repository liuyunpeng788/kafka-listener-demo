package com.fosun.stargazer.kafka.listendemo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author <a href="mailto:liumch@fosun.com">刘梦超</a>
 * @date 2019/3/13 15:49
 * @description: TODO
 * @modified: TODO
 * @version: 1.0
 **/

@Slf4j
@Component
public class ConsumerService {
    @KafkaListener(topics = "max_test")
    public void readMsg(ConsumerRecord record, Acknowledgment ack) {
        int partition = record.partition();
        long offset = record.offset();
        String str = record.value().toString();
        System.out.println(String.format("partition: %d , offset: %d , value: %s", partition, offset, str));

        log.info("start commit offset");
        ack.acknowledge();//手动提交偏移量
        log.info("stop commit offset");
    }
}
