package com.loan.loanapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loan.loanapp.Entity.Customer;
import com.loan.loanapp.Entity.Loan;
import com.loan.loanapp.Entity.LoanApplication;
import com.loan.loanapp.repository.LoanApplicationRepo;
import com.loan.loanapp.repository.LoanRepo;
import com.loan.loanapp.repository.loanDAO;

@Service
public class LoanService {
	@Autowired
	loanDAO loanDao;
	
	@Autowired
	LoanRepo laonRepo;
	
	@Autowired
	LoanApplicationRepo loanApplicationRepo;
	
	public void saveCustomer(Customer customer) {
		loanDao.save(customer);
	}
	public Customer findByEmail(String emailId) {
		return loanDao.findByEmailId(emailId);
	}
	public List<Loan> allLoans() {
		return laonRepo.findAll();
	}
	
	public Optional<Loan> viewLoan(int id) {
		return laonRepo.findById(id);
		
	}
	public LoanApplication applyForLoan(LoanApplication application) {
		application.setStatus("Pending");
		return loanApplicationRepo.save(application);
	}
}
