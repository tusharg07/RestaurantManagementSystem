package com.tka.project.RMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scheff {
	
	private int id;
	private String name;
	private String branch;
	private String salary;
	private String age;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Scheff [id=" + id + ", name=" + name + ", branch=" + branch + ", salary=" + salary + ", age=" + age
				+ "]";
	}

}
