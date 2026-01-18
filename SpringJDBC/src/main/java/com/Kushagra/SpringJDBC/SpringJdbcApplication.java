package com.Kushagra.SpringJDBC;

import com.Kushagra.SpringJDBC.model.Student;
import com.Kushagra.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setName("Kushagra");
		s.setMarks(98);
		s.setRollNo(30);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent();

		List<Student> student = service.getStudent();
		System.out.println(student);
	}

}
