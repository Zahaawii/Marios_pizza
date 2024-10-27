package Statistics;
import PizzaSystem.OrderAPizza;

import java.time.LocalDateTime;
import java.util.Scanner;

//Class made to create a interface of the statistics and add orders to the statistics
public class StatisticInterface extends OrderAPizza {

    static private StatisticsSystem statisticsSystem = new StatisticsSystem();
    static Scanner scanner = new Scanner(System.in);
    static LocalDateTime dateAndTime = LocalDateTime.now();

    //Method made to take hashmap pizza order and add it to our statistics
    public static void addOrderToStatistics() {

        Order statistic = statisticsSystem.makeStatistics(OrderAPizza.buyAPizza(), dateAndTime);
        System.out.println("Pizza ordrer. ID: " + statistic.getId());

    }

    //Method created to show all the statistics/orders
    public static void viewAllStatistics() {
        System.out.println("Here you can see all statistics");
        for(Order stc : statisticsSystem.getStatistics()) {
            System.out.println(stc.getId() + " - " + stc.getPizzaName() + " - " + stc.getDateAndTime());
        }
    }


}
