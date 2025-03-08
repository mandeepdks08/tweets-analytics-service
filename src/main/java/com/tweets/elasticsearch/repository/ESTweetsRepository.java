package com.tweets.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.tweets.elasticsearch.entities.ESTweet;

public interface ESTweetsRepository extends ElasticsearchRepository<ESTweet, String> {

}
