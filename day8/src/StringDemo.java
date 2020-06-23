public class StringDemo {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s);
        System.out.println("-------------");

        char[] chs = {'h','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println(s2);
        System.out.println("-------------");

        String s3 = new String(chs,0,3);
        System.out.println(s3);
        System.out.println("----------");

        String s4 = "hello";
        System.out.println(s4);
    }

}
