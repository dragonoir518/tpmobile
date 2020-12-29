package com.epita.tpmobile.service;

import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.exceptions.NotFoundException;
import com.epita.tpmobile.infrastructure.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocalisationServiceImpl implements LocalisationService {

    @Autowired
    private LocalisationRepository localisationRepository;

    @Override
    public List<Localisation> getLocalisationByCodePostalService(String codePostal) {

        return localisationRepository.getLocalisationByCodePostal(codePostal);
    }

    @Override
    public Localisation getLocalisationByIdService(String id) throws NotFoundException {
        Localisation localisation = localisationRepository.getLocalisationById(id);
        return localisation;
    }
}
