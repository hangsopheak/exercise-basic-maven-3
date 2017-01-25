package com.rupp.repo;

public class Developer extends Employee implements View {
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Developer() {}
	
	// Why this method cannot be generated by IDE? 
	@Override
	public String getDataView() {
		// TODO Auto-generated method stub
		return this.getFullName() + " " + this.getComment() + " " + this.getSalary();
	}
	
	
	
	
	
}