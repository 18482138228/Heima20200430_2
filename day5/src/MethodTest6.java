public class MethodTest6 {
    public static int getMin(int[] arr) {
        int min = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] < min) {
                min = arr[x];
            }
        }

        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int []arr = {34,67,10,28,59};
        int Max = getMax(arr);
        int Min = getMin(arr);
        System.out.println(Max);
        System.out.println(Min);
    }

}
