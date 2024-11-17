package com.xworkz.scholarshipService;

import com.xworkz.scholarshipDTO.ScholarshipDTO;
import com.xworkz.scholarshipRepository.ScholarshipRepoImpl;

public class ScholarshipServiceImpl implements ScholarshipService {
	@Override
	public boolean save(ScholarshipDTO dTO) {
			System.out.println(" Save in scholarshipService");
			
			boolean isvalid = true;
			
			
			if(dTO.getId().length()<3 || dTO.getId().isEmpty()) {
				System.out.println("data is inCorrect");
				
			
			isvalid = false;
			}
			
			if(dTO.getStudentName().length()<3 || dTO.getStudentName().isEmpty()){
				System.out.println("data is inCorrect");
				
				isvalid = false;
			}
			if(dTO.getCourse().length()<4 || dTO.getCourse().isEmpty()){
				System.out.println("data is inCorrect");
				
				isvalid = false;
				}
			if(!(dTO.getEmail().contains("@") && dTO.getEmail().endsWith(".com")||dTO.getEmail().endsWith(".in"))) {
				System.out.println("data is incorrect");
				isvalid = false;
			}
			
			
			if(isvalid) {
				ScholarshipRepoImpl scholarshipRepo =new ScholarshipRepoImpl();
				
		boolean saved = scholarshipRepo.save(dTO);
		System.out.println("saved=="+saved);
			}
			else {
				return false;
			}
			return isvalid;
		

	}

}
			


