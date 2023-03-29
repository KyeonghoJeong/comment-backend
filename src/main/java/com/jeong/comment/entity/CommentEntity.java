package com.jeong.comment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Table(name="cmtTable")
@SequenceGenerator(name="cmt_seq_generator", sequenceName="cmt_seq", initialValue=1, allocationSize=1)
@Entity
public class CommentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cmt_seq_generator")  
	private int id;
	
	private String cmt;

}