package com.epam.training.storage.ticket;

import com.epam.training.model.ticket.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketStorageImpl implements TicketStorage {

    private final Map<Long, Ticket> ticketMap;

    private TicketStorageImpl() {
        ticketMap = new HashMap<>();
    }

    @Override
    public Ticket bookTicket(Ticket ticket) {
        return ticketMap.put(ticket.getId(), ticket);
    }

    @Override
    public boolean cancelTicket(long ticketId) {
        return ticketMap.remove(ticketId) != null;
    }

    @Override
    public List<Ticket> findAll() {
        return new ArrayList<>(ticketMap.values());
    }

    @Override
    public Ticket getTicketById(long ticketId) {
        return ticketMap.get(ticketId);
    }

    @Override
    public Map<Long, Ticket> getTickets() {
        return ticketMap;
    }
}
