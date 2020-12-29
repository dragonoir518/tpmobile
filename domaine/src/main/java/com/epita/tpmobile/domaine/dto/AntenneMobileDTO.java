package com.epita.tpmobile.domaine.dto;

import com.epita.tpmobile.domaine.entity.Operateur;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AntenneMobileDTO implements Serializable {

   /* @JsonProperty("antenneMobileId")
    private String antenneMobileId;*/

    @JsonProperty("operateur")
    private String operateur;

    @JsonProperty("technologie")
    private String technologie;

  /*  public String getAntenneMobileId() {
        return antenneMobileId;
    }

    public void setAntenneMobileId(String antenneMobileId) {
        this.antenneMobileId = antenneMobileId;
    }*/

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
