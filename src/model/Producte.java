package model;

import java.util.Objects;

abstract class Producte {
    float preu;
    String nom;
    String codiBarras;

    public Producte(float preu, String nom, String codiBarras) {
        this.preu = preu;
        this.nom = nom;
        this.codiBarras = codiBarras;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodiBarras() {
        return codiBarras;
    }

    public void setCodiBarras(String codiBarras) {
        this.codiBarras = codiBarras;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producte producte = (Producte) obj;
        return Objects.equals(codiBarras, producte.codiBarras);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codiBarras);
    }
}
