package com.steel.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.steel.pojo.User;

public class MapObjectAction extends ActionSupport {

	private static final long serialVersionUID = -2813364347372968944L;

	private Map<Integer,User> userMap = new HashMap<Integer, User>();

	public Map<Integer, User> getUserMap() {
		createUserMap();
		return userMap;
	}

	private void createUserMap() {
		userMap.put(new Integer(1), new User(1,"Lufy",22,"shanghai"));
		userMap.put(new Integer(2), new User(1,"Sanzi",23,"shanghai"));
		userMap.put(new Integer(3), new User(1,"Lubin",21,"shanghai"));
	}

	public void setUserMap(Map<Integer, User> userMap) {
		this.userMap = userMap;
	}
}
