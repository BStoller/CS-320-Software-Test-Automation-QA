import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class ContactServiceTests {
	@Test
	public void TestAdding() {
		ContactService service = new ContactService();
		
		assertDoesNotThrow(() -> {
				service.AddContact("test", "Blake", "Stoller", "1234567890", "12345 Rd");
		});
		
		Exception addDupResult = assertThrows(Exception.class, () -> {
			service.AddContact("test", "Blake", "Stoller", "1234567890", "12345 Rd");
		});
		
		assertTrue(addDupResult.getMessage().equals("Id already exists"));
	}
	
	@Test
	public void TestDeleting() {
		ContactService service = new ContactService();
		
		assertDoesNotThrow(() -> {
			service.AddContact("test", "Blake", "Stoller", "1234567890", "12345 Rd");
		});
		
		service.DeleteContact("test");
		
		assertTrue(service.Contacts.isEmpty());
	}
	
	@Test
	public void TestUpdating() {
		
		ContactService service = new ContactService();
		
		assertDoesNotThrow(() -> {
			Contact con = new Contact("Test", "Blake", "Stoller", "1234567890", "12345 Rd Rd");
			service.AddContact(con.getId(), con.GetFirstName(), con.GetLastName(), con.GetPhone(), con.GetAddress());
			
			service.UpdateFirstName("Test", "John");
			service.UpdateLastName("Test", "Smith");
			service.UpdatePhone("Test", "0987654321");
			service.UpdateAddress("Test", "Rd rd");
		});
		
		Contact con = service.Contacts.get("Test");
		
		assertEquals(con.GetFirstName(), "John");
		assertEquals(con.GetLastName(), "Smith");
		assertEquals(con.GetPhone(), "0987654321");
		assertEquals(con.GetAddress(), "Rd rd");
		
	}
}
