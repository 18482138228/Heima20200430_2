import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        Random r = new Random();
        int number = r.nextInt(100)+1;//产生的随机数在1和100之间


        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("please tap into number you wanted");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数据" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你,猜中了");
                break;
            }

        }

    }
}
