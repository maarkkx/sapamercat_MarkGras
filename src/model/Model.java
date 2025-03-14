package model;

import org.w3c.dom.Text;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.*;

public class Model {
    static ArrayList<Producte> magatzem = new ArrayList<>();

    static Map<Producte, Integer> carro = new HashMap<>();

    static Stack<String> tickets = new Stack<>();

    /**
     * Afegeix 45 productes de diferents tipus a l'ArrayList de magatzem
     */
    public static void afegirArray() {
        magatzem.add(new Alimentacio(2.59f, "Poma", "1234560", LocalDate.of(2025, 5, 10)));
        magatzem.add(new Alimentacio(1.29f, "Plàtan", "1234561", LocalDate.of(2025, 4, 20)));
        magatzem.add(new Alimentacio(3.89f, "Taronges", "1234562", LocalDate.of(2025, 6, 15)));
        magatzem.add(new Alimentacio(1.09f, "Llet", "1234563", LocalDate.of(2025, 3, 30)));
        magatzem.add(new Alimentacio(0.99f, "Iogurt", "1234564", LocalDate.of(2026, 4, 25)));
        magatzem.add(new Alimentacio(1.59f, "Pa", "1234565", LocalDate.of(2025, 3, 12)));
        magatzem.add(new Alimentacio(4.29f, "Formatge", "1234566", LocalDate.of(2025, 5, 5)));
        magatzem.add(new Alimentacio(2.39f, "Tomàquet", "1234567", LocalDate.of(2025, 4, 18)));
        magatzem.add(new Alimentacio(1.79f, "Enciam", "1234568", LocalDate.of(2025, 3, 28)));
        magatzem.add(new Alimentacio(2.09f, "Pastanaga", "1234569", LocalDate.of(2025, 4, 22)));
        magatzem.add(new Alimentacio(6.59f, "Pollastre", "1234570", LocalDate.of(2025, 3, 27)));
        magatzem.add(new Alimentacio(5.89f, "Vedella", "1234571", LocalDate.of(2025, 4, 5)));
        magatzem.add(new Alimentacio(3.49f, "Salmó", "1234572", LocalDate.of(2025, 3, 22)));
        magatzem.add(new Alimentacio(1.19f, "Ous", "1234573", LocalDate.of(2025, 4, 12)));
        magatzem.add(new Alimentacio(2.99f, "Arròs", "1234574", LocalDate.of(2026, 1, 30)));
        magatzem.add(new Electronica(299.99f, "Smartphone", "1234575", 24));
        magatzem.add(new Electronica(899.50f, "Portàtil", "1234576", 36));
        magatzem.add(new Electronica(150.75f, "Auriculars sense fil", "1234577", 12));
        magatzem.add(new Electronica(79.99f, "Rellotge intel·ligent", "1234578", 24));
        magatzem.add(new Electronica(49.95f, "Ratolí gaming", "1234579", 18));
        magatzem.add(new Electronica(199.99f, "Monitor 24 polzades", "1234580", 24));
        magatzem.add(new Electronica(1200.00f, "Televisor 4K", "1234581", 48));
        magatzem.add(new Electronica(89.99f, "Teclat mecànic", "1234582", 24));
        magatzem.add(new Electronica(35.50f, "Altaveu Bluetooth", "1234583", 12));
        magatzem.add(new Electronica(399.99f, "Tauleta gràfica", "1234584", 24));
        magatzem.add(new Electronica(550.00f, "Consola de videojocs", "1234585", 36));
        magatzem.add(new Electronica(25.99f, "Carregador ràpid USB-C", "1234586", 0));
        magatzem.add(new Electronica(175.00f, "Càmera web HD", "1234587", 18));
        magatzem.add(new Electronica(45.75f, "Memòria USB 256GB", "1234588", 24));
        magatzem.add(new Electronica(349.99f, "Dron amb càmera", "1234589", 12));
        magatzem.add(new Textil(19.99f, "Samarreta de cotó", "1234590", "Cotó"));
        magatzem.add(new Textil(39.50f, "Pantalons texans", "1234591", "Denim"));
        magatzem.add(new Textil(24.99f, "Jaqueta esportiva", "1234592", "Polièster"));
        magatzem.add(new Textil(49.99f, "Vestit d'estiu", "1234593", "Lli"));
        magatzem.add(new Textil(15.75f, "Gorra ajustable", "1234594", "Cotó"));
        magatzem.add(new Textil(99.99f, "Abric de llana", "1234595", "Llana"));
        magatzem.add(new Textil(12.99f, "Bufanda d'hivern", "1234596", "Acrílic"));
        magatzem.add(new Textil(29.99f, "Pijama de màniga llarga", "1234597", "Cotó"));
        magatzem.add(new Textil(9.99f, "Mitjons tèrmics", "1234598", "Llana"));
        magatzem.add(new Textil(22.50f, "Guants de cuir", "1234599", "Cuir natural"));
        magatzem.add(new Textil(17.99f, "Corbata de seda", "1234600", "Seda"));
        magatzem.add(new Textil(34.99f, "Dessuadora amb caputxa", "1234601", "Polièster"));
        magatzem.add(new Textil(55.00f, "Pantalons de vestir", "1234602", "Polièster"));
        magatzem.add(new Textil(11.50f, "Cinturó de pell", "1234603", "Cuir"));
        magatzem.add(new Textil(45.99f, "Jersei de caixmir", "1234604", "Caixmir"));
    }

