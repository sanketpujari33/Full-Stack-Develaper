package com.hibernate;

public class Student {
		private int sno;
		private String sname;
		private double marks;
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public String toString() {
			return "Student [sno=" + sno + ", sname=" + sname + ", marks=" + marks + "]";
		}
}
