package com.firesun.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status {

	private Integer StatusId;
	private String StatusName;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStatusId() {
		return StatusId;
	}


	public String getStatusName() {
		return StatusName;
	}


	public void setStatusName(String statusName) {
		StatusName = statusName;
	}


	public void setStatusId(Integer statusId) {
		StatusId = statusId;
	}
	

}
