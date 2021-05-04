package Adapter;

import java.util.Date;

public class Edevlet {
	
	final int id =1;
	final String firstName="özkan";
	final String lastName="demirel";
	final String nationalityId="12345678902";
	final Date dateOfBirth=new Date(1986, 01, 14);
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	

}
