package com.xworkz.MobileRunner;

public enum MobileConst {
	URL("jdbc:mysql://localhost:3306/mobile"),USERNAME("root"),PASSWORD("xworkzodc");
	private final String value;
	
	private MobileConst(String value) {
		System.out.println("created MobileConstant with String value");
		this.value=value;
	}
  public String getValue() {
	  return value;
  }
}

