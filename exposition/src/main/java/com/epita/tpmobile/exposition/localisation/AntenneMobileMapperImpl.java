package com.epita.tpmobile.exposition.localisation;

import com.epita.tpmobile.domaine.dto.AntenneMobileDTO;
import com.epita.tpmobile.domaine.entity.AntenneMobile;

public class AntenneMobileMapperImpl implements AntenneMobileMapper{
    @Override
    public AntenneMobileDTO mapToDto(AntenneMobile entity) {
        AntenneMobileDTO dto = new AntenneMobileDTO();
       // dto.setAntenneMobileId(entity.getAntenneMobileId());
        dto.setOperateur(entity.getOperateur());
        dto.setTechnologie(entity.getTechnologie());

        return null;
    }
}
