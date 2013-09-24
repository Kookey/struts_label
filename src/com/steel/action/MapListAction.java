package com.steel.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.steel.pojo.User;

public class MapListAction extends ActionSupport {

	private static final long serialVersionUID = -2646314740254951166L;
	private Map<String,List<User>> listMap = null;
	public String execute(){
		return SUCCESS;
	}
	public Map<String, List<User>> getListMap() {
		return listMap;
	}
	public void setListMap(Map<String, List<User>> listMap) {
		this.listMap = listMap;
	}
}
