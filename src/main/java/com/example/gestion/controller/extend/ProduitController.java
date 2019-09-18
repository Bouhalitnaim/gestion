
package com.example.gestion.controller.extend;
import com.example.gestion.controller.CrudController;
import com.example.gestion.entity.Produit;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController extends CrudController<Produit,Long> {

}
