package strings;

import java.util.Scanner;

public class Utils {

    public static String getWord() {
        return getWord("Podaj słowo");
    }

    public static String getWord(String prompt) {
        System.out.println(prompt);
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.nextLine();
            return word;
        }
    }

    public static Integer getNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        int number = Integer.parseInt(scanner.nextLine());
        return number;
    }

    public static Integer getNumber(String prompt) {
        System.out.println(prompt);
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            return number;
        }
    }
}
