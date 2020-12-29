package com.epita.tpmobile.infrastructure;

import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.exceptions.NotFoundException;
import com.epita.tpmobile.infrastructure.jpaRepository.LocalisationJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LocalisationRepositoryImpl implements LocalisationRepository {

    private final LocalisationJpaRepository localisationJpaRepository;

    public LocalisationRepositoryImpl(LocalisationJpaRepository localisationJpaRepository) {
        this.localisationJpaRepository = localisationJpaRepository;
    }

    @Override
    public void saveLocalisation(Localisation localisation) {
        localisationJpaRepository.save(localisation);
    }

    @Override
    public List<Localisation> getLocalisationByVille(String nomVille) {

        List<Localisation> lesLocalisations = new ArrayList<>();
        lesLocalisations = localisationJpaRepository.findByVille(nomVille);
        return lesLocalisations;
    }

    @Override
    public Localisation getLocalisationById(String id) throws NotFoundException {
        return this.localisationJpaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Localisation " + id + " Not found"));
    }

    @Override
    public List<Localisation> getLocalisationByCodePostal(String codePostal) {
        List<Localisation> lesLocalisations = localisationJpaRepository.findByCodePostal(codePostal);
        return lesLocalisations;
    }
}
