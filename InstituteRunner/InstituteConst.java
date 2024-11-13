package com.xworkz.InstituteRunner;

public enum InstituteConst {
	URL("jdbc:mysql://localhost:3306/institute"),USERNAME("root"),PASSWORD("xworkzodc");
	private final String value;
	
	private InstituteConst(String value) {
		this.value=value;
	}
  public String getValue() {
	  return value;
  }
}

