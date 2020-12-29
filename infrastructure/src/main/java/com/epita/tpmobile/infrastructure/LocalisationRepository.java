package com.epita.tpmobile.infrastructure;

import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.exceptions.NotFoundException;

import java.util.List;


public interface LocalisationRepository {
    void saveLocalisation(Localisation localisation);
    List<Localisation> getLocalisationByVille(String nomVille);

    Localisation getLocalisationById(String id) throws NotFoundException;

    List<Localisation> getLocalisationByCodePostal(String codePostal);

}
