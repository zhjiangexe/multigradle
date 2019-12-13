package com.iftek.sys.controller;

import com.iftek.atom.entity.Event;
import com.iftek.core.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
  @Autowired
  private EventService eventService;

  @GetMapping("/")
  public Event query() {
    Event event = eventService.getByName("");
    return event;
  }

}
