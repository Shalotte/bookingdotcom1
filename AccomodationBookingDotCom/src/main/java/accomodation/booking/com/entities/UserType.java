package accomodation.booking.com.entities;

public class UserType extends UserEntity{
	
	private String type;
	private String description;
	
	public UserType() {
	}

//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	
    public UserType(String type, String description) {
		super();
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserType [type=" + type + ", description=" + description + "]";
	}
}
