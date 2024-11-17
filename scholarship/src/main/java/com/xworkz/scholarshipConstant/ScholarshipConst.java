package com.xworkz.scholarshipConstant;

public enum ScholarshipConst{
		
		
		URL("jdbc:mysql://localhost:3306/scholarship"),USER("root"),PASSWORD("xworkzodc");
		
		private String value;
		
		private ScholarshipConst(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}

