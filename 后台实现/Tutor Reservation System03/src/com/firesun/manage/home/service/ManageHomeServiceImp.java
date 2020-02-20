package com.firesun.manage.home.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Lesson;
import com.firesun.entity.Student;
import com.firesun.entity.Teacher;

import com.firesun.manage.home.dao.ManageHomeDaoImp;

@Service
@Transactional(readOnly = true)
public class ManageHomeServiceImp {

	@Resource
	private ManageHomeDaoImp managehomedaoimpl;
	
	//展示最新订单
	public List<Lesson> showLesson(){
		List<Lesson> lesson = this.managehomedaoimpl.selectLesson();
		return lesson;
		
	}
	//展示最新订单-更多
	public List<Lesson> showLessons(){
		List<Lesson> lesson = this.managehomedaoimpl.selectLesson();
		return lesson;
		
	}
	
	//展示最新教员
	public List<Teacher> showTeacher(){
			List<Teacher> teacher = this.managehomedaoimpl.selectTeacher();
			return teacher;
			
	}
	//展示最新教员-更多
	public List<Teacher> showTeachers(){
			List<Teacher> teacher = this.managehomedaoimpl.selectTeacher();
			return teacher;		
	}
	

	//展示最新学员
	public List<Student> showStudent(){
			List<Student> student = this.managehomedaoimpl.selectStudent();
			return student;
			
	}
	//展示最新学员-更多
	public List<Student> showStudents(){
			List<Student> student = this.managehomedaoimpl.selectStudent();
			return student;		
	}
	
}
