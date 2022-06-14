package com.keltontech.flightbokingsystem.entities;
import javax.persistence.*;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "flight_id")
    private int flightId;

    @Column(name = "flightname",nullable = false,length = 20)
    private String flightname;

    @Column(name = "flightstatus",nullable = false,length = 40)
    private  String flightstatus;
    
    @Column(name = "flightcapacity",nullable = false,length = 10)
    private  int flightcapacity;


	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getFlightstatus() {
		return flightstatus;
	}

	public void setFlightstatus(String flightstatus) {
		this.flightstatus = flightstatus;
	}

	public int getFlightcapacity() {
		return flightcapacity;
	}

	public void setFlightcapacity(int flightcapacity) {
		this.flightcapacity = flightcapacity;
	}

	@Override
	public String toString() {
		return "Flight{" +
				"flightId=" + flightId +
				", flightname='" + flightname + '\'' +
				", flightstatus='" + flightstatus + '\'' +
				", flightcapacity=" + flightcapacity +
				'}';
	}
}


