package com.javatpoint.springbootcrudoperation.model;

import jakarta.persistence.*;

@Entity
@Table
public class Authors {

    @Id
    @Column
    private int authorId;

    @Column
    private String name;

    @Column(nullable = false)
    private String email;


    public String getName() {
        return name;
    }

    public int getAuthorId()
    {
        return authorId;
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


}
