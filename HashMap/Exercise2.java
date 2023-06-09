import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        // Hashmap
        HashMap<String, int[]> workHour = new HashMap<>();
        workHour.put("employee 0 ", new int[]{2, 4, 3, 4, 5, 8, 8});
        workHour.put("employee 1 ", new int[]{7, 3, 4, 3, 3, 4, 4});
        workHour.put("employee 2 ", new int[]{3, 3, 4, 3, 3, 2, 2});
        workHour.put("employee 3 ", new int[]{9, 3, 4, 7, 3, 4, 1});
        workHour.put("employee 4 ", new int[]{3, 5, 4, 3, 6, 3, 8});
        workHour.put("employee 5 ", new int[]{3, 4, 4, 6, 3, 4, 4});
        workHour.put("employee 6 ", new int[]{3, 7, 4, 8, 3, 8, 4});
        workHour.put("employee 7 ", new int[]{6, 3, 5, 9, 2, 7, 9});

        // Get an array of Map entries from the HashMap
        Map.Entry<String, int[]>[] entries = workHour.entrySet().toArray(new Map.Entry[0]);

        // Sort the array based on the sum of values in each entry
        Arrays.sort(entries, Comparator.comparingInt(entry -> getSum(entry.getValue())));

        // Display the sorted entries
        System.out.println("\t            Su  M  T  W  Th F  Sa");
        for (Map.Entry<String, int[]> entry : entries) {
            String key = entry.getKey();
            int[] values = entry.getValue();
            int sum = getSum(values);
            System.out.print(key + ":   ");
            for (int value : values) {
                System.out.print(value + "  ");
            }
            System.out.println(" Sum: " + sum);
        }
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
