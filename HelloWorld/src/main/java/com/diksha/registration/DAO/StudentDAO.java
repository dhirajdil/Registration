package com.diksha.registration.DAO;

import java.util.List;

import com.diksha.registration.Student;

public interface StudentDAO {
	public void addStudent(Student stu);
	public void edit(Student stu);
	public void delete(int stuid);
	public List getAllStudent();
}
