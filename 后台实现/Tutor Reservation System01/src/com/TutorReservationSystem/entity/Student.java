package com.TutorReservationSystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="student")
public class Student {
	
	private Integer StudentId;
	private String StudentName;
	private String StudentSex;
	private String StudentGrade;
	private String StudentAddress;
	private String StudentPhone;
	private String StudentImage;
	private String StudentPassword;
	private String StudentIntegral;
	private Set<Subject> StudentSubject;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getStudentId() {
		return StudentId;
	}
	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentSex() {
		return StudentSex;
	}
	public void setStudentSex(String studentSex) {
		StudentSex = studentSex;
	}
	public String getStudentGrade() {
		return StudentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		StudentGrade = studentGrade;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentImage() {
		return StudentImage;
	}
	public void setStudentImage(String studentImage) {
		StudentImage = studentImage;
	}
	public String getStudentPassword() {
		return StudentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
	}
	public String getStudentIntegral() {
		return StudentIntegral;
	}
	public void setStudentIntegral(String studentIntegral) {
		StudentIntegral = studentIntegral;
	}
	
	@OneToMany(mappedBy="student",targetEntity=Subject.class,cascade=CascadeType.ALL)
	public Set<Subject> getStudentSubject() {
		return StudentSubject;
	}
	public void setStudentSubject(Set<Subject> studentSubject) {
		StudentSubject = studentSubject;
	}
	
}
