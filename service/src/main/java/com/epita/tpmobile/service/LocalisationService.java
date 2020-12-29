package com.epita.tpmobile.service;

import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.exceptions.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface LocalisationService {
    List<Localisation> getLocalisationByCodePostalService(String codePostal);
    Localisation getLocalisationByIdService(String id) throws NotFoundException;
}
