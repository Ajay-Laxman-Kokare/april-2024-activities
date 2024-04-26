package com.loan.loanapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapp.Entity.LoanApplication;

@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplication, Integer>{
}
