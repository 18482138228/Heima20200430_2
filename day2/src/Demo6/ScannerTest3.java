package Demo6;

import java.util.Scanner;

public class ScannerTest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = s.nextInt();
        System.out.println("请输入第二个数据：");
        int b = s.nextInt();
        System.out.println("请输入第三个数据：");
        int c = s.nextInt();
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("最大的数是" + max);
    }
}
