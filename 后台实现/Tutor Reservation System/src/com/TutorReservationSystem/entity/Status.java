package com.TutorReservationSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status {

	private Integer StatusId;
	private String StudentName;
	
	
	public Integer getStatusId() {
		return StatusId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public void setStausId(Integer stausId) {
		StatusId = stausId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
}
