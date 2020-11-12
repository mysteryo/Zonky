package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Loan;
import com.example.demo.service.SimpleService;

@RestController
public class SimpleRestController {

	private int maxLoans = 15;
	@Autowired
	SimpleService service;
	
	@GetMapping("/")
	public String simpleIndex() {
		return "QUICK REST LOCATIONS\n"
				+ "/test - TEST AGAINST LOCALHOST(USELESS SINCE YOU SEE THIS)\n"
				+ "/testLoans - GET ALL LOANS FROM MARKETPLACE\n"
				+ "/loans/id - GET SPECIFIC NUMBER OF LOANS FROM MARKETPLACE\n"
				+ "/loans - GET PRE-SET NUMBER OF LOANS\n"
				+ "/loans/lowinteres - GET LOAN WITH LOWEST INTEREST RATE\n"
				+ "/loans/highinterest - GET LOAN WITH HIGHEST INTEREST RATE\n"
				+ "/loans/averageinterest - (FLOAT) GET THE AVERAGE OF THE ALL INTEREST RATES RETURNED FROM MARKETPLACE";
	}
	
	//quick test against localhost if it's working
	@GetMapping("/test")
		public String testSuccesful() {
		return "Test Succesful";
	}
	
	@GetMapping("/testLoans")
	public List<Loan> getLoans(){
		return service.getAllLoans();
	}
	
	@GetMapping("/loans/{id}")
	public List<Loan> getNumberOfLoans(@PathVariable int id){
		return service.getSelectedNumOfLoans(id);
	}
	
	@GetMapping("/loans")
	public List<Loan> getNumberOfLoans(){
		return service.getSelectedNumOfLoans(maxLoans);
	}
	
	@GetMapping("/loans/lowinterest")
	public Loan getLowestInterestLoan() {
		return service.getLowestInterestRate();
	}
	
	@GetMapping("/loans/highinterest")
	public Loan getHighestInterestLoan() {
		return service.getHighestInterestRate();
	}
	
	@GetMapping("loans/averageinterest")
	public float getAverageInterestOfLoans() {
		return service.getAverageInterestRate();
	}
}
