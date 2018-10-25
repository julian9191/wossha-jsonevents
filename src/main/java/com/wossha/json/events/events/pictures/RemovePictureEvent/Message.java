package com.wossha.json.events.events.pictures.RemovePictureEvent;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = 630598882713518981L;
	
	private String uuidPicture;
	
	
	public Message(String uuidPicture) {
		this.uuidPicture = uuidPicture;
	}

	public Message() {}

	public String getUuidPicture() {
		return uuidPicture;
	}

	public void setUuidPicture(String uuidPicture) {
		this.uuidPicture = uuidPicture;
	}

}
