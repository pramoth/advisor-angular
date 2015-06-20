/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author User
 */
@Entity
public class User implements Serializable,UserDetails{
    @Id
    @SequenceGenerator(name = "user", sequenceName = "user_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "user", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String password;
    private String email;
    private String pid;
    private String nameTH;
    private String nameENG;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthday;
    private String sex;
    private String blood;
    private String soldierstatus; 
    private String marrystatus;
    private String nation;
    private String race;
    private String addressofpid;
    private String address;
    private String tel;
    private String mobile;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startwork;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endwork;
    private String workstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getNameTH() {
        return nameTH;
    }

    public void setNameTH(String nameth) {
        this.nameTH = nameth;
    }

    public String getNameENG() {
        return nameENG;
    }

    public void setNameENG(String nameeng) {
        this.nameENG = nameeng;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getSoldierstatus() {
        return soldierstatus;
    }

    public void setSoldierstatus(String soldierstatus) {
        this.soldierstatus = soldierstatus;
    }

    public String getMarrystatus() {
        return marrystatus;
    }

    public void setMarrystatus(String marrystatus) {
        this.marrystatus = marrystatus;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAddressofpid() {
        return addressofpid;
    }

    public void setAddressofpid(String addressofpid) {
        this.addressofpid = addressofpid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getStartwork() {
        return startwork;
    }

    public void setStartwork(Date startwork) {
        this.startwork = startwork;
    }

    public Date getEndwork() {
        return endwork;
    }

    public void setEndwork(Date endwork) {
        this.endwork = endwork;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonLocked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

   
    
}
