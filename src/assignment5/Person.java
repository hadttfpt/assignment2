package assignment5;

import java.util.Scanner;

public class Person {
    /*
    Tạo lớp Person chứa thông tin:
Tên
Giới tính
Ngày sinh
Địa chỉ
Với đầy đủ các hàm getter/setter và Constructor đầy đủ tham số, không tham số.
Viết Phương thức inputInfo() để nhập thông tin từ bàn phím
Viết phương thức showInfo() để hiện thông tin

Tạo lớp Student kế thừa lớp Person.
Có thêm phương thức:
Xem đủ 18 tuổi chưa

Tạo Main để chạy chương trình: Tạo 1 đối tượng Student rồi nhập các thông tin và in thông tin ra. Sau đó kiểm tra xem sv đủ 18 tuổi hay chưa.
     */
    public String name;
    public String gioiTinh;
    public String diaChi;
    public int namSinh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public Person() {
    }
    public Person(String name, String gioiTinh, String diaChi, int namSinh){
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    /*Viết Phương thức inputInfo() để nhập thông tin từ bàn phím*/
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten");
            String name = sc.nextLine();
            System.out.println("Nhap dia chi");
            String diaChi = sc.nextLine();
            System.out.println("Nhap gioi tinh");
            String gioiTinh = sc.nextLine();
            System.out.println("Nhap nam sinh");
            int namSinh = sc.nextInt();
            setName(name);
            setDiaChi(diaChi);
            setGioiTinh(gioiTinh);
            setNamSinh(namSinh);
    }
    /*Viết phương thức showInfo() để hiện thông tin */
    public void showInfor(){
        System.out.println("Name "+getName());
        System.out.println("Gioi Tinh "+getGioiTinh());
        System.out.println("Dia chi "+getDiaChi());
        System.out.println("Nam Sinh "+getNamSinh());
    }
}
