import java.util.Scanner;

public class MethodTest3 {
    public static int getMax(int a,int b,int c){
        int max = a;
        if(a<c){
            max = c;
            if (max < b){
                max = b;
            }
        }
        else{
            if (max < b){
                max = b;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = getMax(a,b,c);
        System.out.println(max);
    }
}
