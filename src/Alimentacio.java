import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

public class Alimentacio extends Producte implements Data {
    LocalDate dataCaducitat;

    public Alimentacio(float preu, String nom, String codiBarras, LocalDate dataCaducitat) {
        super(preu, nom, codiBarras);
        this.dataCaducitat = dataCaducitat;
    }

    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    public float calcularPreuData() {
        LocalDate dataActual = now();
        Period dies = Period.between(dataCaducitat, dataActual);
        int diesTotals = dies.getDays();
        if (diesTotals < 0) {
            return 0;
        } else {
            float preu = getPreu();
            return (preu - getPreu()*(1f/(diesTotals+1)) + (getPreu()*0.1f));
        }
    }
}
