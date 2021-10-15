package com.phint2.pattern.structural.proxy.protection;

public class UserServiceProxy implements UserService {

	private static final String ADMIN = "admin";
	private String role;
	private UserService userService;

	public UserServiceProxy(String name, String role) {
		this.role = role;
		this.userService = new UserServiceImpl(name);
	}

	@Override
	public void load() {
		userService.load();
	}

	@Override
	public void insert() {
		if (isAdmin()) {
			userService.insert();
		} else {
			throw new IllegalAccessError("Access denied");
		}
	}

	private boolean isAdmin() {
		return ADMIN.equalsIgnoreCase(this.role);
	}
}
