import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份(1-12)：");
        int month = sc.nextInt();

        if(month==1 || month==2 || month==12) {
            System.out.println("冬季");
        }else if(month==3 || month==4 || month==5) {
            System.out.println("春季");
        }else if(month==6 || month==7|| month==8) {
            System.out.println("夏季");
        }else if(month==9 || month==10 || month==11) {
            System.out.println("秋季");
        }else {
            System.out.println("你输入的月份有误");
        }

    }
}
