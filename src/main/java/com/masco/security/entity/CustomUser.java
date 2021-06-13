package com.masco.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "custom_user")
@Getter
@Setter
public class CustomUser {

    @Id
    private String username;
    private String password;
    private String roles;
}
