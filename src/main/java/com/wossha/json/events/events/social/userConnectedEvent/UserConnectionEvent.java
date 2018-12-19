package com.wossha.json.events.events.social.userConnectedEvent;

import com.wossha.json.events.events.api.Event;

//@Generated("org.jsonschema2pojo")
public class UserConnectionEvent  extends Event {

	private static final long serialVersionUID = 9007972284210976330L;
	
    private Message message;
    private static String eventName = "USER-CONNECTION";

    public UserConnectionEvent() {}


    public UserConnectionEvent(String originApp, String username) {
        super(eventName, originApp, username);
        this.message = new Message();
    }
    
    public UserConnectionEvent(String originApp, String username, Message message) {
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
		UserConnectionEvent.eventName = eventName;
	}

}