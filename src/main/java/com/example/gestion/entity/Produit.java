package com.example.gestion.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String refer;
    private int quantite;
    private float prixUnitaire;


    public Produit() {
        super();
    }

    public Produit(String refer, int quantite, float prixUnitaire) {
        super();
        this.refer = refer;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public String getrefer() {
        return refer;
    }

    public void setrefer(String refer) {
        this.refer = refer;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit)) return false;
        Produit produit = (Produit) o;
        return id == produit.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
