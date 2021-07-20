package com.epam.training.dao.event;

import com.epam.training.model.event.Event;
import com.epam.training.storage.event.EventStorage;
import com.epam.training.storage.event.EventStorageImpl;

import java.util.List;

public class EventDaoImpl implements EventDao {

    private final EventStorage eventStorage;

    public EventDaoImpl(EventStorageImpl eventStorage) {
        this.eventStorage = eventStorage;
    }

    @Override
    public Event getEventById(long eventId) {
        return eventStorage.getEventById(eventId);
    }

    @Override
    public Event createEvent(Event event) {
        return eventStorage.createEvent(event);
    }

    @Override
    public Event updateEvent(Event event) {
        return eventStorage.updateEvent(event);
    }

    @Override
    public boolean deleteEvent(long eventId) {
        return eventStorage.deleteEvent(eventId);
    }

    @Override
    public List<Event> findAll() {
        return eventStorage.findAllEvents();
    }

}