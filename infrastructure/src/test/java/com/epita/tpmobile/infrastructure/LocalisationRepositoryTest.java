package com.epita.tpmobile.infrastructure;

import com.epita.tpmobile.common.Utils;
import com.epita.tpmobile.domaine.entity.Localisation;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@RunWith(SpringRunner.class)   //Junit 4
@ExtendWith(SpringExtension.class) //Junit 5
@DataJpaTest
public class LocalisationRepositoryTest {

    @Autowired
    private LocalisationRepository localisationRepository;

   /* @org.junit.jupiter.api.Test
    public void saveLocalisationTest() {
        //Given
        Localisation localisation = Utils.getLocalisation();


        //When
        localisationRepository.saveLocalisation(localisation);


        //Then
        List<Localisation> lesLocalisations = new ArrayList<>();
        lesLocalisations = localisationRepository.getLocalisationByVille("Crouy en Thelle");
        for(Localisation l : lesLocalisations) {
            assertThat(l.getVille()).isEqualTo("Crouy en Thelle");
            System.out.println(l.getVille() + " " + l.getAdresseComplete());
        }


    }*/


    @org.junit.jupiter.api.Test
    public void getLocalisationByVilleTest() {
        //Given
        String nomVille="Paris";
        List<Localisation> lesLocalisations = new ArrayList<>();

        //When
        lesLocalisations = localisationRepository.getLocalisationByVille(nomVille);

        //Then
        //assertThat(localisation).isNotNull();
        for(Localisation l : lesLocalisations) {
            assertThat(l.getVille()).isEqualTo(nomVille);
            System.out.println(l.getVille() + " " + l.getAdresseComplete());
        }
    }

    @org.junit.jupiter.api.Test
    public void getLocalisationByCodePostal() {
        //Given
        String codePostal = "75012";
        List<Localisation> lesLocalisations = new ArrayList<>();

        //When
        lesLocalisations = localisationRepository.getLocalisationByCodePostal(codePostal);

        //Then
        //assertThat(localisation).isNotNull();
        for(Localisation l : lesLocalisations) {
            assertThat(l.getCodePostal()).isEqualTo(codePostal);
            System.out.println(l.getVille() + " "+ l.getCodePostal()+" " + l.getAdresseComplete());
        }
    }
}
