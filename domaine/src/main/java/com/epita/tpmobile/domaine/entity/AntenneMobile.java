package com.epita.tpmobile.domaine.entity;

import javax.persistence.*;


@Entity
public class AntenneMobile {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String antenneMobileId;

    private String operateur;

    private String technologie;


    public String getAntenneMobileId() {
        return antenneMobileId;
    }

    public void setAntenneMobileId(String antenneMobileId) {
        this.antenneMobileId = antenneMobileId;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getTechnologie() {
        return technologie;
    }

    public void setTechnologie(String technologie) {
        this.technologie = technologie;
    }
}
