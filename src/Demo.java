
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Nhập số cần tìm kiếm : ");
        int searchNum = Integer.parseInt(scanner.nextLine());
        int low = 0;
        int high = numbers.length - 1;
        boolean check = true;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (numbers[mid] == searchNum) {
                System.out.println("Tìm thấy số " + searchNum + " tại vị trí thứ " + mid + " trong mảng");
                check = true;
                return;
            } else if (searchNum < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy số " + searchNum + " trong mảng");
        }
    }
}
