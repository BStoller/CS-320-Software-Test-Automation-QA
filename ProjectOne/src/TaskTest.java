import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	void TestCreatingNew() {
		// Should work
		assertDoesNotThrow(() -> {
			new Task("test21587", "Blake", "Stoller");
		});
		
		Exception idResult = assertThrows(Exception.class, () -> {
			new Task("test2158716", "Blake", "Stoller");
		});
		
		Exception nameResult = assertThrows(Exception.class, () -> {
			new Task("test21587", "ReallyLongNameThatShouldError", "Stoller");
		});
		
		Exception descriptionResult = assertThrows(Exception.class, () -> {
			new Task("test21587", "Blake", "This is a really long description that is longer than 50 characters. This should cause an error.");
		});
	}
}
