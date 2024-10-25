package PizzaSystem;
import java.util.Scanner;
import java.util.ArrayList;

public class BuildAPizza {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> newPizza = new ArrayList<>();

    public static void buildYourPizza() {
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
}
