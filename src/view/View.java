package view;

public class View {
    public static void escriureText(String text) {
        System.out.println(text);
    }

    public static void menuInici() {
        escriureText("\n---------------------------\n---------> INICI <---------\n---------------------------\n");
        escriureText("1- Gestió Magatzem i Compres");
        escriureText("2- Introduir producte");
        escriureText("3- Passar per caixa");
        escriureText("4- Mostrar carro de la compra");
        escriureText("0- Sortir");
    }

    public static void menuMagatzem() {
        escriureText("\n----------------------------\n--------> MAGATZEM <--------\n----------------------------\n");
        escriureText("1- Caducitat");
        escriureText("2- Tiquets de compra");
        escriureText("3- Composició tèxtil");
        escriureText("4- Buscar Productes");
        escriureText("0- Tornar");
    }

    public static void menuProducte() {
        escriureText("\n-----------------------------\n--------> PRODUCTES <--------\n-----------------------------\n");
        escriureText("1- Alimentació");
        escriureText("2- Tèxtil");
        escriureText("3- Electrònica");
        escriureText("0- Tornar");
    }

}
