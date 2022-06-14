package com.keltontech.flightbokingsystem.entities;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "passenger_id")
	private int passengerId;

    @Column(name = "name",nullable = false,length = 20)
    private String name;

    @Column(name = "address",nullable = false,length = 100)
    private  String address;
    
    @Column(name = "gender",nullable = false,length = 10)
    private  String gender;
    
    @Column(name = "age",nullable = false)
    private  int age;
    
    @Column(name = "email",nullable = false,length = 40)
    private  String email;
    
    @Column(name = "phonenumber",nullable = false,length = 13)
    private  Long phonenumber;

    @Column(nullable=false)
    @NotBlank(message = "* Password is required")
    @Size(min=8)
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BookingSystem> bookingList; 

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Passenger{" +
				"passengerId=" + passengerId +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				", phonenumber=" + phonenumber +
				", password='" + password + '\'' +
				'}';
	}
}
