package question2;

import java.io.Serializable;

public class employee implements Serializable{
	
	private String name;
	private String birth;
	private String department;
	private String designation ;
	 private int salary;
	 
	 public employee() {}

	public employee(String name, String birth, String department, String designation, int salary) {
		super();
		this.name = name;
		this.birth = birth;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
	 
	 

}
