package dao;

import connection.JDBCUtil;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Khach;

public class UserDao {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public UserDao() {
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Set ID cho database 
    public int getMaxRow() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(id_k) from Khach");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    // Kiểm tra username đã tồn tại hay chưa
    public boolean isUsernameExist(String username) {
        try {
            ps = con.prepareStatement("select * from Khach where username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Kiểm tra phone number đã tồn tại hay chưa
    public boolean isPhoneExist(String phone) {
        try {
            ps = con.prepareStatement("select * from Khach where sdt = ?");
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Thêm dữ liệu người đăng ký vào tabel Khach
    public void insert(int id, String username, String password, String ten, String sdt, Date ngaydk, int diem) {
        String sql = "insert into Khach (id_k, username, password, tenk, sdt, ngaydk, diem) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, ten);
            ps.setString(5, sdt);
            ps.setDate(6, ngaydk);
            ps.setInt(7, diem);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Đăng ký tài khoản thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Lấy dữ liệu từ Khach
    public Khach getUserData(String username) {
        try {
            ps = con.prepareStatement("select * from Khach where username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                Khach k = new Khach();
                k.setId_k(rs.getInt("id_k"));
                k.setUsername(rs.getString("username"));
                k.setPassword(rs.getString("password"));
                k.setTenk(rs.getString("tenk"));
                k.setSdt(rs.getString("sdt"));
                k.setGioitinh(rs.getString("gioitinh"));
                k.setDiachi(rs.getString("diachi"));
                k.setNgaydk(rs.getDate("ngaydk"));
                k.setDiem(rs.getInt("diem"));
                return k;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // Cập nhật tài khoản
    public void updateAccount(int id, String username, String password, String ten, String sdt, String gioitinh, String diachi) {
        String sql = "update Khach set username = ?, password = ?, tenk = ?, sdt = ?, gioitinh = ?, diachi = ? where id_k = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, ten);
            ps.setString(4, sdt);
            ps.setString(5, gioitinh);
            ps.setString(6, diachi);
            ps.setInt(7, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Xoá tài khoản
    public boolean deleteAccount(int id) {
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xoá tài khoản không?", "Xoá tài khoản", JOptionPane.OK_CANCEL_OPTION, 0);
        if (x == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from Khach where id_k = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Xoá tài khoản thành công.");
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
