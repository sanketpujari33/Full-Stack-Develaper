package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class StudentInsert {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student stud=new Student();
		stud.setSno(555);
		stud.setSname("Kirishan");
		stud.setMarks(1000);
		s.persist(stud);// insert into StudentInfo value (?,?,?)
		tx.commit();
		s.close();
	}

}
