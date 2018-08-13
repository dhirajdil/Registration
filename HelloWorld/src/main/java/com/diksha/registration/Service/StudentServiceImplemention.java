package com.diksha.registration.Service;

import java.util.List;

import org.hibernate.Transaction;

import com.diksha.registration.Student;
import com.diksha.registration.DAO.*;

public class StudentServiceImplemention implements StudentService{
	
	private StudentDAO studentDAO;
	
	public void addStudent(Student stu) {
		StudentDAOIplemention st=new StudentDAOIplemention();
		System.out.println(stu.getId()+""+stu.getName()+""+stu.getAge());
		st.addStudent(stu);
		
		
	}

	public void edit(Student stu) {
		//studentDAO.edit(stu);
		
	}

	public void delete(int stuid) {
		
		
	}

	public List getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
