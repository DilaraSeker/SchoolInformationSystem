package Model;

import java.util.Vector;

@SuppressWarnings({ "serial", "rawtypes" })
public class Person extends Vector{

	protected String surname;
	protected String name;
	
	public Person(String surname, String name) {
		super();
		this.surname = surname;
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
