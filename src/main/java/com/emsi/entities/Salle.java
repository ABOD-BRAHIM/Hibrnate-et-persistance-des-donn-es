package com.emsi.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "salles")
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nom;
    private String libelle;

    @OneToMany(mappedBy = "salle", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Machine> machines;

    public Salle(String nom, String libelle, List<Machine> machines) {
        this.nom = nom;
        this.libelle = libelle;
        this.machines = machines;
    }
    public Salle() {};

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public List<Machine> getMachines() {
        return machines;
    }
}
