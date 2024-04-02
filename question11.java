import java.util.Scanner;
public class Question11{
    public static void main(String args[]){
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number :");
            int a =in.nextInt();
            System.out.println("The value of a is :"+a);
            int b=42/a;
            int c[]={1};
            c[42]=99;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


