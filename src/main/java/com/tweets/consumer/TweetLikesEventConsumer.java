package com.tweets.consumer;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TweetLikesEventConsumer {
	
	@KafkaListener(topics = "tweets.likes")
	private void listen(List<ConsumerRecord<String, String>> recordsList) {
		
	}
}
