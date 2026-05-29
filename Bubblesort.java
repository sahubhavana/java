import java.util.Arrays;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        // Ascending order (primitive array)
        int[] arr = {9, 3, 1, 5, 13, 12};
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
        
        // Descending order (wrapper class)
        Integer[] arr2 = {9, 3, 1, 5, 13, 12};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr2));
    }
}
