package com.diksha.registration.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.diksha.registration.Student;

public class StudentDAOIplemention implements StudentDAO{
	@Autowired
	private SessionFactory session;
	Transaction tx=null;
	public void addStudent(Student stu) {
		System.out.println("dhiraj"+stu.getId()+""+stu.getName()+""+stu.getAge());
		session.getCurrentSession().save(stu);
		tx = ((SharedSessionContract) session).beginTransaction();
		tx.commit();
	}

	public void edit(Student stu) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int stuid) {
		// TODO Auto-generated method stub
		
	}

	public List getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
