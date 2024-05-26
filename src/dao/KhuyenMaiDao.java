package dao;

import connection.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Khach;
import model.KhuyenMai;

public class KhuyenMaiDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public KhuyenMaiDao() {
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Lấy tất cả dữ liệu từ bảng KhuyenMai
    public ArrayList<KhuyenMai> getVoucherData() {
        ArrayList<KhuyenMai> khuyenmaiList = new ArrayList<>();
        try {
            ps = con.prepareStatement("select * from KhuyenMai");
            rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setId_km(rs.getInt("id_km"));
                km.setLoaikm(rs.getString("loaikm"));
                km.setDieukien(rs.getDouble("dieukien"));
                km.setGiamgia(rs.getDouble("giamgia"));
                km.setSoluong(rs.getInt("soluong"));
                km.setNgaybd(rs.getDate("ngaybd"));
                km.setNgaykt(rs.getDate("ngaykt"));
                khuyenmaiList.add(km);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return khuyenmaiList;
    }
    
    // Lấy dữ liệu dựa trên id_km
    public KhuyenMai getVoucherDataBaseOnID(int makm) {
        KhuyenMai km = new KhuyenMai();
        try {
            ps = con.prepareStatement("select * from KhuyenMai where id_km = ?");
            ps.setInt(1, makm);
            rs = ps.executeQuery();
            while (rs.next()) {
                km.setLoaikm(rs.getString("loaikm"));
                km.setDieukien(rs.getDouble("dieukien"));
                km.setGiamgia(rs.getDouble("giamgia"));
                km.setNgaybd(rs.getDate("ngaybd"));
                km.setNgaykt(rs.getDate("ngaykt"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return km;
    }
}
