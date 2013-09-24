package com.steel.action;

import com.opensymphony.xwork2.ActionSupport;

public class ArrayAction extends ActionSupport {

	private static final long serialVersionUID = -409319555416443829L;

	private String[] attr = null;
	
	public String execute(){
		attr = new String[]{"Miscroft","Sony","Apple","Nokia"};
		return SUCCESS;
	}

	public String[] getAttr() {
		return attr;
	}

	public void setAttr(String[] attr) {
		this.attr = attr;
	}
}
