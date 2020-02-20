package com.firesun.entity;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class Lesson {
  
	private Integer OrderId;
	private Time OrderStarttime;
	private Integer OrderTime;
	private Integer OrderPrice;
	private Subject OrderSubject;
	private Student OrderStudnt;
	private Teacher OrderTeacher;
	private Status OrderStaus;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getOrderId() {
		return OrderId;
	}
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	public Time getOrderStarttime() {
		return OrderStarttime;
	}
	public void setOrderStarttime(Time orderStarttime) {
		OrderStarttime = orderStarttime;
	}
	public Integer getOrderTime() {
		return OrderTime;
	}
	public void setOrderTime(Integer orderTime) {
		OrderTime = orderTime;
	}
	public Integer getOrderPrice() {
		return OrderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		OrderPrice = orderPrice;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "OrderId")
	public Subject getOrderSubject() {
		return OrderSubject;
	}
	public void setOrderSubject(Subject orderSubject) {
		OrderSubject = orderSubject;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "OrderId")
	public Student getOrderStudnt() {
		return OrderStudnt;
	}
	public void setOrderStudnt(Student orderStudnt) {
		OrderStudnt = orderStudnt;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "OrderId")
	public Teacher getOrderTeacher() {
		return OrderTeacher;
	}
	public void setOrderTeacher(Teacher orderTeacher) {
		OrderTeacher = orderTeacher;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "OrderId")
	public Status getOrderStaus() {
		return OrderStaus;
	}
	public void setOrderStaus(Status orderStaus) {
		OrderStaus = orderStaus;
	}
	
	
	
}
