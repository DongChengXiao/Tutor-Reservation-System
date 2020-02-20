package com.firesun.manage.home.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Lesson;
import com.firesun.entity.Student;
import com.firesun.entity.Teacher;

@Repository
public class ManageHomeDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	
	//查询最新订单
	public List<Lesson> selectLesson(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Lesson u by u.OrderStarttime desc");
	    List<Lesson> lessons = query.list();
	   return lessons;
	}
	
    //查询最新教员
	public List<Teacher> selectTeacher(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Teacher> teachers = query.list();
	   return teachers;
	}
	
	//查询最新学员
	public List<Student> selectStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Student> students = query.list();
	   return students;
	}
}
