package com.java.hibercrud.services;

import com.java.hibercrud.User;

public interface Services {
	public void addUser(User u);
	public User getUser();
	public User[] getAllUsers();
	public User search(String name);
	public User update(User u);
	public User deleteUser(User u);
}
