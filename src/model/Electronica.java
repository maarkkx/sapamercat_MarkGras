package model;

public class Electronica extends Producte implements Data {
    int diesGarantia;

    /**
     * Constructor per productes de tipus Electronica
     * @param preu preu del producte
     * @param nom nom del producte
     * @param codiBarras codi identificador del producte
     * @param diesGarantia dies de garantia del producte
     */
    public Electronica(float preu, String nom, String codiBarras, int diesGarantia) {
        super(preu, nom, codiBarras);
        this.diesGarantia = diesGarantia;
    }

    public int getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
    }

    /**
     * Funcio per calcular el preu adicional al producte segons els dies de garantia
     * @return retorna el preu (float) del producte
     */
    @Override
    public float calcularPreuData() {
        if (diesGarantia == 0) {
            return 0;
        } else {
            float preu = getPreu();
            return preu + preu * (diesGarantia/365f)*0.1f;
        }
    }

    @Override
    public String toString() {
        return "Electronica{" +
                "diesGarantia=" + diesGarantia +
                ", preu=" + preu +
                ", nom='" + nom + '\'' +
                ", codiBarras='" + codiBarras + '\'' +
                '}';
    }
}
