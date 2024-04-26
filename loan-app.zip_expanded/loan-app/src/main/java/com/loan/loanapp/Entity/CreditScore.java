package com.loan.loanapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditScore {
	
	@Id
	private String pan;
	private int score;
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public CreditScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
