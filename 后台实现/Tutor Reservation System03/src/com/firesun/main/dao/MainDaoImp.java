package com.firesun.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.firesun.entity.Lesson;
import com.firesun.entity.Status;
import com.firesun.entity.Student;





@Repository
public class MainDaoImp {
    
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Status> selectStudent(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tutor reservation system?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(rs.getInt("StudentId")+"--"+rs.getString("StudentName")+"--"+rs.getString("StudentSex"));
			}
			rs.close();
			conn.close();

	    } catch (ClassNotFoundException e) {
			   // TODO Auto-generated catch block
			      e.printStackTrace();
	    } catch (SQLException e) {
		       // TODO Auto-generated catch block
		          e.printStackTrace();
	}
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select u from Rank u");
	    
		List<Status> lessons = new ArrayList<Status>();
		return lessons;
	}
}
