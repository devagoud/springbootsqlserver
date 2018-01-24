package com.betabulls.book.ticket.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")

public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Ticket_Id")
	private Integer ticketId;
	
	@Column(name="Passenger_Name")
	private String PassengerName;
	@Column(name="Booking_Date")
	private Date BookingDate;
	@Column(name="Station_Source")
	private String StationSource;
	@Column(name="Destnation_Source")
	private String Destination;
	@Column(name="email")
	private String Email;



	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public Date getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		BookingDate = bookingDate;
	}
	public String getStationSource() {
		return StationSource;
	}
	public void setStationSource(String stationSource) {
		StationSource = stationSource;
	}
	
}
