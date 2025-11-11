package com.kk.springbootudemy.learn_jpa_and_hibernate.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kk.springbootudemy.learn_jpa_and_hibernate.beans.Course;

public interface CourseDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
