class InsertionSort {
    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Shift larger elements right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {22, 21, 11, 15, 16};
        insertionSort(arr);
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(arr));
    }
}
