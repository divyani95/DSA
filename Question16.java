class SingleThread extends Thread { 
  public void run() { 
    System.out.println("task one"); 
  } 
} 
 
class Question16 {  
 public static void main(String args[]) {    
 SingleThread t1 = new SingleThread(); 
    t1.start(); 
  } 
}


