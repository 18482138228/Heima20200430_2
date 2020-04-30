package Demo3;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("-----------------");
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("-----------------");
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("-----------------");
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println("-----------------");

        int x = 3;
        int y = 4;
        boolean bb = (x==y);

        int cc = ( x= y);

        System.out.println(bb);
        System.out.println(cc);


    }
}
