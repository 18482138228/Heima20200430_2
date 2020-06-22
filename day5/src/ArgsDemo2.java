public class ArgsDemo2 {
    public static void change(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            // 如果元素是偶数，值就变为以前的2倍
            if (arr[x] % 2 == 0) {
                arr[x] *= 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // 遍历数组
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("----------------");
        change(arr);
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }


}
