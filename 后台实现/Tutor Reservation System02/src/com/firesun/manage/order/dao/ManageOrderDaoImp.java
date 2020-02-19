package com.firesun.manage.order.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Lesson;

@Repository
public class ManageOrderDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	//查询问题订单
	public List<Lesson> selectnoLesson(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Lesson u where u.OrderStaus.RankId = 4");
	    List<Lesson> lessons = query.list();
	    return lessons;
	}	
	
	
	
	//查询完成订单
	public List<Lesson> selectyesLesson(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Lesson u where u.OrderStaus.RankId != 4");
	    List<Lesson> lessons = query.list();
	    return lessons;
	}	
	
	
	//查询某个订单
	public Lesson selectLesson() {
		return null;
		
	}
	
	//删除某个订单
	public boolean deleteLesson() {
		return false;
		
	}
	
	
}
