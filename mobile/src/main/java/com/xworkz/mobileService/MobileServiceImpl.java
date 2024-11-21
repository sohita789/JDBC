package com.xworkz.mobileService;

import com.xworkz.mobileDTO.MobileDTO;
import com.xworkz.mobileRepository.MobileRepoImpl;

public class MobileServiceImpl implements MobileService{

	@Override
	public boolean save(MobileDTO bobileDTO) {

		System.out.println("This is servicce method");

		MobileRepoImpl mobileRepositoryImpl = new MobileRepoImpl();

		return mobileRepositoryImpl.save(bobileDTO);
	}



}
