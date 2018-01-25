package com.betabulls.book.ticket.app;



import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.betabulls.book.ticket.app.Service.TicketBookingService;
import com.betabulls.book.ticket.app.entity.Ticket;

@SpringBootApplication
public class TicketBookingManagementApplication {
	
	
	public static void main(String[] args) {
	SpringApplication.run(TicketBookingManagementApplication.class, args);
	}


}
