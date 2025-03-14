package model;

import org.w3c.dom.Text;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.*;

public class Model {
    static ArrayList<Producte> magatzem = new ArrayList<>();

    static Map<Producte, Integer> carro = new HashMap<>();

    static Stack<String> tickets = new Stack<>();

    public static void afegirArray() {
        magatzem.add(new Alimentacio(2.59f, "Poma", "1234567890123", LocalDate.of(2025, 5, 10)));
        magatzem.add(new Alimentacio(1.29f, "Plàtan", "2345678901234", LocalDate.of(2025, 4, 20)));
        magatzem.add(new Alimentacio(3.89f, "Taronges", "3456789012345", LocalDate.of(2025, 6, 15)));
        magatzem.add(new Alimentacio(1.09f, "Llet", "4567890123456", LocalDate.of(2025, 3, 30)));
        magatzem.add(new Alimentacio(0.99f, "Iogurt", "5678901234567", LocalDate.of(2026, 4, 25)));
        magatzem.add(new Alimentacio(1.59f, "Pa", "6789012345678", LocalDate.of(2025, 3, 12)));
        magatzem.add(new Alimentacio(4.29f, "Formatge", "7890123456789", LocalDate.of(2025, 5, 5)));
        magatzem.add(new Alimentacio(2.39f, "Tomàquet", "8901234567890", LocalDate.of(2025, 4, 18)));
        magatzem.add(new Alimentacio(1.79f, "Enciam", "9012345678901", LocalDate.of(2025, 3, 28)));
        magatzem.add(new Alimentacio(2.09f, "Pastanaga", "0123456789012", LocalDate.of(2025, 4, 22)));
        magatzem.add(new Alimentacio(6.59f, "Pollastre", "1123456789013", LocalDate.of(2025, 3, 27)));
        magatzem.add(new Alimentacio(5.89f, "Vedella", "2123456789014", LocalDate.of(2025, 4, 5)));
        magatzem.add(new Alimentacio(3.49f, "Salmó", "3123456789015", LocalDate.of(2025, 3, 22)));
        magatzem.add(new Alimentacio(1.19f, "Ous", "4123456789016", LocalDate.of(2025, 4, 12)));
        magatzem.add(new Alimentacio(2.99f, "Arròs", "5123456789017", LocalDate.of(2026, 1, 30)));
        magatzem.add(new Electronica(299.99f, "Smartphone", "1234567890123", 24));
        magatzem.add(new Electronica(899.50f, "Portàtil", "2345678901234", 36));
        magatzem.add(new Electronica(150.75f, "Auriculars sense fil", "3456789012345", 12));
        magatzem.add(new Electronica(79.99f, "Rellotge intel·ligent", "4567890123456", 24));
        magatzem.add(new Electronica(49.95f, "Ratolí gaming", "5678901234567", 18));
        magatzem.add(new Electronica(199.99f, "Monitor 24 polzades", "6789012345678", 24));
        magatzem.add(new Electronica(1200.00f, "Televisor 4K", "7890123456789", 48));
        magatzem.add(new Electronica(89.99f, "Teclat mecànic", "8901234567890", 24));
        magatzem.add(new Electronica(35.50f, "Altaveu Bluetooth", "9012345678901", 12));
        magatzem.add(new Electronica(399.99f, "Tauleta gràfica", "0123456789012", 24));
        magatzem.add(new Electronica(550.00f, "Consola de videojocs", "1123456789013", 36));
        magatzem.add(new Electronica(25.99f, "Carregador ràpid USB-C", "2123456789014", 0));
        magatzem.add(new Electronica(175.00f, "Càmera web HD", "3123456789015", 18));
        magatzem.add(new Electronica(45.75f, "Memòria USB 256GB", "4123456789016", 24));
        magatzem.add(new Electronica(349.99f, "Dron amb càmera", "5123456789017", 12));
        magatzem.add(new Textil(19.99f, "Samarreta de cotó", "1234567890123", "Cotó"));
        magatzem.add(new Textil(39.50f, "Pantalons texans", "2345678901234", "Denim"));
        magatzem.add(new Textil(24.99f, "Jaqueta esportiva", "3456789012345", "Polièster"));
        magatzem.add(new Textil(49.99f, "Vestit d'estiu", "4567890123456", "Lli"));
        magatzem.add(new Textil(15.75f, "Gorra ajustable", "5678901234567", "Cotó"));
        magatzem.add(new Textil(99.99f, "Abric de llana", "6789012345678", "Llana"));
        magatzem.add(new Textil(12.99f, "Bufanda d'hivern", "7890123456789", "Acrílic"));
        magatzem.add(new Textil(29.99f, "Pijama de màniga llarga", "8901234567890", "Cotó"));
        magatzem.add(new Textil(9.99f, "Mitjons tèrmics", "9012345678901", "Llana"));
        magatzem.add(new Textil(22.50f, "Guants de cuir", "0123456789012", "Cuir natural"));
        magatzem.add(new Textil(17.99f, "Corbata de seda", "1123456789013", "Seda"));
        magatzem.add(new Textil(34.99f, "Dessuadora amb caputxa", "2123456789014", "Polièster"));
        magatzem.add(new Textil(55.00f, "Pantalons de vestir", "3123456789015", "Polièster"));
        magatzem.add(new Textil(11.50f, "Cinturó de pell", "4123456789016", "Cuir"));
        magatzem.add(new Textil(45.99f, "Jersei de caixmir", "5123456789017", "Caixmir"));
    }

    public static void filtrarCaducitat() {
        List<Alimentacio> aliments = new ArrayList<>();
        for (Object obj : magatzem) {
            if (obj instanceof Alimentacio) {
                aliments.add((Alimentacio) obj);
            }
        }
        aliments.sort(Comparator.comparing(Alimentacio::getDataCaducitat));
        aliments.forEach(System.out::println);
    }

    public static void filtrarTextil() {
        List<Textil> textils = new ArrayList<>();
        for (Object obj : magatzem) {
            if (obj instanceof Textil) {
                textils.add((Textil) obj);
            }
        }
        textils.sort(Comparator.comparing(Textil::getCompTextil));
        textils.forEach(System.out::println);
    }

    public static void afegirCarro(Producte o, int quantitat) {
        if (carro.containsKey(o)) {
            carro.replace(o, carro.get(o) + quantitat);
        } else {
            carro.put(o, quantitat);
        }

    }

    public static String mostrarCarro() {
        String carr = "";
        for (Map.Entry<Producte, Integer> mostrar : carro.entrySet()) {
            Producte prod = mostrar.getKey();
            carr += "Quantitat: x" + mostrar.getValue()+ " | " + prod.getNom() + " " + prod.getPreu() + "€ | Codi: " + prod.getCodiBarras();
            System.out.println("Quantitat: x" + mostrar.getValue()+ " | " + prod.getNom() + " " + prod.getPreu() + "€ | Codi: " + prod.getCodiBarras());
        }
        return carr;
    }

    public static float passarCaixa() {
        float total = 0;
        for (Map.Entry<Producte, Integer> calculartotal : carro.entrySet()) {
            Producte prod = calculartotal.getKey();
            int quantitat = calculartotal.getValue();
            total += prod.getPreu() * quantitat;
        }
        return total;
    }

    public static void netejarCarro() {
        carro.clear();
    }

    public static void setTicket(String ticket) {
        tickets.add(ticket);
    }

    public static void mostrarTickets() {
        tickets.forEach(System.out::println);
    }
}
