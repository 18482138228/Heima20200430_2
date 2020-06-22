import java.util.Scanner;

public class MethodTest {
    public static int getMin(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int min = getMin(a,b);
        System.out.println(min);

    }
}
