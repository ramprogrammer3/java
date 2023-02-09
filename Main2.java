import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number two : ");
        double d1 = sc.nextDouble();
        System.out.println(number1);
        System.out.println(d1);
        double sum = number1 + d1;
        System.out.println(sum);

        System.out.println("Enter a flaot value: ");
        float f1 = sc.nextFloat();
        System.out.println("Enter next float value : ");
        float f2 = sc.nextFloat();

        System.out.println("Sum of f1 and f2 are " + f1 + f2);
        boolean b1 = sc.hasNextFloat();
        System.out.println(b1);

        String str = sc.next();
        System.out.println(str);

        System.out.println("Enter another string ");
        String str1 = sc.nextLine();
        System.out.println(str1);

        sc.close();

    }
}
