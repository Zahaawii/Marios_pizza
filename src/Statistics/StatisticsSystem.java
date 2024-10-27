package Statistics;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

//Class created to maintain a statistic system to display all the orders and remove orders
public class StatisticsSystem {

    private static List <Order> statistics = new ArrayList<>();
    private int nextId = 1;

    //Method created to add make the statistics with the information needed
    public Order makeStatistics(String pizzaName, LocalDateTime dateAndTime) {
    Order statistic = new Order(nextId++, pizzaName, dateAndTime);
    statistics.add(statistic);
    return statistic;
    }

    //Method created to return the statistics
    public List<Order> getStatistics() {
        return statistics;
    }

    //Method created to get all the order statistics
    public static Order getOrderStatistics(int id) {
        for(Order Order : statistics){
            if(Order.getId() == id ) {
                return Order;
            }
        }
        return null;
    }

    //Method made to remove statistics/orders
    public static boolean deleteOrder(int id) {
        Order order = getOrderStatistics(id);
        if(order != null) {
            statistics.remove(order);
            return true;
        }
        return false;
    }


}
