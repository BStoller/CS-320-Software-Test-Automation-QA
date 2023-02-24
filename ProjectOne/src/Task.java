
public class Task {
	private String Id;
	
	public String getId() {
		return Id;
	}
	
	private void SetId(String id) throws Exception {
		if(id.length() > 10)
			throw new Exception("Id cannot be longer than 10 characters");
		
		Id = id;
	}
	
	private String Name;
	
	public String GetName() {
		return Name;
	}
	
	public void SetName(String name) throws Exception {
		if(name.length() > 20)
			throw new Exception("Name cannot be longer than 20 characters");
		
		Name = name;
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

	
	public Task(String id, String name, String description) throws Exception {
		SetId(id);
		SetName(name);
		SetDescription(description);
	}
}
