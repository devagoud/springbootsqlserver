package com.betabulls.book.ticket.app;



import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.betabulls.book.ticket.app.Service.TicketBookingService;
import com.betabulls.book.ticket.app.entity.Ticket;

@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	applicationContext=SpringApplication.run(TicketBookingManagementApplication.class, args);
	TicketBookingService ticketService=applicationContext.getBean("ticketBookingService",TicketBookingService.class);

	
	Ticket ticket=new Ticket();
	ticket.setPassengerName("devagoud");
	ticket.setBookingDate(new Date());
	ticket.setStationSource("krdy");
	ticket.setDestination("hyde");
	ticket.setEmail("R@gmail.com");
		
	ticketService.createTicket(ticket);
	Ticket ticket1=new Ticket();
	ticket1.setPassengerName("devagoud");
	ticket1.setBookingDate(new Date());
	ticket1.setStationSource("kamareddy");
	ticket1.setDestination("hyderabad");
	ticket1.setEmail("RR@gmail.com");
		
	ticketService.createTicket(ticket1);
	
	
	
	
	}
}
