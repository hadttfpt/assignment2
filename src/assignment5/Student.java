package assignment5;

public class Student extends Person {
    /*
    Tạo lớp Student kế thừa lớp Person.
Có thêm phương thức:
Xem đủ 18 tuổi chưa

Tạo Main để chạy chương trình: Tạo 1 đối tượng Student rồi nhập các thông tin và in thông tin ra. Sau đó kiểm tra xem sv đủ 18 tuổi hay chưa.
     */
    public boolean check(){
        if(2019 - super.getNamSinh()>=18){
            return true;
        }return false;
    }
}
