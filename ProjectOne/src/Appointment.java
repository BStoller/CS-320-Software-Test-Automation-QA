import java.io.Console;
import java.time.LocalDate;
import java.util.Date;

public class Appointment {
	private String Id;
	
	public String getId() {
		return Id;
	}
	
	private void SetId(String id) throws Exception {
		if(id.length() > 10)
			throw new Exception("Id cannot be longer than 10 characters");
		
		Id = id;
	}
	
	private LocalDate Date;
	
	public LocalDate GetDate() {
		return Date;
	}
	
	public void SetDate(LocalDate date) throws Exception {
		if(date.isBefore(LocalDate.now()))
			throw new Exception("Date cannot be in the past");
		
		Date = date;
	}
	
	private String Description;
	
	public String GetDescription() {
		return Description;
	}
	
	public void SetDescription(String description) throws Exception {
		if(description.length() > 50)
			throw new Exception("Decription cannot be longer than 50 characters");
		
		Description = description;
	}

	
	public Appointment(String id, LocalDate date, String description) throws Exception {
		SetId(id);
		SetDate(date);
		SetDescription(description);
	}
}
