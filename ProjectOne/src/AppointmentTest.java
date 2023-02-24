import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentTest {
	@Test
	void TestCreatingNew() {
		// Should work
		assertDoesNotThrow(() -> {
			new Appointment("test21587", LocalDate.of(2023, 4, 10), "Stoller");
		});
		
		Exception idResult = assertThrows(Exception.class, () -> {
			new Appointment("test21587891011", LocalDate.of(2023, 4, 10), "Stoller");
		});
		
		Exception dateResult = assertThrows(Exception.class, () -> {
			new Appointment("test21587", LocalDate.of(2022, 1, 10), "Stoller");
		});
		
		Exception descriptionResult = assertThrows(Exception.class, () -> {
			new Appointment("test21587", LocalDate.of(2023, 4, 10), "This is a really long description that is longer than 50 characters. This should cause an error.");
		});
	}
}
