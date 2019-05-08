package assignment4;
/*
1. Viết class Product gồm các thuộc tính: id, productName, qty (số lượng), price ( giá)
Các phương thức:
- Constructor ko tham số và đầy đủ tham số
- Kiểm tra số lượng: nếu qty > 0 báo còn hàng ngược lại hết hàng
2. Viết class Cart gồm các thuộc tính:
id, customer ( tên khách hàng), grandTotal ( tổng tiền), productList ( Danh sách sản phẩm trong giỏ hàng), city
Các phương thức:
- Constructor ko tham số, tạo ô nhớ cho mảng
- Thêm 1 sản phẩm vào giỏ hàng
- Xoá 1 sản phẩm khỏi giỏ hàng
- Tính tổng tiền: grandTotal = grandTotal + 1% phí ship nến trong HN hoặc HCM, 2% nếu ngoại thành * grandTotal
 */
public class Product {
    public int id;
    public String productName;
    public int qty;
    public double price;

    public Product() {
    }

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public void check(){
        if(qty>0){
            System.out.println("Con hang");
        }else{
            System.out.println("Het hang");
        }
    }
}
