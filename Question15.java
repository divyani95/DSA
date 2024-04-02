class Question15 extends Thread { 
    public void run() { 
        System.out.println("task one"); 
    } 
 
    public static void main(String args[]) { 
        Question15 t3 = new Question15(); 
        Question15 t2 = new Question15();         
	Question15 t1 = new Question15(); 
 
        t1.start();         
	t2.start();        
        t3.start(); 
    } 
}



