package com.tweets.consumer;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TweetPersistedEventConsumer {

	@KafkaListener(topics = "tweets.persisted")
	public void listen(List<ConsumerRecord<String, String>> recordsList) {
		
	}
}
