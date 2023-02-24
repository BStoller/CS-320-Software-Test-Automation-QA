import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class AppointmentServiceTest {
	@Test
	public void TestAdding() {
		AppointmentService service = new AppointmentService();
		
		assertDoesNotThrow(() -> {
			service.AddAppointment("test", LocalDate.of(2023, 4, 10), "Description");
		});
		
		Exception addDupResult = assertThrows(Exception.class, () -> {
			service.AddAppointment("test", LocalDate.of(2023, 4, 10), "Description");
		});
		
		assertTrue(addDupResult.getMessage().equals("Id already exists"));
	}
	
	@Test
	public void TestDeleting() {
		AppointmentService service = new AppointmentService();
		
		assertDoesNotThrow(() -> {
			service.AddAppointment("test", LocalDate.of(2023, 4, 10), "Description");
		});
		
		service.DeleteAppointment("test");
		
		assertTrue(service.Tasks.isEmpty());
	}
}
