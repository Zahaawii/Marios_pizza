//package PizzaSystem;
//import java.util.ArrayList;

//public class Pizza {
//
//    private String pizzaName;
//    private int price;
//    private int id;
//    private ArrayList<String> ingredients;
//    private static String [] ingredientsList = {"Ost", "Tomat", "Agurk", "Salat"};
//
//    public Pizza(String pizzaName, int price, int id, int... ingIndex) {
//        this.pizzaName = pizzaName;
//        this.price = price;
//        this.id = id;
//
//        ingredients = new ArrayList<>();
//        for(int index : ingIndex) {
//            if(index >= 0 && index < ingredientsList.length) {
//                ingredients.add(ingredientsList[index]);
//            }
//        }
//    }
//
//    public String displayIngredients() {
//        return "Ingredients: " + ingredients;
//    }
//
//
//}
