package TongHop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;
    static int count = 1;

    public Product() {
        this.productId = count++;
        this.productStatus = true;
    }

    public Product(String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice) {
        this.productId = count++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = true;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {

    }

    @Override
    public void inputData(List<Catalog> catalogs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã sản phẩm : " + productId);
        System.out.println("Nhập tên sản phẩm : ");
        this.productName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm :");
        this.title = scanner.nextLine();
        System.out.println("===== Danh mục sản phẩm ========");
        for (Catalog catalog : catalogs) {
            System.out.println(catalog.getCatalogId() + ". " + catalog.getCatalogName());
        }
        System.out.println("Nhập danh mục muốn thêm vào :");
        int catagory = scanner.nextInt();
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() == catagory) {
                this.catalog = catalog;
            }
        }
        scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm :");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập giá mua vào :");
        float imp = scanner.nextFloat();
        this.importPrice = imp;
        System.out.println("Nhập rate :");
        double rate = scanner.nextDouble();
        this.exportPrice = (float) (imp * rate);
    }

    @Override
    public void displayData() {
        System.out.println("{ Mã sản phẩm : " + productId + " , " +
                "Tên sản phẩm : " + productName + " , " +
                "Mô tả sản phẩm : " + descriptions + " , " +
                "Tiêu đề : " + title + " , " +
                "Danh mục sản phẩm : " + catalog.getCatalogName() + " , " +
                "Giá mua vào : " + importPrice + " , " +
                "Giá bán ra : " + exportPrice + " , " +
                "Trạng thái : " + productStatus + "}");
    }
}
