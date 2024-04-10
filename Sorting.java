 public class Sorting {
 public static void main(String[] args) {
 int[] arr = {0, 1, 2, 1, 0, 2, 1, 2, 0};
 int n = arr.length;
 System.out.println("Before sorting:");
 printArray(arr);
 sort012(arr, n);
 System.out.println("\nAfter sorting:");
 printArray(arr);
 }
 public static void sort012(int a[], int n) {
 int l = 0;
 int m = 0;
 int h = n- 1;
 while (m <= h) {
 if (a[m] == 0) {
 int temp = a[m];
 a[m] = a[l];
 a[l] = temp;
 m++;
 l++;
 } else if (a[m] == 1) {
 m++;
 } else {
 int temp = a[m];
 a[m] = a[h];
 a[h] = temp;
 h--;
 }
 }
 }
 public static void printArray(int arr[]) {
 for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i] + " ");
 } }}