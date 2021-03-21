package strings;

/**
 * Zadanie 2. Odczytaj imię i sprawdź czy imię jest męskie czy żeńskie. Użyj endsWith().
 */
public class Names {
    public static void main(String[] args) {
        String name = Utils.getWord("Podaj imię");
        if (name.endsWith("a")) {
            System.out.println("Imię jest żeńskie");
        } else {
            System.out.println("Imię jest męskie");
        }
    }
}
