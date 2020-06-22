import java.util.Scanner;

public class MethodTest4 {
    public static void printNumber(int x){
        for (int i=1;i<=x;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printNumber(a);
    }
}
