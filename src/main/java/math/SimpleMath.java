package math;

import java.util.Scanner;

//Zadanie 4 Napisz program, który odczytuje liczbę całkowitą i wypisuje ostatnią cyfrę liczby.
//Zadanie 5 Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich sumę.
//Zadanie 6 Napisz program, który odczytuje 2 liczby całkowite i na ekran wypisuje ich iloczyn(zmiennoprzecinkowy).
//Zadanie 7 Napisz program, który oblicza pole koła.
public class SimpleMath {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Exercises user = new Exercises(scanner);

            System.out.println("Program wyświetlający ostatnią cyfre");
            char resultNumber = user.numberChoiceFromUser();
            System.out.println("Ostatnia cyfra to " + resultNumber);

            System.out.println("Liczenie sumy dwóch liczb!");
            int sumResult = user.sumToNumber();
            System.out.println("Wynik dodawania = " + sumResult);

            System.out.println("Liczenie iloczynu dwóch liczb!");
            int quotientResult = user.multiplication();
            System.out.println("Wynik mnożenia = " + quotientResult);

            System.out.println("Liczenie pola koła o zadanym promieniu!");
            double circleFiledResult =  user.circleFiled();
            System.out.println("Pole koła = " + circleFiledResult);
        }
    }
}
