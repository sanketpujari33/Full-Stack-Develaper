package com.spring;

public class Employee {
		private int empId;
		private String empName;
		private int empSalary;
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
		public int getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(int empSalary) {
			this.empSalary = empSalary;
		}
		public String toString() {
			
			return empId+" "+empName+" "+empSalary;
		}
		
}
