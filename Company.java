
class Company {
private String product;
private boolean isProduced = false;
public synchronized void produce(String item) {
while (isProduced) {
try {
wait();
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
e.printStackTrace();
}
}
product = item;
isProduced = true;
System.out.println("Produced " + item);
notify();
}
public synchronized void consume() {
while (!isProduced) {
try {
wait();
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
e.printStackTrace();
}
}
System.out.println("Consumed " + product);
isProduced = false;
notify();
}
}
class Producer extends Thread {
private Company company;
public Producer(Company company) {
this.company = company;
}
@Override
public void run() {
for (int i = 1; i <= 5; i++) {
String item = "Product-" + i;
company.produce(item);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
class Consumer extends Thread {
private Company company;
public Consumer(Company company) {
this.company = company;
}
@Override
public void run() {
for (int i = 0; i < 5; i++) {
company.consume();
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
public class ProdCus {
public static void main(String[] args) {
Company company = new Company();
Producer producerThread = new Producer(company);
Consumer consumerThread = new Consumer(company);
producerThread.start();
consumerThread.start();
try {
producerThread.join();
consumerThread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
