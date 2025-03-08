package com.tweets.consumer;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.tweets.datamodel.Tweet;
import com.tweets.elasticsearch.entities.ESTweet;
import com.tweets.elasticsearch.repository.ESTweetsRepository;
import com.tweets.util.GsonUtils;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TweetPersistedEventConsumer {

	@Autowired
	private ESTweetsRepository esTweetsRepo;

	@KafkaListener(topics = "tweets.persisted")
	public void listen(List<ConsumerRecord<String, String>> recordsList) {
		List<ESTweet> esTweetsList = recordsList.stream().map(record -> {
			Tweet tweet = GsonUtils.getGson().fromJson(record.value(), Tweet.class);
			return tweet.toESTweet();
		}).collect(Collectors.toList());
		esTweetsRepo.saveAll(esTweetsList)
				.forEach(savedTweet -> log.info("Saved tweet to elasticsearch. Tweet _id {}, tweet {}",
						savedTweet.getId(), GsonUtils.getGson().toJson(savedTweet)));
	}
}
