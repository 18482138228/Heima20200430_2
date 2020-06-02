package Demo2;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println(max);
    }
}
