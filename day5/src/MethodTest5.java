public class MethodTest5 {
    public static boolean isEqual(short a,short b){
        System.out.println("short");
        return (a==b);
    }
    public static boolean isEqual(int a,int b){
        System.out.println("int");
        return (a==b);
    }
    public static boolean isEqual(long a,long b){
        System.out.println("long");
        return (a==b);
    }
    public static void main(String[] args) {
        boolean int_ans = isEqual(10,20);
        boolean short_ans = isEqual((short)10,(short)20);
        boolean long_ans = isEqual((long)10,(long)20);

        System.out.println(int_ans);
        System.out.println(short_ans);
        System.out.println(long_ans);
    }
}
