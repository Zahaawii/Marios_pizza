package Statistics;

import java.time.LocalDateTime;

public class Order {

    private int id;
    private String pizzaName;
    private LocalDateTime dateAndTime;

    public Order (int id, String pizzaName, LocalDateTime dateAndTime) {
        this.id = id;
        this.pizzaName = pizzaName;
        this.dateAndTime = dateAndTime;
    }

    public int getId() {
        return id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }



}
