package com.firesun.manage.student.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Student;

@Repository
public class ManageStudentDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	//查询申请学员
	public List<Student> selectnoStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Student> students = query.list();
	   return students;
	}	
	
	//查询正式学员
	public List<Student> selectyesStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Student> students = query.list();
	   return students;
	}
	
	//查询某个学员
	public Student selectStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    //Student students = query.list();
	    return null;
	}
	
	//删除某个学员
	public void deleteStudent(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
	    List<Student> students = query.list();
	    return;
	}	
	
	
}
