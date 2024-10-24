package edu.cjc.smsapp.servicei;

import java.util.List;

import edu.cjc.smsapp.model.Student;

public interface StudentServiceI {
	public void addStudent(Student s);

	public List<Student> getStudents();

		public Student loginUser(String username, String password);
}
