package com.sbf.paymentgateway.repayment.service;

import java.util.Collection;

import com.sbf.paymentgateway.repayment.model.Account;

/**
 * Created by christospapidas on 24012016--.
 */
public interface AccountService {

    Collection<Account> findAll();

    Account findByUsername(String userename);

    Account createNewAccount(Account account);


}
