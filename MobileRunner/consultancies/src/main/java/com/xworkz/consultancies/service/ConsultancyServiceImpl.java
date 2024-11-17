package com.xworkz.consultancies.service;

import com.xworkz.consultancies.ConsultancyDTO.ConsultancyDTO;
import com.xworkz.consultancies.ConsultancyRepoImpl.ConsultancyRepoImpl;

public class ConsultancyServiceImpl implements ConsultancyService {

	@Override
public boolean save(ConsultancyDTO DTO) {
		System.out.println(" Save in SignUpService");
		
		boolean isvalid = true;
		
		if(DTO == null) {
			isvalid = false;
		}
		if(DTO.getConsultancyName().length()<3 || DTO.getConsultancyName().isEmpty()) {
			System.out.println("data is inCorrect");
		
		isvalid = false;
		}
		
		if(DTO.getConsultantName().length()<3 || DTO.getConsultantName().isEmpty()){
			System.out.println("data is inCorrect");
			
			isvalid = false;
		}
		if(DTO.getPrimaryContact().length()<4 || DTO.getPrimaryContact().isEmpty()){
			System.out.println("data is inCorrect");
			
			isvalid = false;
			}
		if(!(DTO.getEmail().contains("@") && DTO.getEmail().endsWith(".com")||DTO.getEmail().endsWith(".in"))) {
			System.out.println("data is incorrect");
			isvalid = false;
		}
		
		
		if(isvalid) {
			ConsultancyRepoImpl consultancyRepo =new ConsultancyRepoImpl();
	boolean saved = consultancyRepo.save(DTO);
	System.out.println("saved=="+saved);
		}
		else {
			return false;
		}
		return isvalid;
	

}}


		