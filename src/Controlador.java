import model.*;
import view.View;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = -1;

        //afageix els 45 productes a la arraylist de magatzem abans de començar el programa
        Model.afegirArray();

        //menu
        while (num != 0) {
            View.menuInici();
            try {
                num = scan.nextInt();
                negatiu(num);
            } catch (InputMismatchException error) {
                View.escriureText("Has d'introduir un numero enter");
            } catch (NegatiuException error2) {
                View.escriureText("No es poden introduir valors negatius");
            } finally {
                scan.nextLine();
            }

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

    /**
     * Mostra el menu de magatzem desde vista, despres te un switch per poder escollir l'opcio
     */
    public static void gestioMagatzem() {
        Scanner magatzem = new Scanner(System.in);
        int num2 = -1;
        while (num2 != 0) {
            View.menuMagatzem();
            try {
                num2 = magatzem.nextInt();
                negatiu(num2);
            } catch (InputMismatchException error) {
                View.escriureText("Has d'introduir un numero enter");
            } catch (NegatiuException error2) {
                View.escriureText("No es poden introduir valors negatius");
            } finally {
                magatzem.nextLine();
            }

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


    /**
     * Menu de afegir productes, mostra el meno de afegir produtes de la Vista
     */
    public static void afegirProductesMenu() {
        Scanner productes = new Scanner(System.in);
        int num3 = -1;
        while (num3 != 0) {
            View.menuProducte();
            try {
                num3 = productes.nextInt();
                negatiu(num3);
            } catch (InputMismatchException error) {
                View.escriureText("Has d'introduir un numero enter");
            } catch (NegatiuException error2) {
                View.escriureText("No es poden introduir valors negatius");
            } finally {
                productes.nextLine();
            }
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

    /**
     * Afageix un objecte de tipus Alimentacio demanant-li dades al usuari
     */
    public static void afegirAliment() {
        View.escriureText("Escriu les dades del aliment que vols afegir");

        View.escriureText("Preu:");
        Scanner afegirAliment = new Scanner(System.in);
        try {
            float preuAliment = afegirAliment.nextFloat();
            afegirAliment.nextLine();
            negatiu(preuAliment);
            View.escriureText("Nom del producte:");
            String nomAliment = afegirAliment.nextLine();

            View.escriureText("Codi de barras:");
            String codiAliment = afegirAliment.nextLine();

            View.escriureText("Data de caducitat (YYYY-MM-DD):");
            LocalDate dataAliment = LocalDate.parse(afegirAliment.nextLine().trim());

            View.escriureText("Quantitat que vols afegir al carro:");
            int quantitat = afegirAliment.nextInt();
            negatiu(quantitat);

            Alimentacio prod = new Alimentacio(preuAliment, nomAliment, codiAliment, dataAliment);

            Model.afegirCarro(prod, quantitat);
        } catch (InputMismatchException error){
            View.escriureText("Has introduit un tipus de dada erroni. Torna a crear el producte.");
        } catch (DateTimeParseException error2){
            View.escriureText("El format de la data no correspon amb el exemple, torna a crear el producte");
        } catch (NegatiuException error3) {
            View.escriureText("No es poden introduir valors negatius");
        } finally {
            afegirAliment.nextLine();
        }

    }

    /**
     * Afageix productes de tipus Textil segons les dades que dona l'usuari
     */
    public static void afegirTextil() {
        Scanner afegirtex = new Scanner(System.in);
        try {
            View.escriureText("Escriu les dades del textil que vols afegir");

            View.escriureText("Preu:");
            float preuText = afegirtex.nextFloat();
            negatiu(preuText);
            afegirtex.nextLine();

            View.escriureText("Nom del producte:");
            String nomText = afegirtex.nextLine();

            View.escriureText("Codi de barras:");
            String codiText = afegirtex.nextLine();

            View.escriureText("Compocició textil:");
            String compocicio = afegirtex.nextLine();

            View.escriureText("Quantitat que vols afegir al carro:");
            int quantitat = afegirtex.nextInt();
            negatiu(quantitat);

            Textil prod = new Textil(preuText, nomText, codiText, compocicio);

            Model.afegirCarro(prod, quantitat);
        } catch (InputMismatchException error){
            View.escriureText("Has introduit un tipus de dada erroni. Torna a crear el producte.");
        } catch (NegatiuException error2) {
        View.escriureText("No es poden introduir valors negatius");
        } finally {
            afegirtex.nextLine();
        }

    }

    /**
     * Afageix productes de tipus Electronica segons les dades que dona l'usuari
     */
    public static void afegirElectronica() {
        Scanner afegirElec = new Scanner(System.in);
        try {
            View.escriureText("Escriu les dades del producte electronic que vols afegir");

            View.escriureText("Preu:");

            float preuElec = afegirElec.nextFloat();
            negatiu(preuElec);
            afegirElec.nextLine();

            View.escriureText("Nom del producte:");
            String nomElec = afegirElec.nextLine();

            View.escriureText("Codi de barras:");
            String codiElec = afegirElec.nextLine();

            View.escriureText("Dies de garantia (ex: 5):");
            int dies = afegirElec.nextInt();

            View.escriureText("Quantitat que vols afegir al carro:");
            int quantitat = afegirElec.nextInt();
            negatiu(quantitat);

            Electronica prod = new Electronica(preuElec, nomElec, codiElec, dies);

            Model.afegirCarro(prod, quantitat);
        } catch (InputMismatchException error){
            View.escriureText("Has introduit un tipus de dada erroni. Torna a crear el producte.");
        } catch (NegatiuException error2) {
            View.escriureText("No es poden introduir valors negatius");
        } finally {
            afegirElec.nextLine();
        }
    }

    /**
     * Mostra el ticket amb la llista de tots els productes del carro, el total del preu, la data amb el dia que es fa la
     * compra y fa un clear del Map de carro
     */
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

    /**
     * Comprova si un numero es negatiu
     * @param num numero per comprovar (int)
     * @throws NegatiuException en cas de ser negatiu llença aquesta exepcio
     */
    public static void negatiu(int num) throws NegatiuException {
        if (num < 0) {
            throw new NegatiuException();
        }
    }

    /**
     * Comprova si un numero es negatiu
     * @param num numero per comprovar (float)
     * @throws NegatiuException en cas de ser negatiu llença aquesta exepcio
     */
    public static void negatiu(float num) throws NegatiuException {
        if (num < 0) {
            throw new NegatiuException();
        }
    }
}