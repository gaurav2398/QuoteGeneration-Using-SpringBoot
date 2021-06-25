package com.cg.quote.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.quote.entities.Account;
import com.cg.quote.entities.UserRole;


@Repository
public interface AccountRepository extends CrudRepository<Account, String>{

}
