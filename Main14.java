import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        System.out.println("hello world ");

        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("Your are going to become adult ");
                break;
            case 21:
                System.out.println("Your are going to join to a job");
                break;
            case 60:
                System.out.println("You are going to retired ");
                break;
            default:
                System.out.println("enjoy your life ");
        }

        if (age > 56) {
            System.out.println("Your are experienced ");
        } else if (age > 46) {
            System.out.println("You are semi-experience ");
        } else if (age > 36) {
            System.out.println("You are semi semi experience ");
        } else {
            System.out.println("you are not experience ");
        }

        if (age > 2) {
            System.out.println("Your are not a baby ");
        }

        sc.close();
    }
}
