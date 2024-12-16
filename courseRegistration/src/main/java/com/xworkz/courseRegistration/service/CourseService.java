package com.xworkz.courseRegistration.service;

import com.xworkz.courseRegistration.DTO.CourseDTO;

public interface CourseService {
   String validate(CourseDTO dto);
    String getNameByEmailAndPassword(String email,String password);
}