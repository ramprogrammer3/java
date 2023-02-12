import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {

        // problem 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");

        float tax = 0;
        float income = sc.nextFloat();

        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + (income - 2.5f) * 0.05f;
        } else if (income > 5.0f && income <= 10.f) {
            tax = tax + (5f - 2.5f) * 0.05f;
            tax = tax + (income - 5f) * 0.2f;
        } else if (income > 10.0f) {
            tax = tax + (5f - 2.5f) * 0.05f;
            tax = tax + (10.0f - 5.0f) * 0.2f;
            tax = tax + (income - 10.0f) * 0.3f;
        }

        System.out.println("The total tax is " + tax);

        sc.close();

        // problem 2

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks in physics");
        // System.out.println("Enter your marks in chemistry");
        // System.out.println("Enter your marks in Maths");
        // byte m1, m2, m3;
        // m1 = sc.nextByte();
        // m2 = sc.nextByte();
        // m3 = sc.nextByte();

        // float avg = (m1 + m2 + m3) / 3.0f;

        // if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("congratulations , you have been promoted");
        // } else {
        // System.out.println("You have not been promoted , please try again ");
        // }

        // sc.close();

        // problem 1
        // int a = 10;
        // if(a == 11){
        // System.out.println("I am 11");
        // }else{
        // System.out.println("I am not 11");
        // }
        // System.out.println("Hello world ");
    }
}
