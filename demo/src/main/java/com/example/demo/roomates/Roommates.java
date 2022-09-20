package com.example.demo.roomates;

import javax.persistence.*;

@Entity
@Table
public class Roommates {
    @Id
    @SequenceGenerator(
            name = "roommate_sequence",
            sequenceName = "roommate_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "roommate_sequence"
    )
    private Long id;
    private String name;
    private double total_share;

    public Roommates() {
    }

    public Roommates(Long id, String name, double total_share) {
        this.id = id;
        this.name = name;
        this.total_share = total_share;
    }

    public Roommates(String name, double total_share) {
        this.name = name;
        this.total_share = total_share;
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

    public double getTotal_share() {
        return total_share;
    }

    public void setTotal_share(double total_share) {
        this.total_share = total_share;
    }

    @Override
    public String toString() {
        return "Roommates{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total_share=" + total_share +
                '}';
    }
}
