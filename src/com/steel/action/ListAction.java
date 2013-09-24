package com.steel.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.steel.pojo.User;

public class ListAction extends ActionSupport {

	private static final long serialVersionUID = -4574137833499111533L;
	private List<User> users = new ArrayList<User>();

	public String getList(){
		geUserList();
		return SUCCESS;
	}
	
	private void geUserList() {
		users.add(new User(1,"wangxl",23,"beijing"));
		users.add(new User(2, "houdongmei", 21, "shanghai"));
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
