package com.wossha.json.events.events.api;

import java.io.IOException;

public interface EventSerializer {

    public EventProcessor deserialize(String json) throws IOException;
}
