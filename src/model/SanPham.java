package model;

public class SanPham {
    private int id_sp;
    private String loaisp;
    private String tensp;
    private double gia;
    private String tinhtrang;
    private String mota;

    public SanPham() {
    }

    public SanPham(int id_sp, String loaisp, String tensp, int gia, String tinhtrang, String mota) {
        this.id_sp = id_sp;
        this.loaisp = loaisp;
        this.tensp = tensp;
        this.gia = gia;
        this.tinhtrang = tinhtrang;
        this.mota = mota;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getId_sp() {
        return id_sp;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public String getTensp() {
        return tensp;
    }

    public double getGia() {
        return gia;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public String getMota() {
        return mota;
    }
    
}
