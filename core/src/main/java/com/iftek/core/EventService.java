package com.iftek.core;

import com.iftek.atom.dao.EventDao;
import com.iftek.atom.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventDao eventDao;

    public Event getByName(String eventName) {
        return eventDao.query(eventName);
    }
}
