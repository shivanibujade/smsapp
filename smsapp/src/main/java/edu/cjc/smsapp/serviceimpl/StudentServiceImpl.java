package edu.cjc.smsapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.smsapp.model.Student;
import edu.cjc.smsapp.repositary.StudentRepositary;
import edu.cjc.smsapp.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentRepositary sr;
	
	@Override
	public void addStudent(Student s) {
		sr.save(s);
		
		
	}

	@Override
	public List<Student> getStudents() {
		
		return sr.findAll();
	}

	@Override
	public Student loginUser(String username, String password) {
		
		 return sr.findByStudentEmailAndContact(username, password);
			

		
	}
	
}
