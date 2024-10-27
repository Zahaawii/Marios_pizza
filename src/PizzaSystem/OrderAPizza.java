package PizzaSystem;
import Statistics.StatisticsSystem;
import Userinterface.ConsoleOperators;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import static Statistics.StatisticInterface.addOrderToStatistics;

public class OrderAPizza extends PizzaMenu {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> newPizza = new ArrayList<>();

    public static void pizzaOrders() {
        int userChoice;
        System.out.println("Do you want to choose a pizza from the menu or choose your own?");

        do {
            System.out.println("Press 1 for menu " +
                    "\nPress 2 for build a pizza");
            try {
                userChoice  = Integer.parseInt(scanner.next());
            } catch (Exception E) {
                System.out.println("Wrong input. Press 1-2, try again");
                userChoice = 0;
            }

        } while (userChoice < 1 || userChoice > 2);


        if(userChoice == 1) {
            PizzaMenu.seeAllPizza();
            addOrderToStatistics();

        }

        if(userChoice == 2) {
            buildYourPizza();
        }
    }

    private static void buildYourPizza() {
        System.out.println("Enter the ingredients you want in your pizza " +
                "\nYou can add up to 4");
        
        System.out.println("1st ingredient");
        newPizza.add(scanner.next());
        System.out.println("2nd ingredient");
        newPizza.add(scanner.next());
        System.out.println("3rd ingredient");
        newPizza.add(scanner.next());
        System.out.println("4th ingredient");
        newPizza.add(scanner.next());

        for(String pizza : newPizza) {
            System.out.println("The ingredients: " + pizza);
        }
    }

    protected static String buyAPizza() {
        menu();

        int userPizzaChoice;
        do {
            System.out.println("What pizza would you like to buy?");
            try {
                userPizzaChoice = Integer.parseInt(scanner.next());

                System.out.println(pizzaer.getOrDefault
                        (userPizzaChoice, "Pizza does not exist. Try again"));
            }
            catch (Exception E) {
                System.out.println("Wrong input");
                userPizzaChoice = 0;
            }
        } while (userPizzaChoice < 1 || userPizzaChoice > 3);


        return pizzaer.getOrDefault
                (userPizzaChoice,null);
    }

    public static void removePizzaFromScreen(int id) {
        System.out.println("Do you want to remove the order from the screen? " +
                "\nPress 'Y' to remove or press anything else");
        String userChoice = scanner.next();

        if(userChoice.equalsIgnoreCase("Y")) {
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want to remove a pizza. Press the ID on the pizza to remove");
            id = scanner.nextInt();
            StatisticsSystem.deleteCharacter(id);
            System.out.println("ID: " + id + " has been removed");
        }
    }

}
