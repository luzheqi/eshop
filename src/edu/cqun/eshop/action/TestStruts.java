package edu.cqun.eshop.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestStruts extends ActionSupport{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute(){
		name = "hello," + name + "!";
		return SUCCESS;
	}

}
