 import java.io.*;
 import java.util.*;
 public class MinimumMaximumElements {
 static class Pair {
 int min;
 int max;
 }
 static Pair getMinMax(int arr[], int n) {
 Pair minmax = new Pair();
 int i;
 if (n % 2 == 0) {
 if (arr[0] > arr[1]) {
 minmax.max = arr[0];
 minmax.min = arr[1];
 } else {
 minmax.min = arr[0];
 minmax.max = arr[1];
 }
 i = 2;
 } else {
 minmax.min = arr[0];
 minmax.max = arr[0];
 i = 1;
 }
 while (i < n- 1) {
 if (arr[i] > arr[i + 1]) {
 if (arr[i] > minmax.max) {
 minmax.max = arr[i];
 }
 if (arr[i + 1] < minmax.min) {
 minmax.min = arr[i + 1];
 }
 } else {
 if (arr[i + 1] > minmax.max) {
 minmax.max = arr[i + 1];
 3
}
 if (arr[i] < minmax.min) {
 minmax.min = arr[i];
 }
 }
 i += 2;
 }
 return minmax;
 }
 public static void main(String args[]) {
 int arr[] = {100, 121, 4445, 12, 33930, 300};
 int arr_size = 6;
 Pair minmax = getMinMax(arr, arr_size);
 System.out.printf("Minimum element is %d", minmax.min);
 System.out.printf("\nMaximum element is %d", minmax.max);
 }
 }