package com.epita.tpmobile.infrastructure.jpaRepository;

import com.epita.tpmobile.domaine.entity.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalisationJpaRepository extends JpaRepository<Localisation,String> {

    List<Localisation> findByVille(String ville);

    List<Localisation> findByCodePostal(String codePostal);
}
