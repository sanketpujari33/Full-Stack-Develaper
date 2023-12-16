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
		stud.setSno(333);
		stud.setSname("sita");
		stud.setMarks(011010);
		s.persist(stud);// insert into StudentInfo value (?,?,?)
		tx.commit();
		s.close();
	}

}
