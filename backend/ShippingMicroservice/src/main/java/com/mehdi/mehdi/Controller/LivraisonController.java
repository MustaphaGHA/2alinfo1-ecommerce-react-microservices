package com.mehdi.mehdi.Controller;

import com.mehdi.mehdi.Entity.Livraison;
import com.mehdi.mehdi.Service.LivraisonService;
import com.mehdi.mehdi.Service.LivraisonServiceImplm;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livraison")
public class LivraisonController {

    @Autowired
    private LivraisonServiceImplm livraisonService ;

    @GetMapping("/")
    public List<Livraison> fetchAllLivraisons() {
        return livraisonService.getAllLivraisons();
    }

    @GetMapping("/adr")
    public Livraison fetchLivraisonUsingAdr(@RequestParam String adress) {
        Livraison Livraison = livraisonService.getLivraisonUsingAdress(adress);
        return Livraison;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Livraison> createLivraison(@RequestBody Livraison Livraison) {
        return new ResponseEntity<>(livraisonService.addLivraison(Livraison), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Livraison> updateLivraison(@PathVariable(value = "id") int id,
                                                     @RequestBody Livraison Livraison){
        return new ResponseEntity<>(livraisonService.updateLivraison(id, Livraison), HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteLivraison(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(livraisonService.deleteLivraison(id), HttpStatus.OK);
    }
}
