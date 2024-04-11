 import java.util.HashSet;
 public class FindUnionAndIntersection {
 public static void main(String[] args) {
 int[] arr1 = {1, 2, 3, 4, 5};
 int[] arr2 = {4, 5, 6, 7, 8};
 System.out.println("Array 1: ");
 printArray(arr1);
 System.out.println("Array 2: ");
 printArray(arr2);
 findUnion(arr1, arr2);
 findIntersection(arr1, arr2);
 }
 public static void findUnion(int[] arr1, int[] arr2) {
 HashSet<Integer> unionSet = new HashSet<>();
 for (int num : arr1) {
 unionSet.add(num);
 }
 for (int num : arr2) {
 unionSet.add(num);
 }
 System.out.println("\nUnion of the arrays:");
 for (int num : unionSet) {
 System.out.print(num + " ");
 }
 }
 public static void findIntersection(int[] arr1, int[] arr2) {
 HashSet<Integer> intersectionSet = new HashSet<>();
 HashSet<Integer> set = new HashSet<>();
 for (int num : arr1) {
 set.add(num);
 8
}
 for (int num : arr2) {
 if (set.contains(num)) {
 intersectionSet.add(num);
 }
 }
 System.out.println("\nIntersection of the arrays:");
 for (int num : intersectionSet) {
 System.out.print(num + " ");
 }
 }
 public static void printArray(int arr[]) {
 for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println();
 }
 }