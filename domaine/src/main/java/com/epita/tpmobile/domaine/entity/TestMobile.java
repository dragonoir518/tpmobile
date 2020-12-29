package com.epita.tpmobile.domaine.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
public class TestMobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testId;

    private String situation;

    private Date date;

    private Time time;

    private String terminal;

    private String url;

    private String fileName;

    private String fileType;

    private int pageChargeeMoins1s;

    private int pageChargeeMoins5s;

    private int pageChargeeMoins60s;

    private double debitMbitsPars;

    private int qualiteParfaite;

    private int qualiteCorrecte;

    private double tempsEnSecondes;

    @ManyToOne
    private Localisation localisation;

    @ManyToOne
    private AntenneMobile antenneMobile;


    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getPageChargeeMoins1s() {
        return pageChargeeMoins1s;
    }

    public void setPageChargeeMoins1s(int pageChargeeMoins1s) {
        this.pageChargeeMoins1s = pageChargeeMoins1s;
    }

    public int getPageChargeeMoins5s() {
        return pageChargeeMoins5s;
    }

    public void setPageChargeeMoins5s(int pageChargeeMoins5s) {
        this.pageChargeeMoins5s = pageChargeeMoins5s;
    }

    public int getPageChargeeMoins60s() {
        return pageChargeeMoins60s;
    }

    public void setPageChargeeMoins60s(int pageChargeeMoins60s) {
        this.pageChargeeMoins60s = pageChargeeMoins60s;
    }

    public double getDebitMbitsPars() {
        return debitMbitsPars;
    }

    public void setDebitMbitsPars(double debitMbitsPars) {
        this.debitMbitsPars = debitMbitsPars;
    }

    public int getQualiteParfaite() {
        return qualiteParfaite;
    }

    public void setQualiteParfaite(int qualiteParfaite) {
        this.qualiteParfaite = qualiteParfaite;
    }

    public int getQualiteCorrecte() {
        return qualiteCorrecte;
    }

    public void setQualiteCorrecte(int qualiteCorrecte) {
        this.qualiteCorrecte = qualiteCorrecte;
    }

    public double getTempsEnSecondes() {
        return tempsEnSecondes;
    }

    public void setTempsEnSecondes(double tempsEnSecondes) {
        this.tempsEnSecondes = tempsEnSecondes;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    public AntenneMobile getAntenneMobile() {
        return antenneMobile;
    }

    public void setAntenneMobile(AntenneMobile antenneMobile) {
        this.antenneMobile = antenneMobile;
    }
}
