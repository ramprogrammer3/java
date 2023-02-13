import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // int i = 1;
        System.out.println("Printing number from 1 to 10 : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("for loop finished here ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print number from 1 to n odd numbers : ");
        int n = sc.nextInt();
        System.out.println("Printing odd number  below : ");

        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("printing odd number is finished ");
        // sc.close();

        for (int i = 0; i <= n; i++) {
            System.out.print(2 * i + 1 + " ");
        }

        System.out.println();
        System.out.println("printing N natural number from 1 to N in reverse order : ");
        System.out.println("Enter a number : ");
        int m = sc.nextInt();
        for (int i = m; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();

    }
}
