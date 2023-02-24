import java.util.ArrayList;
import java.util.HashMap;

public class ContactService {
	public HashMap<String, Contact> Contacts = new HashMap<String, Contact>();
	
	public void AddContact(String id, String firstName, String lastName, String phone, String address) throws Exception {
		Contact newContact = new Contact(id, firstName, lastName, phone, address);
		
		if(Contacts.containsKey(id))
			throw new Exception("Id already exists");
		
		Contacts.put(id, newContact);
	}
	
	public void DeleteContact(String id) {
		Contacts.remove(id);
	}
	
	public void UpdateFirstName(String id, String firstName) throws Exception {
		Contact contact = Contacts.get(id);
		
		contact.SetFirstName(firstName);
		
		Contacts.put(id, contact);
	}
	
	public void UpdateLastName(String id, String lastName) throws Exception {
		Contact contact = Contacts.get(id);
		
		contact.SetLastName(lastName);
		
		Contacts.put(id, contact);
	}
	
	public void UpdatePhone(String id, String phone) throws Exception {
		Contact contact = Contacts.get(id);
		
		contact.SetPhone(phone);
		
		Contacts.put(id, contact);
	}
	
	public void UpdateAddress(String id, String address) throws Exception {
		Contact contact = Contacts.get(id);
		
		contact.SetAddress(address);
		
		Contacts.put(id, contact);
	}
}
