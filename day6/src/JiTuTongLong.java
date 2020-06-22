import java.util.Scanner;

public class JiTuTongLong {
    public static void solve(int a,int b){
        for (int ji=0;ji<=a;ji++){
            if (2*ji+4*(a-ji)==b){
                System.out.println("鸡的个数是："+ji);
                System.out.println("兔的个数是："+(a-ji));
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("鸡和兔一共多少头？");
        int a = sc.nextInt();
        System.out.println("一共有多少个腿？");
        int b = sc.nextInt();
        solve(a,b);

    }
}
