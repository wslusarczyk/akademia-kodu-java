package strings;

/**
 * Zadanie 8. Napisz program, który odczytuje dane w formacie: Imię i Nazwisko Piłkarza Liczba Goli. Wypisz tylko nazwisko piłkarza. Użyj
 * indexOf(), substring().
 */
public class QuestionsName {

    public static void main(String[] args) {
        String data = Utils.getWord("Podaj dane w formacie: Imię i Nazwisko Piłkarza Liczba Goli");
        int firstSpaceIndex = data.indexOf(' ');
        String lastNameAndGoals = data.substring(firstSpaceIndex+1);
        int indexOfLastNameAndGoalsSeparator = lastNameAndGoals.indexOf(' ');
        String lastName = lastNameAndGoals.substring(0, indexOfLastNameAndGoalsSeparator);

        System.out.println("Nazisko piłkarza " + lastName);
    }
}
