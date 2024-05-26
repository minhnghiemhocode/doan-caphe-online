package userView;

import dao.ForgotPasswordDao;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {
    ForgotPasswordDao fp = new ForgotPasswordDao();
    
    public ForgotPassword() {
        initComponents();
        svgFind.setSVGImage("image_svg/find.svg", 40, 40);
        FPassword.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        FBackLogin = new javax.swing.JLabel();
        FUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FPassword = new javax.swing.JPasswordField();
        FSave = new javax.swing.JButton();
        svgFind = new userView.SVGImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 19, 19));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBackLogin.setForeground(new java.awt.Color(100, 19, 19));
        FBackLogin.setText("Đăng nhập");
        FBackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FBackLoginMouseClicked(evt);
            }
        });
        jPanel2.add(FBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        FUsername.setBackground(new java.awt.Color(255, 255, 255));
        FUsername.setForeground(new java.awt.Color(0, 0, 0));
        FUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(FUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 40));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tên đăng nhập:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mật khẩu mới:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, 20));

        FPassword.setBackground(new java.awt.Color(255, 255, 255));
        FPassword.setForeground(new java.awt.Color(0, 0, 0));
        FPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(FPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 240, 40));

        FSave.setBackground(new java.awt.Color(100, 19, 19));
        FSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FSave.setForeground(new java.awt.Color(255, 255, 255));
        FSave.setText("Lưu");
        FSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSaveActionPerformed(evt);
            }
        });
        jPanel2.add(FSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 240, 40));

        svgFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgFindMouseClicked(evt);
            }
        });
        jPanel2.add(svgFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 450, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUÊN MẬT KHẨU?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean isEmpty(){
        if (String.valueOf(FPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống", "Thông báo", 2);
            return false;
        }
        return true;
    }
    
    private boolean isUsername(){
        if (String.valueOf(FUsername.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được để trống", "Thông báo", 2);
            return false;
        }
        return true;
    }
    
    private void FBackLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FBackLoginMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FBackLoginMouseClicked

    private void FUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FUsernameActionPerformed
      
    }//GEN-LAST:event_FUsernameActionPerformed

    private void FPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPasswordActionPerformed
       
    }//GEN-LAST:event_FPasswordActionPerformed

    private void svgFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgFindMouseClicked
        if(isUsername()){
            if(fp.isUsernameExist(FUsername.getText())){
                JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng " + FUsername.getText(), "Thông báo", 1);
                FPassword.setEditable(true);
            }
        }
    }//GEN-LAST:event_svgFindMouseClicked

    private void FSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSaveActionPerformed
        if(isEmpty()){
            String username = FUsername.getText();
            String password = String.valueOf(FPassword.getPassword());
            fp.setPassword(username, password);
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_FSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FBackLogin;
    private javax.swing.JPasswordField FPassword;
    private javax.swing.JButton FSave;
    private javax.swing.JTextField FUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private userView.SVGImage svgFind;
    // End of variables declaration//GEN-END:variables
}
