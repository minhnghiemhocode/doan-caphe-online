package model;

import java.util.Date;

public class XuatNhap {
    private int id_xn;
    private int id_nl;
    private int soluong;
    private Date ngayxn;

    public XuatNhap() {
    }

    public XuatNhap(int id_xn, int id_nl, int soluong, Date ngayxn) {
        this.id_xn = id_xn;
        this.id_nl = id_nl;
        this.soluong = soluong;
        this.ngayxn = ngayxn;
    }

    public void setId_xn(int id_xn) {
        this.id_xn = id_xn;
    }

    public void setId_nl(int id_nl) {
        this.id_nl = id_nl;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setNgayxn(Date ngayxn) {
        this.ngayxn = ngayxn;
    }

    public int getId_xn() {
        return id_xn;
    }

    public int getId_nl() {
        return id_nl;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getNgayxn() {
        return ngayxn;
    }
}
