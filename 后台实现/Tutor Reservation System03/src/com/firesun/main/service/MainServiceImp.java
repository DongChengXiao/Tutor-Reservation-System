package com.firesun.main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Status;
import com.firesun.entity.Student;
import com.firesun.main.dao.MainDaoImp;




@Service
@Transactional(readOnly = true)
public class MainServiceImp {

	@Resource
	private MainDaoImp maindaoimpl;
	public List<Status> showLesson() {
	       List<Status> lesson = this.maindaoimpl.selectStudent();
	       for(Status temp:lesson) {
	    	   System.out.print(temp.getStatusName());
	       }
	       return lesson;
	}

}
