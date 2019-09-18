package com.example.gestion.entity;

import com.example.gestion.util.RoleEnum;

import javax.persistence.*;

@Entity
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    private Long id;
    private String name;

    public Role() {
        super();
    }

    public Role(RoleEnum role) {
        super();
        this.name = role.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
