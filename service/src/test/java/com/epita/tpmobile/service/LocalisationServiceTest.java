package com.epita.tpmobile.service;

import com.epita.tpmobile.domaine.entity.AntenneMobile;
import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.entity.Operateur;
import com.epita.tpmobile.domaine.entity.TestMobile;
import com.epita.tpmobile.infrastructure.LocalisationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class) //Junit 5
@SpringBootTest(classes = {LocalisationServiceImpl.class})
public class LocalisationServiceTest {

    @Autowired
    private LocalisationService localisationService;

    @MockBean
    private LocalisationRepository localisationRepository;

    @Test
    public void Given_CodePostal_Should_Return_Localisations() {
        //Given
        String codePostal ="75012";
        ///////créer une Localisation pour test//////
        Localisation localisation = new Localisation();
        localisation.setAdresseComplete("Maison petites soeurs pauvres - 158 rue de Picpus, 75012 Paris");
        localisation.setCodePostal("75012");
        localisation.setVille("Paris");
        localisation.setLatitude(49.215);
        localisation.setLongitude(2.3217);
        localisation.setNomDepartement("Paris");
        localisation.setNumeroDepartement("75");
        localisation.setNumeroRegion(11);

       // TestMobile test = new TestMobile();
       // test.setDate(new Date());
       // test.setDebitMbitsPars(10);

        AntenneMobile antenneMobile = new AntenneMobile();
        antenneMobile.setOperateur("SFR");
        //Set<TestMobile> lesTests = new HashSet<>();
       // lesTests.add(test);
       // antenneMobile.setTests(lesTests);

        Set<AntenneMobile> lesAntennes = new HashSet<>();
        lesAntennes.add(antenneMobile);

        localisation.setAntenneMobiles(lesAntennes);

        ////////////////////////////////////////////



        List<Localisation> lesLocalisations = new ArrayList<>();

        lesLocalisations.add(localisation);
        //Paramétrer Mock
        when(localisationRepository.getLocalisationByCodePostal(codePostal)).thenReturn(lesLocalisations);

        //When
        List<Localisation> localisations = localisationService.getLocalisationByCodePostalService(codePostal);

        //Then
        for(Localisation l : localisations) {
            assertThat(l.getCodePostal()).isEqualTo(codePostal);
            System.out.println(l.getVille()+" "+l.getAdresseComplete());
        }
    }
}
