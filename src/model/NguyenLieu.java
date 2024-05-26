package model;

import java.util.Date;

public class NguyenLieu {
    private int id_nl;
    private String tennl;
    private String donvi;
    private int soluong;
    private Date nsx;
    private Date hsd;
    private String nhacungcap;

    public NguyenLieu() {
    }

    public NguyenLieu(int id_nl, String tennl, String donvi, int soluong, Date nsx, Date hsd, String nhacungcap) {
        this.id_nl = id_nl;
        this.tennl = tennl;
        this.donvi = donvi;
        this.soluong = soluong;
        this.nsx = nsx;
        this.hsd = hsd;
        this.nhacungcap = nhacungcap;
    }

    public void setId_nl(int id_nl) {
        this.id_nl = id_nl;
    }

    public void setTennl(String tennl) {
        this.tennl = tennl;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public int getId_nl() {
        return id_nl;
    }

    public String getTennl() {
        return tennl;
    }

    public String getDonvi() {
        return donvi;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getNsx() {
        return nsx;
    }

    public Date getHsd() {
        return hsd;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }
    
    
}
