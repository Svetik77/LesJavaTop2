package ru.javawebinar.topjava;

import java.util.Set;

import ru.javawebinar.topjava.model.Role;

public class LoggedUser {
	protected int id;
	protected Set<Role> roles;
	protected boolean enabled;
	public int getId() {
		return id;
	}

	
}
