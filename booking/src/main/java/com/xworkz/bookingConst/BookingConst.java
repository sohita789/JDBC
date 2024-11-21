package com.xworkz.bookingConst;

public enum BookingConst {
	
	URL("jdbc:mysql://localhost:3306/booking"),USER("root"),PASSWORD("xworkzodc");
	
	private String value;
	
	private BookingConst(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}


