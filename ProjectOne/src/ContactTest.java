import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test
	void TestCreatingNew() {
		// Should work
		assertDoesNotThrow(() -> {
			new Contact("test21587", "Blake", "Stoller", "1234567890", "12345 Rd Rd");
		});
		
		Exception idResult = assertThrows(Exception.class, () -> {
			new Contact("test2158716", "Blake", "Stoller", "1234567890", "12345 Rd Rd");
		});
		
		Exception firstNameResult = assertThrows(Exception.class, () -> {
			new Contact("test21587", "BlakeStoller", "Stoller", "1234567890", "12345 Rd Rd");
		});
		
		Exception lastNameResult = assertThrows(Exception.class, () -> {
			new Contact("test21587", "Blake", "BlakeStoller", "1234567890", "12345 Rd Rd");
		});
		
		Exception phoneResult = assertThrows(Exception.class, () -> {
			new Contact("test21587", "Blake", "Stoller", "12345678901", "12345 Rd Rd");
		});
		
		Exception phoneResult2 = assertThrows(Exception.class, () -> {
			new Contact("test21587", "Blake", "Stoller", "123456789", "12345 Rd Rd");
		});
		
		Exception addressResult = assertThrows(Exception.class, () -> {
			new Contact("test21587", "Blake", "Stoller", "12345678901", "12345 Rd Rdghwoeghoiw");
		});
	}
}
