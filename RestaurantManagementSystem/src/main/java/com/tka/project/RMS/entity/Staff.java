package com.tka.project.RMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	private int staffId;
	private String staffName;
	private String staffDes;
	private String staffSalary;
	
	@Id
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDes() {
		return staffDes;
	}
	public void setStaffDes(String staffDes) {
		this.staffDes = staffDes;
	}
	public String getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(String staffSalary) {
		this.staffSalary = staffSalary;
	}
	
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffDes=" + staffDes + ", staffSalary="
				+ staffSalary + "]";
	}
	
	

}
