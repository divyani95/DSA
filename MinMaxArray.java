public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8}; // Example array
        int max = findMax(array);
        int min = findMin(array);
        
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }

    static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
    static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
  
        for (int num : array) {
            if (num < min) {
                min = num;
            }}return min;}}


