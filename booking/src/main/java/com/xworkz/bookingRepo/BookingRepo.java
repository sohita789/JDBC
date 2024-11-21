package com.xworkz.bookingRepo;

import com.xworkz.bookingDTO.BookingDTO;

public interface BookingRepo {
	
		 boolean save(BookingDTO dto);
		 
		 String getlistById(int id);
		 
		 String getemailByPhone(long phone);
		 
		 String  checkEmailPassword(String email, String password);
		 
		 int deleteById(int id);
		 
		String updatedByemail(String name,String address,String email);

}
