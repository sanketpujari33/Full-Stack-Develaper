package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jdbc.xml");
		StudentDao dao = (StudentDao) context.getBean("student");
//		dao.insertStudent(111,"Sanket", 24);
//		dao.updateStudent(111, 25);
//		dao.deleteStudent(111);
		
		
	List<Map<String,Object>> studList =dao.listStudents();		
			for(Map stud : studList)
				System.out.println(stud.get("id")+" "+ stud.get("name")+" "+stud.get("age"));
	}

}
