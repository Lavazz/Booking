package com.epam.training.dao.ticket;

import com.epam.training.model.ticket.Ticket;

import java.util.List;
import java.util.Map;

public interface TicketDao {

    Ticket bookTicket(Ticket ticket);

    boolean cancelTicket(long ticketId);

    List<Ticket> findAll();

    Ticket getTicketById(long ticketId);

    Map<Long, Ticket> getTickets();

}
