package com.tweets.datamodel;

import java.time.LocalDateTime;
import java.util.List;

import com.tweets.elasticsearch.entities.ESTweet;

import lombok.Getter;

@Getter
public class Tweet {
	private Long id;
	private String tweet;
	private String userId;
	private List<String> mediaLinks;
	private String deviceIp;
	private String deviceType;
	private String geoCoordinates;
	private LocalDateTime createdOn;
	private LocalDateTime processedOn;

	public ESTweet toESTweet() {
		return ESTweet.builder().dbId(id).message(tweet).userId(userId).mediaLinks(mediaLinks).deviceIp(deviceIp)
				.deviceType(deviceType).geoCoordinates(geoCoordinates).postedAt(createdOn).build();
	}
}
