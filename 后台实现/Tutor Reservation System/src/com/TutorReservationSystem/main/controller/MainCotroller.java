package com.TutorReservationSystem.main.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TutorReservationSystem.entity.Lesson;
import com.TutorReservationSystem.main.service.MainServiceImp;


@Controller
@RequestMapping(value = "main")
public class MainCotroller {
      
	@Resource
	private MainServiceImp mainserviceimp;
	
	public List<Lesson> listLesson(HttpServletRequest request) {
		List<Lesson> lesson = this.mainserviceimp.showLesson();
		return lesson;
	}
}
