public class Main20 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("skip this iteration");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        int j = 0;
        while (j < 5) {

            System.out.print(j + " ");
            System.out.println("java is great ");
            j++;
            if (j == 2) {
                System.out.println("this iteration is skip : ");
                continue;
            }
        }

        System.out.println("Hello world ");

        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            System.out.print(i + " ");
            System.out.println("java is great ");
        }

        System.out.println("using break in while loop ");
        int i = 0;
        while (i < 5) {

            System.out.print(i + " ");
            System.out.println("java is great ");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }

    }
}
