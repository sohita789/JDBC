package com.xworkz.consultancies.ConsultancyConst;

public enum Consultancy {

	
URL("jdbc:mysql://localhost:3306/consultancy"),USER("root"),PASSWORD("xworkzodc");
	
	private String value;
	
	private Consultancy(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}

