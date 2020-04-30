package Demo6;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int a = s.nextInt();
        System.out.println("输入的数是"+ a);
    }
}
