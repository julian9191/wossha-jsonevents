package com.wossha.json.events.events.pictures.SavePictureEvent;

import org.joda.time.DateTime;

import com.wossha.json.events.events.api.Event;

//@Generated("org.jsonschema2pojo")
public class SavePictureEvent  extends Event {

	private static final long serialVersionUID = 9007972284210976330L;
	
    private Message message;
    private static String eventName = "SavePicture";

    public SavePictureEvent() {}


    public SavePictureEvent(String originApp, String username) {
        super(eventName, originApp, username);
        this.message = new Message();
    }
    
    public SavePictureEvent(String originApp, String username, Message message) {
        super(eventName, originApp, username);
        this.message = message;
    }

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public static String getEventName() {
		return eventName;
	}

	public static void setEventName(String eventName) {
		SavePictureEvent.eventName = eventName;
	}

}