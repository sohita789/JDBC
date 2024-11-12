package com.xworkz.trainConstant;

public enum TrainConstant {

	URL("jdbc:mysql://localhost:3306/train"), USERNAME("root"), PASSWORD("xworkzodc");

	private final String value;

	private TrainConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}


