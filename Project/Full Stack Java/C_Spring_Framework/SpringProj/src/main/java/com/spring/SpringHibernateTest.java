package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-hibernate.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("emp");
		/* Employee emp= new Employee();
		emp.setEmpId(111);
		emp.setEmpName("Sanket");
		emp.setEmpSalary(51621212);
		dao.saveEmployee(emp);*/
//		dao.updateEmployee(111, 10000);
//		dao.deleteEmployee(111);
		List<Employee> empList = dao.listEmployee();
		for(Employee emp: empList)
			System.out.println(emp);
	}

}
