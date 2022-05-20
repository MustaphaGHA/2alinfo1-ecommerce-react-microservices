package com.mehdi.mehdi.Service;

import com.mehdi.mehdi.Entity.Livraison;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LivraisonService {
    List<Livraison> getAllLivraisons();
    Livraison getLivraisonUsingAdress(String adr);
    Livraison addLivraison(Livraison livraison);
    Livraison updateLivraison(int id, Livraison newLivraison);
    String deleteLivraison(int id);
}
