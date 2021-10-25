package Model;


@SuppressWarnings("serial")
public class Student extends Person{
	
	private String studentID;
	private int grade;
	private int age;
	private int fee;
	
	
	public Student(String studentID, String surname, String name,  int grade, int age, int fee) {
		super(surname, name);
		this.studentID = studentID;
		this.grade = grade;
		this.age = age;
		this.fee = fee;
	}

	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	

	
	
	

}
