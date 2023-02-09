
public class Main9 {
    public static void main(String[] args) {
        // String name = "ram";
        // // String name1 = new String("ram kumar");

        // System.out.println(name);
        // // for(char ch : name){
        // // System.out.println(name);
        // // }
        // System.out.println(name.length());

        String str = "Hi my name is ram kumar , i am from maniyari";
        String name = "Ram kumar";

        System.out.println(name.equalsIgnoreCase("ram kumar"));

        System.out.println(name.equals("Ram kumar"));

        // System.out.println(str.equals("am"));

        System.out.println(str.lastIndexOf("am", 20));

        System.out.println(str.lastIndexOf("x"));
        System.out.println(str.lastIndexOf("ar"));

        System.out.println(str.indexOf("x", -1));

        System.out.println(str.indexOf("ar", 15));

        System.out.println(name.indexOf("ar"));
        System.out.println(str.indexOf("am"));

        System.out.println(name.charAt(0));
        System.out.println(str.charAt(15));

        System.out.println(str.endsWith("i"));
        System.out.println(name.endsWith("r"));

        System.out.println(name.startsWith(" "));

        System.out.println(str.startsWith("H"));

        System.out.println(str.replace("am", "x"));

        System.out.println(str.replace('m', 'p'));

        System.out.println(str.substring(10, 20));

        // System.out.println(name.substring(100));
        System.out.println(name.substring(0));
        System.out.println(str.substring(10));

        String name1 = name.trim();
        System.out.println(name1);

        System.out.println(name);
        String lString = str.toUpperCase();

        System.out.println(lString);
        System.out.println(str.toLowerCase());

        System.out.println(str);
        System.out.println(str.length());

        // for(int i = 0; i<str.length(); i++){
        // System.out.println(str.charAt(i));
        // }

    }
}
