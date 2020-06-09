package cn.hacz.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class KafkaProducerTest {
    // kafka地址
    final String single = "s10:9092";
    final String list = "s10:9092,s10:9093,s10:9094";
    // 主题
    final String topic = "test";
    // 属性配置
    Properties properties;

    @Before
    public void before() {
        properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, list);
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "producer.client.id.test");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
    }

    /**
     * 进行数据的生产
     */
    @Test
    public void producer() {
        // 配置生产者客户端参数及创建相应的生产者实例。
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        // 构建待发送的消息。
        ProducerRecord<String, String> topicInfo = new ProducerRecord<>(topic, "生活你好，消息队列");
        // 发消息
        producer.send(topicInfo);
        // 关闭
        producer.close();
    }
}
