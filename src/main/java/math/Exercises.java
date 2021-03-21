package math;

import java.util.Scanner;


public class Exercises {

    private Scanner scanner;

    public Exercises(Scanner scanner) {
        this.scanner = scanner;
    }

    public Character numberChoiceFromUser() {
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        String b = String.valueOf(a);
        int lengtString = b.length();
        char lastNumber = b.charAt(lengtString - 1);
        return lastNumber;
    }

    public Integer sumToNumber() {
        ArgumentsProvider ArgumentsProvider = new ArgumentsProvider().getArguments();
        int a = ArgumentsProvider.getA();
        int b = ArgumentsProvider.getB();
        int result = a + b;
        return result;
    }

    public Integer multiplication() {
        ArgumentsProvider ArgumentsProvider = new ArgumentsProvider().getArguments();
        int a = ArgumentsProvider.getA();
        int b = ArgumentsProvider.getB();

        int result = a * b;
        return result;
    }

    public Double circleFiled(){
        System.out.println("Podaj promień koła");
        double r = scanner.nextInt();
        double pi = 3.14;
        double result = r * pi;
        return result;
    }


    private class ArgumentsProvider {

        private int a;

        private int b;

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public ArgumentsProvider getArguments() {
            System.out.println("Podaj liczbę a: ");
            a = scanner.nextInt();
            System.out.println("Podaj liczbę b: ");
            b = scanner.nextInt();
            return this;
        }
    }
}
