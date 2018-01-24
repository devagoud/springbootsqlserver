package com.betabulls.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.betabulls.book.ticket.app.entity.Ticket;


public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {

}
