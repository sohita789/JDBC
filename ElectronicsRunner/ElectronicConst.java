package com.xworkz.ElectronicsRunner;

public enum ElectronicConst {
	URL("jdbc:mysql://localhost:3306/electronics"),USERNAME("root"),PASSWORD("xworkzodc");
	private final String value;
	
	private ElectronicConst(String value) {
		this.value=value;
		System.out.println("Created the ElectronicConst with String");
	}
  public String getValue() {
	  return value;
  }
}
