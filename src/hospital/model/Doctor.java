package hospital.model;

import java.util.Date;


public class Doctor extends Person{
	
	public Doctor(String name, String id, String gender, Date dob,
			String phone, String addr) throws Exception {
		super(name, id, gender, dob, phone, addr);

	}

	private String specialty;
	
	
	public String getSepcialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
		

	
}
	
