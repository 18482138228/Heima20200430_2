import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int x=1;x<=10;x++){
            int number = r.nextInt(10);
            System.out.println("number="+number);
        }
        System.out.println("--------------------");

        int i =r.nextInt(100)+1;
        System.out.println("i="+i);
    }
}
