 public class KadansAlgorithm {
 public static void main(String[] args) {
 int[] arr = {-2,-3, 4,-1,-2, 1, 5,-3 };
 findLargestContiguousSubarray(arr);
 }
 public static void findLargestContiguousSubarray(int[] arr) {
 int maxEndingHere = 0;
 int maxSoFar = Integer.MIN_VALUE;
 int start = 0;
 int end = 0;
 int s = 0;
 for (int i = 0; i < arr.length; i++) {
 maxEndingHere += arr[i];
 if (maxSoFar < maxEndingHere) {
 maxSoFar = maxEndingHere;
 start = s;
 end = i;
 }
 if (maxEndingHere < 0) {
 maxEndingHere = 0;
 s = i + 1;
 }
 }
 System.out.println("The largest sum contiguous subarray is:");
 for (int i = start; i <= end; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println("\nThe maximum sum is: " + maxSoFar);
 }
 }
