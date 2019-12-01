package com.infotech.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketingBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketingBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		
		return ticketBookingDao.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		
		return ticketBookingDao.findById(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
		
	}

}
