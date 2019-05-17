package assignment8;

public class KHang {

    public String maKH;
    public String hoTen;
    public String date;
    public String doiTg;
    public String quocTich;
    public int luongKW;
    public int donGia;
    public int dinhMuc;
    public double thanhTien;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoiTg() {
        return doiTg;
    }

    public void setDoiTg(String doiTg) {
        this.doiTg = doiTg;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getLuongKW() {
        return luongKW;
    }

    public void setLuongKW(int luongKW) {
        this.luongKW = luongKW;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public KHang(String maKH, String hoTen, String date, String doiTg, String quocTich, int luongKW, int donGia, int dinhMuc,double thanhTien) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.date = date;
        this.doiTg = doiTg;
        this.quocTich = quocTich;
        this.luongKW = luongKW;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public KHang() {
    }

}
