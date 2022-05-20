package com.mehdi.mehdi.Service;

import com.mehdi.mehdi.Entity.Livraison;
import com.mehdi.mehdi.Repository.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivraisonServiceImplm implements LivraisonService{
    @Autowired
    private LivraisonRepository LivraisonRepository;

    public List<Livraison> getAllLivraisons() {
        return LivraisonRepository.findAll() ;
    }

    public Livraison getLivraisonUsingAdress(String adress){
        return LivraisonRepository.findLivraisonsByAdress(adress);
    }

    public Livraison addLivraison(Livraison livraison) {
        return LivraisonRepository.save(livraison);
    }
    public Livraison updateLivraison(int id, Livraison newLivraison) {
        if (LivraisonRepository.findById(id)!=null) {
            Livraison existingLivraison = LivraisonRepository.findById(id);
            existingLivraison.setAdress(newLivraison.getAdress());
            existingLivraison.setPrix(newLivraison.getPrix());
            return LivraisonRepository.save(existingLivraison);
        } else
            return null;
    }
    public String deleteLivraison(int id) {
        if (LivraisonRepository.findById(id)!=null) {
            LivraisonRepository.deleteById(id);
            return "livraison supprimé";
        } else
            return "livraison non supprimé";
    }
}
