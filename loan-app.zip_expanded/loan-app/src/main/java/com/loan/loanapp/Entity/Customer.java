package com.loan.loanapp.Entity;

import java.util.Objects;

import org.springframework.http.MediaType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	private String firstname;
	private String lastname;
	private String emailId;
	private String password;
	private Long phone;
	private String pan;
	
	public long getId() {
		return customerId;
	}
	public void setId(int Id) {
		this.customerId = customerId;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, emailId, firstname, lastname, pan, password, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(emailId, other.emailId)
				&& Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(pan, other.pan) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "Customer [Id=" + customerId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailId=" + emailId + ", password=" + password + ", phone=" + phone + ", pan=" + pan + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
