/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.repo;

import java.util.Date;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.internship.advisor.App;
import th.co.geniustree.internship.advisor.model.Department;
import th.co.geniustree.internship.advisor.model.User;

/**
 *
 * @author pramoth
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@Transactional(propagation = Propagation.REQUIRED)
public class UserRepoIT {

    private static final Logger LOG = LoggerFactory.getLogger(UserRepoIT.class);
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private DepartmentRepo departmentRepo;

    @Before
    public void setup() {
        LOG.info("setup call.");
    }

    @Test
    public void test1() {
        long count = userRepo.count();
        Assertions.assertThat(count).isEqualTo(0);
    }

    @Test
    public void userMustSaveableToDB() {
        User user = createUser();
        userRepo.save(user);
        User findByEmail = userRepo.findByEmail("xxx@xxx.com");
        Assertions.assertThat(findByEmail).isNotNull();
    }

    private User createUser() {
        User user = new User();
        user.setEmail("xxx@xxx.com");
        user.setNameTH("ดำ แดง");
        user.setAddress("xxxxxxx xxxx xxxxxx");
        user.setBirthday(new Date());
        return user;
    }

    @Test
    public void userWithDepartmentMustBeSaveableToDB() {
        Department dep = new Department();
        dep.setName("Software Development");
        dep = departmentRepo.save(dep);
        User user = createUser();
        user.setDepartment(dep);
        userRepo.save(user);
        User findByEmail = userRepo.findByEmail("xxx@xxx.com");
        
        Assertions.assertThat(findByEmail.getDepartment()).isEqualTo(dep);
    }
}
