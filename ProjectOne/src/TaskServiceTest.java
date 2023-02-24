import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TaskServiceTest {
	@Test
	public void TestAdding() {
		TaskService service = new TaskService();
		
		assertDoesNotThrow(() -> {
				service.AddTask("test", "Blake", "Stoller");
		});
		
		Exception addDupResult = assertThrows(Exception.class, () -> {
			service.AddTask("test", "Blake", "Stoller");
		});
		
		assertTrue(addDupResult.getMessage().equals("Id already exists"));
	}
	
	@Test
	public void TestDeleting() {
		TaskService service = new TaskService();
		
		assertDoesNotThrow(() -> {
			service.AddTask("test", "Blake", "Stoller");
		});
		
		service.DeleteTask("test");
		
		assertTrue(service.Tasks.isEmpty());
	}
	
	@Test
	public void TestUpdating() {
		
		TaskService service = new TaskService();
		
		assertDoesNotThrow(() -> {
			Task con = new Task("Test", "Blake", "Stoller");
			service.AddTask(con.getId(), con.GetName(), con.GetDescription());
			
			service.UpdateName("Test", "John");
			service.UpdateDescription("Test", "Smith");
		});
		
		Task con = service.Tasks.get("Test");
		
		assertEquals(con.GetName(), "John");
		assertEquals(con.GetDescription(), "Smith");
		
	}
}
