import java.util.ArrayList;
import java.util.HashMap;

public class TaskService {
	public HashMap<String, Task> Tasks = new HashMap<String, Task>();
	
	public void AddTask(String id, String name, String description) throws Exception {
		Task newTask = new Task(id, name, description);
		
		if(Tasks.containsKey(id))
			throw new Exception("Id already exists");
		
		Tasks.put(id, newTask);
	}
	
	public void DeleteTask(String id) {
		Tasks.remove(id);
	}
	
	public void UpdateName(String id, String name) throws Exception {
		Task task = Tasks.get(id);
		
		task.SetName(name);
		
		Tasks.put(id, task);
	}
	
	public void UpdateDescription(String id, String lastName) throws Exception {
		Task task = Tasks.get(id);
		
		task.SetDescription(lastName);
		
		Tasks.put(id, task);
	}
}
