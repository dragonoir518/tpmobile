package com.epita.tpmobile.domaine.dto;

import com.epita.tpmobile.domaine.entity.AntenneMobile;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import java.util.Set;

public class LocalisationDTO implements Serializable {

   /* @JsonProperty("localisation_id")
    private String localiationId;*/

   /* @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;*/

    @JsonProperty("adressecomplete")
    private String adresseComplete;

    @JsonProperty("codePostal")
    private String codePostal;

    @JsonProperty("ville")
    private String ville;

    @JsonProperty("strate")
    private String strate;

    @JsonProperty("numero_departement")
    private String numeroDepartement;

    @JsonProperty("nom_departement")
    private String nomDepartement;

    @JsonProperty("numero_region")
    private Integer numeroRegion;

    @JsonProperty("les_antennes_mobiles")
    private Set<AntenneMobile> antenneMobiles;

  /*  public String getLocaliationId() {
        return localiationId;
    }

    public void setLocaliationId(String localiationId) {
        this.localiationId = localiationId;
    }*/

  /*  public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }*/

    public String getAdresseComplete() {
        return adresseComplete;
    }

    public void setAdresseComplete(String adresseComplete) {
        this.adresseComplete = adresseComplete;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getStrate() {
        return strate;
    }

    public void setStrate(String strate) {
        this.strate = strate;
    }

    public String getNumeroDepartement() {
        return numeroDepartement;
    }

    public void setNumeroDepartement(String numeroDepartement) {
        this.numeroDepartement = numeroDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public Integer getNumeroRegion() {
        return numeroRegion;
    }

    public void setNumeroRegion(Integer numeroRegion) {
        this.numeroRegion = numeroRegion;
    }

    public Set<AntenneMobile> getAntenneMobiles() {
        return antenneMobiles;
    }

    public void setAntenneMobiles(Set<AntenneMobile> antenneMobiles) {
        this.antenneMobiles = antenneMobiles;
    }
}
