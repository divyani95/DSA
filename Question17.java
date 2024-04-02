public class Question17 extends Thread { 
 
    public void run() { 
        for (int i = 0; i < 10; i++) { 
            try { 
                Thread.sleep(1000); 
            } catch (Exception e) { 
                System.out.println(e); 
            } 
            System.out.println(i); 
        } 
    } 
 
    public static void main(String[] args) { 
        Question17 mt = new Question17(); 
        // mt.run();         
	   mt.start(); 
        mt.setName("DIVYANI");        // rename thread 
        System.out.println(mt.getName());   // print name of thread        
        System.out.println(Thread.activeCount());   // count threads 
        mt.setPriority(4); 
        System.out.println(mt.getPriority()); 
    } 
}


