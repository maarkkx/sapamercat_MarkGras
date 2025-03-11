import model.*;
import view.View;

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
                    break;

                case 4:
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
                    break;

                case 3:
                    Model.filtrarTextil();
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
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }

        }
    }

}