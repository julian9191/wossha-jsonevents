package com.wossha.json.events.events.pictures.RemovePictureEvent;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable{

	private static final long serialVersionUID = 630598882713518981L;
	
	private List<String> uuidPictures;
	
	
	public Message(List<String> uuidPictures) {
		this.uuidPictures = uuidPictures;
	}

	public Message() {}

	public List<String> getUuidPictures() {
		return uuidPictures;
	}

	public void setUuidPictures(List<String> uuidPicture) {
		this.uuidPictures = uuidPictures;
	}

}
