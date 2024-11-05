/*

This Class was made after discussion with one from the class who provided me with another solution on how to solve
some of the assignment. The way to code is very nice and I kept it here to be able to do it again another time.

package PizzaSystem;
import java.util.ArrayList;

public class Pizza {

    private String pizzaName;
    private int price;
    private int id;
    private ArrayList<String> ingredients;
    private static String [] ingredientsList = {"Ost", "Tomat", "Agurk", "Salat"};

    public Pizza(String pizzaName, int price, int id, int... ingIndex) {
        this.pizzaName = pizzaName;
        this.price = price;
        this.id = id;

        ingredients = new ArrayList<>();
        for(int index : ingIndex) {
            if(index >= 0 && index < ingredientsList.length) {
                ingredients.add(ingredientsList[index]);
            }
        }
    }

    public String displayIngredients() {
        return "Ingredients: " + ingredients;
    }


}
 */
