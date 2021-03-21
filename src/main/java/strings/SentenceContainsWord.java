package strings;

import java.util.Scanner;

/**
 * Zadanie 4. Napisz program odczytujący zdanie, sprawdź czy w zdaniu występuje wyraz kot.
 */
public class SentenceContainsWord {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj zdanie");
            String sentence = scanner.nextLine();

            if (sentence.contains("kot")) {
                System.out.println("Podane zdanie zawiera wyraz kot");
            } else {
                System.out.println("Podane zdanie nie zwiera wyrazu kot");
            }
        }
    }
}
