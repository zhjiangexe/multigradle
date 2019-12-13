package com.iftek.atom.dao;

import com.iftek.atom.entity.Event;

public interface EventDao {
  Event query(String eventName);
}
