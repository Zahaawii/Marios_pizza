package PizzaSystem;
import Userinterface.ConsoleOperators;

import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {

    static HashMap <Integer, String> pizzaer = new HashMap<>();

    public static void showMenu() {

        pizzaer.put(1, "Salat pizza: Salat, Tomatoes, Cucumbers, Onions, Kebab - 100,-");
        pizzaer.put(2, "Margaritha pizza: Cheese, tomatoes - 75,- ");
        pizzaer.put(3, "Pepperonni pizza: Pepperoines, Cheese, Tomatoes - 100,-");
        pizzaer.put(4, "Hawaii pizza: Pineapple, Ham, Cheese Tomatoes - 100,-");
        pizzaer.put(5, "Chicken pizza: Chicken, Bacon, Cheese, Tomatoes - 100,-");

        System.out.println("Menu:");
        ConsoleOperators.printSeperator(70);

        for(Map.Entry p : pizzaer.entrySet()){
            System.out.println(p.getKey() + " " + p.getValue());
            ConsoleOperators.printSeperator(70);

        }
    }

}
