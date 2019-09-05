package com.example.gestion;

import com.example.gestion.entity.Produit;
import com.example.gestion.entity.Role;
import com.example.gestion.entity.User;
import com.example.gestion.repository.ProduitRepository;
import com.example.gestion.repository.RoleRepository;
import com.example.gestion.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;


@SpringBootApplication
public class GestionStockProduitsApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(GestionStockProduitsApplication.class, args);
        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);

        produitRepository.save(new Produit("Livre", 50, 20));
        produitRepository.save(new Produit("Cahier", 200, 5.25f));
        produitRepository.save(new Produit("Stylo", 500, 2.10f));


        RoleRepository roleRepository = ctx.getBean(RoleRepository.class);

        Role roleUser = new Role("ROLE_USER");
        Role roleAdmin = new Role("ROLE_ADMIN");

        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);

        UserRepository userRepository = ctx.getBean(UserRepository.class);
        User utilisateur = new User("user","password1",true);
        utilisateur.setRoles(Arrays.asList(roleUser,roleUser));

        userRepository.save(utilisateur);

        User admin = new User("admin","password2",true);
        admin.setRoles(Arrays.asList(roleUser,roleAdmin));

        userRepository.save(admin);
    }

}
