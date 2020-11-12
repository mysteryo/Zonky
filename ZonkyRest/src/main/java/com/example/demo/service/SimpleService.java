package com.example.demo.service;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Loan;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SimpleService {

	ObjectMapper mapper = new ObjectMapper();
	

	public List<Loan> getAllLoans(){
		try {
			Loan[] l = mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class);
			System.out.println("Max loans from marketplace: "+l.length);
			List<Loan> loanList = Arrays.asList(l);
			return loanList;
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<Loan> getSelectedNumOfLoans(int count){
		try {
			Loan[] l = mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class);
			System.out.println("Max loans from marketplace: "+l.length);
			if(count > l.length) count = l.length;
			List<Loan> loanList = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				loanList.add(l[i]);
			}
			System.out.println("Retrieving: "+loanList.size()+" of loans");
			return loanList;
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Loan getLowestInterestRate() {
		try {
			Loan[] l = mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class);
			System.out.println("Max loans from marketplace: "+l.length);
			float minInterest = l[0].interestRate;
			int lowestInterestRateIndex = 0;
			for (int i = 1; i < l.length; i++) {
				if(l[i].interestRate < minInterest) {
					minInterest = l[i].interestRate;
					lowestInterestRateIndex = i;
				}
			}
			return l[lowestInterestRateIndex];
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Loan getHighestInterestRate() {
		try {
			Loan[] l = mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class);
			System.out.println("Max loans from marketplace: "+l.length);
			float maxInterest = l[0].interestRate;
			int highestInterestRateIndex = 0;
			for (int i = 1; i < l.length; i++) {
				if(l[i].interestRate > maxInterest) {
					maxInterest = l[i].interestRate;
					highestInterestRateIndex = i;
				}
			}
			return l[highestInterestRateIndex];
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public float getAverageInterestRate() {
		try {
			Loan[] l = mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class);
			System.out.println("Max loans from marketplace: "+l.length);
			float averageInterest = 0;
			for (int i = 0; i < l.length; i++) {
				averageInterest += l[i].interestRate;
			}
			return averageInterest/l.length;
		} catch (IOException e) {
			System.out.println(e);
			return 0;
		}
	}
	
}
