import model.*;
import view.View;

import java.time.LocalDate;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = -1;
        Model.afegirArray();
        while (num != 0) {
            View.menuInici();
            num = scan.nextInt();
            switch (num) {
                case 1:
                    gestioMagatzem();
                    break;

                case 2:
                    afegirProductesMenu();
                    break;

                case 3:
                    caixa();
                    break;

                case 4:
                    Model.mostrarCarro();
                    break;
            }
        }
    }

    public static void gestioMagatzem() {
        Scanner magatzem = new Scanner(System.in);
        int num2 = -1;
        while (num2 != 0) {
            View.menuMagatzem();
            num2 = magatzem.nextInt();
            switch (num2) {
                case 1:
                    Model.filtrarCaducitat();
                    break;

                case 2:
                    Model.mostrarTickets();
                    break;

                case 3:
                    Model.filtrarTextil();
                    break;

                case 4:
                    Model.buscarProductes();
                    break;
            }
        }
    }



    public static void afegirProductesMenu() {
        Scanner productes = new Scanner(System.in);
        int num3 = -1;
        while (num3 != 0) {
            View.menuProducte();
            num3 = productes.nextInt();
            switch (num3) {
                case 1:
                    afegirAliment();
                    break;

                case 2:
                    afegirTextil();
                    break;

                case 3:
                    afegirElectronica();
                    break;
            }

        }
    }

    public static void afegirAliment() {
        View.escriureText("Escriu les dades del aliment que vols afegir");

        View.escriureText("Preu:");
        Scanner afegirAliment = new Scanner(System.in);
        float preuAliment = afegirAliment.nextFloat();
        afegirAliment.nextLine();

        View.escriureText("Nom del producte:");
        String nomAliment = afegirAliment.nextLine();

        View.escriureText("Codi de barras:");
        String codiAliment = afegirAliment.nextLine();

        View.escriureText("Data de caducitat (YYYY-MM-DD):");
        LocalDate dataAliment = LocalDate.parse(afegirAliment.nextLine().trim());

        View.escriureText("Quantitat que vols afegir al carro:");
        int quantitat = afegirAliment.nextInt();

        Alimentacio prod = new Alimentacio(preuAliment, nomAliment, codiAliment, dataAliment);

        Model.afegirCarro(prod, quantitat);
    }

    public static void afegirTextil() {
        View.escriureText("Escriu les dades del textil que vols afegir");

        View.escriureText("Preu:");
        Scanner afegirtex = new Scanner(System.in);
        float preuText = afegirtex.nextFloat();
        afegirtex.nextLine();

        View.escriureText("Nom del producte:");
        String nomText = afegirtex.nextLine();

        View.escriureText("Codi de barras:");
        String codiText = afegirtex.nextLine();

        View.escriureText("Compocició textil:");
        String compocicio = afegirtex.nextLine();

        View.escriureText("Quantitat que vols afegir al carro:");
        int quantitat = afegirtex.nextInt();

        Textil prod = new Textil(preuText, nomText, codiText, compocicio);

        Model.afegirCarro(prod, quantitat);
    }

    public static void afegirElectronica() {
        View.escriureText("Escriu les dades del producte electronic que vols afegir");

        View.escriureText("Preu:");
        Scanner afegirElec = new Scanner(System.in);
        float preuElec = afegirElec.nextFloat();
        afegirElec.nextLine();

        View.escriureText("Nom del producte:");
        String nomElec = afegirElec.nextLine();

        View.escriureText("Codi de barras:");
        String codiElec = afegirElec.nextLine();

        View.escriureText("Dies de garantia (ex: 5):");
        int dies = afegirElec.nextInt();

        View.escriureText("Quantitat que vols afegir al carro:");
        int quantitat = afegirElec.nextInt();

        Electronica prod = new Electronica(preuElec, nomElec, codiElec, dies);

        Model.afegirCarro(prod, quantitat);
    }

    public static void caixa() {
        View.escriureText("--------------------------------");
        View.escriureText("------>    SAPAMERCAT    <------");
        View.escriureText("--------------------------------");
        View.escriureText("Data: " + LocalDate.now() + "\n--------------------------------");

        float total = Model.passarCaixa();

        String ticket = "\n--------------------------------\n------>    SAPAMERCAT    <------\n--------------------------------" + "\nData: " + LocalDate.now() + "\n--------------------------------\n" + Model.mostrarCarro() + "\n\nTOTAL: " + total + "\n--------------------------------";
        View.escriureText("\nTOTAL: " + total);
        View.escriureText("--------------------------------");

        Model.setTicket(ticket);

        Model.netejarCarro();
    }
}