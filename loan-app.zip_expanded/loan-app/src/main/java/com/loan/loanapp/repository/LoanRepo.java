package com.loan.loanapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapp.Entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer>{
}
