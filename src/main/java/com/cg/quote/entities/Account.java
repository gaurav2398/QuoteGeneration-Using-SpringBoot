package com.cg.quote.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

	@Id
	@Column(name="Account_Number")
	String accountNumber;
	@Column(name="Insured_Name")
	String insuredName;
	@Column(name="Insured_Street")
	String insuredStreet;
	@Column(name="Insured_City")
	String insuredCity;
	@Column(name="Insured_State")
	String insuredState ;
	@Column(name="Insured_Zip")
	String insuredZip;
	@Column(name="Business_Segment_Name")
	String businessSegmentName; 
	@Column(name="User_Name")
	String userName;
	@Column(name="createdby")
	String createdBy;


	public Account(String accountNumber, String insuredName, String insuredStreet, String insuredCity,
			String insuredState, String insuredZip, String businessSegmentName, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.businessSegmentName = businessSegmentName;
		this.userName = userName;
	}

	public Account(String accountNumber, String insuredName, String insuredStreet, String insuredCity,
			String insuredState, String insuredZip, String businessSegmentName, String userName,
			String createdBy) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.businessSegmentName = businessSegmentName;
		this.userName = userName;
		this.createdBy = createdBy;
	}

	public Account() {
		super();
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredStreet() {
		return insuredStreet;
	}
	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}
	public String getInsuredCity() {
		return insuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}
	public String getInsuredState() {
		return insuredState;
	}
	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}
	public String getInsuredZip() {
		return insuredZip;
	}
	public void setInsuredZip(String insuredZip) {
		this.insuredZip = insuredZip;
	}
	public String getBusinessSegmentName() {
		return businessSegmentName;
	}
	public void setBusinessSegmentName(String businessSegmentName) {
		this.businessSegmentName = businessSegmentName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCreatedby() {
		return createdBy;
	}

	public void setCreatedby(String createdby) {
		this.createdBy = createdby;
	}

	@Override
	public String toString() {
		return "\n-------------------------------------\n"+
				"\nAccount Number : " + accountNumber + "\nInsured_Name : " + insuredName +				
				"\nInsured Street : "+ insuredStreet + "\nInsured City : " + insuredCity +
				"\nInsured State : " + insuredState + "\nInsured Zip : " + insuredZip + 
				"\nBusiness Segment Name : " + businessSegmentName + "\nUser Name : "
				+ userName + "\nCreated By : " + createdBy;
	}	
}