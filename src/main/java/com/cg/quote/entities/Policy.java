package com.cg.quote.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	@Id
	@GeneratedValue(generator="Policy_seq")
	@SequenceGenerator(name="Policy_seq",sequenceName="Policy_seq",allocationSize=1)
	@Column(name="Policy_Number")
	int policyNumber;

	@Column(columnDefinition= "VARCHAR(15)")
	String accountNumber;
	@Column(columnDefinition= "VARCHAR(20)")
	String business_segment;
	@Column(columnDefinition= "VARCHAR(10)")
	String city;
	@Column(columnDefinition= "VARCHAR(30)")
	String createdBy;
	@Column(columnDefinition= "VARCHAR(30)")
	String option1;
	@Column(columnDefinition= "VARCHAR(30)")
	String option2;
	@Column(columnDefinition= "VARCHAR(30)")
	String option3;
	@Column(columnDefinition= "VARCHAR(10)")
	String premiumAmount;
	@Column(columnDefinition= "VARCHAR(30)")
	String question1;
	@Column(columnDefinition= "VARCHAR(30)")
	String question2;
	@Column(columnDefinition= "VARCHAR(30)")
	String question3;
	@Column(columnDefinition= "VARCHAR(20)")
	String state;
	@Column(columnDefinition= "VARCHAR(30)")
	String street;
	@Column(columnDefinition= "VARCHAR(20)")
	String userName;
	@Column(columnDefinition= "VARCHAR(10)")
	String zip;
	
	public Policy(int policyNumber, String accountNumber, String business_segment, String city, String createdBy,
			String option1, String option2, String option3, String premiumAmount, String question1, String question2,
			String question3, String state, String street, String userName, String zip) {
		super();
		this.policyNumber = policyNumber;
		this.accountNumber = accountNumber;
		this.business_segment = business_segment;
		this.city = city;
		this.createdBy = createdBy;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.premiumAmount = premiumAmount;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.state = state;
		this.street = street;
		this.userName = userName;
		this.zip = zip;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBusiness_segment() {
		return business_segment;
	}
	public void setBusiness_segment(String business_segment) {
		this.business_segment = business_segment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", accountNumber=" + accountNumber + ", business_segment="
				+ business_segment + ", city=" + city + ", createdBy=" + createdBy + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3 + ", premiumAmount=" + premiumAmount + ", question1="
				+ question1 + ", question2=" + question2 + ", question3=" + question3 + ", state=" + state + ", street="
				+ street + ", userName=" + userName + ", zip=" + zip + "]";
	}
	
}
