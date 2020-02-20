package com.firesun.manage.teacher.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;

@Repository
public class ManageTeacherDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	//查询申请教员
		public List<Teacher> selectnoTeacher(){
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
		    List<Teacher> teachers = query.list();
		   return teachers;
		}	
		
	//查询正式教员
		public List<Teacher> selectyesTeacher(){
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
		    List<Teacher> teachers = query.list();
		   return teachers;
		}	
		
		//查询某个教员
				public Teacher selectTeacher(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				   // Teacher teachers = query.list();
				   return null;
				}	
				
	   //删除某个教员
				public boolean deleteTeacher(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				    List<Teacher> teachers = query.list();
				    return true;
				}	
}
