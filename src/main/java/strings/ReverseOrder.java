package strings;

import java.util.Scanner;

/**
 * Zadanie 3. Odczytaj wyraz i wypisz na ekran wyraz w odwróconej kolejności. Użyj StringBuildera.
 */
public class ReverseOrder {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj wyraz!");
            String word = scanner.nextLine();

            int length = word.length();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = length - 1; i >= 0; i--) {
                stringBuilder.append(word.charAt(i));
            }
            System.out.println("Wyraz = " + stringBuilder.toString());
        }
    }
}
