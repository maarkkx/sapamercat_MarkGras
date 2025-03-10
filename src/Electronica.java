public class Electronica extends Producte implements Data {
    int diesGarantia;

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

    @Override
    public float calcularPreuData() {
        if (diesGarantia == 0) {
            return 0;
        } else {
            float preu = getPreu();
            return preu + getPreu()*(diesGarantia/365f)*0.1f;
        }
    }
}
