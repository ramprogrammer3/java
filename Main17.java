public class Main17 {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        int b = 0;
        System.out.println("Printing number using while loop");
        while (b < 10) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();
        int a = 0;
        System.out.println("printing number using do while loop ");
        do {
            System.out.print(a + " ");
            a++;
        } while (a < 5);

        System.out.println();
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= 100);
    }
}
