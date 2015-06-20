/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author User
 */
@Entity
public class Department implements Serializable{
    @Id
    @SequenceGenerator(name = "Department",sequenceName = "DEPARTMENT_SEQ",allocationSize = 1)
    @GeneratedValue(generator = "Department",strategy = GenerationType.SEQUENCE)
    @Column(name = "department_id")
    private int idDepartment;
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private List<User> Users;

    public List<User> getUsers() {
        return Users;
    }

    public void setUsers(List<User> Users) {
        this.Users = Users;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.idDepartment;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        if (this.idDepartment != other.idDepartment) {
            return false;
        }
        return true;
    }
    
    
  
    
}
