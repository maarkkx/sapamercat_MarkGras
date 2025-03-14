package view;

public class View {
    /**
     * Escriu per terminal un text
     * @param text el text que vols escriure
     */
    public static void escriureText(String text) {
        System.out.println(text);
    }

    /**
     * Mostra el menu d'inici
     */
    public static void menuInici() {
        escriureText("\n---------------------------\n---------> INICI <---------\n---------------------------\n");
        escriureText("1- Gestió Magatzem i Compres");
        escriureText("2- Introduir producte");
        escriureText("3- Passar per caixa");
        escriureText("4- Mostrar carro de la compra");
        escriureText("0- Sortir");
    }

    /**
     * Mostra el menu del magatzem
     */
    public static void menuMagatzem() {
        escriureText("\n----------------------------\n--------> MAGATZEM <--------\n----------------------------\n");
        escriureText("1- Caducitat");
        escriureText("2- Tiquets de compra");
        escriureText("3- Composició tèxtil");
        escriureText("4- Buscar Productes");
        escriureText("0- Tornar");
    }

    /**
     * mostra el menu per afegir productes
     */
    public static void menuProducte() {
        escriureText("\n-----------------------------\n--------> PRODUCTES <--------\n-----------------------------\n");
        escriureText("1- Alimentació");
        escriureText("2- Tèxtil");
        escriureText("3- Electrònica");
        escriureText("0- Tornar");
    }

}
