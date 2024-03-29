public class CountingSort {
    public static void countingSort(int[] array, int max) {
        int[] count = new int[max + 1];
        int[] output = new int[array.length];

        // Store count of each element
        for (int value : array) {
            count[value]++;
        }

        // Modify count array such that each element at each index
        // stores the sum of previous counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        int maxValue = 8;

        System.out.println("Original array:");
        printArray(array);

        countingSort(array, maxValue);

        System.out.println("Sorted array:");
        printArray(array);
    }
}






 






