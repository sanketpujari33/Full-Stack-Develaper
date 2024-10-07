package com.mock.service;

import com.mock.dao.UserDao;

public class UserService {
	private UserDao dao;
	public UserService(UserDao dao) {
		this.dao=dao;
		}
	public UserService() {}
	public String getNameByUserId(Integer id) {
		String name =dao.findNameById(id);
				return name;
	}
	public String getEmailByUserId(Integer id) {
			String email=dao.findEmailById(id);
			return email;
	}
	}
