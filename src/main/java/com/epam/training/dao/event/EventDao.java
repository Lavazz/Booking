package com.epam.training.dao.event;

import com.epam.training.model.event.Event;

import java.util.List;
import java.util.Map;

public interface EventDao {

    Event getEventById(long eventId);

    Event createEvent(Event event);

    Event updateEvent(Event event);

    boolean deleteEvent(long eventId);

    List<Event> findAll();

    public Map<Long, Event> getEvents();

}
