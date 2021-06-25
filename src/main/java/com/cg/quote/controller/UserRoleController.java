package com.cg.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.quote.dao.AccountRepository;
import com.cg.quote.dao.PolicyRepository;
import com.cg.quote.dao.UserRoleRepository;
import com.cg.quote.entities.Account;
import com.cg.quote.entities.Policy;
import com.cg.quote.entities.UserRole;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class UserRoleController {

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private PolicyRepository policyRepository;

	// get all userrole
	@GetMapping("/userrole")
	public List<UserRole> getAllUserRole() {
		List<UserRole> list = (List<UserRole>) this.userRoleRepository.findAll();
		return list;
	}

	// create userrole
	@PostMapping("/userrole")
	public UserRole createUserRole(@RequestBody UserRole userRole) {
		return userRoleRepository.save(userRole);
	}

	// get all accounts
	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		List<Account> list = (List<Account>) this.accountRepository.findAll();
		return list;
	}

	// create accounts
	@PostMapping("/accounts")
	public Account createAccounts(@RequestBody Account account) {		
		return accountRepository.save(account);
	}
	
	// get all policy
	@GetMapping("/policy")
	public List<Policy> getAllPolicy() {	
		List<Policy> list = (List<Policy>) this.policyRepository.findAll();
		return list;
	}
	
	
	// create policy
	@PostMapping("/policy")
	public Policy createPolicy(@RequestBody Policy policy) {		
		return policyRepository.save(policy);
	}

}
