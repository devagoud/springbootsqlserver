package com.betabulls.book.ticket.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betabulls.book.ticket.app.dao.TicketBookingDao;
import com.betabulls.book.ticket.app.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	public TicketBookingDao ticketDao;
	
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.save(ticket) ;
	}

	public Ticket getTicketById(Integer ticket) {
		// TODO Auto-generated method stub
		return ticketDao.findOne(ticket);
	}

	public Iterable<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return ticketDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketDao.delete(ticketId);;
	}

	public Ticket updateTicket(Integer ticketId, String email) {
		
		Ticket tt=ticketDao.findOne(ticketId);
		
		tt.setEmail(email);
		Ticket t1=ticketDao.save(tt);
		// TODO Auto-generated method stub
		return t1;
	}

}
