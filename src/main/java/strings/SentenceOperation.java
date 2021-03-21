package strings;

/**
 * Zadanie 6. Odczytaj zdanie, usuń pierwszy i ostatni znak w zdaniu, wypisz zdanie z usuniętymi znakami.
 * Zadanie12.
 * Odczytaj zdanie zamień małe 'a’ na duże ’A’.
 * Użyj replace().
 */
public class SentenceOperation {

    public static void main(String[] args) {
        removeFirstAndLastChar();
        replaceCharacter();
    }

    private static void replaceCharacter() {
        String sentence = Utils.getWord("Podaj zdanie...");
        System.out.println(sentence.replaceAll("a", "A"));
    }

    private static void removeFirstAndLastChar() {
        String sentence = Utils.getWord("Podaj zdanie");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(sentence);
        stringBuilder.deleteCharAt(0);
        int length = stringBuilder.length();
        stringBuilder.deleteCharAt(length - 1);

        System.out.println(stringBuilder.toString());
    }
}
