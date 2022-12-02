package edu.miu.springdata1Assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;
}
