package com.epam.training.model.event;

import lombok.Data;

import java.util.Date;

@Data
public class EventImpl implements Event {

    long id;
    String title;
    Date date;

    public EventImpl(String title, Date date) {
        this.title = title;
        this.date = date;
    }
}
