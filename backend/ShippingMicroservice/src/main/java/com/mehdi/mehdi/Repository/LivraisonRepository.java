package com.mehdi.mehdi.Repository;

import com.mehdi.mehdi.Entity.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Integer> {

    Livraison findLivraisonsByAdress(String adress);
    Livraison findById(int id);

}
