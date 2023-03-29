package com.jeong.comment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jeong.comment.entity.CommentEntity;
import com.jeong.comment.repository.CommentRepository;

@Repository
public class CommentDaoImpl implements CommentDao {

	@Autowired
	private CommentRepository commentRepository;
	
	public void saveComment(CommentEntity commentEntity) {
		commentRepository.save(commentEntity);
	}
	
}