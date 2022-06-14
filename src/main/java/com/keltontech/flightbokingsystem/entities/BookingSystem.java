package com.keltontech.flightbokingsystem.entities;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BookingSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "booking_id")
	private int bookingId;


    @Column(name = "startinglocation",nullable = false,length = 40)
    private  String startinglocation;
    
    @Column(name = "destination",nullable = false,length = 40)
    private  String destination;
    
    @Column(name = "datetime",nullable = false,length = 40)
    private  LocalDateTime datetime;

    @Column(name = "price",nullable = false)
    private double price;
    
    @ManyToOne
    @JoinColumn(name ="passenger_id")
    Passenger passenger;
    
    


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getStartinglocation() {
		return startinglocation;
	}

	public void setStartinglocation(String startinglocation) {
		this.startinglocation = startinglocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookingSystem{" +
				"bookingId=" + bookingId +
				", startinglocation='" + startinglocation + '\'' +
				", destination='" + destination + '\'' +
				", datetime=" + datetime +
				", price=" + price +
				'}';
	}
}