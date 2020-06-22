public class ArrayTest4 {
    public static void main(String[] args) {
        int []arr = {11,22,33,44,55};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("-----------");

        for (int x=0;x<5;x++){
            System.out.println(arr[x]);
        }

        System.out.println("----------------");


        System.out.println("数组的长度为"+arr.length+"个");
        System.out.println("---------------");
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }

    }
}
