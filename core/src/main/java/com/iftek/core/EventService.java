package com.iftek.core;

import com.iftek.atom.dao.EventDao;
import com.iftek.atom.entity.Event;

public class EventService {
    private EventDao eventDao;

    public Event getByName(String eventName) {
        return eventDao.query(eventName);
    }
}
