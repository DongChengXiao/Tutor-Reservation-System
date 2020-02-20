package com.firesun.student.message.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Lesson;

@Repository
public class StudentMessageDaoImp {

	
	@Resource
	private SessionFactory sessionFactory;
	
	
	//查询我的消息
	public List<Lesson> selectMessages(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Lesson> lessons = query.list();
	    return lessons;
	}
    
	//拒绝订单
	public List<Lesson> rejectMessages(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Lesson> lessons = query.list();
	    return lessons;
	}
	
	//接受订单
	public List<Lesson> obtainMessages(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Lesson> lessons = query.list();
	    return lessons;
	}
}
