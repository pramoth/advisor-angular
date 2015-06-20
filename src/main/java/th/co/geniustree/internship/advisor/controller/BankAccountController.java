/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.internship.advisor.model.BankAccount;
import th.co.geniustree.internship.advisor.repo.BankAccountRepo;

/**
 *
 * @author Best
 */
@RestController
public class BankAccountController {
    
    @Autowired
    private BankAccountRepo bankaccountRopo;
    
    @RequestMapping(value = "/bankaccounts")
    public Page<BankAccount> getBankAccount(Pageable pageable){
    return bankaccountRopo.findAll(pageable);
    }
    
    
    @RequestMapping(value = "/bankaccountssave" , method = RequestMethod.POST)
    public void saveBankAccount(@Validated @RequestBody BankAccount bankaccount){
        bankaccountRopo.save(bankaccount);
    }
    
    
    @RequestMapping(value = "/bankaccountsdelete" , method = RequestMethod.POST)
    public void deleteBankAccount(@RequestBody BankAccount bankaccount){
       bankaccountRopo.delete(bankaccount);
    }
}
