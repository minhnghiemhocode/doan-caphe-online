package model;

import java.util.Date;


public class KhuyenMai {
    private int id_km;
    private String loaikm;
    private double dieukien;
    private double giamgia;
    private int soluong;
    private Date ngaybd;
    private Date ngaykt;

    public KhuyenMai() {
    }

    public KhuyenMai(int id_km, String loaikm, double dieukien, double giamgia, int soluong, Date ngaybd, Date ngaykt) {
        this.id_km = id_km;
        this.loaikm = loaikm;
        this.dieukien = dieukien;
        this.giamgia = giamgia;
        this.soluong = soluong;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
    }

    public void setId_km(int id_km) {
        this.id_km = id_km;
    }

    public void setLoaikm(String loaikm) {
        this.loaikm = loaikm;
    }

    public void setDieukien(double dieukien) {
        this.dieukien = dieukien;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setNgaybd(Date ngaybd) {
        this.ngaybd = ngaybd;
    }

    public void setNgaykt(Date ngaykt) {
        this.ngaykt = ngaykt;
    }

    public int getId_km() {
        return id_km;
    }

    public String getLoaikm() {
        return loaikm;
    }

    public double getDieukien() {
        return dieukien;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getNgaybd() {
        return ngaybd;
    }

    public Date getNgaykt() {
        return ngaykt;
    }    
    
}
