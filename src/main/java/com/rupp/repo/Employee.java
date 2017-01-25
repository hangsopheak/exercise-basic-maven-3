package com.rupp.repo;


public class Employee extends Person implements View{
	private Double salary;
	private Integer years;
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Integer getYears() {
		return years;
	}
	
	public void setYears(Integer years) {
		this.years = years;
	}

	@Override
	public String getDataView() {
		
		// TODO Auto-generated method stub
		return "Salary: " + this.getSalary() 
			+ "; Years: " + this.getYears() 
			+ "; First Name: " + this.getFirstName()
			+ "; Last Name: " + this.getLastName()
			+ "; DOB: " + this.getBirthDateAsString();
	}
	
	
}
