package com.cg.quote.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Userrole")
public class UserRole {
	@Id
	@Column(name="Username")
	public String userName;
	@Column(name="Password")
	public String password;
	@Column(name="Rolecode")
	public String rolecode;
	

	public UserRole(String userName, String password, String roleCode) {
		super();
		this.userName = userName;
		this.password = password;
		this.rolecode = roleCode;
	}
	public UserRole() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleCode() {
		return rolecode;
	}
	public void setRoleCode(String roleCode) {
		rolecode = roleCode;
	}
	@Override
	public String toString() {
		if (rolecode.equals("1"))
		{
		return "\n\nUser Name : " + userName + ", Password : " + password + ", RoleCode : Insured ";
		}
		else if (rolecode.equals("2"))
		{
			return "\n\nUser Name : " + userName + ", Password : " + password + ", RoleCode : Agent";
			}
		else if (rolecode.equals("3"))
		{
			return "\n\nUser Name : " + userName + ", Password : " + password + ", RoleCode : Admin";
			}
		else
		return null;
	}
	
	
}
