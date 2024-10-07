package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	    // Setter method for jdbcTemplate
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;

	    }
	public void insertStudent(int id, String name, int age) {
		String SQL="insert into Student values (?,?,?)";
		jdbcTemplate.update(SQL,id,name, age);
		System.out.println("Student Insert");
	}
	public void updateStudent(int id, int age) {
		String SQL="update Student set age=? where id=?";
		jdbcTemplate.update(SQL,id, age);
		System.out.println("Student update");
	}


	public void deleteStudent(int id) {
		String SQL="delete from Student where id=?";
		jdbcTemplate.update(SQL,id);
		System.out.println("Student delete");
	}
	
	public List<Map<String, Object>> listStudents() {
		String SQL = "select * from Student";
		
		return jdbcTemplate.queryForList(SQL);
	}

}
