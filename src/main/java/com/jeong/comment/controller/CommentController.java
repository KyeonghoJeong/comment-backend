package com.jeong.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeong.comment.dto.CommentDto;
import com.jeong.comment.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/api/comment/create")
	public String create(@RequestBody String cmt) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		CommentDto commentDto = objectMapper.readValue(cmt, CommentDto.class);
		
		commentService.create(commentDto);
		
		String reply = commentDto.getCmt();

		return reply;
	}
	
}