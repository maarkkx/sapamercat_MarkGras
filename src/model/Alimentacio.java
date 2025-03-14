package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

import static java.time.LocalDate.now;

public class Alimentacio extends Producte implements Data, Comparable<Alimentacio> {
    LocalDate dataCaducitat;

    /**
     * Constructor del objecte Alimentacio
     * @param preu preu del producte
     * @param nom nom del producte
     * @param codiBarras codi identificador del producte
     * @param dataCaducitat data caducitat del producte
     */
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

    /**
     * Funcio per calcular el preu del producte segons la seva data de caducitat
     * @return retorna el preu (float) final del producte
     */
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

    @Override
    public String toString() {
        return  "Nom: '" + nom + "\'" +
                " | Preu: " + preu +
                "€ | Data de Caducitat: " + dataCaducitat +
                " | CodiBarras: '" + codiBarras + '\'';
    }

    @Override
    public int compareTo(Alimentacio o) {
        return this.dataCaducitat.compareTo(o.dataCaducitat);
    }

}
