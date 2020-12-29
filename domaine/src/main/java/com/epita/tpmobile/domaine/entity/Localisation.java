package com.epita.tpmobile.domaine.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Localisation {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String localiationId;

    private double latitude;

    private double longitude;

    private String adresseComplete;

    private String codePostal;

    private String ville;

    private String strate;

    private String numeroDepartement;

    private String nomDepartement;

    private int numeroRegion;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AntenneMobile> antenneMobiles;

    public String getLocaliationId() {
        return localiationId;
    }

    public void setLocaliationId(String localiationId) {
        this.localiationId = localiationId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

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

    public int getNumeroRegion() {
        return numeroRegion;
    }

    public void setNumeroRegion(int numeroRegion) {
        this.numeroRegion = numeroRegion;
    }

    public Set<AntenneMobile> getAntenneMobiles() {
        return antenneMobiles;
    }

    public void setAntenneMobiles(Set<AntenneMobile> antenneMobiles) {
        this.antenneMobiles = antenneMobiles;
    }
}
