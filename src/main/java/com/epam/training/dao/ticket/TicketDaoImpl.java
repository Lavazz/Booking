package com.epam.training.dao.ticket;

import com.epam.training.model.ticket.Ticket;
import com.epam.training.storage.ticket.TicketStorage;
import com.epam.training.storage.ticket.TicketStorageImpl;

import java.util.List;

public class TicketDaoImpl implements TicketDao {

    private final TicketStorage ticketStorage;

    public TicketDaoImpl(TicketStorageImpl ticketStorage) {
        this.ticketStorage = ticketStorage;
    }

    @Override
    public Ticket bookTicket(Ticket ticket) {
        return ticketStorage.bookTicket(ticket);
    }

    @Override
    public boolean cancelTicket(long ticketId) {
        return ticketStorage.cancelTicket(ticketId);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketStorage.findAll();
    }

    @Override
    public Ticket getTicketById(long ticketId) {
        return ticketStorage.getTicketById(ticketId);
    }

}
