package com.firesun.student.subject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Teacher;

@Repository
public class StudentSubjectDaoImp {


	@Resource
	private SessionFactory sessionFactory;
	
	//查询科目教员
			public List<Teacher> selectsubjectTeachers(){
				Session session = this.sessionFactory.getCurrentSession();
				Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
			    List<Teacher> teachers = query.list();
			   return teachers;
			}
			
   //查询某个教员
			public Teacher selectsubjectTeacher(){
				Session session = this.sessionFactory.getCurrentSession();
				Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
			    List<Teacher> teachers = query.list();
			   return null;
			}
			
   //预约订单
			public boolean createorderTeacher(){
							Session session = this.sessionFactory.getCurrentSession();
							Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
						    List<Teacher> teachers = query.list();
						   return true;
		    }
	
   //支付订单
			public boolean payorderTeacher(){
										Session session = this.sessionFactory.getCurrentSession();
										Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
									    List<Teacher> teachers = query.list();
									   return true;
			}

}
