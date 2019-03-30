package com.wossha.json.events.events.pictures.SavePictureEvent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable{

	private static final long serialVersionUID = 630598882713518981L;
	private List<PictureInfo> pictures = new ArrayList<PictureInfo>();
	
	public Message(List<PictureInfo> pictures) {
		super();
		this.pictures = pictures;
	}

	public Message() {}

	public List<PictureInfo> getPictures() {
		return pictures;
	}

	public void setPictures(List<PictureInfo> pictures) {
		this.pictures = pictures;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
