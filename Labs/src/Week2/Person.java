package Week2;

import java.time.*;

public class Person {
	private String name;
	private LocalDate dob;
	private String gender;
	private String phone;
	
	public Person() {
		this.name = "";
		this.dob = dob.parse("1900-01-01");
		this.gender ="";
		this.phone="";
	}
	public Person(String name, String dob, String gender, String phone) {
		this.name = name;
		this.dob = LocalDate.parse(dob);
		this.gender ="";
		this.phone="";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = LocalDate.parse(dob);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
