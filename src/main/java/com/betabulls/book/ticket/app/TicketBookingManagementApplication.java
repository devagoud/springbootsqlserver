package com.betabulls.book.ticket.app;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.betabulls.book.ticket.app.Service.TicketBookingService;
import com.betabulls.book.ticket.app.entity.Ticket;

@SpringBootApplication
public class TicketBookingManagementApplication implements CommandLineRunner{
	@Autowired()
	public TicketBookingService ticketService;
	public static void main(String[] args) {
	SpringApplication.run(TicketBookingManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ticket ticket1=new Ticket();
		ticket1.setPassengerName("devagoud");
		ticket1.setBookingDate(new Date());
		ticket1.setStationSource("kamareddy");
		ticket1.setDestination("hyderabad");
		ticket1.setEmail("RR@gmail.com");
		ticketService.createTicket(ticket1);
	}
}
