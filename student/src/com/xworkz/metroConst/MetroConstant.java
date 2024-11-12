package com.xworkz.metroConst;

public enum MetroConstant {

	URL("jdbc:mysql://localhost:3306/metro"), USERNAME("root"), PASSWORD("xworkzodc");

	private final String value;

	private MetroConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}


