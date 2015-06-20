/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author oom
 */
@Entity
public class Contactpersion implements Serializable{
    @Id
    private String name;
    private Integer telephonenumber;
    private String reletion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(Integer telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getReletion() {
        return reletion;
    }

    public void setReletion(String reletion) {
        this.reletion = reletion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Contactpersion other = (Contactpersion) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
