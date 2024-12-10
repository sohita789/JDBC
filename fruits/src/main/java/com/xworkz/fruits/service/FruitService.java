package com.xworkz.fruits.service;

import java.sql.Date;
import java.util.List;

public interface FruitService {
    long getPhNoById(int id);

	List<String> getNameByQuantity(int quantity);

	Double getCostByphno(long phNo);

	String getMartNameAndName(int id, String name);

	List<String> getNameByQuantity1(int quantity);

	

	

	

}