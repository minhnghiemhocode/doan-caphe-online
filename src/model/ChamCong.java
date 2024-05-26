package model;

import java.util.Date;

public class ChamCong {
    private int id_cc;
    private int id_nv;
    private Date giobd;
    private Date giokt;
    private int giovang;
    private int giotangca;

    public ChamCong() {
    }

    public ChamCong(int id_cc, int id_nv, Date giobd, Date giokt, int giovang, int giotangca) {
        this.id_cc = id_cc;
        this.id_nv = id_nv;
        this.giobd = giobd;
        this.giokt = giokt;
        this.giovang = giovang;
        this.giotangca = giotangca;
    }

    public void setId_cc(int id_cc) {
        this.id_cc = id_cc;
    }

    public void setId_nv(int id_nv) {
        this.id_nv = id_nv;
    }

    public void setGiobd(Date giobd) {
        this.giobd = giobd;
    }

    public void setGiokt(Date giokt) {
        this.giokt = giokt;
    }

    public void setGiovang(int giovang) {
        this.giovang = giovang;
    }

    public void setGiotangca(int giotangca) {
        this.giotangca = giotangca;
    }

    public int getId_cc() {
        return id_cc;
    }

    public int getId_nv() {
        return id_nv;
    }

    public Date getGiobd() {
        return giobd;
    }

    public Date getGiokt() {
        return giokt;
    }

    public int getGiovang() {
        return giovang;
    }

    public int getGiotangca() {
        return giotangca;
    }
}
