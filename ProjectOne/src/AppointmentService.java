import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class AppointmentService {
	public HashMap<String, Appointment> Tasks = new HashMap<String, Appointment>();
	
	public void AddAppointment(String id, LocalDate date, String description) throws Exception {
		Appointment newAppointment = new Appointment(id, date, description);
		
		if(Tasks.containsKey(id))
			throw new Exception("Id already exists");
		
		Tasks.put(id, newAppointment);
	}
	
	public void DeleteAppointment(String id) {
		Tasks.remove(id);
	}
}
