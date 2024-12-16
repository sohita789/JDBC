package com.xworkz.courseRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.courseRegistration.DTO.CourseDTO;
import com.xworkz.courseRegistration.service.CourseService;
import com.xworkz.courseRegistration.service.CourseServiceImpl;

@Controller
@RequestMapping("/")

public class CourseController {
	
    @Autowired
    private CourseService courseService;
	

    CourseController(){
     System.out.println("created CourseRegistrationController");
    }

    @PostMapping("/login")
    public String onSave(Model model, CourseDTO dto){
        System.out.println(dto.toString());
        System.out.println("running onSave in CourseController");

       String save= courseService.validate(dto);
       model.addAttribute("msg",save);

        return "Course.jsp";
    }
    
    @PostMapping("/signin")
    public String onSearch(@RequestParam String email,@RequestParam String password,Model model){
        String valid= courseService.getNameByEmailAndPassword(email,password);
        model.addAttribute( "msg",valid);
        return "Success.jsp";
    }


}