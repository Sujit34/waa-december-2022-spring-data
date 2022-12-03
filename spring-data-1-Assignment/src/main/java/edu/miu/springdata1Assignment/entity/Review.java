package edu.miu.springdata1Assignment.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private String reviewComment;

    @ManyToOne
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JsonBackReference
    private User user;
}
