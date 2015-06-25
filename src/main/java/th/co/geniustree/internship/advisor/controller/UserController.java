/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.internship.advisor.model.BankAccount;
import th.co.geniustree.internship.advisor.model.ContactPersion;
import th.co.geniustree.internship.advisor.model.Department;
import th.co.geniustree.internship.advisor.model.User;
import th.co.geniustree.internship.advisor.repo.BankAccountRepo;
import th.co.geniustree.internship.advisor.repo.ContactpersionRepo;
import th.co.geniustree.internship.advisor.repo.DepartmentRepo;
import th.co.geniustree.internship.advisor.repo.UserRepo;

/**
 *
 * @author Best
 */
@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    
    private int count;
    
    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private ContactpersionRepo contactpersionRepo;
    
    @Autowired
    private DepartmentRepo departmentRepo;
    
    @Autowired
    private BankAccountRepo bankAccountRepo;
     
    private User userEmail = null;

    @RequestMapping(value = "/users")
    public Page<User> getUser(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @RequestMapping(value = "/userssave", method = RequestMethod.POST)
    public void saveUser(@Validated @RequestBody User user) {
         userRepo.save(user);
         
     }

    @RequestMapping(value = "/usersdelete", method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user) {
        userRepo.delete(user);
    }
    
    @RequestMapping(value = "/departments")
    public Page<Department> getDepartment(Pageable pageable){
    return departmentRepo.findAll(pageable);
    }
    
    
     @RequestMapping(value = "/contactsave", method = RequestMethod.POST)
    public void saveContact( @Validated @RequestBody ContactPersion contactPersion ) {
        contactpersionRepo.save(contactPersion);
        
    }
    
      @RequestMapping(value = "/bankaccount", method = RequestMethod.POST)
    public void saveBankAccount( @Validated @RequestBody BankAccount bankAccount) {
        bankAccountRepo.save(bankAccount);
        
    }
}

