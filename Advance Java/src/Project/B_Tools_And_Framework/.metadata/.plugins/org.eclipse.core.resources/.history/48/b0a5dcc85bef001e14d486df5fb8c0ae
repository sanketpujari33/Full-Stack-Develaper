package com.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class StudentDelete {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//Method1 
		/* Student stud = new Student();
		stud.setSno(111);
		s.remove(stud); //s.delete(stud); // prior Hibernate 6
		*/
		
		//Method2
		/*Student stude =s.get(Student.class, 333);
		s.remove(stude);
		*/
		
		//Method3
		SelectionQuery<Student> query= s.createSelectionQuery("from Student where marks >= :marks", Student.class);
		query.setParameter("marks", 1000000);
		List<Student> studList = query.list();
		for(Student stud: studList)
			s.remove(stud);
		tx.commit();
		s.close();
	} 

}
