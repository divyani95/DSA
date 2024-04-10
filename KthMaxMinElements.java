 import java.util.*;
 public class KthMaxMinElements {
 public static int findKthMinElement(int[] arr, int k) {
 PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 for (int num : arr) {
 minHeap.offer(num);
 if (minHeap.size() > k) {
 minHeap.poll();
 }
 }
 return minHeap.peek();
 }
 public static int findKthMaxElement(int[] arr, int k) {
 PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
 for (int num : arr) {
 maxHeap.offer(num);
 if (maxHeap.size() > k) {
 maxHeap.poll();
 }
 }
 return maxHeap.peek();
 }
 public static void main(String[] args) {
 int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
 int k = 3;
 System.out.println("Array: " + Arrays.toString(arr));
 System.out.println("Kth minimum element: " + findKthMinElement(arr, k));
 System.out.println("Kth maximum element: " + findKthMaxElement(arr, k));
 }
 }
