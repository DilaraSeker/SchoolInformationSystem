package Model;

public class Class{
	
	private String gradeID;
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	 	
	
	public Class(String gradeID, String monday, String tuesday, String wednesday, String thursday, String friday) {
		super();
		this.gradeID = gradeID;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
	}


	public String getGradeID() {
		return gradeID;
	}


	public void setGradeID(String gradeID) {
		this.gradeID = gradeID;
	}


	public String getMonday() {
		return monday;
	}


	public void setMonday(String monday) {
		this.monday = monday;
	}


	public String getTuesday() {
		return tuesday;
	}


	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}


	public String getWednesday() {
		return wednesday;
	}


	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}


	public String getThursday() {
		return thursday;
	}


	public void setThursday(String thursday) {
		this.thursday = thursday;
	}


	public String getFriday() {
		return friday;
	}


	public void setFriday(String friday) {
		this.friday = friday;
	}
	
	
}
