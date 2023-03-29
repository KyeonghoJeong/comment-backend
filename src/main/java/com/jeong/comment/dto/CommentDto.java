package com.jeong.comment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class CommentDto {

	@JsonProperty("comment")
	private String cmt;
	
}