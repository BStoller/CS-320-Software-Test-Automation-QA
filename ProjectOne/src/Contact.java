
public class Contact {
	private String Id;
	
	public String getId() {
		return Id;
	}
	
	public void SetId(String id) throws Exception {
		if(id.length() > 10)
			throw new Exception("Id cannot be longer than 10 characters");
		
		Id = id;
	}
	
	private String FirstName;
	
	public String GetFirstName() {
		return FirstName;
	}
	
	public void SetFirstName(String firstName) throws Exception {
		if(firstName.length() > 10)
			throw new Exception("First name cannot be longer than 10 characters");
		
		FirstName = firstName;
	}
	
	private String LastName;
	
	public String GetLastName() {
		return LastName;
	}
	
	public void SetLastName(String lastName) throws Exception {
		if(lastName.length() > 10)
			throw new Exception("Last name cannot be longer than 10 characters");
		
		LastName = lastName;
	}
	
	private String Phone;
	
	public String GetPhone() {
		return Phone;
	}
	
	public void SetPhone(String phone) throws Exception {
		if(phone.length() != 10)
			throw new Exception("Phone must be 10 characters");
		
		for(int i = 0; i < phone.length(); i++) {
			var charAt = phone.charAt(i);
			
			if(!Character.isDigit(charAt))
				throw new Exception("Phone must be all digits");
		}
		
		Phone = phone;
	}
	
	private String Address;
	
	public String GetAddress() {
		return Address;
	}
	
	public void SetAddress(String address) throws Exception {
		
		if(address.length() > 30)
			throw new Exception("Address cannot be longer than 30 characters");
		
		Address = address;
	}
	
	public Contact(String id, String firstName, String lastName, String phone, String address) throws Exception {
		SetId(id);
		SetFirstName(firstName);
		SetLastName(lastName);
		SetPhone(phone);
		SetAddress(address);
	}
}
