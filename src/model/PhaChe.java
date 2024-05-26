package model;

public class PhaChe {
    private int id_sp;
    private int id_nl;
    private int soluong;

    public PhaChe() {
    }

    public PhaChe(int id_sp, int id_nl, int soluong) {
        this.id_sp = id_sp;
        this.id_nl = id_nl;
        this.soluong = soluong;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public void setId_nl(int id_nl) {
        this.id_nl = id_nl;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getId_sp() {
        return id_sp;
    }

    public int getId_nl() {
        return id_nl;
    }

    public int getSoluong() {
        return soluong;
    }
}
