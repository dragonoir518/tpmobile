package com.epita.tpmobile.exposition.localisation;

import com.epita.tpmobile.domaine.dto.AntenneMobileDTO;
import com.epita.tpmobile.domaine.entity.AntenneMobile;

public interface AntenneMobileMapper {

    AntenneMobileDTO mapToDto(AntenneMobile entity);
}
