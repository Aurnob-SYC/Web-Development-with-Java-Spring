package com.example.EmployeeManagement.dao;


import com.example.EmployeeManagement.model.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);

}
