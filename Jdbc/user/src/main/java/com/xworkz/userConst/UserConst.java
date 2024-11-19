package com.xworkz.userConst;

public enum UserConst {

URL("jdbc:mysql://localhost:3306/userdata"),USER("root"),PASSWORD("xworkzodc");
	
	private String value;
	
	private UserConst(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}



