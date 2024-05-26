package employeeView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import userView.First;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EmpDashboard extends javax.swing.JFrame {
    
    int width = 200; // Biến sử dụng cho thao tác đóng, mở menu
    int height = 600;
    
    // biến giải quyết xung đột đa luồng (không liên quan đến các xử lí dữ liệu)
    private AtomicBoolean running = new AtomicBoolean(true);
    
    public EmpDashboard() {
        initComponents();
        addSVG();
        setTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnSlideMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        closeMenu = new userView.SVGImage();
        mainLogo = new userView.SVGImage();
        lbLogout = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        lbProduct = new javax.swing.JLabel();
        lbVoucher = new javax.swing.JLabel();
        lbStatistics = new javax.swing.JLabel();
        svgHome = new userView.SVGImage();
        svgProduct = new userView.SVGImage();
        svgVoucher = new userView.SVGImage();
        svgUser = new userView.SVGImage();
        svgLogout = new userView.SVGImage();
        lbChat = new javax.swing.JLabel();
        svgKho = new userView.SVGImage();
        lbChat1 = new javax.swing.JLabel();
        svgBill = new userView.SVGImage();
        lbChat2 = new javax.swing.JLabel();
        svgCC = new userView.SVGImage();
        pnContainer = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpProduct = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        emCategory1 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        emEnter1 = new javax.swing.JTextField();
        emSearch1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        emTable1 = new javax.swing.JTable();
        jpVoucher = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        emCategory2 = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        emEnter2 = new javax.swing.JTextField();
        emSearch2 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        emTable2 = new javax.swing.JTable();
        jpUser = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        emCategory3 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        emEnter3 = new javax.swing.JTextField();
        emSearch3 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        emTable7 = new javax.swing.JTable();
        jpKho = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        emCategory4 = new javax.swing.JComboBox<>();
        jLabel96 = new javax.swing.JLabel();
        emEnter4 = new javax.swing.JTextField();
        emSearch4 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        emTable8 = new javax.swing.JTable();
        jLabel110 = new javax.swing.JLabel();
        jpHoaDon = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jpChamCong = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        openMenu = new userView.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(100, 19, 19));
        pnMain.setInheritsPopupMenu(true);
        pnMain.setPreferredSize(new java.awt.Dimension(900, 600));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSlideMenu.setBackground(new java.awt.Color(93, 5, 5));
        pnSlideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(93, 5, 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 200, 160));
        jLabel2.setText("THE COFFEE HOME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        closeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMenuMouseClicked(evt);
            }
        });
        jPanel2.add(closeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 41));

        mainLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLogoMouseClicked(evt);
            }
        });
        jPanel2.add(mainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 95));

        pnSlideMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 190));

        lbLogout.setBackground(new java.awt.Color(255, 255, 255));
        lbLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setText("Đăng xuất");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        lbHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("Trang chủ");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lbProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbProduct.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct.setText("Sản phẩm");
        lbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProductMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbVoucher.setText("Khuyến mãi");
        lbVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVoucherMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lbStatistics.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbStatistics.setForeground(new java.awt.Color(255, 255, 255));
        lbStatistics.setText("Khách");
        lbStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbStatisticsMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        pnSlideMenu.add(svgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));
        pnSlideMenu.add(svgProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 30, 30));
        pnSlideMenu.add(svgVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));
        pnSlideMenu.add(svgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 30, 30));

        lbChat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbChat.setForeground(new java.awt.Color(255, 255, 255));
        lbChat.setText("Kho");
        lbChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChatMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        pnSlideMenu.add(svgKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 30, 30));

        lbChat1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbChat1.setForeground(new java.awt.Color(255, 255, 255));
        lbChat1.setText("Hoá đơn");
        lbChat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChat1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbChat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));
        pnSlideMenu.add(svgBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 30, 30));

        lbChat2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbChat2.setForeground(new java.awt.Color(255, 255, 255));
        lbChat2.setText("Chấm công");
        lbChat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChat2MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbChat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));
        pnSlideMenu.add(svgCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 30, 30));

        pnMain.add(pnSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 600));

        pnContainer.setBackground(new java.awt.Color(204, 255, 255));
        pnContainer.setPreferredSize(new java.awt.Dimension(800, 450));
        pnContainer.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(800, 450));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 231, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(163, 149, 134));
        lbDate.setText("Wednesday, 22-12-2023");
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbTime.setBackground(new java.awt.Color(0, 0, 0));
        lbTime.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbTime.setForeground(new java.awt.Color(100, 19, 19));
        lbTime.setText("11:03:05 PM");
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        jpHome.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 150));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 168, 168));
        jLabel3.setText("Đơn hàng");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 168, 168));
        jLabel5.setText("999");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jpHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, 150));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 168, 168));
        jLabel4.setText("Doanh thu");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 168, 168));
        jLabel6.setText("22,520,950");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jpHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 150));

        pnContainer.add(jpHome, "card4");

        jpProduct.setBackground(new java.awt.Color(242, 231, 220));
        jpProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(100, 19, 19));
        jLabel76.setText("QUẢN LÝ SẢN PHẨM");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Tìm kiếm theo");

        emCategory1.setBackground(new java.awt.Color(255, 255, 255));
        emCategory1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory1.setForeground(new java.awt.Color(0, 0, 0));
        emCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Loại", "Tên", "Giá", "Tình trạng" }));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Nhập thông tin");

        emEnter1.setBackground(new java.awt.Color(255, 255, 255));
        emEnter1.setForeground(new java.awt.Color(0, 0, 0));

        emSearch1.setBackground(new java.awt.Color(0, 0, 0));
        emSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch1.setForeground(new java.awt.Color(255, 255, 255));
        emSearch1.setText("Tìm");
        emSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch1ActionPerformed(evt);
            }
        });

        emTable1.setBackground(new java.awt.Color(255, 255, 255));
        emTable1.setForeground(new java.awt.Color(0, 0, 0));
        emTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Loại", "Tên", "Giá", "Tình trạng", "Mô tả", "Hình ảnh"
            }
        ));
        emTable1.setGridColor(new java.awt.Color(100, 19, 19));
        emTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(emTable1);

        javax.swing.GroupLayout jpProductLayout = new javax.swing.GroupLayout(jpProduct);
        jpProduct.setLayout(jpProductLayout);
        jpProductLayout.setHorizontalGroup(
            jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(51, 51, 51)
                        .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(emCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(emEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpProductLayout.setVerticalGroup(
            jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel77)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel78)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContainer.add(jpProduct, "card2");

        jpVoucher.setBackground(new java.awt.Color(242, 231, 220));
        jpVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(100, 19, 19));
        jLabel104.setText("QUẢN LÝ KHUYẾN MÃI");

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Tìm kiếm theo");

        emCategory2.setBackground(new java.awt.Color(255, 255, 255));
        emCategory2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory2.setForeground(new java.awt.Color(0, 0, 0));
        emCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại KM", "% KM", "Ngày bắt đầu", "Ngày kết thúc" }));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 0));
        jLabel106.setText("Nhập thông tin");

        emEnter2.setBackground(new java.awt.Color(255, 255, 255));
        emEnter2.setForeground(new java.awt.Color(0, 0, 0));

        emSearch2.setBackground(new java.awt.Color(0, 0, 0));
        emSearch2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch2.setForeground(new java.awt.Color(255, 255, 255));
        emSearch2.setText("Tìm");
        emSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch2ActionPerformed(evt);
            }
        });

        emTable2.setBackground(new java.awt.Color(255, 255, 255));
        emTable2.setForeground(new java.awt.Color(0, 0, 0));
        emTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Loại KM", "Điều kiện", "% KM", "Số lượng KM", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ));
        emTable2.setGridColor(new java.awt.Color(100, 19, 19));
        emTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setViewportView(emTable2);

        javax.swing.GroupLayout jpVoucherLayout = new javax.swing.GroupLayout(jpVoucher);
        jpVoucher.setLayout(jpVoucherLayout);
        jpVoucherLayout.setHorizontalGroup(
            jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane13)
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addGap(59, 59, 59)
                        .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(emCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106)
                            .addComponent(emEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jpVoucherLayout.setVerticalGroup(
            jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVoucherLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel105)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel106)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContainer.add(jpVoucher, "card2");

        jpUser.setBackground(new java.awt.Color(242, 231, 220));
        jpUser.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(100, 19, 19));
        jLabel60.setText("DANH SÁCH KHÁCH");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Tìm kiếm theo");

        emCategory3.setBackground(new java.awt.Color(255, 255, 255));
        emCategory3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory3.setForeground(new java.awt.Color(0, 0, 0));
        emCategory3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Số điện thoại", "Giới tính", "Địa chỉ", "Ngày đăng ký", "Điểm" }));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Nhập thông tin");

        emEnter3.setBackground(new java.awt.Color(255, 255, 255));
        emEnter3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emEnter3.setForeground(new java.awt.Color(0, 0, 0));

        emSearch3.setBackground(new java.awt.Color(0, 0, 0));
        emSearch3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch3.setForeground(new java.awt.Color(255, 255, 255));
        emSearch3.setText("Tìm");
        emSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch3ActionPerformed(evt);
            }
        });

        emTable7.setBackground(new java.awt.Color(255, 255, 255));
        emTable7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emTable7.setForeground(new java.awt.Color(0, 0, 0));
        emTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Số điện thoại", "Giới tính", "Địa chỉ", "Ngày đăng ký", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emTable7.setGridColor(new java.awt.Color(100, 19, 19));
        emTable7.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane22.setViewportView(emTable7);

        javax.swing.GroupLayout jpUserLayout = new javax.swing.GroupLayout(jpUser);
        jpUser.setLayout(jpUserLayout);
        jpUserLayout.setHorizontalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUserLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(67, 67, 67)
                        .addGroup(jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(emCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(emEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpUserLayout.setVerticalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpUserLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel83)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUserLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel86)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUserLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContainer.add(jpUser, "card2");

        jpKho.setBackground(new java.awt.Color(242, 231, 220));
        jpKho.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(100, 19, 19));
        jLabel89.setText("QUẢN LÝ KHO");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Kho lưu trữ nguyên liệu");

        emCategory4.setBackground(new java.awt.Color(255, 255, 255));
        emCategory4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory4.setForeground(new java.awt.Color(0, 0, 0));
        emCategory4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên NL", "Đơn vị", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp" }));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("Nhập thông tin");

        emEnter4.setBackground(new java.awt.Color(255, 255, 255));
        emEnter4.setForeground(new java.awt.Color(0, 0, 0));

        emSearch4.setBackground(new java.awt.Color(0, 0, 0));
        emSearch4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch4.setForeground(new java.awt.Color(255, 255, 255));
        emSearch4.setText("Tìm");
        emSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch4ActionPerformed(evt);
            }
        });

        emTable8.setBackground(new java.awt.Color(255, 255, 255));
        emTable8.setForeground(new java.awt.Color(0, 0, 0));
        emTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên NL", "Đơn vị", "Số lượng", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp"
            }
        ));
        emTable8.setGridColor(new java.awt.Color(100, 19, 19));
        emTable8.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(emTable8);

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 0));
        jLabel110.setText("Tìm kiếm theo");

        javax.swing.GroupLayout jpKhoLayout = new javax.swing.GroupLayout(jpKho);
        jpKho.setLayout(jpKhoLayout);
        jpKhoLayout.setHorizontalGroup(
            jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(jLabel95))
                        .addGap(57, 57, 57)
                        .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(emCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96)
                            .addComponent(emEnter4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpKhoLayout.setVerticalGroup(
            jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKhoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel95))
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel110)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel96)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContainer.add(jpKho, "card2");

        jpHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        jpHoaDon.setPreferredSize(new java.awt.Dimension(900, 533));
        jpHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel148.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(100, 19, 19));
        jLabel148.setText("LỊCH SỬ HOÁ ĐƠN");
        jpHoaDon.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        pnContainer.add(jpHoaDon, "card2");

        jpChamCong.setBackground(new java.awt.Color(255, 255, 255));
        jpChamCong.setPreferredSize(new java.awt.Dimension(900, 533));
        jpChamCong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel149.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(100, 19, 19));
        jLabel149.setText("CHẤM CÔNG");
        jpChamCong.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        pnContainer.add(jpChamCong, "card2");

        pnMain.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 900, 531));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 200, 160));
        jLabel8.setText("THE COFFEE HOME");
        pnMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        openMenu.setText(" ");
        openMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuMouseClicked(evt);
            }
        });
        pnMain.add(openMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addSVG() // Thêm file svg vào giao diện
    {
        openMenu.setSVGImage("image_svg/menu.svg", 30, 30);
        closeMenu.setSVGImage("image_svg/closemenu.svg", 30, 30);
        mainLogo.setSVGImage("image_svg/mainlogo.svg", 90, 90);
        svgHome.setSVGImage("image_svg/home.svg", 30, 30);
        svgProduct.setSVGImage("image_svg/product.svg", 30, 30);
        svgVoucher.setSVGImage("image_svg/voucher.svg", 30, 30);
        svgUser.setSVGImage("image_svg/account.svg", 30, 30);
        svgKho.setSVGImage("image_svg/kho.svg", 30, 30);
        svgBill.setSVGImage("image_svg/bill.svg", 30, 30);
        svgCC.setSVGImage("image_svg/cc.svg", 30, 30);
        svgLogout.setSVGImage("image_svg/logout.svg", 30, 30);
    }
    
    
    // THIẾT KẾ GIAO DIỆN 
    
    // Method setTime
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (running.get()) {
                        Date date = new Date();
                        SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                        String time = tf.format(date);

                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                lbTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                                lbDate.setText(df.format(date));
                            }
                        });

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }).start();
    }

    // Method open MenuBar
    public void openMenuBar() {
        running.set(false);
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    final int currentWidth = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnSlideMenu.setSize(currentWidth, height);
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    // Method close MenuBar
    public void closeMenuBar() {
        running.set(true);
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    final int currentWidth = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            pnSlideMenu.setSize(currentWidth, height);
                        }
                    });
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmpDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?","Đăng xuất",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProductMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(true);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbProductMouseClicked

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        closeMenuBar();
        jpHome.setVisible(true);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbHomeMouseClicked

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_openMenuMouseClicked

    private void closeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuMouseClicked

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked

    }//GEN-LAST:event_mainLogoMouseClicked

    private void lbVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVoucherMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(true);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbVoucherMouseClicked

    private void emSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch1ActionPerformed

    }//GEN-LAST:event_emSearch1ActionPerformed

    private void emSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch2ActionPerformed

    }//GEN-LAST:event_emSearch2ActionPerformed

    private void emSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch3ActionPerformed

    }//GEN-LAST:event_emSearch3ActionPerformed

    private void emSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch4ActionPerformed

    }//GEN-LAST:event_emSearch4ActionPerformed

    private void lbStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbStatisticsMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(true);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbStatisticsMouseClicked

    private void lbChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChatMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(true);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbChatMouseClicked

    private void lbChat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChat1MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(true);
        jpChamCong.setVisible(false);
    }//GEN-LAST:event_lbChat1MouseClicked

    private void lbChat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChat2MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpChamCong.setVisible(true);
    }//GEN-LAST:event_lbChat2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private userView.SVGImage closeMenu;
    private javax.swing.JComboBox<String> emCategory1;
    private javax.swing.JComboBox<String> emCategory2;
    private javax.swing.JComboBox<String> emCategory3;
    private javax.swing.JComboBox<String> emCategory4;
    private javax.swing.JTextField emEnter1;
    private javax.swing.JTextField emEnter2;
    private javax.swing.JTextField emEnter3;
    private javax.swing.JTextField emEnter4;
    private javax.swing.JButton emSearch1;
    private javax.swing.JButton emSearch2;
    private javax.swing.JButton emSearch3;
    private javax.swing.JButton emSearch4;
    private javax.swing.JTable emTable1;
    private javax.swing.JTable emTable2;
    private javax.swing.JTable emTable7;
    private javax.swing.JTable emTable8;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JPanel jpChamCong;
    private javax.swing.JPanel jpHoaDon;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpKho;
    private javax.swing.JPanel jpProduct;
    private javax.swing.JPanel jpUser;
    private javax.swing.JPanel jpVoucher;
    private javax.swing.JLabel lbChat;
    private javax.swing.JLabel lbChat1;
    private javax.swing.JLabel lbChat2;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbStatistics;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbVoucher;
    private userView.SVGImage mainLogo;
    private userView.SVGImage openMenu;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSlideMenu;
    private userView.SVGImage svgBill;
    private userView.SVGImage svgCC;
    private userView.SVGImage svgHome;
    private userView.SVGImage svgKho;
    private userView.SVGImage svgLogout;
    private userView.SVGImage svgProduct;
    private userView.SVGImage svgUser;
    private userView.SVGImage svgVoucher;
    // End of variables declaration//GEN-END:variables
}
