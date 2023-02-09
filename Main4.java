import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // System.out.println("Hello wodld ");
        // double subject1 = 45;
        // double subject2 = 89;
        // double subject3 = 67;

        // double cgpa = (subject1 + subject2 + subject3) / 30;
        // System.out.println("the cgpa is " + cgpa);

        // question 3

        // Scanner sc = new Scanner(System.in);
        // System.out.println("What is your name ?");
        // String name = sc.next();
        // System.out.println("Hello " + name + " hava a good day ");

        // sc.close();

        // question 4

        System.out.println("Enter kilometer value : ");
        Scanner sc = new Scanner(System.in);
        float kilometer = sc.nextFloat();
        float miles = kilometer * 0.621371f;
        System.out.println(kilometer + " kilometer = " + miles + " miles");

        sc.close();

    }
}
