package com.firesun.manage.student.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Student;
import com.firesun.manage.home.dao.ManageHomeDaoImp;
import com.firesun.manage.student.dao.ManageStudentDaoImp;

@Service
@Transactional(readOnly = true)
public class ManageStudentServiceImp {

	@Resource
	private ManageStudentDaoImp managestudentdaoimpl;
	
	//展示申请学员
		public List<Student> shownoStudent(){
				List<Student> student = this.managestudentdaoimpl.selectnoStudent();
				return student;
				
		}
	//展示申请学员-更多
		public List<Student> shownoStudents(){
				List<Student> student = this.managestudentdaoimpl.selectnoStudent();
				return student;		
		}
		
	//展示正式学员
		public List<Student> showyesStudent(){
				List<Student> student = this.managestudentdaoimpl.selectnoStudent();
				return student;
				
		}
	//展示正式学员-更多
		public List<Student> showyesStudents(){
				List<Student> student = this.managestudentdaoimpl.selectnoStudent();
				return student;		
		}

		//展示某个学员
				public Student showStudent(){
						List<Student> student = this.managestudentdaoimpl.selectnoStudent();
						return null;
						
				}
		//删除某个学员
				public boolean deleteStudent(){
						List<Student> student = this.managestudentdaoimpl.selectnoStudent();
						return true;		
				}
}
