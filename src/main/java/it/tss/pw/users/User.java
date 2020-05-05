/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.users;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Melissa
 */
public class User implements Serializable{
    
    private Long id;
    private String firstName;
    private String lastName;
    private String usr;
    private String pws;
    private LocalDate birthDate;

    public User() {
    }

    public User(Long id, String usr, String pws) {
        this.id = id;
        this.usr = usr;
        this.pws = pws;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
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
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", usr=" + usr + ", pws=" + pws + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
    
    
}
