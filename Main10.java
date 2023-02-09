/**
 * Main10
 */
public class Main10 {

    public static void main(String[] args) {
        // System.out.println("Hello world ");

        // convert a string to lowercase
        // String str1 = "Welcome to java string tutotorl ";
        // String name = str1.toLowerCase();
        // String str = str1.toUpperCase();

        // System.out.println(str1.toLowerCase());
        // System.out.println(str1.toUpperCase());

        // replace space to _

        // String str = "Hi my name is ram kumar ";
        // String str1 = str.replace(" ", "_");
        // System.out.println(str1);

        // problem 3

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "ram");
        System.out.println(letter);

        // problem 4

        String myString = "This String  contains   double and triple spaces ";

        System.out.println(myString.indexOf(("  ")));
        System.out.println(myString.indexOf(("   ")));

        // problem 5

        String letter2 = "Dear Harry,\n\t This Java Course is Nice. \n\t Thanks!";
        System.out.println(letter2);

    }
}