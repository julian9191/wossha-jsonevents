package com.wossha.json.events.events.pictures.RemovePictureEvent;

import com.wossha.json.events.events.api.Event;

//@Generated("org.jsonschema2pojo")
public class RemovePictureEvent  extends Event {

	private static final long serialVersionUID = 9007972284210976330L;
	
    private Message message;
    private static String eventName = "REMOVE-PICTURE";

    public RemovePictureEvent() {}


    public RemovePictureEvent(String originApp, String username) {
        super(eventName, originApp, username);
        this.message = new Message();
    }
    
    public RemovePictureEvent(String originApp, String username, Message message) {
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
		RemovePictureEvent.eventName = eventName;
	}

}