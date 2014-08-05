package hospital.model;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




public abstract class Person {
	
	protected String name;
	protected String id;
	protected String gender;

	protected Date birth;
	protected String phone;
	protected String addr;
	
	public Person (String name, String id, String gender, Date birth, String phone, String addr) throws Exception{
		
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.birth = birth;
		this.phone = phone;
		this.addr = addr;
		
		/****************************************************************/	
		// -----precondition:----- 
		// name cannot be null
		// id cannot be null
		// does has same value existed in the system
		// birth cannot be null
		// phone cannot be null
		// address cannot be null
		
		// ------postcondition:-----
		//
		//ensure new patient details added to the record	
		/****************************************************************/
		
		if (name == null || name.isEmpty()) throw new Exception ("Please enter correct value, name cannot be empty.");
		if (id == null || id.isEmpty()) throw new Exception ("Please enter correct value, ID cannot be empty.");
		if (phone == null || phone.isEmpty()) throw new Exception ("Please enter a contact number, it cannot be empty.");
		if (addr == null || addr.isEmpty()) throw new Exception ("Please enter address, it cannot be empty.");
		if (birth == null ) throw new Exception ("Please enter a valid date, it cannot be empty.");
		if (gender == null) throw new Exception ("Please enter address, it cannot be empty.");
	}	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDOB() {
		return birth;
	}

	public void setDOB(Date birth) {
		this.birth = birth;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	private static boolean isDate(String birth, String format) {

	    if (birth == null || birth.isEmpty() || format == null || format.isEmpty()) {
	        return false;
	    }

	    if (format.replaceAll("'.+?'", "").indexOf("y") < 0) {
	        format += "/yyyy";
	        DateFormat formatter = new SimpleDateFormat("/yyyy");
	        birth += formatter.format(new Date());
	    }

	    DateFormat formatter = new SimpleDateFormat(format);
	    formatter.setLenient(false);
	    ParsePosition p = new ParsePosition(0);
	    Date date = formatter.parse(birth, p);

	    if (date == null || p.getErrorIndex() > 0) {
	        return false;
	    }
	    if (p.getIndex() != birth.length()) {
	        return false;
	    }

	    if (formatter.getCalendar().get(Calendar.YEAR) > 9999) {
	        return false;
	    }

	    return true;
	}
		
}





