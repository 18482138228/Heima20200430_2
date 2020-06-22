import java.util.Scanner;

public class MethodTest2 {
    public static boolean IsEqual(int a,int b){
        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int b = s.nextInt();

        if(IsEqual(a,b)){
            System.out.println("相等");
        }
        else {
            System.out.println("不相等");
        }
    }
        //何梓怡yuki
}
