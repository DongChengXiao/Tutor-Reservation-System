package com.firesun.manage.student.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.home.service.ManageHomeServiceImp;
import com.firesun.manage.student.service.ManageStudentServiceImp;
import com.google.gson.Gson;

@Controller
public class ManageStudentController {

	@Resource
	private ManageStudentServiceImp managestudentserviceimp;
	
	//响应申请学员
	@RequestMapping(value = "nostudent", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firenoStudent(HttpServletRequest request) {
		List<Student> student = this.managestudentserviceimp.shownoStudent();
		Gson gson = new Gson();
		String studentjson = gson.toJson(student);
		return studentjson;
	}
	
	//响应申请学员-更多
	@RequestMapping(value = "nostudents", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firenoStudents(HttpServletRequest request) {
		List<Student> student = this.managestudentserviceimp.shownoStudent();
		Gson gson = new Gson();
		String studentjson = gson.toJson(student);
		return studentjson;
	}
	
	//响应正式学员
	@RequestMapping(value = "yesstudent", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireyesStudent(HttpServletRequest request) {
		List<Student> student = this.managestudentserviceimp.showyesStudent();
		Gson gson = new Gson();
		String studentjson = gson.toJson(student);
		return studentjson;
	}
	
	//响应正式学员-更多
	@RequestMapping(value = "yesstudents", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireyesStudents(HttpServletRequest request) {
		List<Student> student = this.managestudentserviceimp.showyesStudent();
		Gson gson = new Gson();
		String studentjson = gson.toJson(student);
		return studentjson;
	}

	//响应某个学员
	@RequestMapping(value = "showstudent", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireshowStudent(HttpServletRequest request) {
		Student student = this.managestudentserviceimp.showStudent();
		Gson gson = new Gson();
		String studentjson = gson.toJson(student);
		return studentjson;
	}
	
	//响应删除学员
		@RequestMapping(value = "showstudent", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firedelStudent(HttpServletRequest request) {
			Student student = this.managestudentserviceimp.showStudent();
			Gson gson = new Gson();
			String studentjson = gson.toJson(student);
			return studentjson;
		}
	
			
}
