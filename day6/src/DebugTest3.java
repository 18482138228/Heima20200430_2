public class DebugTest3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);
        change(a, b);
        System.out.println("a:" + a + ",b:" + b);

    }

    private static void change(int a, int b) {
        System.out.println("a:" + a + ",b:" + b);
        a = b;
        b = a + b;
        System.out.println("a:" + a + ",b:" + b);
    }

}
