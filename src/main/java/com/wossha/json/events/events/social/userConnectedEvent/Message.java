package com.wossha.json.events.events.social.userConnectedEvent;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = 630598882713518981L;
	
	private String username;
	private Integer status;
	
	
	public Message(String username, Integer status) {
		this.username = username;
		this.status = status;
	}

	public Message() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
