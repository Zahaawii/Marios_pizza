package Userinterface;

import java.util.Scanner;

public class ConsoleOperators {

    static Scanner scanner = new Scanner(System.in);

    public static void displayInfo(String prompt) {
        printSeperator(30);
        System.out.println(prompt);
        printSeperator(30);
    }

    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void pressAnythingToContinue() {
        System.out.println("Press a buttom to contiune");
        scanner.nextLine();
        clearConsole();
    }
}
