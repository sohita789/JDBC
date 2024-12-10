package com.xworkz.fruits.entity;

import java.sql.Date;
import java.util.List;

import com.xworkz.fruits.service.FruitService;
import com.xworkz.fruits.service.FruitServiceImpl;

public class FruitRunner {
        public static void main(String[] args) {

		FruitService service = new FruitServiceImpl();
		Long phNo = service.getPhNoById(2);
		System.out.println(phNo);

		List<String> name = service.getNameByQuantity(2);
		for (String string : name) {
			System.out.println(string);
		}

		Double cost = service.getCostByphno(9741591749L);
		System.out.println(cost);

		String martName = service.getMartNameAndName(1, "ashirwad");
		System.out.println(name);
	}

}