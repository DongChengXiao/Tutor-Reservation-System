package com.firesun.student.subject.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Teacher;
import com.firesun.student.home.service.StudentHomeServiceImp;
import com.firesun.student.subject.service.StudentSubjectServiceImp;
import com.google.gson.Gson;

@Controller
public class StudentSubjectController {

	@Resource
	private StudentSubjectServiceImp studentsubjectserviceimp;
	
	//响应科目教员
	@RequestMapping(value = "subjectteachers", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firesubjectTeachers(HttpServletRequest request) {
		List<Teacher> teacher = this.studentsubjectserviceimp.showsubjectTeachers();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(teacher);
		return teacherjson;
	}
	
	
	
	//响应某个科目教员
	@RequestMapping(value = "subjectteacher", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firesubjectTeacher(HttpServletRequest request) {
		Teacher teacher = this.studentsubjectserviceimp.showsubjectTeacher();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(teacher);
		return teacherjson;
	}
	
	//响应预约教员订单
	@RequestMapping(value = "createorderteacher", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firecreordTeachers(HttpServletRequest request) {
		boolean sun = this.studentsubjectserviceimp.createorderTeacher();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(sun);
		return teacherjson;
	}
	
	//响应支付教员订单
	@RequestMapping(value = "payorderteacher", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firepayordTeachers(HttpServletRequest request) {
		boolean sun = this.studentsubjectserviceimp.payorderTeacher();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(sun);
		return teacherjson;
	}
	
}
