package Statistics;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StatisticInterface {

    static private StatisticsSystem statisticsSystem = new StatisticsSystem();
    static Scanner scanner = new Scanner(System.in);
    static LocalDateTime dateAndTime = LocalDateTime.now();

    public static void addStatistic() {
        System.out.println("Add pizza");
        String name = scanner.next();

        Statistic statistic = statisticsSystem.makeStatistics(name, dateAndTime);
        System.out.println("Pizza tilføjet til statistikkerne. ID: " + statistic.getId());
    }

    public static void viewAllStatistics() {
        System.out.println("Here you can see all statistics");
        for(Statistic stc : statisticsSystem.getStatistics()) {
            System.out.println(stc.getId() + " - " + stc.getPizzaName() + " - " + stc.getDateAndTime());
        }
    }

}
