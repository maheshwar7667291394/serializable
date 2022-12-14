package question4;

import java.io.Serializable;

public class Employee  implements Serializable{
	private int empId;
		private String empName;
		private Address address; // Employee Has Address
		private String email;
		private String Password;
		
		public Employee() {}

		public Employee(int empId, String empName, Address address, String email, String password) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.address = address;
			this.email = email;
			Password = password;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		};
		
		
	
	

}