    /**
     * Filtra els productes de tipus Alimentacio segons el temps que li quedi per caducar, quan menys temps més prioritat
     */
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

    /**
     * Filtra els productes de tipus Textil alfabeticament segons la seva compocicio textil
     */
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

    /**
     * Afageix el producte creat per l'usuari al carro. Si supera els 100 productes llença una exepcio,
     * si posa dos productes amb el mateix codi de barras es suma la quantitat dels dos productes ja que
     * es soposa que es el mateix producte.
     * @param o objecte que s'afegira al Map de carro
     * @param quantitat la quantitat del producte
     */
    public static void afegirCarro(Producte o, int quantitat) {
        if (carro.containsKey(o)) {
            carro.replace(o, carro.get(o) + quantitat);
        } else {
            carro.put(o, quantitat);
        }
        if (carro.size() > 100) {
            try {
                throw new LimitProductesException();
            } catch (LimitProductesException error) {
                System.out.println("Si vols comprar més has de passar per caixa");
            }

        }

    }

    /**
     * Mostra tots els productes que hi ha al carro
     * @return retorna la llista dels productes en un String
     */
    public static String mostrarCarro() {
        String carr = "";
        for (Map.Entry<Producte, Integer> mostrar : carro.entrySet()) {
            Producte prod = mostrar.getKey();
            carr += "\nQuantitat: x" + mostrar.getValue()+ " | " + prod.getNom() + " " + prod.getPreu() + "€ | Codi: " + prod.getCodiBarras();
            System.out.println("Quantitat: x" + mostrar.getValue()+ " | " + prod.getNom() + " " + prod.getPreu() + "€ | Codi: " + prod.getCodiBarras());
        }
        return carr;
    }

    /**
     * Calcula el preu total de tots els productes dins del carro
     * @return retorna el preu total (float)
     */
    public static float passarCaixa() {
        float total = 0;
        for (Map.Entry<Producte, Integer> calculartotal : carro.entrySet()) {
            Producte prod = calculartotal.getKey();
            int quantitat = calculartotal.getValue();
            total += prod.getPreu() * quantitat;
        }
        return total;
    }

    /**
     * buida el Map de carro
     */
    public static void netejarCarro() {
        carro.clear();
    }

    /**
     * Afegeix un String a la pila de tickets
     * @param ticket String del ticket
     */
    public static void setTicket(String ticket) {
        tickets.add(ticket);
    }

    /**
     * mostra tots els tickets dins de la pila de tickets
     */
    public static void mostrarTickets() {
        tickets.forEach(System.out::println);
    }

    /**
     * busca un producte dins de la ArrayList de magatzem segons el seu codi de barras
     */
    public static void buscarProductes () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriu el codi de barras del producte");
        String codi = scan.nextLine();

        for (Producte p : magatzem) {
            if (p.getCodiBarras().equals(codi)) {
                System.out.println(p);
                return;
            }
        }
    }
}
