package com.xworkz.loanConst;

public enum LoanConst {
URL("jdbc:mysql://localhost:3306/loandata"),USER("root"),PASSWORD("xworkzodc");
	
	private String value;
	
	private LoanConst(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}



