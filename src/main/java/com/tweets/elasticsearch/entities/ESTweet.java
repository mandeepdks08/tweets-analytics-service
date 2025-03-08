package com.tweets.elasticsearch.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "tweets")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ESTweet {

	@Id
	private String id;
	private Long dbId;
	private String message;
	private List<String> mediaLinks;
	private String userId;
	private LocalDateTime postedAt;
	private String deviceType;
	private String deviceIp;
	private String geoCoordinates;
	private DocumentMetaInfo metaInfo;
}
