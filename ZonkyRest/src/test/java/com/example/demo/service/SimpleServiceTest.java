package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.example.demo.entity.Loan;
import com.example.demo.testData.InitializeLoans;
import com.fasterxml.jackson.databind.ObjectMapper;

class SimpleServiceTest {
	
	@Mock
	ObjectMapper mapper;
	
	@InjectMocks
	SimpleService service;
	
	Loan[] loans = InitializeLoans.getInitializedLoans();
	
	@BeforeEach
	public void before() throws Exception {
		MockitoAnnotations.initMocks(this);
		Mockito.when(mapper.readValue(new URL("https://api.zonky.cz/loans/marketplace"), Loan[].class)).thenReturn(loans);
	}

	@Test
	void testGetAllLoans() {
		assertEquals(Arrays.asList(loans), service.getAllLoans());
	}
	
	@Test
	void testGetNumberOfLoans() {
		assertEquals(List.of(loans[0]),service.getSelectedNumOfLoans(1)) ;
	}
	
	@Test
	void testGetLowestInterestRate() {
		assertEquals(loans[0],service.getLowestInterestRate()) ;
	}
	
	@Test
	void testGetHighestInterestRate() {
		assertEquals(loans[1],service.getHighestInterestRate());
	}
	
	@Test
	void testGetAverageInterestRate() {
		float expectedAverage = (loans[0].interestRate + loans[1].interestRate)/2;
		assertEquals(expectedAverage,service.getAverageInterestRate());
	}

}
