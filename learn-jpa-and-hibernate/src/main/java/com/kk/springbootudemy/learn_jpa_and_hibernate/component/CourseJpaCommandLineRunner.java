package com.kk.springbootudemy.learn_jpa_and_hibernate.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kk.springbootudemy.learn_jpa_and_hibernate.beans.Course;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseJdbcRepository;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseJpaRepository;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course(11, "Java - jpa", "Kishore"));
		repo.insert(new Course(12, "Azure - jpa", "Kishore"));
		repo.insert(new Course(13, "Devops - jpa", "Kishore"));
		repo.deleteById(13);
		System.out.println(repo.findById(11));
		System.out.println(repo.findById(12));
	}

}
