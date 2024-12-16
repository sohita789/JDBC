package com.xworkz.xworkz_admin_details.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.xworkz_admin_details.DTO.XworkzDTO;
import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
import com.xworkz.xworkz_admin_details.repository.XworkzRepoImpl;
import com.xworkz.xworkz_admin_details.repository.XworkzRepository;
@Service
public class XworkzServiceImpl implements XworkzService{
	
	@Autowired
	private XworkzRepository repository;
	
	private boolean save;

	@Override
	public boolean save(XworkzDTO xworkzDTO) {
		
		String name=xworkzDTO.getName();
		save= true;

        if(name.length()>5 && name.matches("[A-Za-z ]+")){
        System.out.println("name valid");

    }
        else {
        save=false;
        System.out.println("name is invalid");
    }
    int age=xworkzDTO.getAge();
        if(age>18){

        System.out.println("age is valid");
    }
        else{
        save=false;
        System.out.println("age is invalid");
        return save;
    }
    String email=xworkzDTO.getEmail();
        if(email.contains("@gmail.com")){

        System.out.println("email is valid");
    }
        else {
            save = false;
            System.out.println("email is invalid");
        }



    String password=xworkzDTO.getPassword();


    String confirmPassword=xworkzDTO.getConfirmPassword();
        if(confirmPassword.equals(password)){

        System.out.println("comfpassword is valid");
    }
        else{
        save=false;
        System.out.println("confpassword is in valid");

    }

    String phNo= String.valueOf(xworkzDTO.getPhoneNo());
        if(phNo.startsWith("9") && phNo.length()==10){
        	save=true;
        System.out.println("phno is valid");
    }
        else {
            save=false;
        System.out.println("phone is in valid");

    }

if(save) {System.out.println("calling save repo");
   XworkzEntity entity = new XworkzEntity();
    entity.setName(xworkzDTO.getName());
    entity.setAge(xworkzDTO.getAge());
    entity.setEmail(xworkzDTO.getEmail());
    entity.setPassword(xworkzDTO.getPassword());
    entity.setConfirmPassword(xworkzDTO.getConfirmPassword());
    entity.setPhoneNo(xworkzDTO.getPhoneNo());
    XworkzRepository xRepository = new XworkzRepoImpl();
   boolean saved = xRepository.save(entity);
}
        System.out.println(save);
        return save;

}
}

