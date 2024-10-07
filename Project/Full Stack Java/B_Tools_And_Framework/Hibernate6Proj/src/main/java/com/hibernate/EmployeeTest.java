package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeTest {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=new Employee();
//		emp.setEmpId(111);
		emp.setAmpName("Sanket");
		emp.setEmSalary(1000000000);
		s.persist(emp);
		tx.commit();
		s.close();
	}

}
