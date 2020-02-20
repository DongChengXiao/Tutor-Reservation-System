package com.firesun.student.mycenter.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Lesson;
import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.student.mycenter.dao.StudentMycenterDaoImp;
import com.firesun.student.subject.dao.StudentSubjectDaoImp;

@Service
@Transactional(readOnly = true)
public class StudentMycenterServiceImp {

	@Resource
	private StudentMycenterDaoImp studentmycenterdaoimpl;
	
	//展示我的积分我的资料
	public Student showStudent(){
	    Student student = this.studentmycenterdaoimpl.selectStudent();
	   return student;
	}
	
	//展示我的课程
	public List<Lesson> showLessons(){
		List<Lesson> lessons = this.studentmycenterdaoimpl.selectLessons();
	   return lessons;
	}
	
	//展示我的消息
	public List<Lesson> showMessages(){
		List<Lesson> lessons = this.studentmycenterdaoimpl.selectmessages();
	   return lessons;
	}
	
	//修改我的信息
	public boolean changeStudent() {
		boolean status = this.studentmycenterdaoimpl.updateStudent();
		return status;		
	}
	
}
