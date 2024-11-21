package com.xworkz.bookingService;

import com.xworkz.bookingDTO.BookingDTO;
import com.xworkz.bookingRepo.BookingRepoImpl;

public class BookingServiceImpl implements BookingService {

     public boolean save(BookingDTO dto) {
			BookingRepoImpl registrationRepoImpl=new BookingRepoImpl();
			registrationRepoImpl.save(dto);
			return true;
		}
	    
		public String getlistById(int id) {
			 String valid=null;
			if(id!=0) {
				System.out.println("data is not null");
				BookingRepoImpl registrationRepoImpl=new BookingRepoImpl();
				 valid=registrationRepoImpl.getlistById(id);
				System.out.println(valid);
				
			}
			else {
				System.out.println("data is null");
			}
			return  valid;
		}

		public String getemailByPhone(long phoneno) {
			
				 String valid=null;
				if(phoneno!=0 ) {
					System.out.println("data is not null");
					BookingRepoImpl registrationRepoImpl=new BookingRepoImpl();
					 valid=registrationRepoImpl.getemailByPhone(phoneno);
				
					
				}
				else {
					System.out.println("data is null");
				}
			return valid;
		}

		public String checkEmailPassword(String email, String password) {
			String valid=null;
			
			 BookingRepoImpl registrationRepo = new BookingRepoImpl();
		        String res = registrationRepo.checkEmailPassword(email, password);
		        
				return res;
		        
			
		}

		public int deleteById(int id) {
			BookingRepoImpl registrationRepo = new BookingRepoImpl();
	       int res = registrationRepo.deleteById(id);
			return res;
		}

		public String updatedByemail(String name,String address,String email) {
			String valid=null;
			BookingRepoImpl registrationRepo = new BookingRepoImpl();
		       String res = registrationRepo.updatedByemail(name,address,email);
			return valid;
		}

	}

