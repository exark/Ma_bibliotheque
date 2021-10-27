package com.example.mabibliotheque;

public class Livre {

    //VAR
    private int id;
    private String titre;
    private String auteur;
    private String description;
    private String date_parution;
    private String couverture;

    public Livre(int id, String titre, String auteur, String description, String date_parution, String couverture) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.date_parution = date_parution;
        this.couverture = couverture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate_parution() {
        return date_parution;
    }

    public void setDate_parution(String date_parution) {
        this.date_parution = date_parution;
    }

    public String getCouverture() {
        return couverture;
    }

    public void setCouverture(String couverture) {
        this.couverture = couverture;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", description='" + description + '\'' +
                ", date_parution='" + date_parution + '\'' +
                ", couverture='" + couverture + '\'' +
                '}';
    }

}
