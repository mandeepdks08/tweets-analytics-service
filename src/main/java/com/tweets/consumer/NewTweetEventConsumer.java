package com.tweets.consumer;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NewTweetEventConsumer {
	
	@KafkaListener(topics = "tweets.to-persist")
	private void listen(List<ConsumerRecord<String, String>> recordsList) {
		
	}
}
