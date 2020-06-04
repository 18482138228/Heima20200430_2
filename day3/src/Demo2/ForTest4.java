package Demo2;

public class ForTest4 {
    public static void main(String[] args) {
        int count = 0;
        for(int x=1;x<1000;x++){
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
