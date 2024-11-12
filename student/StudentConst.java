package com.xworkz.assign.student;

public enum StudentConst {

	URL("jdbc:mysql://localhost:3306/student"), USERNAME("root"), PASSWORD("xworkzodc");

	private final String value;

	private StudentConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

