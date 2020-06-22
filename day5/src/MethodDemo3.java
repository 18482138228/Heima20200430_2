public class MethodDemo3 {
    //方法重载;
    public static float sum(float a,float b){
        return a+b;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static  int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum1 = sum(a,b);

        int c = 30;
        int sum2 = sum(a,b,c);

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
