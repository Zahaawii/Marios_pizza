package Userinterface;
import PizzaSystem.BuildAPizza;
import PizzaSystem.PizzaMenu;
import Statistics.StatisticInterface;

import java.util.Objects;
import java.util.Scanner;

public class UI {

    static Scanner scanner = new Scanner(System.in);

    public static void menu(){
        String endSession;
        welcomeMenu();
        do {
            UserDecision();
            endSession();
            endSession = scanner.next();
        } while (!endSession.equalsIgnoreCase("Y"));

    }

    private static void welcomeMenu() {
        ConsoleOperators.displayInfo("Welcome to Marios Pizzaria");
    }

    private static void UserDecision() {
        System.out.println("You have following choices");

       int userChoice;

        do {
            System.out.println("1. Place an order \n2. Build your own pizza \n3. See statistics. \n4. See the menu");

            try {
                userChoice = Integer.parseInt(scanner.next());
            }
            catch (Exception e) {
                System.out.println("Wrong input, press 1-3");
                userChoice = 0;
            }
        } while (userChoice < 1 || userChoice > 4);

        if(userChoice == 1) {
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want to place an order");

        }

        if(userChoice == 2) {
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want to build your own pizza");
            BuildAPizza.buildYourPizza();

        }

        if(userChoice == 3) {
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want too see statistics");
            StatisticInterface.addStatistic();
            StatisticInterface.viewAllStatistics();
        }

        if(userChoice == 4) {
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want to see the menu");
            PizzaMenu.showMenuUI();
        }
    }

    private static void endSession() {
        System.out.println("Do you want to end the session");
        System.out.println("Press Y to end or press anything else to continue");
        ConsoleOperators.printSeperator(30);
    }
}
