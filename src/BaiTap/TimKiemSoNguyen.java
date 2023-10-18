package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemSoNguyen {
    public static void main(String[] args) {
        int[] arr = getArr();
        List<Integer> listFound = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm kiếm trong mảng :");
        int value = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                listFound.add(i);
            }
        }
        if (!found) System.out.println("Không tìm thấy giá trị " + value + " xuất hiện trong mảng.");
        else {
            System.out.println("Giá trị " + value + " xuất hiện " + listFound.size()+" lần trong mảng tại vị trí :");
            for (int a : listFound) {
                System.out.println("arr[" + a + "]");
            }
        }
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
