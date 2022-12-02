package edu.miu.springdata1Assignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne(mappedBy ="user" )
    private Address address;
}
