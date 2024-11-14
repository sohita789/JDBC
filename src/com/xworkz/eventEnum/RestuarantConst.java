package com.xworkz.eventEnum;

public enum RestuarantConst {

	URL("jdbc:mysql://localhost:3306/restuarant"),USERNAME("root"),PASSWORD("xworkzodc");
	private final String value;
	
	private RestuarantConst(String value) {
		this.value=value;
		System.out.println("created the RestuarantConstant with String value");
	}
  public String getValue() {
	  return value;
  }
}

