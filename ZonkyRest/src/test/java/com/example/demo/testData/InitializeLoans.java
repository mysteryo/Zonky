package com.example.demo.testData;

import com.example.demo.entity.Loan;

public class InitializeLoans {

	public static Loan[] getInitializedLoans() {
		Loan l1 = new Loan(1, "www.123.cz", "user1", "", 0, 0.25f, 0.0f, "", 0.0f, 0.0f, 0.0f, 0.0f, true, "", true, "", 0, "", true, null);
		Loan l2 = new Loan(2, "www.987.cz", "user2", "", 0, 0.75f, 0.0f, "", 0.0f, 0.0f, 0.0f, 0.0f, true, "", true, "", 0, "", true, null);
		
		return new Loan[]{l1,l2};
	}
}
