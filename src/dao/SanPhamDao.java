package dao;

import connection.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.SanPham;

public class SanPhamDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public SanPhamDao() {
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Lấy tất cả dữ liệu từ bảng SanPham
    public ArrayList<SanPham> getProductData() {
        ArrayList<SanPham> sanphamList = new ArrayList<>();
        try {
            ps = con.prepareStatement("select * from SanPham");
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId_sp(rs.getInt("id_sp"));
                sp.setLoaisp(rs.getString("loaisp"));
                sp.setTensp(rs.getString("tensp"));
                sp.setGia(rs.getDouble("gia"));
                sp.setTinhtrang(rs.getString("tinhtrang"));
                sp.setMota(rs.getString("mota"));
                sanphamList.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sanphamList;
    }
    
    // Tìm sản phẩm theo phân loại 
    public ArrayList<SanPham> searchProductData(String field, String thongtin) {
        ArrayList<SanPham> sanphamList = new ArrayList<>();
        try {
            ps = con.prepareStatement("select * from SanPham where " + field + " like ?");
            ps.setString(1, "%" + thongtin + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId_sp(rs.getInt("id_sp"));
                sp.setLoaisp(rs.getString("loaisp"));
                sp.setTensp(rs.getString("tensp"));
                sp.setGia(rs.getDouble("gia"));
                sp.setTinhtrang(rs.getString("tinhtrang"));
                sp.setMota(rs.getString("mota"));
                sanphamList.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sanphamList;
    }
}
