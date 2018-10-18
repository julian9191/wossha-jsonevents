package com.wossha.json.events.events.pictures.SavePictureEvent;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = 630598882713518981L;
	
	private String uuidPicture;
	private String name;
	private String fileType;
	private String type;
	private Integer fileSize;
	private String value;
	private String uuidPictureToRemove;
	
	public Message(String uuidPicture, String name, String fileType, String type, Integer fileSize, String value, String uuidPictureToRemove) {
		this.uuidPicture = uuidPicture;
		this.name = name;
		this.fileType = fileType;
		this.type = type;
		this.fileSize = fileSize;
		this.value = value;
		this.uuidPictureToRemove = uuidPictureToRemove;
	}

	public Message() {}

	public String getUuidPicture() {
		return uuidPicture;
	}

	public void setUuidPicture(String uuidPicture) {
		this.uuidPicture = uuidPicture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUuidPictureToRemove() {
		return uuidPictureToRemove;
	}

	public void setUuidPictureToRemove(String uuidPictureToRemove) {
		this.uuidPictureToRemove = uuidPictureToRemove;
	}
	
	
	
	
}
