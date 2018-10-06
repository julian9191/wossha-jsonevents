package com.wossha.json.events.events.api;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wossha.json.events.services.UUIDGenerator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event implements Serializable{
	
	private String uuid;
    private String name;
    private String originApp;
    private String username;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date timestamp;

    public Event(){}

    public Event(String name, String originApp, String username) {
		this.uuid = UUIDGenerator.generateUUID();
		this.name = name;
		this.originApp = originApp;
		this.username = username;
		this.timestamp = new Date();
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginApp() {
		return originApp;
	}

	public void setOriginApp(String originApp) {
		this.originApp = originApp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	

}