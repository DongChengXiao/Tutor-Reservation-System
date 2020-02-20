package com.firesun.student.home.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.teacher.service.ManageTeacherServiceImp;
import com.firesun.student.home.service.StudentHomeServiceImp;
import com.google.gson.Gson;

@Controller
public class StudentHomeController {

	@Resource
	private StudentHomeServiceImp studenthomeserviceimp;
	
	//响应优秀教员
		@RequestMapping(value = "goodteacher", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firegoodTeacher(HttpServletRequest request) {
			List<Teacher> teacher = this.studenthomeserviceimp.showgoodTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
		
	//响应优秀教员-更多
		@RequestMapping(value = "goodteachers", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firegoodTeachers(HttpServletRequest request) {
			List<Teacher> teacher = this.studenthomeserviceimp.showgoodTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
		
		//响应最新教员
		@RequestMapping(value = "goodteacher", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firenewTeacher(HttpServletRequest request) {
			List<Teacher> teacher = this.studenthomeserviceimp.showgoodTeachers();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
		
	//响应最新教员-更多
		@RequestMapping(value = "newteachers", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firenewTeachers(HttpServletRequest request) {
			List<Teacher> teacher = this.studenthomeserviceimp.showgoodTeachers();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}

		//响应教员库
		@RequestMapping(value = "showteachers", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireshowTeacher(HttpServletRequest request) {
			List<Teacher> teacher = this.studenthomeserviceimp.showTeachers();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
		
		//响应学员库
			@RequestMapping(value = "showstudents", produces = "application/json; charset=utf-8")
			@ResponseBody
			public String fireshowStudent(HttpServletRequest request) {
				List<Student> students = this.studenthomeserviceimp.showStudents();
				Gson gson = new Gson();
				String teacherjson = gson.toJson(students);
				return teacherjson;
			}
		
}
