package Model;

import javax.json.JsonArray;

public class SchoolBus {
	
	private String schoolBusID;
	private int capacity;
	private String status;
	private String arrived;
	private JsonArray students;
	
	public SchoolBus(String schoolBusID, int capacity, String status, String arrived, JsonArray students) {
		super();
		this.schoolBusID = schoolBusID;
		this.capacity = capacity;
		this.status = status;
		this.arrived = arrived;
		this.students = students;
	}
	
	public String getSchoolBusID() {
		return schoolBusID;
	}
	public void setSchoolBusID(String schoolBusID) {
		this.schoolBusID = schoolBusID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getArrived() {
		return arrived;
	}
	public void setArrived(String arrived) {
		this.arrived = arrived;
	}
	public JsonArray getStudents() {
		return students;
	}
	public void setStudents(JsonArray students) {
		this.students = students;
	}
	
	
	
	
}
