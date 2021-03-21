package strings;

import java.util.Locale;
import java.util.Scanner;

/**
 * Zadanie9. Na serwerze przechowujemy obrazki w formacie:
 * http://www.akademiakodu.pl/54/nazwa_panstwa_male_litery.svg
 * Odczytaj nazwę państwa zapisaną dużymi literami i na ekran wypisz adres url obrazka.
 *
 * Zadanie10.
 * Odczytaj nazwę państwa i wypisz tylko 3 pierwsze litery Państwa (na stronie internetowej
 * nie mamy więcej miejsca na wyświetlenie). Użyj substring()
 */
public class CountryName {

    public static void main(String[] args) {
        countryImageUrl();
        countryShortIdentifier();
    }

    private static void countryImageUrl() {
        String prefix = "http://www.akademiakodu.pl/54/";
        String suffix = "_male_litery.svg";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj nazwe panstwa");
            String countryName = scanner.nextLine().trim();

            String countryInRequiredFormat = countryName.toLowerCase().replaceAll(" ", "_");
            StringBuilder builder = new StringBuilder();
            builder.append(prefix);
            builder.append(countryInRequiredFormat);
            builder.append(suffix);

            System.out.println(builder.toString());
        }
    }

    private static void countryShortIdentifier() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj nazwe panstwa");
            String countryName = scanner.nextLine().trim();
            String countryNameShort = countryName.substring(0, 3);
            System.out.println(countryNameShort);
        }
    }
}
