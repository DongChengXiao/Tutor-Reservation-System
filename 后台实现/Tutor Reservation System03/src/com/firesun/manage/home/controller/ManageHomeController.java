package com.firesun.manage.home.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Lesson;
import com.firesun.entity.Status;
import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.home.service.ManageHomeServiceImp;
import com.google.gson.Gson;

@Controller
public class ManageHomeController {

	@Resource
	private ManageHomeServiceImp managehomeserviceimp;
	
	
	//响应最新订单
	@RequestMapping(value = "lesson", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireLesson(HttpServletRequest request) {
		List<Lesson> lesson = this.managehomeserviceimp.showLesson();
		Gson gson = new Gson();
		String lessonjson = gson.toJson(lesson);
		return lessonjson;
	}
	
	//响应最新订单-更多
	@RequestMapping(value = "lessons", produces = "application/json; charset=utf-8")
	@ResponseBody
		public String fireLessons(HttpServletRequest request) {
			List<Lesson> lesson = this.managehomeserviceimp.showLesson();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}
		
	//响应最新教员
	@RequestMapping(value = "teacher", produces = "application/json; charset=utf-8")
	@ResponseBody
		public String fireTeacher(HttpServletRequest request) {
			List<Teacher> teacher = this.managehomeserviceimp.showTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
	
	//响应最新教员-更多
	@RequestMapping(value = "teachers", produces = "application/json; charset=utf-8")
	@ResponseBody
		public String fireTeachers(HttpServletRequest request) {
			List<Teacher> teacher = this.managehomeserviceimp.showTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
	
	//响应最新学员
		@RequestMapping(value = "student", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireStudent(HttpServletRequest request) {
			List<Student> student = this.managehomeserviceimp.showStudent();
			Gson gson = new Gson();
			String studentjson = gson.toJson(student);
			return studentjson;
		}
		
		//响应最新学员
		@RequestMapping(value = "students", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireStudents(HttpServletRequest request) {
			List<Student> student = this.managehomeserviceimp.showStudent();
			Gson gson = new Gson();
			String studentjson = gson.toJson(student);
			return studentjson;
		}
				
				
}
