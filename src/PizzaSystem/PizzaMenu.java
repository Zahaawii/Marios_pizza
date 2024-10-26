package PizzaSystem;
import Userinterface.ConsoleOperators;
import static PizzaSystem.BuildAPizza.scanner;
import java.util.HashMap;
import java.util.Map;



public class PizzaMenu {

    static HashMap <Integer, String> pizzaer = new HashMap<>();

    public static void showMenuUI() {
       userMenuDecision();
    }

    private static HashMap menu() {

        pizzaer.put(1, "Salat pizza: Salat, Tomatoes, Cucumbers, Onions, Kebab - 100,-");
        pizzaer.put(2, "Margaritha pizza: Cheese, tomatoes - 75,- ");
        pizzaer.put(3, "Pepperonni pizza: Pepperoines, Cheese, Tomatoes - 100,-");
        pizzaer.put(4, "Hawaii pizza: Pineapple, Ham, Cheese Tomatoes - 100,-");
        pizzaer.put(5, "Chicken pizza: Chicken, Bacon, Cheese, Tomatoes - 100,-");

        return pizzaer;
    }

    private static void removePizzaFromMenu() {
        menu();
        System.out.println("Enter the number of the pizza you want to remove");

        //Måske lave if statement i stedet?
        try {

            int removePizza = scanner.nextInt();
            pizzaer.remove(removePizza);

            for(Map.Entry newMenu : pizzaer.entrySet()) {
                System.out.println(newMenu.getKey() + " " + newMenu.getValue());
                ConsoleOperators.printSeperator(70);
            }

        } catch (Exception e) {
            System.out.println("Wrong input");
        }


    }

    private static void seeAllPizza(){
        menu();

        System.out.println("Menu:");
        ConsoleOperators.printSeperator(70);

        for(Map.Entry p : pizzaer.entrySet()){
            System.out.println(p.getKey() + " " + p.getValue());
            ConsoleOperators.printSeperator(70);
        }
    }

    private static void addNewPizzaToMenu() {
        menu();

        int pizzaNumber;
        String pizzaName;
        try {
            System.out.println("Enter number of the pizza");
            pizzaNumber = scanner.nextInt();
            System.out.println("Enter the name and toppings of the pizza");
            pizzaName = scanner.next();
            pizzaer.put(pizzaNumber, pizzaName);
            System.out.println("Pizza: " + pizzaNumber + "\nName and toppings: " + pizzaName + " has been added.");
            System.out.println("New menu");

            for(Map.Entry p : pizzaer.entrySet()){
                System.out.println(p.getKey() + " " + p.getValue());
                ConsoleOperators.printSeperator(70);
            }

        } catch (Exception e) {
            System.out.println("Wrong input");
        }


    }

//    private static void chooseToRemove() {
//        System.out.println("Would you like to remove something from the menu? \nPress Y/N");
//        String userChoice = scanner.next();
//        if(userChoice.equalsIgnoreCase("Y")) {
//            removePizzaFromMenu();
//        }
//    }
//
//    private static void addToMenu() {
//        System.out.println("Would you like to add something to the menu \nPress Y/N");
//        String userChoice = scanner.next();
//        if(userChoice.equalsIgnoreCase("Y")) {
//            addNewPizzaToMenu();
//        }
//    }

    private static void userMenuDecision() {
        System.out.println("Do you want to see the menu, remove or add something to the menu?");
        ConsoleOperators.printSeperator(70);

        int userChoice;

        do {
            System.out.println("1. See the menu " +
                    "\n2. Remove a Pizza from the menu" +
                    "\n3. Add a new pizza to the menu");

            try {
                userChoice = Integer.parseInt(scanner.next());
            }
            catch (Exception e) {
                System.out.println("Wrong input, press 1 or 2");
                userChoice = 0;
            }
        } while (userChoice < 1 || userChoice > 3);

        if(userChoice == 1) {
            seeAllPizza();
        }

        if(userChoice == 2) {
            ConsoleOperators.pressAnythingToContinue();
            removePizzaFromMenu();
        }

        if(userChoice == 3) {
            ConsoleOperators.pressAnythingToContinue();
            addNewPizzaToMenu();
        }
    }
}
