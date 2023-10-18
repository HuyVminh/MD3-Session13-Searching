package BaiTap;

public class TimSoLonNhat {
    public static void main(String[] args) {
        int[] arr = getArr();
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            System.out.print(a + " ");
            if (a > max) max = a;
        }
        System.out.println();
        System.out.println("Giá trị lớn nhất trong mảng là : " + max);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
