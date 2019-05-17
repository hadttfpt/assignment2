package assignment8;

import java.time.LocalDate;
import java.util.*;

public class KHangTest {
    public ArrayList<KHang> List = new ArrayList<>();
    public String maKH;
    public String hoTen;
    public String date;
    public String doiTg;
    public String quocTich;
    public int luongKW;
    public int donGia;
    public int dinhMuc;
    public double thanhTien;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang");
        maKH = sc.nextLine();
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay ra hoa don");
        date = sc.nextLine();
        System.out.println("Nhap so luong KW tieu thu");
        luongKW = sc.nextInt();
        System.out.println("Nhap don gia ");
        donGia = sc.nextInt();
    }

    public int choice() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ban la khach VN hay nuoc ngoai ");
            System.out.println("1:Viet Nam");
            System.out.println("2:Nuoc Ngoai");
            n = sc.nextInt();
            sc.nextLine();
        } while (n > 3);
        if (n == 1) {
            return 1;
        } else return 2;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        KHang kh = new KHang(maKH, hoTen, date, doiTg, quocTich, luongKW, donGia, dinhMuc, thanhTien());
        nhap();
        if(choice()==1){
            if (luongKW < 50) {
                kh.setDinhMuc(1000);
            } else if (luongKW < 100 && luongKW > 50) {
                kh.setDinhMuc(1200);
            } else {
                kh.setDinhMuc(2000);
            }
            List.add(kh);
        }else{
            System.out.println("Nhap quoc tich");
            quocTich = sc.nextLine();
            kh.setDinhMuc(2000);
            List.add(kh);
        }
                /*
                <50: giá 1000
                50-100: giá 1200
                100-200: giá 1500
                >200: giá 2000
                 */
    }

    public double thanhTien() {
        if (luongKW <= dinhMuc) {
            return luongKW * donGia;
        } else {
            return donGia * dinhMuc + luongKW * donGia;
        }
    }

    public void tongSoLuong() {
        int luongTieuThuVN = 0;
        int luongTieuThuNN = 0;
        for (KHang kh : List) {
            if (kh.quocTich.equals("vietnam")) {
                luongTieuThuVN += kh.luongKW;
            } else {
                luongTieuThuNN += kh.luongKW;
            }
        }
        System.out.println("So luong KW tieu thu cua khach VN " + luongTieuThuVN);
        System.out.println("So luong KW tieu thu cua khach nuoc ngoai " + luongTieuThuNN);
    }

    public void trungBinnh() {
        int tong = 0;
        for (int i = 0; i < List.size(); i++) {
            tong += List.get(i).thanhTien;
        }
        System.out.println("Trung binh thanh tien cua nguoi nuoc ngoai la " + tong / List.size());
    }

    public void xuatTheoDate() {
        for (KHang kh : List) {
            LocalDate ld = LocalDate.parse(kh.date);
            if (ld.getMonthValue() == 1 && ld.getYear() == 2019) {
                System.out.println("Ma khach hang " + kh.maKH);
                System.out.println("Ho ten " + kh.hoTen);
                System.out.println("Ngay ra hoa don " + kh.date);
                System.out.println("Doi tuong khach hang " + kh.doiTg);
                System.out.println("Luong KW tieu thu " + kh.luongKW);
                if (choice() == 1) {
                    System.out.println("Quoc tich Viet Nam ");
                } else {
                    System.out.println("quoc tich " + kh.quocTich);
                }
            }

    /*
    Xây dựng chương trình quản lý danh sách hoá đơn tiền điện của khách hàng. Thông tin bao gồm các loại khách hàng :
+	Khách hàng Việt Nam: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): số lượng
(số KW tiêu thụ), đơn giá, định mức. Thành tiền được tính như sau:
-	Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
-	Ngược lại thì: thành tiền = đơn giá * định mức + số lượng KW vượt định mức * Đơn giá mới
+	Khách hàng nước ngoài: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), quốc tịch, số lượng, đơn giá. Thành tiền được tính = số lượng * đơn giá.
Thực hiện các yêu cầu sau:
+	Nhập xuất danh sách các hóa đơn khách hàng.
+	Tính tổng số lượng cho từng loại khách hàng.
+	Tính trung bình thành tiền của khách hàng người nước ngoài.
+	Xuất ra các hoá đơn trong tháng 01 năm 2019 (cùa cả 2 loại khách hàng).

1 Mảng định mức như sau (Dùng class variable)
Định mức cho người nước ngoài: 2000
         */
        }
    }
}
