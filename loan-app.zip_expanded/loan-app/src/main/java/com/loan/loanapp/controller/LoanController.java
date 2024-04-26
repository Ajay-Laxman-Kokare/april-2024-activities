package com.loan.loanapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.Entity.Customer;
import com.loan.loanapp.Entity.Loan;
import com.loan.loanapp.Entity.LoanApplication;
import com.loan.loanapp.Entity.LoginRequest;
import com.loan.loanapp.service.LoanService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/loan")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@PostMapping(path = "/register")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer){
		loanService.saveCustomer(customer);
		return ResponseEntity.status(201).body(customer);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<Customer> loginCustomer(@RequestBody LoginRequest loginReq){
		Customer cust = loanService.findByEmail(loginReq.getEmail());
		if (cust == null || !cust.getPassword().equals(loginReq.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.ok().build();
	}
	
	@GetMapping(path = "/loans")
	public ResponseEntity<Object> getLoans(){
		return ResponseEntity.status(200).body(loanService.allLoans());
	}
	
	@PostMapping(path = "/viewLaon/{id}")
	public ResponseEntity<Optional<Loan>> apply(@PathVariable int id){
		return ResponseEntity.status(200).body(loanService.viewLoan(id));
	}
	
	@PostMapping("/applyLoan")
    public ResponseEntity<LoanApplication> applyForLoan(@RequestBody LoanApplication application) {
        LoanApplication appliedLoan = loanService.applyForLoan(application);
        return ResponseEntity.ok(appliedLoan);
    }
}
