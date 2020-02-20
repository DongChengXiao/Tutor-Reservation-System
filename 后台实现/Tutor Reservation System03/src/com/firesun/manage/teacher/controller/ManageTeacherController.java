package com.firesun.manage.teacher.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.student.service.ManageStudentServiceImp;
import com.firesun.manage.teacher.service.ManageTeacherServiceImp;
import com.google.gson.Gson;

@Controller
public class ManageTeacherController {

	@Resource
	private ManageTeacherServiceImp manageteacherserviceimp;
	
	
	//响应申请教员
	@RequestMapping(value = "noteacher", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firenoTeacher(HttpServletRequest request) {
		List<Teacher> teacher = this.manageteacherserviceimp.shownoTeacher();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(teacher);
		return teacherjson;
	}


	//响应申请教员-更多
	@RequestMapping(value = "noteachers", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firenoTeachers(HttpServletRequest request) {
		List<Teacher> teacher = this.manageteacherserviceimp.shownoTeachers();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(teacher);
		return teacherjson;
	}
	
	
	//响应正式教员
		@RequestMapping(value = "yesteacher", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireyesTeacher(HttpServletRequest request) {
			List<Teacher> teacher = this.manageteacherserviceimp.showyesTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}


    //响应正式教员-更多
		@RequestMapping(value = "yesteachers", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireyesTeachers(HttpServletRequest request) {
			List<Teacher> teacher = this.manageteacherserviceimp.showyesTeachers();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
	
	//响应某个教员
	@RequestMapping(value = "showteacher", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireshowTeacher(HttpServletRequest request) {
		Teacher teacher = this.manageteacherserviceimp.showTeacher();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(teacher);
		return teacherjson;
	}
	
	//响应某删除教员
		@RequestMapping(value = "showteacher", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firedeleteTeacher(HttpServletRequest request) {
			Teacher teacher = this.manageteacherserviceimp.showTeacher();
			Gson gson = new Gson();
			String teacherjson = gson.toJson(teacher);
			return teacherjson;
		}
}
