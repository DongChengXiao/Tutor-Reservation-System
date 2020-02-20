package com.firesun.student.message.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Lesson;
import com.firesun.entity.Student;
import com.firesun.student.message.service.StudentMessageServiceImp;
import com.firesun.student.mycenter.service.StudentMycenterServiceImp;
import com.google.gson.Gson;

@Controller
public class StudentMessageController {

	@Resource
	private StudentMessageServiceImp studentmessageserviceimp;
	
	//响应我的消息
	@RequestMapping(value = "showmessage", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireshowMessage(HttpServletRequest request) {
		List<Lesson> lessons = this.studentmessageserviceimp.showMessages();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(lessons);
		return teacherjson;
	}
	
	//拒绝我的消息
	@RequestMapping(value = "rejectmessage", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String firerejectMessage(HttpServletRequest request) {
		List<Lesson> lessons = this.studentmessageserviceimp.rejectMessages();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(lessons);
		return teacherjson;
	}
	
	//拒绝接受我的消息
	@RequestMapping(value = "acceptmessage", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String fireacceptMessage(HttpServletRequest request) {
		List<Lesson> lessons = this.studentmessageserviceimp.acceptMessages();
		Gson gson = new Gson();
		String teacherjson = gson.toJson(lessons);
		return teacherjson;
	}
}
