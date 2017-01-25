package com.rupp.repo;

public class TeamLeader extends Employee implements View {
	private Integer projectNum;

	public Integer getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(Integer projectNum) {
		this.projectNum = projectNum;
	}
	
	public TeamLeader(){}
	
	@Override
	public String getDataView() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		str.append(this.getFullName().toUpperCase());
		str.append(" ");
		str.append(this.getProjectNum());
		return super.getDataView();
	}
	
	
	
	
	
}
