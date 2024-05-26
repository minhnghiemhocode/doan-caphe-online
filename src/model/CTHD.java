package model;

public class CTHD {
    private int id_hd;
    private int id_sp;
    private int soluong;
    private double thanhtien;

    public CTHD() {
    }

    public CTHD(int id_hd, int id_sp, int soluong, double thanhtien) {
        this.id_hd = id_hd;
        this.id_sp = id_sp;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public void setId_hd(int id_hd) {
        this.id_hd = id_hd;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getId_hd() {
        return id_hd;
    }

    public int getId_sp() {
        return id_sp;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }
}
