package com.steel.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.steel.pojo.User;

public class MapListAction extends ActionSupport {

	private static final long serialVersionUID = -2646314740254951166L;
	private Map<String,List<User>> listMap = null;
	public String execute(){
		listMap = new HashMap<String, List<User>>();
		List<User> users1 = new ArrayList<User>();
		users1.add(new User(1, "wxngl", 21, "beijing"));
		users1.add(new User(2, "xingxing", 20, "weihai"));
		listMap.put("class1", users1);
		List<User> users2 = new ArrayList<User>();
		users2.add(new User(1, "shuaiqi", 21, "shanghai"));
		users2.add(new User(2, "baqi", 20, "guilin"));
		listMap.put("class2", users2);
		return SUCCESS;
	}
	public Map<String, List<User>> getListMap() {
		return listMap;
	}
	public void setListMap(Map<String, List<User>> listMap) {
		this.listMap = listMap;
	}
}
