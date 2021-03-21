package strings;

/**
 * Zadanie1. Napisz program odczytujący wyraz i wypisujący na ekranie pierwszą literę wyrazu. Użyj charAt(). Co się stanie jeśli podamy
 * wyraz pusty?
 */
public class FirstLetterWord {

    public static void main(String[] args) {
        String word = Utils.getWord();

        char a = word.charAt(0);
        System.out.println("Pierwsza litera wyrazu " + a);
    }
}
