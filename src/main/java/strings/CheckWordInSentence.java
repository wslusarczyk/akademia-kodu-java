package strings;

/**
 * Zadanie7. Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to Akademia. Użyj equalsIgnoreCase().
 */
public class CheckWordInSentence {

    public static void main(String[] args) {
        String question = Utils.getWord("Podaj wyraz");
        if (question.equalsIgnoreCase("Akademia")) {
            System.out.println("Wyraz to akademia");
        } else {
            System.out.println("Wyraz to nie akademia");
        }
    }
}
