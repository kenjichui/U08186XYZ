package hospital.model;

import java.util.ArrayList;

public class Treatment {
	
	public String treatID;
	public String treatName;
	public String docInCharge;
	public String roomID;
	
	public Treatment (String treatID, String treatName, String docInCharge, String roomID) throws Exception{
		
		this.treatID = treatID;
		this.treatName = treatName;
		this.docInCharge = docInCharge;
		this.roomID = roomID;
		
		
		if (treatName == null || treatName.isEmpty()) throw new Exception ("Please enter valid treatment name.");
		if (treatID == null || treatID.isEmpty()) throw new Exception ("Please enter valid treatment number.");
		if (docInCharge == null || docInCharge.isEmpty()) throw new Exception ("Please enter valid doctor's name.");
		if (roomID == null || roomID.isEmpty()) throw new Exception ("Please enter a valid room number.");

		
	}
		
		/****************************************************************/	
		// -----precondition:----- 
		// treatName cannot be null
		// treatID cannot be null
		// docInCharge does has same value existed in the system
		// roomID cannot be null
		
		// ------postcondition:-----
		//
		//ensure new treatment details added to the record	
		/****************************************************************/
		
			

		private String getTreatID() {
			return treatID;
		}
	
		private void setTreatID(String treatID) {
			this.treatID = treatID;
		}
	
		private String getTreatName() {
			return treatName;
		}
	
		private void setTreatName(String treatName) {
			this.treatName = treatName;
		}
	
		private String getDocInCharge() {
			return docInCharge;
		}
	
		private void setDocInCharge(String docInCharge) {
			this.docInCharge = docInCharge;
		}
	
		private String getRoomID() {
			return roomID;
		}
	
		public void setRoomID(String roomID) {
			this.roomID = roomID;
		}

		public ArrayList<Treatment> addTreatment() throws Exception{

			/****************************************************************/	
			// Create ArrayList to store the treatment record		
			/****************************************************************/	
			
			ArrayList<Treatment> tl = new ArrayList<Treatment>();
				
				int j = 0;
				
				boolean isExist = false;
				
				//Require there are no two treatment have the same ID.
				
				for (Treatment tre : tl){
					if(tre.getTreatID().equals(this.treatID)){
						isExist = true;
				
				// System.out.println("The Treatment ID you entered is already existed.");  
				
						break;
					}
					
				if(!isExist){
					tl.add(new Treatment (treatID, docInCharge, docInCharge, docInCharge));
					j++;			
					}
				
		
		}
				return tl;
				
		}
		

	}

