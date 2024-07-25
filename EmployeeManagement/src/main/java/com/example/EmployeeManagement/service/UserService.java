package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.model.User;
import com.example.EmployeeManagement.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
