public class ArrayArrayTest {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int j=0;j<arr.length;j++){
            for (int i=0;i<arr[j].length;i++){
                System.out.println(arr[j][i]);
                System.out.println(" ");
            }
        }
        System.out.println("end");

    }
}
