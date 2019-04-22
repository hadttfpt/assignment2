package baitap;
import demo.SoNguyenTo;

public class MainSoNto {
    public static void main(String[] args){
        SoNguyenTo number = new SoNguyenTo();
        number.input();
        number.setA(number.getA());
        if(number.isSoNguyenTo(number.getA())){
            System.out.println("La so nguyen to");
            System.out.print("So nguyen to lien sau la "+number.timSoNguyenToTiepTheo());
        }
        else {
            System.out.println("Khong la so nguyen to ");
        }
    }
}
