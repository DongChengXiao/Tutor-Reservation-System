package com.firesun.main.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.firesun.main.service.MainServiceImp;
import com.firesun.entity.Status;
import com.firesun.entity.Student;




@Controller
public class MainCotroller {
      
	@Resource
	private MainServiceImp mainserviceimp;
	
	@RequestMapping(value = "main")
	public String listLesson(HttpServletRequest request) {
		List<Status> lesson = this.mainserviceimp.showLesson();
		
		return "main";
	}
}
