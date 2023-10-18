package BaiTap;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        int[] arr = getArr();
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            System.out.print(a + " ");
            if (a < min) min = a;
        }
        System.out.println();
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
}
