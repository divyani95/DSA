 public class ReverseAnArray {
 public static void rvereseArray(int arr[], int start, int end)
 {
 int temp;
 while (start < end)
 {
 temp = arr[start];
 arr[start] = arr[end];
 arr[end] = temp;
 start++;
 end--;
 }
 }
 public static void printArray(int arr[], int size)
 {
 for (int i = 0; i < size; i++)
 System.out.print(arr[i] + " ");
 System.out.println();
 }
 public static void main(String args[]) {
 int arr[] = {-21, 56, 33,-8, 42, 19,-63, 77, 5,-37, 92,-11, 28, 67,-49, 13,-2, 30,
 88,-15};
 }
 }
 printArray(arr, 6);
 rvereseArray(arr, 0, 5);
 System.out.print("Reversed array is \n");
 printArray(arr, 6);
