package com.loan.loanapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapp.Entity.Customer;
import com.loan.loanapp.Entity.Loan;

@Repository
public interface loanDAO extends JpaRepository<Customer, Integer>{
	//Customer findByEmail(String email);

	Customer findByEmailId(String emailId);
}
