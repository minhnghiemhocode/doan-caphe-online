package model;

import java.util.Date;

public class HoaDon {
    private int id_hd;
    private int id_k;
    private Date ngayhd;
    private int id_km;
    private double tienship;
    private double tiengiam;
    private double tientong;
    private int diemsd;

    public HoaDon() {
    }

    public HoaDon(int id_hd, int id_k, Date ngayhd, int id_km, double tienship, double tiengiam, double tientong, int diemsd) {
        this.id_hd = id_hd;
        this.id_k = id_k;
        this.ngayhd = ngayhd;
        this.id_km = id_km;
        this.tienship = tienship;
        this.tiengiam = tiengiam;
        this.tientong = tientong;
        this.diemsd = diemsd;
    }

    public void setId_hd(int id_hd) {
        this.id_hd = id_hd;
    }

    public void setId_k(int id_k) {
        this.id_k = id_k;
    }

    public void setNgayhd(Date ngayhd) {
        this.ngayhd = ngayhd;
    }

    public void setId_km(int id_km) {
        this.id_km = id_km;
    }

    public void setTienship(double tienship) {
        this.tienship = tienship;
    }

    public void setTiengiam(double tiengiam) {
        this.tiengiam = tiengiam;
    }

    public void setTientong(double tientong) {
        this.tientong = tientong;
    }

    public void setDiemsd(int diemsd) {
        this.diemsd = diemsd;
    }

    public int getId_hd() {
        return id_hd;
    }

    public int getId_k() {
        return id_k;
    }

    public Date getNgayhd() {
        return ngayhd;
    }

    public int getId_km() {
        return id_km;
    }

    public double getTienship() {
        return tienship;
    }

    public double getTiengiam() {
        return tiengiam;
    }

    public double getTientong() {
        return tientong;
    }

    public int getDiemsd() {
        return diemsd;
    }
}
