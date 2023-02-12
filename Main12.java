public class Main12 {
    public static void main(String[] args) {

        System.out.println("For logical AND.....");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // System.out.println(a && b);
        if(a && b && c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;

        // System.out.println(a && b);
        if(a1 || b1 || c1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
