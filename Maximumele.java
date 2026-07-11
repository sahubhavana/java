public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 15, 7};

        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println("Maximum = " + max);
    }
}
