package com.example.demo.sharedexp;

import javax.persistence.*;

@Entity
@Table
public class Share {
    @Id
    @SequenceGenerator(
            name = "share_sequence",
            sequenceName = "share_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "share_sequence"
    )
    private Long id;
    private String name_of_expense;
    private double total;
    private double share_of_each;

    public Share() {

    }

    public Share(Long id, String name_of_expense, double total, double share_of_each) {
        this.id = id;
        this.name_of_expense = name_of_expense;
        this.total = total;
        this.share_of_each = share_of_each;
    }

    public Share(String name_of_expense, double total, double share_of_each) {
        this.name_of_expense = name_of_expense;
        this.total = total;
        this.share_of_each = share_of_each;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_of_expense() {
        return name_of_expense;
    }

    public void setName_of_expense(String name_of_expense) {
        this.name_of_expense = name_of_expense;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getShare_of_each() {
        return share_of_each;
    }

    public void setShare_of_each(double share_of_each) {
        this.share_of_each = share_of_each;
    }

    @Override
    public String toString() {
        return "Share{" +
                "id=" + id +
                ", name_of_expense='" + name_of_expense + '\'' +
                ", total=" + total +
                ", share_of_each=" + share_of_each +
                '}';
    }
}
