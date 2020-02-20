package com.firesun.student.mycenter.dao;

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
public class StudentMycenterDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	//查询我的积分我的资料
	public Student selectStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	   // Student student = query.list();
	   return null;
	}
	
	//查询我的课程
		public List<Lesson> selectLessons(){
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
		    List<Lesson> lessons = query.list();
		    return lessons;
		}
	
	//查询我的消息
				public List<Lesson> selectmessages(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				    List<Lesson> lessons = query.list();
				    return lessons;
				}
				
	//修改我的资料
				public boolean updateStudent(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				   // Student student = query.list();
				   return true;
				}
}
