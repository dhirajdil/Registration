package com.diksha.registration.Service;

import com.diksha.registration.*;
import java.util.*;

public interface StudentService {
	public void addStudent(Student stu);
	public void edit(Student stu);
	public void delete(int stuid);
	public List getAllStudent();

}
