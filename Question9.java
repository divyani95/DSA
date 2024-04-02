import java.util.Random;
  public class Question9{
    public static void main(String agrs[]){
        int a=0,b=0,c=0;
        Random r=new Random();
        for(int i=0;i<5;i++){
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }
            catch(Exception e){
                System.out.println("Arithmetic Exception Occured : Division by zero");
                a=0;
            }
            System.out.println("The value of a is "+a);
        }
    }
}


