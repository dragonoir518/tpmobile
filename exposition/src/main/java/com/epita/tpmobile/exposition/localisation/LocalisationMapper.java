package com.epita.tpmobile.exposition.localisation;

import com.epita.tpmobile.domaine.dto.LocalisationDTO;
import com.epita.tpmobile.domaine.entity.Localisation;

import java.util.List;

public interface LocalisationMapper {
    LocalisationDTO mapToDto(Localisation entity);

    List<LocalisationDTO> mapToDtoList(List<Localisation> lesLocalisations);
}
