package com.firesun.student.mycenter.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Lesson;
import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.student.mycenter.service.StudentMycenterServiceImp;
import com.firesun.student.subject.service.StudentSubjectServiceImp;
import com.google.gson.Gson;

@Controller
public class StudentMycenterController {

	@Resource
	private StudentMycenterServiceImp studentmycenterserviceimp;
	
	
	//响应我的积分、资料
	@RequestMapping(value = "mycenterstudent", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firemycenterStudent(HttpServletRequest request) {
		Student student = this.studentmycenterserviceimp.showStudent();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(student);
		return teacherjson;
	}
	//响应我的课程
	@RequestMapping(value = "mycenterlessons", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firemycenterLesson(HttpServletRequest request) {
		List<Lesson> lessons = this.studentmycenterserviceimp.showLessons();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(lessons);
		return teacherjson;
	}
	
	//响应我的消息
	@RequestMapping(value = "mycenterlessons", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firemycenterMessages(HttpServletRequest request) {
		List<Lesson> lessons = this.studentmycenterserviceimp.showMessages();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(lessons);
		return teacherjson;
	}
	
	//响应修改我的资料
	@RequestMapping(value = "updatemycenterstudent", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firechangemycenterStudent(HttpServletRequest request) {
		Boolean status = this.studentmycenterserviceimp.changeStudent();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(status);
		return teacherjson;
	}
}
