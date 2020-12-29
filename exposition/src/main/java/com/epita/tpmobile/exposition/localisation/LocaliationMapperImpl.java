package com.epita.tpmobile.exposition.localisation;

import com.epita.tpmobile.domaine.dto.LocalisationDTO;
import com.epita.tpmobile.domaine.entity.Localisation;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class LocaliationMapperImpl implements LocalisationMapper {
    @Override
    public LocalisationDTO mapToDto(Localisation entity) {
        LocalisationDTO dto = new LocalisationDTO();
       // dto.setLocaliationId(entity.getLocaliationId());
        dto.setAdresseComplete(entity.getAdresseComplete());
        dto.setCodePostal(entity.getCodePostal());
        dto.setVille(entity.getVille());
        dto.setNomDepartement(entity.getNomDepartement());
        dto.setStrate(entity.getStrate());
        dto.setAntenneMobiles(entity.getAntenneMobiles());

        return dto;
    }

    @Override
    public List<LocalisationDTO> mapToDtoList(List<Localisation> lesLocalisations) {
        return lesLocalisations.stream()
                               .filter(Objects::nonNull)
                               .map(this::mapToDto)
                               .collect(Collectors.toList());
    }


}
