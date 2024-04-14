package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
public class StudentUpdate {

    public static void main(String[] args) {
    	SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//Method1 
		/*Student stud=s.get(Student.class,222);// select * from StudentInfo where sn0=111;
		stud.setMarks(20000);
		s.merge(stud);// s.Update(stud); // prior to hib ernate 6 version */

		//Method 2 - Using HQL (Hibernate Query Language)- Applied on model (Class), not on table
		MutationQuery  query= s.createMutationQuery("update Student set marks=:marks where sname=:sname");
		query.setParameter("marks", 3000);
		query.setParameter("sname", "sanket");
		query.executeUpdate();
		
		/*
		 Prior Hibernate 6 version
		 ----------------------------
		Query query= s.createMutationQuery("update Student set marks=:marks where sname=:sname");
		query.setParameter("marks", 2000);
		query.setParameter("sname", "Ram");
		query.executeUpdate();
		 */
		tx.commit();
		s.close();
    }
}
