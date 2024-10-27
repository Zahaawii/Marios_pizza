package Userinterface;
import java.util.Scanner;


//idea for this class is to make the CLI look pretty
public class ConsoleOperators {

    static Scanner scanner = new Scanner(System.in);

    //Method makes a pretty display info
    public static void displayInfo(String prompt) {
        printSeperator(30);
        System.out.println(prompt);
        printSeperator(30);
    }

    //Method creates a "---" seperator
    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //Method clears the terminal so it doesnt have all the previous steps
    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //Method gives the user the opportunity to press to continue or wait.
    public static void pressAnythingToContinue() {
        System.out.println("Press a buttom to contiune");
        scanner.nextLine();
        clearConsole();
    }
}
