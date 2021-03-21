package math.extended;

import java.util.Random;
import java.util.Scanner;

// Zadanie 10 Napisz program, który wypisuje liczbę 12 147 483 647 (wcześniej zadeklaruj tąwartość w zmiennej).
// Zadanie 11 Napisz program, który losuje liczbę losową z przedziału 1..100.
// Zadanie 12 Napisz program, który odczytuje 2 zmienne całkowite i zamienia ich wartości.
// Zadanie 13 Napisz program, który odczytuje 3 zmienne całkowite i pokazuje na ekran średnią z liczb. Zaokrąglij wynik do 2 miejsc po
// przecinku.

public class ExtendedMath {

    public static void main(String[] args) {
        printLong();
        randomNumber();

        try (Scanner scanner = new Scanner(System.in)) {
            readAndSwapNumbers(scanner);
            calculateAverage(scanner);
        }
    }

    private static void printLong() {
        long a = 12147483647L;
        System.out.println(a);
    }

    private static void randomNumber() {
        Random random = new Random();

        int los = random.nextInt(101);
        System.out.println("Wylosowana liczba to " + los);
    }

    private static void readAndSwapNumbers(Scanner scanner) {
        System.out.println("Podaj liczbę a! ");
        int a1 = scanner.nextInt();
        System.out.println("Podaj liczbę b!");
        int b1 = scanner.nextInt();
        int b2 = a1;
        int a2 = b1;
        System.out.println("Liczba a = " + a2 + " a liczba b = " + b2);
    }

    private static void calculateAverage(Scanner scanner) {
        double sum = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Podaj " + i + " liczbę");
            double number = scanner.nextInt();
            sum = sum + number;
        }
        double average = sum / 3;
        average = Math.round(average);
        System.out.println("Średnia z podanych liczb = " + average);
    }
}
