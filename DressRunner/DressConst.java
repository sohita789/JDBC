package com.xworkz.DressRunner;

public enum DressConst {
	URL("jdbc:mysql://localhost:3306/dress"),USERNAME("root"),PASSWORD("xworkzodc");
	private final String value;
	
	private DressConst(String value) {
		this.value=value;
		System.out.println("created the DressConstant with String value");
	}
  public String getValue() {
	  return value;
  }
}

