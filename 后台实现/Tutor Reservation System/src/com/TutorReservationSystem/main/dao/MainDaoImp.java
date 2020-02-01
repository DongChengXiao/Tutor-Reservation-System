package com.TutorReservationSystem.main.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.TutorReservationSystem.entity.Lesson;


@Repository
public class MainDaoImp {
    
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Lesson> selectLesson(){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Lesson cou where order by cou.LessonId ");
		List <Lesson> lesson = query.list();
		return lesson;
	}
}
