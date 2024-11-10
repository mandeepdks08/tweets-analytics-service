package com.tweets.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TweetsAnalyticsConsumer {

	@KafkaListener(topics = "tweets")
	public void listen(String data) {
		
	}
}
