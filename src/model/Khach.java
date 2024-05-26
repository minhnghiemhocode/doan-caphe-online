package model;

import java.util.Date;

public class Khach {
    private int id_k;
    private String username;
    private String password;
    private String tenk;
    private String sdt;
    private String gioitinh;
    private String diachi;
    private Date ngaydk;
    private int diem;

    public Khach() {
    }

    public Khach(int id_k, String username, String password, String tenk, String sdt, String gioitinh, String diachi, Date ngaydk, int diem) {
        this.id_k = id_k;
        this.username = username;
        this.password = password;
        this.tenk = tenk;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaydk = ngaydk;
        this.diem = diem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_k() {
        return id_k;
    }

    public void setId_k(int id_k) {
        this.id_k = id_k;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenk() {
        return tenk;
    }

    public void setTenk(String tenk) {
        this.tenk = tenk;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        this.ngaydk = ngaydk;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
}
