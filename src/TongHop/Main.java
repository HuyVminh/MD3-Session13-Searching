package TongHop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static TongHop.Management.*;

public class Main {


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Catalog> catalogs = new ArrayList<>();
        catalogs.add(new Catalog("Thịt", 1, "àqlưẹqlưeqưẹqưlẹqưelj"));
        catalogs.add(new Catalog("Cá", 1, "dfwẻwekq;ưelkqưeqư;ưekq"));
        catalogs.add(new Catalog("Rau", 1, "dfgẻtwẻqerygjtyểtryuurt"));
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục\n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm\n" +
                    "5. Thoát");
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    addCategory(catalogs);
                    break;
                case 2:
                    addProduct(products, catalogs);
                    break;
                case 3:
                    sort(products);
                    break;
                case 4:
                    searchCategory(products);
                    break;
                case 5:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    break;
            }
        }
    }
}
