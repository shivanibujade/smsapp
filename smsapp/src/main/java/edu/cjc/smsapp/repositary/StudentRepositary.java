package edu.cjc.smsapp.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.smsapp.model.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>
{
	
	public Student findByStudentEmailAndContact(String StudentEmail,String contact);
}
