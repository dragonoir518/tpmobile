package com.epita.tpmobile.common;

import com.epita.tpmobile.domaine.entity.AntenneMobile;
import com.epita.tpmobile.domaine.entity.Localisation;
import com.epita.tpmobile.domaine.entity.Operateur;
import com.epita.tpmobile.domaine.entity.TestMobile;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static Localisation getLocalisation() {
        Localisation localisation = new Localisation();
        localisation.setAdresseComplete("Maison de retraite - 188 grande rue, 60530 Crouy en Thelle");
        localisation.setCodePostal("60530");
        localisation.setVille("Crouy en Thelle");
        localisation.setLatitude(49.215);
        localisation.setLongitude(2.3217);
        localisation.setNomDepartement("OISE");
        localisation.setNumeroDepartement("60");
        localisation.setNumeroRegion(32);

      //  TestMobile test = new TestMobile();
      //  test.setDate(new Date());
      //  test.setDebitMbitsPars(10);

        AntenneMobile antenneMobile = new AntenneMobile();
        antenneMobile.setOperateur("SFR");
       // Set<TestMobile> lesTests = new HashSet<>();
       // lesTests.add(test);
        //antenneMobile.setTests(lesTests);

        Set<AntenneMobile> lesAntennes = new HashSet<>();
        lesAntennes.add(antenneMobile);

        localisation.setAntenneMobiles(lesAntennes);

        return  localisation;
    }
}
