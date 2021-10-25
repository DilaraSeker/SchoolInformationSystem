package Model;

@SuppressWarnings("serial")
public class Teacher extends Person{
	
	String branch;
	int salary;
	
	public Teacher(String surname, String name, String branch, int salary) {
		super(surname, name);
		this.branch = branch;
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
