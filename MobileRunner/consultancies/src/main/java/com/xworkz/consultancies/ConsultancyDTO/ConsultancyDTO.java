package com.xworkz.consultancies.ConsultancyDTO;

import java.util.Objects;

public class ConsultancyDTO {

	private String consultancyName;
	private String consultantName;
	private String primaryContact;
	private String email;
	
	public ConsultancyDTO() {
		super();
	}

	public ConsultancyDTO(String consultantName, String consultancyName, String primaryContact, String email) {
		super();
		this.consultantName = consultantName;
		this.consultancyName = consultancyName;
		this.primaryContact = primaryContact;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ConsultancyDTO [consultancyName=" + consultancyName + ", consultantName=" + consultantName
				+ ", primaryContact=" + primaryContact + ", email=" + email + "]";
	}

	public String getConsultancyName() {
		return consultancyName;
	}

	public void setConsultancyName(String consultancyName) {
		this.consultancyName = consultancyName;
	}

	public String getConsultantName() {
		return consultantName;
	}

	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consultancyName, consultantName, email, primaryContact);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultancyDTO other = (ConsultancyDTO) obj;
		return Objects.equals(consultancyName, other.consultancyName)
				&& Objects.equals(consultantName, other.consultantName) && Objects.equals(email, other.email)
				&& primaryContact == other.primaryContact;
	}
	
	
	

}


