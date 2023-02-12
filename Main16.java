import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if (website.endsWith(".org")) {
            System.out.println("This is an organization website");
        } else if (website.endsWith(".com")) {
            System.out.println("this is commerical website ");
        } else if (website.endsWith(".in")) {
            System.out.println("This is indian website ");
        }

        sc.close();
    }
}
