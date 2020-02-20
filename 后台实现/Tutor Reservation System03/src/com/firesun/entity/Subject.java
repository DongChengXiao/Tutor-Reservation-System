package com.firesun.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	private Integer SubjectId; 
	private String SubjectName;
	private String SubjectType;
	private Set<Student> SubjectStudent;
	
	@OneToMany(mappedBy="subject",targetEntity=Student.class,cascade=CascadeType.ALL)
	public Set<Student> getSubjectStudent() {
		return SubjectStudent;
	}
	public void setSubjectStudent(Set<Student> subjectStudent) {
		SubjectStudent = subjectStudent;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(Integer subjectId) {
		SubjectId = subjectId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public String getSubjectType() {
		return SubjectType;
	}
	public void setSubjectType(String subjectType) {
		SubjectType = subjectType;
	}
	
	
}
