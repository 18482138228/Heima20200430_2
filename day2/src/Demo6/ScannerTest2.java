package Demo6;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = s.nextInt();
        System.out.println("请输入第二个数：");
        int b = s.nextInt();
        boolean flag = (a == b);
        if(flag){
            System.out.println("两数相等");
        }
        else{
            System.out.println("两数不相等");
        }
    }
}
