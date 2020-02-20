package com.firesun.manage.order.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firesun.entity.Lesson;
import com.firesun.manage.home.service.ManageHomeServiceImp;
import com.firesun.manage.order.service.ManageOrderServiceImp;
import com.google.gson.Gson;

@Controller
public class ManageOrderController {
     
	@Resource
	private ManageOrderServiceImp manageorderserviceimp;
	
	    //响应问题订单
		@RequestMapping(value = "nolesson", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firenoLesson(HttpServletRequest request) {
			List<Lesson> lesson = this.manageorderserviceimp.shownoLesson();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}
		
		//响应问题订单=更多
		@RequestMapping(value = "nolessons", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firenoLessons(HttpServletRequest request) {
			List<Lesson> lesson = this.manageorderserviceimp.shownoLessons();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}	
		
		//响应完成订单
		@RequestMapping(value = "yeslesson", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireyesLesson(HttpServletRequest request) {
			List<Lesson> lesson = this.manageorderserviceimp.showyesLesson();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}
		
		//响应完成订单-更多
		@RequestMapping(value = "yeslessons", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireyesLessons(HttpServletRequest request) {
			List<Lesson> lesson = this.manageorderserviceimp.showyesLessons();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}	

	    //响应展示某个订单
		@RequestMapping(value = "showlesson", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String fireshowLesson(HttpServletRequest request) {
			Lesson lesson = this.manageorderserviceimp.showLesson();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}
	
	    //响应删除某个订单
		@RequestMapping(value = "dellesson", produces = "application/json; charset=utf-8")
		@ResponseBody
		public String firedelLesson(HttpServletRequest request) {
			Boolean lesson = this.manageorderserviceimp.unshowLesson();
			Gson gson = new Gson();
			String lessonjson = gson.toJson(lesson);
			return lessonjson;
		}
}
