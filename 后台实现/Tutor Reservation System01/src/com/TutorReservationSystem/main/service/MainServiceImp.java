package com.TutorReservationSystem.main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.TutorReservationSystem.entity.Lesson;
import com.TutorReservationSystem.main.dao.MainDaoImp;



@Service
@Transactional(readOnly = true)
public class MainServiceImp {

	@Resource
	private MainDaoImp maindaoimpl;
	public List<Lesson> showLesson() {
	       List<Lesson> lesson = this.maindaoimpl.selectLesson();
	       for(Lesson temp:lesson) {
	    	   System.out.print(temp.getOrderId());
	       }
	       return lesson;
	}

}
