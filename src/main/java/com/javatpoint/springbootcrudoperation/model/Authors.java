package com.javatpoint.springbootcrudoperation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Authors {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public int getAuthorId()
    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column
    private String email;
}
