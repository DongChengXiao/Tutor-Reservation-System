package com.firesun.manage.order.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Lesson;
import com.firesun.manage.home.dao.ManageHomeDaoImp;
import com.firesun.manage.order.dao.ManageOrderDaoImp;

@Service
@Transactional(readOnly = true)
public class ManageOrderServiceImp {

	@Resource
	private ManageOrderDaoImp manageorderdaoimp;
	
	//展示问题订单
	public List<Lesson> shownoLesson(){
			List<Lesson> lesson = this.manageorderdaoimp.selectnoLesson();
			return lesson;	
	}
	
	//展示问题订单-更多
	public List<Lesson> shownoLessons(){
		List<Lesson> lesson = this.manageorderdaoimp.selectnoLesson();
		return lesson;	
    }
	
	//展示完成订单
	public List<Lesson> showyesLesson(){
			List<Lesson> lesson = this.manageorderdaoimp.selectyesLesson();
			return lesson;	
	}
	
	//展示完成订单-更多
	public List<Lesson> showyesLessons(){
				List<Lesson> lesson = this.manageorderdaoimp.selectyesLesson();
				return lesson;	
	}
	
    //展示某个订单
	public Lesson showLesson(){
		Lesson lesson = this.manageorderdaoimp.selectLesson();
		return lesson;	
    }	
	
	//删除某个订单
	public boolean unshowLesson() {
		return false;
		
	}
	
}
