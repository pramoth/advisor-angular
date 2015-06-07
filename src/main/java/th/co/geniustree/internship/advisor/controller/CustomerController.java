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
import th.co.geniustree.internship.advisor.model.Customer;
import th.co.geniustree.internship.advisor.repo.CustomerRepo;

/**
 *
 * @author pramoth
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @RequestMapping(value = "/customers")
    public Page<Customer> getCustomers(Pageable pageable) {
        return customerRepo.findAll(pageable);
    }
    @RequestMapping(value = "/customers",method = RequestMethod.POST)
    public void saveCustomer(@Validated @RequestBody Customer customer) {
        customerRepo.save(customer);
    }
}
