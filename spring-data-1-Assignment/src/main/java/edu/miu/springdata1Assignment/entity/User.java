package edu.miu.springdata1Assignment.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String lastName;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Review> reviews;

    @OneToOne(mappedBy ="user" )
    @JsonManagedReference
    private Address address;
}
