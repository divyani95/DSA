class FibonacciArmstrongNumbers { 
private static final int MAX_COUNT = 25;
private int fibCount = 0; 
private int armstrongCount = 0; 
private static int fibonacci(int n) {
if (n <= 1) { 
return n; 
} 
return fibonacci(n - 1) + fibonacci(n - 2); 
} 
private static boolean isArmstrongNumber(int number) {
int sum = 0; 
int originalNumber = number; 
int numberOfDigits = String.valueOf(number).length(); 
while (number > 0) { 
int digit = number % 10; 
sum += (int) Math.pow(digit, numberOfDigits); 
number /= 10; 
} 
return originalNumber == sum; 
} 
public synchronized void printFibonacci() { 
while (fibCount < MAX_COUNT) { 
int fibNumber = fibonacci(fibCount); 
System.out.println(Thread.currentThread().getName() + " (Fibonacci): " + fibNumber); 
fibCount++; 
notify(); // Notify the other thread to print
try { 
if (fibCount < MAX_COUNT) { 
wait(); // Wait for the other thread to noƟfy
} 
} catch (InterruptedException e) {
Thread.currentThread().interrupt(); 
} 
} 
} 
public synchronized void printArmstrong() { 
for (int i = 100; armstrongCount < 25; i++) { 
if (isArmstrongNumber(i)) { 
System.out.println(Thread.currentThread().getName() + " (Armstrong): " + i); 
armstrongCount++; 
notify();
try { 
if (armstrongCount < MAX_COUNT) { 
wait(); 
} 
} catch (InterruptedException e) {
Thread.currentThread().interrupt(); 
} 
} 
} 
} 
} 
public class threadFiboArm { 
public static void main(String[] args) {
FibonacciArmstrongNumbers numbersPrinter = new FibonacciArmstrongNumbers(); 
Thread fibonacciThread = new Thread(numbersPrinter::printFibonacci, "FibonacciThread"); 
Thread armstrongThread = new Thread(numbersPrinter::printArmstrong, 
"ArmstrongThread"); 
fibonacciThread.start(); 
armstrongThread.start(); 
} 
} 
