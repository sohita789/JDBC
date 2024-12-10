package com.xworkz.fruits.service;

import java.sql.Date;
import java.util.List;

import com.xworkz.fruits.repository.FruitRepoImpl;
import com.xworkz.fruits.repository.FruitRepository;

public class FruitServiceImpl implements FruitService {

	@Override
	public long getPhNoById(int id) {
		FruitRepository fruitRepo = new FruitRepoImpl();
		Long phNo = fruitRepo.getPhNoById(id);
		return phNo;
	}

	@Override
	
	public List<String> getNameByQuantity(int quantity) {
		FruitRepository fruitRepo = new FruitRepoImpl();
		List<String> name = fruitRepo.getNameByQuantity(quantity);
		return name;
	}

	@Override
	public Double getCostByphno(long phno) {
		FruitRepoImpl fruitRepo = new FruitRepoImpl();
		Double cost = fruitRepo.getCostByphNo(phno);
		return cost;
	}

	@Override
	public String getMartNameAndName(int id, String name) {
		System.out.println("");
		return null;
	}

	@Override
	public List<String> getNameByQuantity1(int quantity) {
		System.out.println("");
		return null;
	}
  }