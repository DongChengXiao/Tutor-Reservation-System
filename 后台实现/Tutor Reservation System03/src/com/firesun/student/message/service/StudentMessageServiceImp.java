package com.firesun.student.message.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Lesson;
import com.firesun.student.message.dao.StudentMessageDaoImp;
import com.firesun.student.mycenter.dao.StudentMycenterDaoImp;

@Service
@Transactional(readOnly = true)
public class StudentMessageServiceImp {

	@Resource
	private StudentMessageDaoImp studentmessagedaoimpl;
	
	
	//展示我的消息
	public List<Lesson> showMessages(){
		List<Lesson> lessons = this.studentmessagedaoimpl.selectMessages();
	   return lessons;
	}
	
	//拒绝我的消息
	public List<Lesson> rejectMessages(){
		List<Lesson> lessons = this.studentmessagedaoimpl.selectMessages();
	   return lessons;
	}
	
	//接受我的消息
	public List<Lesson> acceptMessages(){
		List<Lesson> lessons = this.studentmessagedaoimpl.selectMessages();
	   return lessons;
	}
}
