package com.domain.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
    

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reservation", length = 11)
    private Long id;

    @NotEmpty(message = "Name is required")
    @Column(name="name_person", length = 100, unique = true)
    private String namePerson;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email format is wrong")
    @Column(name="email_person", length = 100, unique = true)
    private String email;

    @NotEmpty(message = "Phone Number is required")
    @Column(name="phone_person", length = 50, unique = true)
    private String phoneNumber;

    @Column(name="address_person", length = 255)
    private String address;

    @Column(name="is_deleted", length = 11, columnDefinition = "integer default 0")
    private Integer isDeleted;

    public Reservation(){
        
    }

    public Reservation(Long id, String namePerson, String email, String phoneNumber, String address,
            Integer isDeleted) {
        this.id = id;
        this.namePerson = namePerson;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }



    



}
