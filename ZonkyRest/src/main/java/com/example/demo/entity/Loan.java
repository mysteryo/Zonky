package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Ignore some useless fields like photos
@JsonIgnoreProperties(ignoreUnknown = true)
public class Loan {

	public int id;
	public String url;
	public String name;
	public String nickName;
	public int terminMonths;
	public float interestRate;
	public float revenueRate;
	public String rating;
	public float amount;
	public float remainingInvestment;
	public float reservedAmount;
	public float investmentRate;
	public boolean covered;
	public String datePublished;
	public boolean published;
	public String deadline;
	public int investmentsCount;
	public String mainIncomeType;
	public boolean insuranceActive;
	
	//IDK zonky api says it contains strings but there are some fields ... using object for not throwing exception from jackson
	public Object[] insuranceHistory;
	
	public Loan() {}
	
	
	public Loan(int id, String url, String name, String nickName, int terminMonths, float interestRate,
			float revenueRate, String rating, float amount, float remainingInvestment, float reservedAmount,
			float investmentRate, boolean covered, String datePublished, boolean published, String deadline,
			int investmentsCount, String mainIncomeType, boolean insuranceActive, Object[] insuranceHistory) {
		this.id = id;
		this.url = url;
		this.name = name;
		this.nickName = nickName;
		this.terminMonths = terminMonths;
		this.interestRate = interestRate;
		this.revenueRate = revenueRate;
		this.rating = rating;
		this.amount = amount;
		this.remainingInvestment = remainingInvestment;
		this.reservedAmount = reservedAmount;
		this.investmentRate = investmentRate;
		this.covered = covered;
		this.datePublished = datePublished;
		this.published = published;
		this.deadline = deadline;
		this.investmentsCount = investmentsCount;
		this.mainIncomeType = mainIncomeType;
		this.insuranceActive = insuranceActive;
		this.insuranceHistory = insuranceHistory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getTerminMonths() {
		return terminMonths;
	}
	public void setTerminMonths(int terminMonths) {
		this.terminMonths = terminMonths;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public float getRevenueRate() {
		return revenueRate;
	}
	public void setRevenueRate(float revenueRate) {
		this.revenueRate = revenueRate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getRemainingInvestment() {
		return remainingInvestment;
	}
	public void setRemainingInvestment(float remainingInvestment) {
		this.remainingInvestment = remainingInvestment;
	}
	public float getReservedAmount() {
		return reservedAmount;
	}
	public void setReservedAmount(float reservedAmount) {
		this.reservedAmount = reservedAmount;
	}
	public float getInvestmentRate() {
		return investmentRate;
	}
	public void setInvestmentRate(float investmentRate) {
		this.investmentRate = investmentRate;
	}
	public boolean isCovered() {
		return covered;
	}
	public void setCovered(boolean covered) {
		this.covered = covered;
	}
	public String getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getInvestmentsCount() {
		return investmentsCount;
	}
	public void setInvestmentsCount(int investmentsCount) {
		this.investmentsCount = investmentsCount;
	}
	public String getMainIncomeType() {
		return mainIncomeType;
	}
	public void setMainIncomeType(String mainIncomeType) {
		this.mainIncomeType = mainIncomeType;
	}
	public boolean isInsuranceActive() {
		return insuranceActive;
	}
	public void setInsuranceActive(boolean insuranceActive) {
		this.insuranceActive = insuranceActive;
	}
	public Object[] getInsuranceHistory() {
		return insuranceHistory;
	}
	public void setInsuranceHistory(Object[] insuranceHistory) {
		this.insuranceHistory = insuranceHistory;
	}


	@Override
	public String toString() {
		return "Loan [id=" + id + ", url=" + url + ", name=" + name + ", nickName=" + nickName + ", terminMonths="
				+ terminMonths + ", interestRate=" + interestRate + ", revenueRate=" + revenueRate + ", rating="
				+ rating + ", amount=" + amount + ", remainingInvestment=" + remainingInvestment + ", reservedAmount="
				+ reservedAmount + ", investmentRate=" + investmentRate + ", covered=" + covered + ", datePublished="
				+ datePublished + ", published=" + published + ", deadline=" + deadline + ", investmentsCount="
				+ investmentsCount + ", mainIncomeType=" + mainIncomeType + ", insuranceActive=" + insuranceActive
				+ ", insuranceHistory=" + insuranceHistory + "]";
	}
	
	
	
	
	
}
