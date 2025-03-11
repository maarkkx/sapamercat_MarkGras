package model;

public class Textil extends Producte {
    String compTextil;

    public Textil(float preu, String nom, String codiBarras, String compTextil) {
        super(preu, nom, codiBarras);
        this.compTextil = compTextil;
    }

    public String getCompTextil() {
        return compTextil;
    }

    public void setCompTextil(String compTextil) {
        this.compTextil = compTextil;
    }

    @Override
    public String toString() {
        return "Textil{" +
                "compTextil='" + compTextil + '\'' +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codiBarras='" + codiBarras + '\'' +
                '}';
    }
}
