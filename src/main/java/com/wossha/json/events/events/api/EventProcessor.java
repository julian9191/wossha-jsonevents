package com.wossha.json.events.events.api;

import java.util.List;

import com.wossha.json.events.events.api.Event;
import com.wossha.json.events.exceptions.RecoverableException;

public interface EventProcessor<T> {

    public String name();
    public T data();
    public void setData(T data);
    public List<Event> execute() throws RecoverableException;

}
