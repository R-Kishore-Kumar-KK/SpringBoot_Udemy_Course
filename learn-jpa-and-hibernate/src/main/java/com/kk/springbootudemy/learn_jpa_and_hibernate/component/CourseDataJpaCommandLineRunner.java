package com.kk.springbootudemy.learn_jpa_and_hibernate.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kk.springbootudemy.learn_jpa_and_hibernate.beans.Course;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseDataJpaRepository;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseJdbcRepository;
import com.kk.springbootudemy.learn_jpa_and_hibernate.repo.CourseJpaRepository;

@Component
public class CourseDataJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseDataJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(21, "Java - data jpa", "Kishore"));
		repo.save(new Course(22, "Azure - data jpa", "Kishore"));
		repo.save(new Course(23, "Devops - data jpa", "Kishore"));
		repo.deleteById(23l);
		System.out.println(repo.findById(21l));
		System.out.println(repo.findById(22l));
		System.out.println(repo.findAll());
		System.out.println(repo.count());
		System.out.println(repo.findByAuthor("Kishore"));
		System.out.println(repo.findByName("Java - data jpa"));
	}

}
