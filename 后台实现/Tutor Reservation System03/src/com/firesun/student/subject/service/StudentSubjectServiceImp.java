package com.firesun.student.subject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Teacher;
import com.firesun.student.home.dao.StudentHomeDaoImp;
import com.firesun.student.subject.dao.StudentSubjectDaoImp;

@Service
@Transactional(readOnly = true)
public class StudentSubjectServiceImp {

	@Resource
	private StudentSubjectDaoImp studentsubjectdaoimpl;
	
	
	//展示科目教员
	public List<Teacher> showsubjectTeachers(){
	    List<Teacher> teachers = this.studentsubjectdaoimpl.selectsubjectTeachers();
	   return teachers;
	}
	
	//展示某个科目教员
	public Teacher showsubjectTeacher(){
	    Teacher teachers = this.studentsubjectdaoimpl.selectsubjectTeacher();
	   return teachers;
	}
	
	//预约老师订单
	public Boolean createorderTeacher(){
	    boolean status = this.studentsubjectdaoimpl.createorderTeacher();
	   return true;
	}
	
	//支付老师订单
	public Boolean payorderTeacher(){
	    boolean status = this.studentsubjectdaoimpl.payorderTeacher();
	   return true;
	}
	
	
}
