import java.util.Map;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        Map<Integer, Double> errorRates = Map.of(
            1, 1.0,
            2, 1.0,
            3, 1.0,
            4, 1.0,
            5, 0.9,
            6, 0.9,
            7, 0.9,
            8, 0.9,
            9, 0.8,
            10, 0.77
        );
        double errorRate = errorRates.getOrDefault(speed, 1.0);
        return 221 * speed * errorRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
