import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(input.nextLine());

            int result = 10 / num; // Division by zero can throw an ArithmeticException

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught:");
            System.out.println("Message: " + e.getMessage()); // Get the exception message
            System.out.println("Cause: " + e.getCause());       // Get the cause of the exception
            System.out.println("Stack Trace:");
            e.printStackTrace();                                 // Print the stack trace
        } catch (Exception e) {
            System.out.println("General Exception caught:");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}









