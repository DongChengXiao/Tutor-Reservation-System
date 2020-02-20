package com.firesun.student.home.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firesun.entity.Student;
import com.firesun.entity.Teacher;
import com.firesun.manage.teacher.dao.ManageTeacherDaoImp;
import com.firesun.student.home.dao.StudentHomeDaoImp;

@Service
@Transactional(readOnly = true)
public class StudentHomeServiceImp {

	
	@Resource
	private StudentHomeDaoImp studenthomedaoimpl;
	
	
	//展示优秀教员
			public List<Teacher> showgoodTeacher(){
			    List<Teacher> teachers = this.studenthomedaoimpl.selectgoodTeacher();
			   return teachers;
			}
			
    //展示优秀教员-更多
			public List<Teacher> showgoodTeachers(){
			    List<Teacher> teachers = this.studenthomedaoimpl.selectgoodTeacher();
			   return teachers;
			}
    //展示最新教员
					public List<Teacher> shownewTeacher(){
					    List<Teacher> teachers = this.studenthomedaoimpl.selectnewTeacher();
					   return teachers;
					}
					
     //展示最新教员-更多
					public List<Teacher> shownewTeachers(){
					    List<Teacher> teachers = this.studenthomedaoimpl.selectnewTeacher();
					   return teachers;
					}
					
					
	 //查询教员库
					public List<Teacher> showTeachers(){
						
					    List<Teacher> teachers = this.studenthomedaoimpl.selectTeachers();
					
					    return teachers;
					}
					
	   //查询学员库
					public List<Student> showStudents(){
		
					    List<Student> students = this.studenthomedaoimpl.selectStudents();
					   return students;
					}

					
}
