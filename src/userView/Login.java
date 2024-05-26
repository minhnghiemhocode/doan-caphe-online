package userView;

import adminView.AdminDashboard;
import connection.JDBCUtil;
import employeeView.EmpDashboard;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Khach;

public class Login extends javax.swing.JFrame {
    private ButtonGroup bg = new ButtonGroup();
    
    public Login() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Adminbt = new javax.swing.JRadioButton();
        Employeebt = new javax.swing.JRadioButton();
        logPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logForgot = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        Userbt = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(100, 19, 19));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logUsername.setBackground(new java.awt.Color(255, 255, 255));
        logUsername.setForeground(new java.awt.Color(0, 0, 0));
        logUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(logUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 40));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bạn chưa có tài khoản?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 50));

        Adminbt.setBackground(new java.awt.Color(255, 255, 255));
        Adminbt.setForeground(new java.awt.Color(0, 0, 0));
        Adminbt.setText("Admin");
        Adminbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adminbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminbtActionPerformed(evt);
            }
        });
        jPanel2.add(Adminbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, -1));

        Employeebt.setBackground(new java.awt.Color(255, 255, 255));
        Employeebt.setForeground(new java.awt.Color(0, 0, 0));
        Employeebt.setText("Nhân viên");
        Employeebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employeebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeebtActionPerformed(evt);
            }
        });
        jPanel2.add(Employeebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 80, 20));

        logPassword.setBackground(new java.awt.Color(255, 255, 255));
        logPassword.setForeground(new java.awt.Color(0, 0, 0));
        logPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(logPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 240, 40));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mật khẩu:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tên đăng nhập:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        logForgot.setForeground(new java.awt.Color(204, 0, 0));
        logForgot.setText("Quên mật khẩu?");
        logForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logForgotMouseClicked(evt);
            }
        });
        jPanel2.add(logForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 20));

        btnLogin.setBackground(new java.awt.Color(100, 19, 19));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, 40));

        btnSignup.setBackground(new java.awt.Color(255, 255, 255));
        btnSignup.setForeground(new java.awt.Color(100, 19, 19));
        btnSignup.setText("Đăng ký");
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 80, 30));

        Userbt.setBackground(new java.awt.Color(255, 255, 255));
        Userbt.setForeground(new java.awt.Color(0, 0, 0));
        Userbt.setText("Khách");
        Userbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Userbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserbtActionPerformed(evt);
            }
        });
        jPanel2.add(Userbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 440, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 200, 160));
        jLabel1.setText("LOGIN TO SEE MORE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init(){
        bg.add(Adminbt);
        bg.add(Employeebt);
        bg.add(Userbt);
        Adminbt.setSelected(true);
    }   
    
    // Hàm để đảm bảo ô username và ô password không bị rỗng
    private boolean isEmpty()
    {
        if (logUsername.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
            return false;
        }
        if (String.valueOf(logPassword.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }
        return true;
    }
    
    private void logUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUsernameActionPerformed

    }//GEN-LAST:event_logUsernameActionPerformed

    private void AdminbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminbtActionPerformed
        
    }//GEN-LAST:event_AdminbtActionPerformed

    // Hàm mở cửa sổ login dẹp hơn
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1.0; i += 0.1){
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try{
                Thread.sleep(40);
            }catch (InterruptedException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void logPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logPasswordActionPerformed
     
    }//GEN-LAST:event_logPasswordActionPerformed

    private void EmployeebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeebtActionPerformed
        
    }//GEN-LAST:event_EmployeebtActionPerformed

    // Link tới ForgotPassword Frame
    private void logForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logForgotMouseClicked
        new ForgotPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logForgotMouseClicked

    // Đăng nhập
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (isEmpty())
        {
            String username = logUsername.getText();
            String password = String.valueOf(logPassword.getPassword());
            if(Adminbt.isSelected()){
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from NhanVien where vaitro = 'admin' and username = ? and password = ?");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
//                    
                    if (rs.next()){
                        AdminDashboard ad = new AdminDashboard();
                        ad.setVisible(true);
                        ad.pack();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Đăng nhập thất bại", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }  
            } else if (Employeebt.isSelected()){
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from NhanVien where vaitro = 'nhanvien' and username = ? and password = ?");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    
                    if (rs.next()){
                        EmpDashboard ed = new EmpDashboard();
                        ed.setVisible(true);
                        ed.pack();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Đăng nhập thất bại", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement ps;
                    ps = con.prepareStatement("select * from Khach where username = ? and password = ?");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    
                    if (rs.next()){
                        UserDashboard.khach.setUsername(username);
                        new UserDashboard().setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu", "Đăng nhập thất bại", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
     
    }//GEN-LAST:event_btnLoginMouseClicked

    // Link tới Signup Frame
    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        new Signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignupMouseClicked

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        Signup SignUpFrame = new Signup();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void UserbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserbtActionPerformed
       
    }//GEN-LAST:event_UserbtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Adminbt;
    private javax.swing.JRadioButton Employeebt;
    private javax.swing.JRadioButton Userbt;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logForgot;
    private javax.swing.JPasswordField logPassword;
    private javax.swing.JTextField logUsername;
    // End of variables declaration//GEN-END:variables
}
