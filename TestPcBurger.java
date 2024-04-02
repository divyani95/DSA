class McDonald { 
 int n; 
 boolean f = false; 
 synchronized public void produce_burger(int n) throws InterruptedException {
 if (f) { 
 wait(); 
 } 
 this.n = n; 
 System.out.println("Produced Burger: " + this.n); 
 f = true; 
 notify();
 } 
 synchronized public int consume_burger() throws InterruptedException {
 if (!f) { 
 wait(); 
 } 
 System.out.println("Consumed Burger: " + this.n); 
 f = false; 
 notify();
 return this.n; 
 } 
}  
class Producer_Burger extends Thread { 
 McDonald mc; 
 Producer_Burger(McDonald mc) { 
 this.mc = mc; 
 } 
 public void run() { 
 try { 
 int i = 1; 
 while (true) { 
 this.mc.produce_burger(i); 
 Thread.sleep(3000); 
 i++; 
 } 
 } catch (InterruptedException e) {
 e.printStackTrace(); 
 } 
 } 
}  
class Consumer_Burger extends Thread { 
 McDonald mc; 
 Consumer_Burger(McDonald mc) { 
 this.mc = mc; 
 } 
 public void run() { 
 while (true) { 
 try { 
 this.mc.consume_burger(); 
 Thread.sleep(2000); 
 } catch (InterruptedException e) {
 e.printStackTrace(); 
 } 
 } 
 } 
} 
 
class TestPcBurger { 
 public static void main(String[] args) {
 McDonald comp = new McDonald(); 
 Producer_Burger p = new Producer_Burger(comp); 
 Consumer_Burger c = new Consumer_Burger(comp); 
 p.start(); 
 c.start(); 
 } 
}