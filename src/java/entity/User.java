/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Melnikov
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
    @OneToMany(orphanRemoval = true,cascade = {CascadeType.MERGE,
        CascadeType.PERSIST,CascadeType.REMOVE})
    private List<String> rolles = new ArrayList<>();

    public User() {
    }

    public User(String name, String surname, String login, String password, List<String> rolles) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.rolles = rolles;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String strRolles="";
        for (int i = 0; i < rolles.size(); i++) {
            String role = rolles.get(i);
            strRolles += role+", ";
        }
        return "User{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", login=" + login + ", password=" + password + ", rolles=" + strRolles + '}';
    }

    
    public List<String> getRolles() {
        return rolles;
    }

    public void setRolles(List<String> rolles) {
        this.rolles = rolles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
