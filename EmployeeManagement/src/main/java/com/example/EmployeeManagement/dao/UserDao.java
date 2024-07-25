package com.example.EmployeeManagement.dao;


import com.example.EmployeeManagement.model.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
