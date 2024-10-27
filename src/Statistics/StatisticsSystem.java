package Statistics;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StatisticsSystem {

    private static List <Order> statistics = new ArrayList<>();
    private int nextId = 1;

    public Order makeStatistics(String pizzaName, LocalDateTime dateAndTime) {
    Order statistic = new Order(nextId++, pizzaName, dateAndTime);
    statistics.add(statistic);
    return statistic;
    }

    public List<Order> getStatistics() {
        return statistics;
    }

    public static Order getOrderStatistics(int id) {
        for(Order Order : statistics){
            if(Order.getId() == id ) {
                return Order;
            }
        }
        return null;
    }

    public static boolean deleteCharacter(int id) {
        Order order = getOrderStatistics(id);
        if(order != null) {
            statistics.remove(order);
            return true;
        }
        return false;
    }


}
