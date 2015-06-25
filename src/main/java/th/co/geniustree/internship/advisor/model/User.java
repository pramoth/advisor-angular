/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.advisor.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author User
 */
@Entity
public class User implements Serializable, UserDetails {

    @Id
    @SequenceGenerator(name = "user", sequenceName = "user_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "user", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotBlank(message = "please input password")
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    @NotBlank(message = "please input email")
    @Email(message = "format Incompatible (Ex. xxx@xxx.com)")
    private String email;

    @Column(name = "pid", nullable = false)
    @NotBlank(message = "please input person id")
    private String pid;

    @Column(name = "namethai", nullable = false)
    @NotBlank(message = "please input nameTH")
    private String namethai;

    private String nameeng;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthdate;

    @NotBlank(message = "please input sex")
    private String sex;

    @NotBlank(message = "please input blood")
    private String blood;
    private String soldierstatus;
    private String marrystatus;

    @Column(name = "nation", nullable = false)
    @NotBlank(message = "please input nation")
    private String nation;

    @Column(name = "race", nullable = false)
    @NotBlank(message = "please input race")
    private String race;

    private String addressofpid;
    @Column(name = "address", nullable = false)
    @NotBlank(message = "please input address")
    private String address;

    private String tel;
    @Column(name = "phonenumber", nullable = false)
    @NotBlank(message = "please input PhoneNumber")
    private String phonenumber;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startwork;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endwork;

    @NotBlank(message = "please input workstatus")
    private String workstatus;

    private String image;
    private boolean enabled = true;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTACTPERSION_ID")
    private ContactPersion contactPersion;

    @ManyToMany
    private List<Authority> authorities;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BANKACCOUNT_EMAIL", nullable = true)
    private BankAccount bankAccount;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Department getDepartment() {
        return department;
    }

    public ContactPersion getContactPersion() {
        return contactPersion;
    }

    public void setContactPersion(ContactPersion contactPersion) {
        this.contactPersion = contactPersion;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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

    public String getNamethai() {
        return namethai;
    }

    public void setNamethai(String namethai) {
        this.namethai = namethai;
    }

    public String getNameeng() {
        return nameeng;
    }

    public void setNameeng(String nameeng) {
        this.nameeng = nameeng;
    }

    public Date getStartwork() {
        return startwork;
    }

    public void setStartwork(Date startwork) {
        this.startwork = startwork;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

   
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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

  
    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
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
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
