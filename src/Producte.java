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
    public String toString() {
        return "Producte{" +
                "preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codiBarras='" + codiBarras + '\'' +
                '}';
    }
}
