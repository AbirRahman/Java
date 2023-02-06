public static void countingSort(int[] arr, int n) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int[] count = new int[max + 1];
    for (int i = 0; i < n; i++) {
        count[arr[i]]++;
    }
    int index = 0;
    for (int i = 0; i <= max; i++) {
        for (int j = 0; j < count[i]; j++) {
            arr[index++] = i;
        }
    }
}

public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    int n = arr.length;
    countingSort(arr, n);
    System.out.println("Sorted array: " + Arrays.toString(arr));
}


// Output: Sorted array: [11, 12, 22, 25, 64]
