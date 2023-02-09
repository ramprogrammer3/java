import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {
        // System.out.println("hello world ");
        System.out.println("Sum of three number: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int number3 = sc.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("The sum is " + sum);


        sc.close();
    }
}
