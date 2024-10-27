package Userinterface;
import PizzaSystem.OrderAPizza;
import PizzaSystem.PizzaMenu;
import Statistics.StatisticInterface;
import java.util.Scanner;


//CLI based UI to give the entire project a foundation of where the code is being executed
public class UI {

    static Scanner scanner = new Scanner(System.in);

    //Method creates an infinite loop so our system will never end.
    public static void menu(){
        String endSession;
        welcomeMenu();
        do {
            UserDecision();
            endSession();
            endSession = scanner.next();
        } while (!endSession.equalsIgnoreCase("Y"));

    }

    //Method made to the name of the system in the beginning.
    private static void welcomeMenu() {
        ConsoleOperators.displayInfo("Welcome to Marios Pizzaria");
    }

    //Method made to give the user the opportunity to choose what they want to do.
    //Methods inside this method gives us an overall easy way to look at what need to be changed
    private static void UserDecision() {
        System.out.println("You have following choices");

       int userChoice;

       //Do, try, catch & while loop made so the user cannot crash the system and has to enter correct information
        do {
            System.out.println("1. Place an order. \n2. See statistics. \n3. See the menu \n4. Remove settings");

            try {
                userChoice = Integer.parseInt(scanner.next());
            }
            catch (Exception e) {
                System.out.println("Wrong input, press 1-3");
                userChoice = 0;
            }
        } while (userChoice < 1 || userChoice > 4);

        if(userChoice == 1) {
            //Makes the user go into pizza orders menu
            ConsoleOperators.pressAnythingToContinue();
            OrderAPizza.pizzaOrders();

        }

        if(userChoice == 2) {
            //Makes the user go into statistic menu
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want too see statistics");
            StatisticInterface.viewAllStatistics();
        }

        if(userChoice == 3) {
            //Makes the user go into the menu menu
            ConsoleOperators.pressAnythingToContinue();
            System.out.println("You want to see the menu");
            PizzaMenu.showMenuUI();
        }

        if(userChoice == 4) {
            //Gives the user the abillity to remove orders from the screen
            System.out.println("You can remove things here?");
            OrderAPizza.removePizzaFromScreen(1);
        }
    }

    //Method to give the possibility to end the endless loop of the system.
    private static void endSession() {
        System.out.println("Do you want to end the session");
        System.out.println("Press Y to end or press anything else to continue");
        ConsoleOperators.printSeperator(30);
    }
}
