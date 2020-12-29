package com.epita.tpmobile.exposition.localisation;

import com.epita.tpmobile.domaine.dto.LocalisationDTO;
import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.exceptions.NotFoundException;
import com.epita.tpmobile.service.LocalisationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class LocalisationController {

    private static final Logger logger = LoggerFactory.getLogger(LocalisationController.class);

    @Autowired
    private LocalisationService localisationService;

    @Autowired
    private LocalisationMapper localisationMapper;

    @GetMapping(value = "/antennebycodepostal/{codePostal}", produces = { "application/json" })
    public List<LocalisationDTO> getLocalisationAntenneByCodePostal(@PathVariable final String codePostal) {
        //System.out.println("dans la fonction antennebycodepostal");

        List<Localisation> localisations = localisationService.getLocalisationByCodePostalService(codePostal);

        List<LocalisationDTO> dtos = localisationMapper.mapToDtoList(localisations);

        logger.info("liste LocalisationDTO nombre elements =>"+ dtos.size());
        for(LocalisationDTO d : dtos) {
            System.out.println(d.getAdresseComplete());
        }
        return dtos;
    }


    @GetMapping(value = "/antennebyid/{id}", produces = { "application/json" })
    public LocalisationDTO getLocalisationAntenneById(@PathVariable final String id) throws NotFoundException {
        //System.out.println("dans la fonction antennebycodepostal");
        LocalisationDTO dto = null;

        Localisation localisation = localisationService.getLocalisationByIdService(id);

        if(localisation==null) {
            throw new NotFoundException("Id "+id+" est inconnu!!!");
        }

        dto= localisationMapper.mapToDto(localisation);

        return dto;
    }

}
