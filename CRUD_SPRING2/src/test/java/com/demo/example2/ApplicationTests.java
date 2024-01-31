package com.demo.example2;
 
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.example2.Entity.Student;
import com.demo.example2.Repository.StudentRepository;

@SpringBootTest
class ApplicationTests {
@Autowired
	private StudentRepository studentrepo;

//create 
	@Test
	void saveStudentInformation() {
		Student student = new Student();
		student.setName("somu");
		student.setCourse("editing");
		student.setFee(25000);
		studentrepo.save(student);
	}
	
	// Read
	@Test
	public void allStudents() {
		Iterable<Student> findAll = studentrepo.findAll();
		for (Student student : findAll) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());
		}
		}
	
	//Read all
	@Test
	public void findStudentById() {
		Optional<Student> findById = studentrepo.findById(6L);
		if(findById.isPresent()) {
			Student student = findById.get();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());
		}else {
			System.out.println("no record found");
		}	
	}
	
	//Update
	@Test
	void upadateStudentInformation() {
		Student student = new Student();
		student.setId(2L);
		student.setName("somy");
		student.setCourse("java");
		student.setFee(2500);
		studentrepo.save(student);
	}
	
	//Delete
	@Test
	void deleteStudentById() {
		studentrepo.deleteById(8L);
	}

}
