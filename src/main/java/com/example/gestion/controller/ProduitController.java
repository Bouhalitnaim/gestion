package com.example.gestion.controller;
import com.example.gestion.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.gestion.service.IProduitService;
import java.util.List;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin

public class ProduitController {

   @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduits() {
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id){
        produitService.deleteProduit(id);
    }
}
