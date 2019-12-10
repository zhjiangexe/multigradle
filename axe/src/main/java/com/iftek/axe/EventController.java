package com.iftek.axe;

import com.iftek.atom.entity.Event;
import com.iftek.core.EventService;

public class EventController {
    private EventService eventService;

    public String getByName(String paramName){
        Event event = eventService.getByName(paramName);
        return event.getName();
    }
}
