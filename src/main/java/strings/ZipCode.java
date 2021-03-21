package strings;

import java.util.Scanner;

/**
 * Zadanie 5. Napisz program, który odczytuje kod pocztowy składający się z 5 cyfr. Dopisz - pomiędzy cyframi. Użyj StringBuilder i insert
 * Dla przykładu: 87100 Jako wynik:87-100
 */

public class ZipCode {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String zipCode = getZipCode(scanner).toString();
            int length = zipCode.length();
            while (length > 5) {
                System.out.println("Kod pocztowy powinnien składać się z 5 cyfr!");
                zipCode = getZipCode(scanner).toString();
                length = zipCode.length();
            }

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(zipCode);
            char sign = '-';
            stringBuilder.insert(2, sign);
            System.out.println(stringBuilder.toString());
        }
    }

    private static Integer getZipCode(Scanner scanner) {
        return Utils.getNumber(scanner, "Podaj kod pocztowy");
    }
}
