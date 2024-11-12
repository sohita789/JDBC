package com.xworkz.infosys;

public enum InfosysConst {

	URL("jdbc:mysql://localhost:3306/infosys"), USERNAME("root"), PASSWORD("xworkzodc");

	private final String value;

	private InfosysConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

