package com.infotech.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(TicketBookingManagementAppsApplication.class, args);
		
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",TicketBookingService.class);
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("pune");
		ticket.setPassengerName("kk");
		ticket.setEmail("kk@yahoo.com");
		
		ticketBookingService.createTicket(ticket);
	}

}
