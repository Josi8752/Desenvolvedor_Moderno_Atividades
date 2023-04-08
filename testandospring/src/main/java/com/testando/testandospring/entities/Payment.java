package com.testando.testandospring.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name = "tb_payment")
public class Payment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @OneToOne
    @MapsId
    private Order order;

    public  Payment(){

    }

    public Payment(long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return id +
                ", " + moment
                ;
    }
}
