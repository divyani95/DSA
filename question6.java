public class Faculty {
    String designation="Student";
    String collegeName="Amity institute of information and technology";
    public void does(){
        System.out.println("studying");
    }
}
public class question6 extends Faculty {
    String subject="Java";
    void hobby(){
        System.out.println("Learning is my thing.");
    }
    public static void main(String args[]){
        question6 obj=new question6();
        System.out.println(obj.designation);
        System.out.println(obj.collegeName);
        obj.does();
        System.out.println(obj.subject);
        obj.hobby();
    }
}
