package com.rupp.repo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person extends DCommon {
	private Date birthDate;
	private String lastName;
	private String firstName;
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public String getBirthDateAsString(){
		return dateToString(this.getBirthDate(), "yyyy-MM-dd");
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFullName(){
		return this.getFirstName() + " " + this.getLastName();
	}
	
	public static String dateToString(Date date, String dateFormat) {		
		SimpleDateFormat fmt = new SimpleDateFormat(dateFormat);
		return fmt.format(date);	
	}
}
