package assignment4;

import java.util.*;

/*
2. Viết class Cart gồm các thuộc tính:
id, customer ( tên khách hàng), grandTotal ( tổng tiền), productList ( Danh sách sản phẩm trong giỏ hàng), city
Các phương thức:
- Constructor ko tham số, tạo ô nhớ cho mảng
- Thêm 1 sản phẩm vào giỏ hàng
- Xoá 1 sản phẩm khỏi giỏ hàng
- Tính tổng tiền: grandTotal = grandTotal + 1% phí ship nến trong HN hoặc HCM, 2% nếu ngoại thành * grandTotal
 id, productName, qty (số lượng), price ( giá)
 */
public class Cart {
    public int id;
    public String customer;
    public double grandTotal;
    public ArrayList<Product> productList;
    public String city;

    public Cart() {
    }

    public Cart(int id, String customer, double grandTotal, String city) {
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham");
        String productName = sc.nextLine();
        System.out.println("Nhap so luong");
        int qty = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gia");
        Double price = sc.nextDouble();
        Product pr = new Product(id,productName,qty,price);
        productList.add(pr);

    }
    public void xoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham muon xoa");
        int c = sc.nextInt();
        for(int i = 0;i<productList.size();i++){
            if(productList.get(i).id==c){
                productList.remove(i);
            }
        }
    }

    public double getPrice(){
        double grandTotal = 0;
        for (int i = 0; i < productList.size(); i++) {
            grandTotal += productList.get(i).qty * productList.get(i).price;
        }
        if(city.equals("HN")||city.equals("HCM")){
            grandTotal = grandTotal + 0.01*grandTotal;
        }else {
            grandTotal = grandTotal + 0.02*grandTotal;
        }return grandTotal;
    }
}
