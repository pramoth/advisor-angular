/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.internship.advisor.model.BankAccount;

/**
 *
 * @author Jasin007
 */
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{
    
}
