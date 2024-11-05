package Statistics;

import java.time.LocalDateTime;

//Class made to give our order a blueprint of information that our classes has to follow
public class Order {

    private int id;
    private String pizzaName;
    private LocalDateTime dateAndTime;

    public Order (int id, String pizzaName, LocalDateTime dateAndTime) {
        this.id = id;
        this.pizzaName = pizzaName;
        this.dateAndTime = dateAndTime;
    }

    //Getter method made to get the id so we can identify which pizza has been ordered
    public int getId() {
        return id;
    }

    //Getter method made to get the name of the pizza
    public String getPizzaName() {
        return pizzaName;
    }

    //Getter method made so we can see the time of the order
    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }



}
