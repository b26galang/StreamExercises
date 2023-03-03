package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {
    public static void main(String[] args) {
        List<Integer> temperatures = new ArrayList<>();

        temperatures.add(64);
        temperatures.add(48);
        temperatures.add(123);
        temperatures.add(108);
        temperatures.add(44);
        temperatures.add(30);
        temperatures.add(49);
        temperatures.add(34);
        temperatures.add(53);
        temperatures.add(39);
        temperatures.add(16);
        temperatures.add(0);
        temperatures.add(10);
        temperatures.add(29);

        System.out.println("Original Temperatures: " + temperatures);
        System.out.println();

        System.out.println("Using map and collect:");
        List<Integer> higherTemp = temperatures.stream().map(temp -> temp + 20).collect(Collectors.toList());
        System.out.println("Temperatures but 20 degrees warmer: " + higherTemp);
        System.out.println();

        System.out.println("Using filter and sorted:");
        List<Integer> belowFreezing = temperatures.stream().filter(temp -> temp < 32).sorted().toList();
        System.out.println("Temperatures below freezing: " + belowFreezing);
        System.out.println();
        List<Integer> heatWave = temperatures.stream().filter(temp -> temp > 100).sorted().toList();
        System.out.println("Heat Wave: " + heatWave);
        System.out.println();

        System.out.println("Using reduce:");
        int numOfTemps  = temperatures.stream().reduce(0, (ans, current) -> ans + 1);
        System.out.println("Number of temperatures: " + numOfTemps);
    }

}
