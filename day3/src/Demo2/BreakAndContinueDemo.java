package Demo2;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for(int x=1;x<=10;x++){
            if(x%3 == 0){
                continue;
            }
            System.out.println("J");
        }
    }
}
