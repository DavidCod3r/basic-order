package entities;

import java.util.Date;

public class Cliente {
	
	private String name;
	private String email;
	private Date birthDate;
	
	
	public Cliente(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	

}
