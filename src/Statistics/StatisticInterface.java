package Statistics;
import PizzaSystem.OrderAPizza;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StatisticInterface extends OrderAPizza {

    static private StatisticsSystem statisticsSystem = new StatisticsSystem();
    static Scanner scanner = new Scanner(System.in);
    static LocalDateTime dateAndTime = LocalDateTime.now();

    public static void addOrderToStatistics() {

        Order statistic = statisticsSystem.makeStatistics(OrderAPizza.buyAPizza(), dateAndTime);
        System.out.println("Pizza ordrer. ID: " + statistic.getId());

    }

    public static void viewAllStatistics() {
        System.out.println("Here you can see all statistics");
        for(Order stc : statisticsSystem.getStatistics()) {
            System.out.println(stc.getId() + " - " + stc.getPizzaName() + " - " + stc.getDateAndTime());
        }
    }


}
