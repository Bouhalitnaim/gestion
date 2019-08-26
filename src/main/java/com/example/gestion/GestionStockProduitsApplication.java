package com.example.gestion;

import com.example.gestion.entity.Produit;
import com.example.gestion.repository.ProduitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class GestionStockProduitsApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(GestionStockProduitsApplication.class, args);
        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);

        produitRepository.save(new Produit("Livre", 50, 20));
        produitRepository.save(new Produit("Cahier", 200, 5.25f));
        produitRepository.save(new Produit("Stylo", 500, 2.10f));
    }

}
