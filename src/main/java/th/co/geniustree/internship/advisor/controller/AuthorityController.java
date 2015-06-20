
package th.co.geniustree.internship.advisor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.internship.advisor.model.Authority;
import th.co.geniustree.internship.advisor.repo.AuthorityRepo;

@RestController
public class AuthorityController {
     @Autowired
     private AuthorityRepo authorityRepo;
   
     
     @RequestMapping(value = "/authoritys")
    public Page<Authority> getCustomers(Pageable pageable) {
        return authorityRepo.findAll(pageable);
    }
        
        @RequestMapping(value = "/saveauthoritys",method = RequestMethod.POST)
    public void saveCustomer(@Validated @RequestBody Authority authority) {
        authorityRepo.save(authority);
    }
     ////////// Delete ////////////////////
    @RequestMapping(value = "/delectauthoritys", method = RequestMethod.POST)
    public void deleteCustomer(@RequestBody Authority authority) {
        authorityRepo.delete(authority.getRole());
 
    }
    
}
