package demo;
import java.util.Scanner;

public class SoNguyenTo {
    /*Tạo class SoNguyenTo gồm:

biến a lưu trữ 1 số nguyên tố.

phương thức boolean isSoNguyenTo(int x){} kiểm tra số x có phải số nguyên tố không.

phương thức int timSoNguyenToTiepTheo(){} tìm và trả về số nguyên tố liền sau số nguyên tố a.

phương thức get/set biến a; Nếu tham số truyền vào hàm set là 1 số nguyên tố thì mới gán vào a. Nếu không thì hiển thị thông báo: không set.

Ở hàm Main. Khai báo 1 đối tượng thuộc class SoNguyenTo và test các hàm đã viết.

     */
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println("Khong set. ");
            input();
        }
    }
    public void input(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập số ");
        a = sc.nextInt();
    }

    public boolean isSoNguyenTo(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }return x>1;
    }
    public int timSoNguyenToTiepTheo(){
        int i;
        for(i = a+1;;i++){
            if(isSoNguyenTo(i)){
                break;
            }
        }return i;
    }
}
