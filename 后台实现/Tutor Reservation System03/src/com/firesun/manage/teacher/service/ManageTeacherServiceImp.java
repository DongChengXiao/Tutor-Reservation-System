package com.firesun.manage.teacher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.student.dao.ManageStudentDaoImp;
import com.firesun.manage.teacher.dao.ManageTeacherDaoImp;

@Service
@Transactional(readOnly = true)
public class ManageTeacherServiceImp {

	@Resource
	private ManageTeacherDaoImp manageteacherdaoimpl;
	
	//展示申请教员
		public List<Teacher> shownoTeacher(){
				List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
				return teacher;
				
		}
		
	//展示申请教员-更多
		public List<Teacher> shownoTeachers(){
				List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
				return teacher;
				
		}
		
	//展示正式教员
				public List<Teacher> showyesTeacher(){
						List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
						return teacher;
						
				}
				
	//展示正式教员-更多
				public List<Teacher> showyesTeachers(){
						List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
						return teacher;
						
				}
				
	//展示某个教员
				public Teacher showTeacher(){
						List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
						return null;
						
				}
				
	//删除某个教员
				public boolean deleteTeacher(){
						List<Teacher> teacher = this.manageteacherdaoimpl.selectnoTeacher();
						return true;
						
				}
				
}
