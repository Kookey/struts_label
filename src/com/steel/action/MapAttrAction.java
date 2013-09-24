package com.steel.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class MapAttrAction extends ActionSupport {


	private static final long serialVersionUID = 6150443497227899375L;

	private Map<String,String[]> attrMap = null;

	public String execute(){
		attrMap = new HashMap<String, String[]>();
		attrMap.put("attr1", new String[]{"1","2","3"});
		attrMap.put("attr2", new String[]{"4","5","6"});
		attrMap.put("attr3", new String[]{"7","8","9"});
		return SUCCESS;
	}
	
	public Map<String, String[]> getAttrMap() {
		return attrMap;
	}

	public void setAttrMap(Map<String, String[]> attrMap) {
		this.attrMap = attrMap;
	}
	
}
