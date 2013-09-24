package com.steel.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class MapStringAction extends ActionSupport {

	private static final long serialVersionUID = -3162733771538943627L;

	private Map<String,String> mapStr = null;
	public String execute(){
		
		mapStr = new HashMap<String, String>();
		mapStr.put("1", "Koo");
		mapStr.put("2", "Wendy");
		return SUCCESS;
	}
	public Map<String, String> getMapStr() {
		return mapStr;
	}
	public void setMapStr(Map<String, String> mapStr) {
		this.mapStr = mapStr;
	}
	
}
