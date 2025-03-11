package model;

public class Textil extends Producte implements Comparable<Textil> {
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
        return  "Nom: '" + nom + '\'' +
                " | Preu: " + preu +
                "€ | Composició Textil: '" + compTextil + '\'' +
                " | Codi de Barras: '" + codiBarras + '\'';
    }

    @Override
    public int compareTo(Textil o) {
        return 0;
    }
}
