package com.emsi.entities;

import javax.persistence.*;

@Entity
@Table(name = "machines")
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ref;
    private String marque;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    Salle salle;

    public Machine(String ref, String marque, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.salle = salle;
    }

    public Machine() {};

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public String getMarque() {
        return marque;
    }

    public Salle getSalle() {
        return salle;
    }
}
