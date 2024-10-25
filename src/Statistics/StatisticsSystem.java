package Statistics;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StatisticsSystem {

    private List <Statistic> statistics = new ArrayList<>();
    private int nextId = 1;

    public Statistic makeStatistics(String pizzaName, LocalDateTime dateAndTime) {
    Statistic statistic = new Statistic(nextId++, pizzaName, dateAndTime);
    statistics.add(statistic);
    return statistic;

    }

    public List<Statistic> getStatistics() {
        return statistics;
    }

}
