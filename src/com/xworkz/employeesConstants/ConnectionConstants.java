package com.xworkz.employeesConstants;

public enum ConnectionConstants {
		URL("jdbc:mysql://localhost:3306/employees_details"), USERNAME("root"), PASSWORD("xworkzodc");

		private final String value;

		private ConnectionConstants(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}


