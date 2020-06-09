package cn.hacz.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The class/interface
 *
 * @author guodd
 * @version 1.0 use jdk 1.8
 */
public class KafkaConsumerTest {
    // kafka地址
    final String single = "s10:9092";
    final String list = "s10:9092,s10:9093,s10:9094";
    // 主题
    final String topic = "test";
    // 属性配置
    Properties properties;
    // 监听
    AtomicBoolean isRunning = new AtomicBoolean(true);

    @Before
    public void before() {
        // 配置四个必填参数
        properties = new Properties();
        // broker服务清单
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, list);
        // 消费者隶属的消费组的名称，默认值为""
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "group.id");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG, "producer.client.id.test");
        // 序列化，生产者使用的是StringSerializer序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
    }

    @Test
    public void consumerInfo() {
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        List<PartitionInfo> partitionInfos = consumer.partitionsFor(topic);
        for (PartitionInfo partitionInfo : partitionInfos) {
            System.out.println(Arrays.toString(partitionInfo.replicas()) + "，" + partitionInfo.partition());
        }
        consumer.close();
    }

    /**
     * 消费者
     */
    @Test
    public void consumer() {
        // 配置消费者客户端参数及创建相应的消费者实例。
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        // 订阅主题
        consumer.subscribe(Collections.singletonList(topic));
        // 开始消费的分区
        // consumer.beginningOffsets(Collections.singletonList(new TopicPartition(topic, 1)));
        Map<TopicPartition, Long> timestampsToSearch = new HashMap<>();
        timestampsToSearch.put(new TopicPartition(topic, 0), 100000000L);
        consumer.offsetsForTimes(timestampsToSearch);
        // 可以指定消费的分区
        // consumer.assign(Collections.singletonList(new TopicPartition(topic, 1)));
        // 消费主题
        while (isRunning.get()) {
            ConsumerRecords<String, String> poll = consumer.poll(Duration.ofMillis(1000));
            for (ConsumerRecord<String, String> record : poll) {
                System.out.println(record.topic() + "," + record.value());
            }
            // 提交消费位移
            // consumer.commitAsync();
            // OffsetAndMetadata committed = consumer.committed(new TopicPartition("", 1));
        }
        // 关闭实例
        consumer.close();
    }
}
