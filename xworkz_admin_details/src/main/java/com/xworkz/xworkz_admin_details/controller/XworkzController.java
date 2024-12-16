package com.xworkz.xworkz_admin_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 
import com.xworkz.xworkz_admin_details.DTO.XworkzDTO;
import com.xworkz.xworkz_admin_details.service.XworkzService;
import com.xworkz.xworkz_admin_details.service.XworkzServiceImpl;



@Controller
@RequestMapping("/")
public class XworkzController {
	 @Autowired
	 private XworkzService xworkzService;

 XworkzController(){
	System.out.println("created no args XworkzController");
}
  
 
 @GetMapping("/login")

	public String onSave() {
		System.out.println("running onSave method in MusicController ");
		return "index.jsp";
	}

	@PostMapping("/login")

	public String onSave(XworkzDTO xworkzDTO) {
		System.out.println(xworkzDTO.toString());
		XworkzService xworkzService = new XworkzServiceImpl();
		boolean saved = xworkzService.save(xworkzDTO);
         
		return "index.jsp";
	}
/////////////////
 //   @PostMapping("/login")
  //  public String onSave(XworkzDTO xworkzDTO){
   //     System.out.println(xworkzDTO);
   //     boolean save = xworkzService.save(xworkzDTO);
     //   if(save) {
            
        
      //  return "xworkz.jsp";
  //  }
	//	return "index.jsp";
}


