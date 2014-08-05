package hospital.model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {

	public Patient(String name, String id, String gender, Date dob,
			String phone, String addr) throws Exception {
		super(name, id, gender, dob, phone, addr);
				
		/****************************************************************/	
		// -----precondition:----- 
		// patient id cannot have the two records of the same value
		// name,id, gender, birthday cannot be null
	
		
		// ------postcondition:-----
		//ensure new patient details added to the record	
		/****************************************************************/
		
		
		/****************************************************************/	
		//Create ArrayList to store the treatment record		
		/****************************************************************/	
		
		
		ArrayList<Patient> pl = new ArrayList<Patient>();
		
		int i = 0;
		
		boolean isExist = false;
		
		//Require there are no two patients have the same ID.
		
		for (Patient pat : pl){
			if(pat.getID().equals(this.id)){
				isExist = true;
		
		// System.out.println("The Patient ID you entered is already existed.");  
		
				break;
			}
			
		if(!isExist){
			pl.add(new Patient (name, id, gender, dob, phone, addr));
			i++;			
			}
		}
	}				
}

