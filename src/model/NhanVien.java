package model;

import java.util.Date;

public class NhanVien {
    private int id_nv;
    private String username;
    private String password;
    private String tennv;
    private String sdt;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private double luongcoban;
    private Date ngayvl;
    private String vaitro;

    public NhanVien() {
    }

    public NhanVien(int id_nv, String username, String password, String tennv, String sdt, String gioitinh, Date ngaysinh, String diachi, double luongcoban, Date ngayvl, String vaitro) {
        this.id_nv = id_nv;
        this.username = username;
        this.password = password;
        this.tennv = tennv;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.luongcoban = luongcoban;
        this.ngayvl = ngayvl;
        this.vaitro = vaitro;
    }

    public void setId_nv(int id_nv) {
        this.id_nv = id_nv;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public void setNgayvl(Date ngayvl) {
        this.ngayvl = ngayvl;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public int getId_nv() {
        return id_nv;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTennv() {
        return tennv;
    }

    public String getSdt() {
        return sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public Date getNgayvl() {
        return ngayvl;
    }

    public String getVaitro() {
        return vaitro;
    }
    
    
}
