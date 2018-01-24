package com.betabulls.book.ticket.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betabulls.book.ticket.app.Service.TicketBookingService;
import com.betabulls.book.ticket.app.entity.Ticket;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	@Autowired
	public TicketBookingService ticketService;
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket){
		
		return ticketService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
		
		
		return ticketService.getTicketById(ticketId);
	}
	
	
	@GetMapping(value="/ticket/allticket")
	public Iterable<Ticket> getAllTicket(){
		
		return ticketService.getAllTicket();
	}
	@DeleteMapping(value="/delete/{ticketId}")
	public void deleteItem(@PathVariable("ticketId")Integer ticketId){
		
		 ticketService.deleteTicket(ticketId);
		
	}
	@PutMapping(value="/update/{ticketId}/{email:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("email") String email ){
		return ticketService.updateTicket(ticketId,email);
	}
	
	
	
	
	
	
}
