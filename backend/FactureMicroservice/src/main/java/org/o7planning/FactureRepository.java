package org.o7planning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories ("org.o7planning")
public interface FactureRepository extends  JpaRepository<Facture,Integer>{

}
