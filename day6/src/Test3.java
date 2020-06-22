public class Test3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int x = 10000;x<1e5;x++){
            int ge = x%10;
            int shi = x/10%10;
            int qian = x/1000%10;
            int wan = x/10000%10;

            if((ge == wan)&&(shi == qian)){
                System.out.println(x+"是回文数");
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
