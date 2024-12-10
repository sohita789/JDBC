package com.xworkz.fruits.repository;

import java.sql.Date;
import java.util.List;

public interface FruitRepository {
	
  long getPhNoById(int id);

  Double getCostByphno(long phNo);

  String getMartNameandName(int id, String name);

  List<String> getNameByQuantity(int quantity);

}