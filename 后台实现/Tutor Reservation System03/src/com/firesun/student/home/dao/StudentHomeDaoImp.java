package com.firesun.student.home.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;

@Repository
public class StudentHomeDaoImp {

	@Resource
	private SessionFactory sessionFactory;
	
	 //查询优秀教员
		public List<Teacher> selectgoodTeacher(){
			Session session = this.sessionFactory.getCurrentSession();
			Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
		    List<Teacher> teachers = query.list();
		   return teachers;
		}
	//查询最新教员
				public List<Teacher> selectnewTeacher(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				    List<Teacher> teachers = query.list();
				   return teachers;
				}
				
				
   //查询教员库
				public List<Teacher> selectTeachers(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				    List<Teacher> teachers = query.list();
				   return teachers;
				}
				
   //查询学员库
				public List<Student> selectStudents(){
					Session session = this.sessionFactory.getCurrentSession();
					Query query = session.createQuery("select u from Teacher u where u.RanId = 0");
				    List<Student> students = query.list();
				   return students;
				}

}
