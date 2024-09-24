public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 4;
        int index = binarySearch(array, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}


//Output: Key found at index: 3
//This code implements a simple binary search algorithm that takes an array and a key as inputs,
and returns the index of the first occurrence of the key in the array.
The array must be sorted in ascending order. If the key is not found, it returns -1.
