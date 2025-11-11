package com.kk.springbootudemy.learn_jpa_and_hibernate.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kk.springbootudemy.learn_jpa_and_hibernate.beans.Course;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseJdbcRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course(1, "Java - jdbc", "Kishore"));
		repo.insert(new Course(2, "Azure - jdbc", "Kishore"));
		repo.insert(new Course(3, "Devops - jdbc", "Kishore"));
		repo.delete(3);
		System.out.println(repo.findById(1));
		System.out.println(repo.findById(2));
	}

}
