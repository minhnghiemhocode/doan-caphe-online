package dao;

import connection.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ForgotPasswordDao {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public ForgotPasswordDao(){
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     // Kiểm tra username đã tồn tại hay chưa
    public boolean isUsernameExist(String username){
        try {
            ps = con.prepareStatement("SELECT * FROM Khach WHERE username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Username không tồn tại");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Thay đổi mật khẩu
    public void setPassword(String username, String password){
        String sql = "UPDATE Khach SET username = ? WHERE password = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, username);
            if (ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Cập nhật mật khẩu thành công");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPasswordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
