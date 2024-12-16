package com.xworkz.courseRegistration.repository;

import com.xworkz.courseRegistration.entity.CourseEntity;

public interface CourseRepository {
	
  boolean save(CourseEntity courseEntity);
  String getNameByEmailAndPassword(String email,String password);
}
