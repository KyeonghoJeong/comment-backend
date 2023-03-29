package com.jeong.comment.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeong.comment.dao.CommentDao;
import com.jeong.comment.dto.CommentDto;
import com.jeong.comment.entity.CommentEntity;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CommentDao commentDao;

	@Override
	public void create(CommentDto commentDto) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration().setFieldAccessLevel(Configuration.AccessLevel.PRIVATE).setFieldMatchingEnabled(true);
		
		CommentEntity commentEntity = modelMapper.map(commentDto, CommentEntity.class);
		
		commentDao.saveComment(commentEntity);
	}
}
