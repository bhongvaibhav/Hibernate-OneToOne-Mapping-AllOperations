package com.tybsc.hibernate3_OneToOneAllop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import com.tybsc.hibernate3.Address;

//import com.tybsc.hibernate2_OneToOne.Address;

@Entity
public class Employee
{
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	private int salary;
	
	@OneToOne
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int salary, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	
	


}
