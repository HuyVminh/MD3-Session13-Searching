package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = getArr();
        List<Integer> listFoundI = new ArrayList<>();
        List<Integer> listFoundJ = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm kiếm trong mảng 2 chiều :");
        int value = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    found = true;
                    listFoundI.add(i);
                    listFoundJ.add(j);
                }
            }
        }
        if (!found) System.out.println("Không tìm thấy số " + value + " trong mảng.");
        else {
            System.out.println("Số " + value + " xuất hiện trong mảng tại " + listFoundJ.size() + " vị trí : ");
            for (int i = 0; i < listFoundI.size(); i++) {
                System.out.println("arr[" + listFoundI.get(i) + "][" + listFoundJ.get(i) + "]");
            }
        }
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
}
