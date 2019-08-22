package com.example.gestion.service;


import com.example.gestion.entity.Produit;
import java.util.List;
public interface IProduitService {
    List<Produit> getProduits();
    void addProduit(Produit produit);
    void updateProduit(Produit produit);
    void deleteProduit(String ref);
}