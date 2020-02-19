package com.TutorReservationSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	private Integer TeacherId;
	private String TeacherName;
	private String TeacherSex;
	private String TeacherPhone;
	private String TeacherPassword;
	private String TeacherAddress;
	private String TeacherInformation;
	private String TeacherInformationpic;
	private String TeacherImage;
	private String TeacherPhoto;
	private String TeacherCardid;
	private String TeacherCardpic;
	private String TeacherUniversity;
	private String TeacherIntegral;
	private String TeacherSubtype;
	private String TeacherDescription;
	private Subject TeacherSubject;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "TeacherId")
	public Subject getTeacherSubject() {
		return TeacherSubject;
	}
	public void setTeacherSubject(Subject teacherSubject) {
		TeacherSubject = teacherSubject;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "teacherId")
	public Rank getTeacherRank() {
		return TeacherRank;
	}
	public void setTeacherRank(Rank teacherRank) {
		TeacherRank = teacherRank;
	}
	private Rank TeacherRank;
	public Integer getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(Integer teacherId) {
		TeacherId = teacherId;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getTeacherSex() {
		return TeacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		TeacherSex = teacherSex;
	}
	public String getTeacherPhone() {
		return TeacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		TeacherPhone = teacherPhone;
	}
	public String getTeacherPassword() {
		return TeacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		TeacherPassword = teacherPassword;
	}
	public String getTeacherAddress() {
		return TeacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		TeacherAddress = teacherAddress;
	}
	public String getTeacherInformation() {
		return TeacherInformation;
	}
	public void setTeacherInformation(String teacherInformation) {
		TeacherInformation = teacherInformation;
	}
	public String getTeacherInformationpic() {
		return TeacherInformationpic;
	}
	public void setTeacherInformationpic(String teacherInformationpic) {
		TeacherInformationpic = teacherInformationpic;
	}
	public String getTeacherImage() {
		return TeacherImage;
	}
	public void setTeacherImage(String teacherImage) {
		TeacherImage = teacherImage;
	}
	public String getTeacherPhoto() {
		return TeacherPhoto;
	}
	public void setTeacherPhoto(String teacherPhoto) {
		TeacherPhoto = teacherPhoto;
	}
	public String getTeacherCardid() {
		return TeacherCardid;
	}
	public void setTeacherCardid(String teacherCardid) {
		TeacherCardid = teacherCardid;
	}
	public String getTeacherCardpic() {
		return TeacherCardpic;
	}
	public void setTeacherCardpic(String teacherCardpic) {
		TeacherCardpic = teacherCardpic;
	}
	public String getTeacherUniversity() {
		return TeacherUniversity;
	}
	public void setTeacherUniversity(String teacherUniversity) {
		TeacherUniversity = teacherUniversity;
	}
	public String getTeacherIntegral() {
		return TeacherIntegral;
	}
	public void setTeacherIntegral(String teacherIntegral) {
		TeacherIntegral = teacherIntegral;
	}
	public String getTeacherSubtype() {
		return TeacherSubtype;
	}
	public void setTeacherSubtype(String teacherSubtype) {
		TeacherSubtype = teacherSubtype;
	}
	public String getTeacherDescription() {
		return TeacherDescription;
	}
	public void setTeacherDescription(String teacherDescription) {
		TeacherDescription = teacherDescription;
	}

	
}
