package adminView;

import com.raven.datechooser.DateChooser;
import employeeView.EmpDashboard;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import userView.First;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class AdminDashboard extends javax.swing.JFrame {

    int width = 200; // Biến sử dụng cho thao tác đóng, mở menu
    int height = 600;
    
    private ArrayList<DateChooser> dateList = new ArrayList<>();
    private ArrayList<JTextField> textList = new ArrayList<>();
    
    // biến giải quyết xung đột đa luồng (không liên quan đến các xử lí dữ liệu)
    private AtomicBoolean running = new AtomicBoolean(true);

    public AdminDashboard() {
        initComponents();
        init();
        createDate();
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
        lbEmployee = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        lbVoucher = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        svgEmp = new userView.SVGImage();
        svgPro = new userView.SVGImage();
        svgVou = new userView.SVGImage();
        svgUser = new userView.SVGImage();
        svgLogout = new userView.SVGImage();
        lbUser1 = new javax.swing.JLabel();
        lbUser2 = new javax.swing.JLabel();
        svgPro1 = new userView.SVGImage();
        svgManage1 = new userView.SVGImage();
        svgBill = new userView.SVGImage();
        svgKho = new userView.SVGImage();
        lbUser3 = new javax.swing.JLabel();
        svgSta = new userView.SVGImage();
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
        jpEmployee = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        emCategory = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        emEnter = new javax.swing.JTextField();
        emSearch = new javax.swing.JButton();
        emAddbt = new javax.swing.JButton();
        emDeletebt = new javax.swing.JButton();
        emUpdatebt = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        emTable = new javax.swing.JTable();
        jpAddEmployee = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        eaID = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        eaName = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        eaPhone = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        eaNgaysinh = new javax.swing.JTextField();
        eaSalary = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        eaUsername = new javax.swing.JTextField();
        eaPassword = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        eaAddbt = new javax.swing.JButton();
        eaBackbt = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        eeSex = new javax.swing.JComboBox<>();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        eaDiachi1 = new javax.swing.JTextField();
        jpDeleteEmployee = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        edCategory = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        edEnter = new javax.swing.JTextField();
        edSearch = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        edTable = new javax.swing.JTable();
        edDeletebt = new javax.swing.JButton();
        edBackbt = new javax.swing.JButton();
        jpUpdateEmployee = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        euEnter = new javax.swing.JTextField();
        euSearch = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        euID = new javax.swing.JTextField();
        euName = new javax.swing.JTextField();
        euPhone = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        euSalary = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        euSavebt = new javax.swing.JButton();
        euBackbt = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        edTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        euNgaysinh = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        euDiachi1 = new javax.swing.JTextField();
        jpProduct = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        emCategory1 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        emEnter1 = new javax.swing.JTextField();
        emSearch1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        emTable1 = new javax.swing.JTable();
        emAddbt1 = new javax.swing.JButton();
        emDeletebt1 = new javax.swing.JButton();
        emUpdatebt1 = new javax.swing.JButton();
        jpAddProduct = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        eaID1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        eaName1 = new javax.swing.JTextField();
        eaPhone1 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        eaWorkDate1 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        eaUsername1 = new javax.swing.JTextField();
        eaPassword1 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        eaAddbt1 = new javax.swing.JButton();
        eaBackbt1 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jpDeleteProduct = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        edCategory1 = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        edEnter1 = new javax.swing.JTextField();
        edSearch1 = new javax.swing.JButton();
        edDeletebt1 = new javax.swing.JButton();
        edBackbt1 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        emTable3 = new javax.swing.JTable();
        jpUpdateProduct = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        euID1 = new javax.swing.JTextField();
        euName1 = new javax.swing.JTextField();
        euSex1 = new javax.swing.JTextField();
        euPhone1 = new javax.swing.JTextField();
        euWorkDate1 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        euSalary1 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        euSavebt1 = new javax.swing.JButton();
        euBackbt1 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        emTable4 = new javax.swing.JTable();
        edCategory3 = new javax.swing.JComboBox<>();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        edEnter3 = new javax.swing.JTextField();
        edSearch3 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jpVoucher = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        emCategory2 = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        emEnter2 = new javax.swing.JTextField();
        emSearch2 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        emTable2 = new javax.swing.JTable();
        emAddbt2 = new javax.swing.JButton();
        emDeletebt2 = new javax.swing.JButton();
        emUpdatebt2 = new javax.swing.JButton();
        jpAddVoucher = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        eaID2 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        eaName2 = new javax.swing.JTextField();
        eaPhone2 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        vaNgaykt = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        eaUsername2 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        eaAddbt2 = new javax.swing.JButton();
        eaBackbt2 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        eaWorkDate4 = new javax.swing.JTextField();
        vaNgaybd = new javax.swing.JTextField();
        jpDeleteVoucher = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        edCategory2 = new javax.swing.JComboBox<>();
        jLabel120 = new javax.swing.JLabel();
        edEnter2 = new javax.swing.JTextField();
        edSearch2 = new javax.swing.JButton();
        edDeletebt2 = new javax.swing.JButton();
        edBackbt2 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        emTable5 = new javax.swing.JTable();
        jpUpdateVoucher = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        euID2 = new javax.swing.JTextField();
        euName2 = new javax.swing.JTextField();
        euSex2 = new javax.swing.JTextField();
        euPhone2 = new javax.swing.JTextField();
        vuNgaykt = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        euSavebt2 = new javax.swing.JButton();
        euBackbt2 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        emTable6 = new javax.swing.JTable();
        edCategory4 = new javax.swing.JComboBox<>();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        edEnter4 = new javax.swing.JTextField();
        edSearch4 = new javax.swing.JButton();
        jLabel141 = new javax.swing.JLabel();
        euWorkDate3 = new javax.swing.JTextField();
        vuNgaybd = new javax.swing.JTextField();
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
        emAddbt3 = new javax.swing.JButton();
        emDeletebt3 = new javax.swing.JButton();
        emUpdatebt3 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jpAddKho = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        eaID3 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        eaName3 = new javax.swing.JTextField();
        eaPhone3 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        iaHansd = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        eaUsername3 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        eaAddbt3 = new javax.swing.JButton();
        eaBackbt3 = new javax.swing.JButton();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        eaWorkDate5 = new javax.swing.JTextField();
        iaNgaysx = new javax.swing.JTextField();
        jpDeleteKho = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        edDeletebt3 = new javax.swing.JButton();
        edBackbt3 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        emTable9 = new javax.swing.JTable();
        emEnter5 = new javax.swing.JTextField();
        emSearch5 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        emCategory5 = new javax.swing.JComboBox<>();
        jLabel151 = new javax.swing.JLabel();
        jpUpdateKho = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        euID3 = new javax.swing.JTextField();
        euName3 = new javax.swing.JTextField();
        euSex3 = new javax.swing.JTextField();
        euPhone3 = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        euSavebt3 = new javax.swing.JButton();
        euBackbt3 = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        emEnter6 = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        emSearch6 = new javax.swing.JButton();
        emCategory7 = new javax.swing.JComboBox<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        emTable11 = new javax.swing.JTable();
        jLabel160 = new javax.swing.JLabel();
        iuHansd = new javax.swing.JTextField();
        euWorkDate5 = new javax.swing.JTextField();
        iuNgaysx = new javax.swing.JTextField();
        jpHoaDon = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jpThongKe = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        openMenu = new userView.SVGImage();
        adminUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(100, 19, 19));
        pnMain.setInheritsPopupMenu(true);
        pnMain.setPreferredSize(new java.awt.Dimension(900, 600));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSlideMenu.setBackground(new java.awt.Color(93, 5, 5));
        pnSlideMenu.setPreferredSize(new java.awt.Dimension(200, 600));
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

        lbEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lbEmployee.setText("Nhân viên");
        lbEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEmployeeMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lbAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 255));
        lbAdd.setText("Sản phẩm");
        lbAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbVoucher.setText("Khuyến mãi");
        lbVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVoucherMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lbUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("Khách");
        lbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        pnSlideMenu.add(svgEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));
        pnSlideMenu.add(svgPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 30, 30));
        pnSlideMenu.add(svgVou, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));
        pnSlideMenu.add(svgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 30, 30));

        lbUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbUser1.setText("Đơn hàng");
        lbUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUser1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        lbUser2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser2.setForeground(new java.awt.Color(255, 255, 255));
        lbUser2.setText("Kho");
        lbUser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUser2MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        pnSlideMenu.add(svgPro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));
        pnSlideMenu.add(svgManage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 30, 30));
        pnSlideMenu.add(svgBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 30, 30));
        pnSlideMenu.add(svgKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 30, 30));

        lbUser3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUser3.setForeground(new java.awt.Color(255, 255, 255));
        lbUser3.setText("Thống kê");
        lbUser3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUser3MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));
        pnSlideMenu.add(svgSta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 30, 30));

        pnMain.add(pnSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 600));

        pnContainer.setBackground(new java.awt.Color(204, 255, 255));
        pnContainer.setPreferredSize(new java.awt.Dimension(900, 450));
        pnContainer.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(900, 533));
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
        jLabel3.setText("Tổng đơn hàng");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 168, 168));
        jLabel5.setText("999");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jpHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, 150));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 168, 168));
        jLabel4.setText("Tổng doanh thu");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 168, 168));
        jLabel6.setText("22,520,950");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jpHome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 150));

        pnContainer.add(jpHome, "card4");

        jpEmployee.setBackground(new java.awt.Color(242, 231, 220));
        jpEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(100, 19, 19));
        jLabel50.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Tìm kiếm theo");

        emCategory.setBackground(new java.awt.Color(255, 255, 255));
        emCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory.setForeground(new java.awt.Color(0, 0, 0));
        emCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm" }));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Nhập thông tin");

        emEnter.setBackground(new java.awt.Color(255, 255, 255));
        emEnter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emEnter.setForeground(new java.awt.Color(0, 0, 0));

        emSearch.setBackground(new java.awt.Color(0, 0, 0));
        emSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch.setForeground(new java.awt.Color(255, 255, 255));
        emSearch.setText("Tìm");
        emSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearchActionPerformed(evt);
            }
        });

        emAddbt.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt.setText("Thêm");
        emAddbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbtMouseClicked(evt);
            }
        });
        emAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbtActionPerformed(evt);
            }
        });

        emDeletebt.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt.setText("Xoá");
        emDeletebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebtMouseClicked(evt);
            }
        });
        emDeletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebtActionPerformed(evt);
            }
        });

        emUpdatebt.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt.setText("Sửa");
        emUpdatebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebtMouseClicked(evt);
            }
        });
        emUpdatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebtActionPerformed(evt);
            }
        });

        emTable.setBackground(new java.awt.Color(255, 255, 255));
        emTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emTable.setForeground(new java.awt.Color(0, 0, 0));
        emTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm"
            }
        ));
        emTable.setGridColor(new java.awt.Color(100, 19, 19));
        emTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane16.setViewportView(emTable);
        if (emTable.getColumnModel().getColumnCount() > 0) {
            emTable.getColumnModel().getColumn(2).setResizable(false);
            emTable.getColumnModel().getColumn(7).setHeaderValue("Ngày vào làm");
        }

        javax.swing.GroupLayout jpEmployeeLayout = new javax.swing.GroupLayout(jpEmployee);
        jpEmployee.setLayout(jpEmployeeLayout);
        jpEmployeeLayout.setHorizontalGroup(
            jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(55, 55, 55)
                        .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(emCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(emEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emUpdatebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jpEmployeeLayout.setVerticalGroup(
            jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmployeeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel51)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel52)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jpEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEmployeeLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(emAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emUpdatebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        emEnter.getAccessibleContext().setAccessibleName("");

        pnContainer.add(jpEmployee, "card2");

        jpAddEmployee.setBackground(new java.awt.Color(242, 231, 220));
        jpAddEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(100, 19, 19));
        jLabel53.setText("THÊM NHÂN VIÊN");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("ID");

        eaID.setBackground(new java.awt.Color(255, 255, 255));
        eaID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Tên");

        eaName.setBackground(new java.awt.Color(255, 255, 255));
        eaName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Giới tính");

        eaPhone.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone.setForeground(new java.awt.Color(0, 0, 0));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Số điện thoại");

        eaNgaysinh.setBackground(new java.awt.Color(255, 255, 255));
        eaNgaysinh.setForeground(new java.awt.Color(0, 0, 0));

        eaSalary.setBackground(new java.awt.Color(255, 255, 255));
        eaSalary.setForeground(new java.awt.Color(0, 0, 0));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Lương cơ bản");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Username");

        eaUsername.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername.setForeground(new java.awt.Color(0, 0, 0));

        eaPassword.setBackground(new java.awt.Color(255, 255, 255));
        eaPassword.setForeground(new java.awt.Color(0, 0, 0));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Password");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Vai trò");

        eaAddbt.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt.setText("Thêm");
        eaAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbtActionPerformed(evt);
            }
        });

        eaBackbt.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt.setText("Huỷ");
        eaBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbtMouseClicked(evt);
            }
        });
        eaBackbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbtActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Nhập thông tin nhân viên cần thêm");

        eeSex.setBackground(new java.awt.Color(255, 255, 255));
        eeSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eeSex.setForeground(new java.awt.Color(0, 0, 0));
        eeSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setText("Ngày sinh");

        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(0, 0, 0));
        jLabel132.setText("Địa chỉ");

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Nhân viên" }));

        eaDiachi1.setBackground(new java.awt.Color(255, 255, 255));
        eaDiachi1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpAddEmployeeLayout = new javax.swing.GroupLayout(jpAddEmployee);
        jpAddEmployee.setLayout(jpAddEmployeeLayout);
        jpAddEmployeeLayout.setHorizontalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel53))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel79))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel56)
                .addGap(256, 256, 256)
                .addComponent(jLabel58))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(eeSex, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel62)
                .addGap(208, 208, 208)
                .addComponent(jLabel131))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(eaNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel63)
                .addGap(212, 212, 212)
                .addComponent(jLabel132))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(eaDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel57)
                .addGap(247, 247, 247)
                .addComponent(jLabel61))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(eaSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel59)
                .addGap(189, 189, 189)
                .addComponent(jLabel64))
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(eaAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(eaBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAddEmployeeLayout.setVerticalGroup(
            jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddEmployeeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel53)
                .addGap(6, 6, 6)
                .addComponent(jLabel79)
                .addGap(26, 26, 26)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eeSex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel131))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jLabel132))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jLabel61))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel64))
                .addGroup(jpAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaAddbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpAddEmployee, "card12");

        jpDeleteEmployee.setBackground(new java.awt.Color(242, 231, 220));
        jpDeleteEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(100, 19, 19));
        jLabel54.setText("XOÁ NHÂN VIÊN");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Tìm kiếm theo ");

        edCategory.setBackground(new java.awt.Color(255, 255, 255));
        edCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edCategory.setForeground(new java.awt.Color(0, 0, 0));
        edCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm" }));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Nhập thông tin");

        edEnter.setBackground(new java.awt.Color(255, 255, 255));
        edEnter.setForeground(new java.awt.Color(0, 0, 0));
        edEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnterActionPerformed(evt);
            }
        });

        edSearch.setBackground(new java.awt.Color(0, 0, 0));
        edSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch.setForeground(new java.awt.Color(255, 255, 255));
        edSearch.setText("Tìm");
        edSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edSearchActionPerformed(evt);
            }
        });

        edTable.setBackground(new java.awt.Color(255, 255, 255));
        edTable.setForeground(new java.awt.Color(0, 0, 0));
        edTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm"
            }
        ));
        edTable.setGridColor(new java.awt.Color(100, 19, 19));
        edTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(edTable);
        if (edTable.getColumnModel().getColumnCount() > 0) {
            edTable.getColumnModel().getColumn(2).setResizable(false);
            edTable.getColumnModel().getColumn(7).setHeaderValue("Ngày vào làm");
        }

        edDeletebt.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt.setText("Xoá");

        edBackbt.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt.setText("Huỷ");
        edBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbtMouseClicked(evt);
            }
        });
        edBackbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDeleteEmployeeLayout = new javax.swing.GroupLayout(jpDeleteEmployee);
        jpDeleteEmployee.setLayout(jpDeleteEmployeeLayout);
        jpDeleteEmployeeLayout.setHorizontalGroup(
            jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel54)
                .addGap(50, 50, 50)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(edCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(edEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(edSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDeleteEmployeeLayout.setVerticalGroup(
            jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel65)
                        .addGap(0, 0, 0)
                        .addComponent(edCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel66)
                        .addGap(0, 0, 0)
                        .addComponent(edEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(edSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jpDeleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDeleteEmployeeLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(edDeletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(edBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpDeleteEmployee, "card13");

        jpUpdateEmployee.setBackground(new java.awt.Color(242, 231, 220));
        jpUpdateEmployee.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(100, 19, 19));
        jLabel55.setText("CHỈNH SỬA NHÂN VIÊN");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Tìm kiếm theo");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Nhập thông tin");

        euEnter.setBackground(new java.awt.Color(255, 255, 255));
        euEnter.setForeground(new java.awt.Color(0, 0, 0));
        euEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euEnterActionPerformed(evt);
            }
        });

        euSearch.setBackground(new java.awt.Color(0, 0, 0));
        euSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSearch.setForeground(new java.awt.Color(255, 255, 255));
        euSearch.setText("Tìm");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(100, 19, 19));
        jLabel69.setText("Nhập thông tin cần chỉnh sửa");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("ID");

        euID.setBackground(new java.awt.Color(255, 255, 255));
        euID.setForeground(new java.awt.Color(0, 0, 0));

        euName.setBackground(new java.awt.Color(255, 255, 255));
        euName.setForeground(new java.awt.Color(0, 0, 0));

        euPhone.setBackground(new java.awt.Color(255, 255, 255));
        euPhone.setForeground(new java.awt.Color(0, 0, 0));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Tên");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("Ngày sinh");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Số điện thoại");

        euSalary.setBackground(new java.awt.Color(255, 255, 255));
        euSalary.setForeground(new java.awt.Color(0, 0, 0));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Địa chỉ");

        euSavebt.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt.setText("Lưu");
        euSavebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebtActionPerformed(evt);
            }
        });

        euBackbt.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt.setText("Huỷ");
        euBackbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbtMouseClicked(evt);
            }
        });

        edTable3.setBackground(new java.awt.Color(255, 255, 255));
        edTable3.setForeground(new java.awt.Color(0, 0, 0));
        edTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm"
            }
        ));
        edTable3.setGridColor(new java.awt.Color(100, 19, 19));
        edTable3.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane17.setViewportView(edTable3);
        if (edTable3.getColumnModel().getColumnCount() > 0) {
            edTable3.getColumnModel().getColumn(2).setResizable(false);
            edTable3.getColumnModel().getColumn(7).setHeaderValue("Ngày vào làm");
        }

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Giới tính");

        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 0));
        jLabel133.setText("Lương");

        euNgaysinh.setBackground(new java.awt.Color(255, 255, 255));
        euNgaysinh.setForeground(new java.awt.Color(0, 0, 0));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Địa chỉ", "Lương cơ bản", "Ngày vào làm" }));

        euDiachi1.setBackground(new java.awt.Color(255, 255, 255));
        euDiachi1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpUpdateEmployeeLayout = new javax.swing.GroupLayout(jpUpdateEmployee);
        jpUpdateEmployee.setLayout(jpUpdateEmployeeLayout);
        jpUpdateEmployeeLayout.setHorizontalGroup(
            jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel55)
                .addGap(39, 39, 39)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(euEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(euSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel69))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel70)
                .addGap(126, 126, 126)
                .addComponent(jLabel71)
                .addGap(117, 117, 117)
                .addComponent(jLabel73)
                .addGap(69, 69, 69)
                .addComponent(jLabel74))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel72)
                .addGap(78, 78, 78)
                .addComponent(jLabel75)
                .addGap(97, 97, 97)
                .addComponent(jLabel133))
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(euSavebt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(euBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUpdateEmployeeLayout.setVerticalGroup(
            jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel67)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel68)
                        .addGap(0, 0, 0)
                        .addComponent(euEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateEmployeeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(euSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel69)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74))
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel75)
                    .addComponent(jLabel133))
                .addGroup(jpUpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpUpdateEmployee, "card14");

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

        emAddbt1.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt1.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt1.setText("Thêm");
        emAddbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbt1MouseClicked(evt);
            }
        });
        emAddbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbt1ActionPerformed(evt);
            }
        });

        emDeletebt1.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt1.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt1.setText("Xoá");
        emDeletebt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebt1MouseClicked(evt);
            }
        });
        emDeletebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebt1ActionPerformed(evt);
            }
        });

        emUpdatebt1.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt1.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt1.setText("Sửa");
        emUpdatebt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebt1MouseClicked(evt);
            }
        });
        emUpdatebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebt1ActionPerformed(evt);
            }
        });

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
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emUpdatebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpProductLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(emAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emUpdatebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpProduct, "card2");

        jpAddProduct.setBackground(new java.awt.Color(242, 231, 220));
        jpAddProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(100, 19, 19));
        jLabel80.setText("THÊM SẢN PHẨM");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Mã sản phẩm");

        eaID1.setBackground(new java.awt.Color(255, 255, 255));
        eaID1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Loại sản phẩm");

        eaName1.setBackground(new java.awt.Color(255, 255, 255));
        eaName1.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone1.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Giá");

        eaWorkDate1.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Tình trạng");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Tên sản phẩm");

        eaUsername1.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername1.setForeground(new java.awt.Color(0, 0, 0));

        eaPassword1.setBackground(new java.awt.Color(255, 255, 255));
        eaPassword1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setText("Hình ảnh");

        eaAddbt1.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt1.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt1.setText("Thêm");
        eaAddbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbt1ActionPerformed(evt);
            }
        });

        eaBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt1.setText("Huỷ");
        eaBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbt1MouseClicked(evt);
            }
        });
        eaBackbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbt1ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("Nhập thông tin sản phẩm cần thêm");

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 0));
        jLabel134.setText("Mô tả");

        javax.swing.GroupLayout jpAddProductLayout = new javax.swing.GroupLayout(jpAddProduct);
        jpAddProduct.setLayout(jpAddProductLayout);
        jpAddProductLayout.setHorizontalGroup(
            jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel80))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel90))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel81)
                .addGap(175, 175, 175)
                .addComponent(jLabel85))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaID1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(eaWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel82)
                .addGap(170, 170, 170)
                .addComponent(jLabel134))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(eaPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel87)
                .addGap(183, 183, 183)
                .addComponent(jLabel88))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel84))
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390)
                .addComponent(eaAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(eaBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAddProductLayout.setVerticalGroup(
            jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddProductLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel80)
                .addGap(6, 6, 6)
                .addComponent(jLabel90)
                .addGap(26, 26, 26)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81)
                    .addComponent(jLabel85))
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addComponent(jLabel134))
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addComponent(eaUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel84)
                .addGroup(jpAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaAddbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpAddProduct, "card12");

        jpDeleteProduct.setBackground(new java.awt.Color(242, 231, 220));
        jpDeleteProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(100, 19, 19));
        jLabel91.setText("XOÁ SẢN PHẨM");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 0));
        jLabel92.setText("Tìm kiếm theo ");

        edCategory1.setBackground(new java.awt.Color(255, 255, 255));
        edCategory1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edCategory1.setForeground(new java.awt.Color(0, 0, 0));
        edCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Loại", "Tên", "Giá", "Tình trạng" }));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 0));
        jLabel93.setText("Nhập thông tin");

        edEnter1.setBackground(new java.awt.Color(255, 255, 255));
        edEnter1.setForeground(new java.awt.Color(0, 0, 0));
        edEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter1ActionPerformed(evt);
            }
        });

        edSearch1.setBackground(new java.awt.Color(0, 0, 0));
        edSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch1.setForeground(new java.awt.Color(255, 255, 255));
        edSearch1.setText("Tìm");

        edDeletebt1.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt1.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt1.setText("Xoá");

        edBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt1.setText("Huỷ");
        edBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbt1MouseClicked(evt);
            }
        });
        edBackbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbt1ActionPerformed(evt);
            }
        });

        emTable3.setBackground(new java.awt.Color(255, 255, 255));
        emTable3.setForeground(new java.awt.Color(0, 0, 0));
        emTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Loại", "Tên", "Giá", "Tình trạng", "Mô tả", "Hình ảnh"
            }
        ));
        emTable3.setGridColor(new java.awt.Color(100, 19, 19));
        emTable3.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setViewportView(emTable3);

        javax.swing.GroupLayout jpDeleteProductLayout = new javax.swing.GroupLayout(jpDeleteProduct);
        jpDeleteProduct.setLayout(jpDeleteProductLayout);
        jpDeleteProductLayout.setHorizontalGroup(
            jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel91)
                .addGap(56, 56, 56)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addComponent(edCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(edEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(edSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDeleteProductLayout.setVerticalGroup(
            jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteProductLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel92)
                        .addGap(0, 0, 0)
                        .addComponent(edCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel93)
                        .addGap(0, 0, 0)
                        .addComponent(edEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(edSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jpDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDeleteProductLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(edDeletebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(edBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpDeleteProduct, "card13");

        jpUpdateProduct.setBackground(new java.awt.Color(242, 231, 220));
        jpUpdateProduct.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(100, 19, 19));
        jLabel94.setText("CHỈNH SỬA SẢN PHẨM");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(100, 19, 19));
        jLabel97.setText("Nhập thông tin cần chỉnh sửa");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Mã sản phẩm");

        euID1.setBackground(new java.awt.Color(255, 255, 255));
        euID1.setForeground(new java.awt.Color(0, 0, 0));

        euName1.setBackground(new java.awt.Color(255, 255, 255));
        euName1.setForeground(new java.awt.Color(0, 0, 0));

        euSex1.setBackground(new java.awt.Color(255, 255, 255));
        euSex1.setForeground(new java.awt.Color(0, 0, 0));

        euPhone1.setBackground(new java.awt.Color(255, 255, 255));
        euPhone1.setForeground(new java.awt.Color(0, 0, 0));

        euWorkDate1.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Loại sản phẩm");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Tên sản phẩm");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("Giá");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("Tình trạng");

        euSalary1.setBackground(new java.awt.Color(255, 255, 255));
        euSalary1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Mô tả");

        euSavebt1.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt1.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt1.setText("Lưu");
        euSavebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebt1ActionPerformed(evt);
            }
        });

        euBackbt1.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt1.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt1.setText("Huỷ");
        euBackbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbt1MouseClicked(evt);
            }
        });

        emTable4.setBackground(new java.awt.Color(255, 255, 255));
        emTable4.setForeground(new java.awt.Color(0, 0, 0));
        emTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Loại", "Tên", "Giá", "Tình trạng", "Mô tả", "Hình ảnh"
            }
        ));
        emTable4.setGridColor(new java.awt.Color(100, 19, 19));
        emTable4.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setViewportView(emTable4);

        edCategory3.setBackground(new java.awt.Color(255, 255, 255));
        edCategory3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edCategory3.setForeground(new java.awt.Color(0, 0, 0));
        edCategory3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Loại", "Tên", "Giá", "Tình trạng" }));

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(0, 0, 0));
        jLabel135.setText("Tìm kiếm theo ");

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(0, 0, 0));
        jLabel136.setText("Nhập thông tin");

        edEnter3.setBackground(new java.awt.Color(255, 255, 255));
        edEnter3.setForeground(new java.awt.Color(0, 0, 0));
        edEnter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter3ActionPerformed(evt);
            }
        });

        edSearch3.setBackground(new java.awt.Color(0, 0, 0));
        edSearch3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch3.setForeground(new java.awt.Color(255, 255, 255));
        edSearch3.setText("Tìm");

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(0, 0, 0));
        jLabel137.setText("Hình ảnh");

        javax.swing.GroupLayout jpUpdateProductLayout = new javax.swing.GroupLayout(jpUpdateProduct);
        jpUpdateProduct.setLayout(jpUpdateProductLayout);
        jpUpdateProductLayout.setHorizontalGroup(
            jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel94)
                .addGap(45, 45, 45)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel135)
                    .addComponent(edCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136)
                    .addComponent(edEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(edSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel97))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel98)
                .addGap(55, 55, 55)
                .addComponent(jLabel99)
                .addGap(50, 50, 50)
                .addComponent(jLabel100)
                .addGap(53, 53, 53)
                .addComponent(jLabel101))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euID1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euName1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel102)
                .addGap(77, 77, 77)
                .addComponent(jLabel103)
                .addGap(103, 103, 103)
                .addComponent(jLabel137))
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365)
                .addComponent(euSavebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(euBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUpdateProductLayout.setVerticalGroup(
            jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateProductLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94)
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel135)
                        .addGap(0, 0, 0)
                        .addComponent(edCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel136)
                        .addGap(0, 0, 0)
                        .addComponent(edEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateProductLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(edSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel97)
                .addGap(20, 20, 20)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101))
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euID1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(jLabel137))
                .addGroup(jpUpdateProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euWorkDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpUpdateProduct, "card14");

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

        emAddbt2.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt2.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt2.setText("Thêm");
        emAddbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbt2MouseClicked(evt);
            }
        });
        emAddbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbt2ActionPerformed(evt);
            }
        });

        emDeletebt2.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt2.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt2.setText("Xoá");
        emDeletebt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebt2MouseClicked(evt);
            }
        });
        emDeletebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebt2ActionPerformed(evt);
            }
        });

        emUpdatebt2.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt2.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt2.setText("Sửa");
        emUpdatebt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebt2MouseClicked(evt);
            }
        });
        emUpdatebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVoucherLayout = new javax.swing.GroupLayout(jpVoucher);
        jpVoucher.setLayout(jpVoucherLayout);
        jpVoucherLayout.setHorizontalGroup(
            jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(emSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emUpdatebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jpVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpVoucherLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(emAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emUpdatebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpVoucher, "card2");

        jpAddVoucher.setBackground(new java.awt.Color(242, 231, 220));
        jpAddVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(100, 19, 19));
        jLabel107.setText("THÊM KHUYẾN MÃI");

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Mã khuyến mãi");

        eaID2.setBackground(new java.awt.Color(255, 255, 255));
        eaID2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("Loại khuyến mãi");

        eaName2.setBackground(new java.awt.Color(255, 255, 255));
        eaName2.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone2.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 0));
        jLabel111.setText("% Giảm giá");

        vaNgaykt.setBackground(new java.awt.Color(255, 255, 255));
        vaNgaykt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Số lượng");

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 0));
        jLabel114.setText("Điều kiện khuyến mãi");

        eaUsername2.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("Ngày kết thúc KM");

        eaAddbt2.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt2.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt2.setText("Thêm");
        eaAddbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbt2ActionPerformed(evt);
            }
        });

        eaBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt2.setText("Back");
        eaBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbt2MouseClicked(evt);
            }
        });
        eaBackbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbt2ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("Nhập thông tin khuyến mãi cần thêm");

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(0, 0, 0));
        jLabel138.setText("Ngày bắt đầu KM");

        eaWorkDate4.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate4.setForeground(new java.awt.Color(0, 0, 0));

        vaNgaybd.setBackground(new java.awt.Color(255, 255, 255));
        vaNgaybd.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpAddVoucherLayout = new javax.swing.GroupLayout(jpAddVoucher);
        jpAddVoucher.setLayout(jpAddVoucherLayout);
        jpAddVoucherLayout.setHorizontalGroup(
            jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel107))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel117))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel108)
                .addGap(155, 155, 155)
                .addComponent(jLabel112))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaID2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(eaWorkDate4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel109)
                .addGap(149, 149, 149)
                .addComponent(jLabel138))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(vaNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel114)
                .addGap(117, 117, 117)
                .addComponent(jLabel115))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(vaNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel111))
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400)
                .addComponent(eaAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(eaBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAddVoucherLayout.setVerticalGroup(
            jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddVoucherLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel107)
                .addGap(6, 6, 6)
                .addComponent(jLabel117)
                .addGap(26, 26, 26)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(jLabel112))
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaID2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jLabel138))
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115))
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel111)
                .addGroup(jpAddVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaAddbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpAddVoucher, "card12");

        jpDeleteVoucher.setBackground(new java.awt.Color(242, 231, 220));
        jpDeleteVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(100, 19, 19));
        jLabel118.setText("XOÁ KHUYẾN MÃI");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("Tìm kiếm theo ");

        edCategory2.setBackground(new java.awt.Color(255, 255, 255));
        edCategory2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edCategory2.setForeground(new java.awt.Color(0, 0, 0));
        edCategory2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại KM", "% KM", "Ngày bắt đầu", "Ngày kết thúc" }));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Nhập thông tin");

        edEnter2.setBackground(new java.awt.Color(255, 255, 255));
        edEnter2.setForeground(new java.awt.Color(0, 0, 0));
        edEnter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter2ActionPerformed(evt);
            }
        });

        edSearch2.setBackground(new java.awt.Color(0, 0, 0));
        edSearch2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch2.setForeground(new java.awt.Color(255, 255, 255));
        edSearch2.setText("Tìm");

        edDeletebt2.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt2.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt2.setText("Xoá");

        edBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt2.setText("Huỷ");
        edBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbt2MouseClicked(evt);
            }
        });
        edBackbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbt2ActionPerformed(evt);
            }
        });

        emTable5.setBackground(new java.awt.Color(255, 255, 255));
        emTable5.setForeground(new java.awt.Color(0, 0, 0));
        emTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Loại KM", "Điều kiện", "% KM", "Số lượng KM", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ));
        emTable5.setGridColor(new java.awt.Color(100, 19, 19));
        emTable5.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane20.setViewportView(emTable5);

        javax.swing.GroupLayout jpDeleteVoucherLayout = new javax.swing.GroupLayout(jpDeleteVoucher);
        jpDeleteVoucher.setLayout(jpDeleteVoucherLayout);
        jpDeleteVoucherLayout.setHorizontalGroup(
            jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel118)
                .addGap(43, 43, 43)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addComponent(edCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120)
                    .addComponent(edEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(edSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDeleteVoucherLayout.setVerticalGroup(
            jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel119)
                        .addGap(0, 0, 0)
                        .addComponent(edCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel120)
                        .addGap(0, 0, 0)
                        .addComponent(edEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(edSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jpDeleteVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDeleteVoucherLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(edDeletebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(edBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpDeleteVoucher, "card13");

        jpUpdateVoucher.setBackground(new java.awt.Color(242, 231, 220));
        jpUpdateVoucher.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(100, 19, 19));
        jLabel121.setText("CHỈNH SỬA KHUYẾN MÃI");

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(100, 19, 19));
        jLabel124.setText("Nhập thông tin cần chỉnh sửa");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(0, 0, 0));
        jLabel125.setText("Mã khuyến mãi");

        euID2.setBackground(new java.awt.Color(255, 255, 255));
        euID2.setForeground(new java.awt.Color(0, 0, 0));

        euName2.setBackground(new java.awt.Color(255, 255, 255));
        euName2.setForeground(new java.awt.Color(0, 0, 0));

        euSex2.setBackground(new java.awt.Color(255, 255, 255));
        euSex2.setForeground(new java.awt.Color(0, 0, 0));

        euPhone2.setBackground(new java.awt.Color(255, 255, 255));
        euPhone2.setForeground(new java.awt.Color(0, 0, 0));

        vuNgaykt.setBackground(new java.awt.Color(255, 255, 255));
        vuNgaykt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setText("Loại khuyến mãi");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 0));
        jLabel127.setText("Điều kiện");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 0, 0));
        jLabel128.setText("% Giảm giá");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("Số lượng");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Ngày kết thúc KM ");

        euSavebt2.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt2.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt2.setText("Lưu");
        euSavebt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebt2ActionPerformed(evt);
            }
        });

        euBackbt2.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt2.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt2.setText("Huỷ");
        euBackbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbt2MouseClicked(evt);
            }
        });

        emTable6.setBackground(new java.awt.Color(255, 255, 255));
        emTable6.setForeground(new java.awt.Color(0, 0, 0));
        emTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Loại KM", "Điều kiện", "% KM", "Số lượng KM", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ));
        emTable6.setGridColor(new java.awt.Color(100, 19, 19));
        emTable6.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane21.setViewportView(emTable6);

        edCategory4.setBackground(new java.awt.Color(255, 255, 255));
        edCategory4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edCategory4.setForeground(new java.awt.Color(0, 0, 0));
        edCategory4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại KM", "% KM", "Ngày bắt đầu", "Ngày kết thúc" }));

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(0, 0, 0));
        jLabel139.setText("Tìm kiếm theo ");

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(0, 0, 0));
        jLabel140.setText("Nhập thông tin");

        edEnter4.setBackground(new java.awt.Color(255, 255, 255));
        edEnter4.setForeground(new java.awt.Color(0, 0, 0));
        edEnter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEnter4ActionPerformed(evt);
            }
        });

        edSearch4.setBackground(new java.awt.Color(0, 0, 0));
        edSearch4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edSearch4.setForeground(new java.awt.Color(255, 255, 255));
        edSearch4.setText("Tìm");

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(0, 0, 0));
        jLabel141.setText("Ngày bắt đầu KM ");

        euWorkDate3.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate3.setForeground(new java.awt.Color(0, 0, 0));

        vuNgaybd.setBackground(new java.awt.Color(255, 255, 255));
        vuNgaybd.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpUpdateVoucherLayout = new javax.swing.GroupLayout(jpUpdateVoucher);
        jpUpdateVoucher.setLayout(jpUpdateVoucherLayout);
        jpUpdateVoucherLayout.setHorizontalGroup(
            jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139)
                    .addComponent(edCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140)
                    .addComponent(edEnter4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(edSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel124))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel125)
                .addGap(45, 45, 45)
                .addComponent(jLabel126)
                .addGap(39, 39, 39)
                .addComponent(jLabel127)
                .addGap(82, 82, 82)
                .addComponent(jLabel128))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euID2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euName2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel129)
                .addGap(85, 85, 85)
                .addComponent(jLabel141)
                .addGap(27, 27, 27)
                .addComponent(jLabel130))
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euWorkDate3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(vuNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(vuNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(euSavebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(euBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUpdateVoucherLayout.setVerticalGroup(
            jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121)
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel139)
                        .addGap(0, 0, 0)
                        .addComponent(edCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel140)
                        .addGap(0, 0, 0)
                        .addComponent(edEnter4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateVoucherLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(edSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel124)
                .addGap(10, 10, 10)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125)
                    .addComponent(jLabel126)
                    .addComponent(jLabel127)
                    .addComponent(jLabel128))
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euID2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euName2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSex2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129)
                    .addComponent(jLabel141)
                    .addComponent(jLabel130))
                .addGroup(jpUpdateVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euWorkDate3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vuNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vuNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpUpdateVoucher, "card14");

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
        if (emTable7.getColumnModel().getColumnCount() > 0) {
            emTable7.getColumnModel().getColumn(2).setResizable(false);
        }

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

        emAddbt3.setBackground(new java.awt.Color(100, 19, 19));
        emAddbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emAddbt3.setForeground(new java.awt.Color(255, 255, 255));
        emAddbt3.setText("Thêm");
        emAddbt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emAddbt3MouseClicked(evt);
            }
        });
        emAddbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emAddbt3ActionPerformed(evt);
            }
        });

        emDeletebt3.setBackground(new java.awt.Color(100, 19, 19));
        emDeletebt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emDeletebt3.setForeground(new java.awt.Color(255, 255, 255));
        emDeletebt3.setText("Xoá");
        emDeletebt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emDeletebt3MouseClicked(evt);
            }
        });
        emDeletebt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emDeletebt3ActionPerformed(evt);
            }
        });

        emUpdatebt3.setBackground(new java.awt.Color(100, 19, 19));
        emUpdatebt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emUpdatebt3.setForeground(new java.awt.Color(255, 255, 255));
        emUpdatebt3.setText("Sửa");
        emUpdatebt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emUpdatebt3MouseClicked(evt);
            }
        });
        emUpdatebt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emUpdatebt3ActionPerformed(evt);
            }
        });

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
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emAddbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emDeletebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emUpdatebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpKhoLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(emAddbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emDeletebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(emUpdatebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpKho, "card2");

        jpAddKho.setBackground(new java.awt.Color(242, 231, 220));
        jpAddKho.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(100, 19, 19));
        jLabel113.setText("THÊM NGUYÊN LIỆU");

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Mã nguyên liệu");

        eaID3.setBackground(new java.awt.Color(255, 255, 255));
        eaID3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("Tên nguyên liệu");

        eaName3.setBackground(new java.awt.Color(255, 255, 255));
        eaName3.setForeground(new java.awt.Color(0, 0, 0));

        eaPhone3.setBackground(new java.awt.Color(255, 255, 255));
        eaPhone3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("Số lượng");

        iaHansd.setBackground(new java.awt.Color(255, 255, 255));
        iaHansd.setForeground(new java.awt.Color(0, 0, 0));

        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(0, 0, 0));
        jLabel142.setText("Nhà cung cấp");

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(0, 0, 0));
        jLabel143.setText("Đơn vị");

        eaUsername3.setBackground(new java.awt.Color(255, 255, 255));
        eaUsername3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(0, 0, 0));
        jLabel144.setText("Hạn sử dụng");

        eaAddbt3.setBackground(new java.awt.Color(100, 19, 19));
        eaAddbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaAddbt3.setForeground(new java.awt.Color(255, 255, 255));
        eaAddbt3.setText("Thêm");
        eaAddbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaAddbt3ActionPerformed(evt);
            }
        });

        eaBackbt3.setBackground(new java.awt.Color(255, 255, 255));
        eaBackbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eaBackbt3.setForeground(new java.awt.Color(0, 0, 0));
        eaBackbt3.setText("Huỷ");
        eaBackbt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eaBackbt3MouseClicked(evt);
            }
        });
        eaBackbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaBackbt3ActionPerformed(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(0, 0, 0));
        jLabel145.setText("Nhập thông tin nguyên liệu cần thêm");

        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(0, 0, 0));
        jLabel146.setText("Ngày sản xuất");

        eaWorkDate5.setBackground(new java.awt.Color(255, 255, 255));
        eaWorkDate5.setForeground(new java.awt.Color(0, 0, 0));

        iaNgaysx.setBackground(new java.awt.Color(255, 255, 255));
        iaNgaysx.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpAddKhoLayout = new javax.swing.GroupLayout(jpAddKho);
        jpAddKho.setLayout(jpAddKhoLayout);
        jpAddKhoLayout.setHorizontalGroup(
            jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel113))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel145))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel116)
                .addGap(164, 164, 164)
                .addComponent(jLabel142))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaID3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(eaWorkDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel122)
                .addGap(161, 161, 161)
                .addComponent(jLabel146))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaName3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(iaNgaysx, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel143)
                .addGap(219, 219, 219)
                .addComponent(jLabel144))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(iaHansd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel123))
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(eaPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380)
                .addComponent(eaAddbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(eaBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpAddKhoLayout.setVerticalGroup(
            jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddKhoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel113)
                .addGap(6, 6, 6)
                .addComponent(jLabel145)
                .addGap(26, 26, 26)
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel142))
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaID3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaWorkDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jLabel146))
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaName3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iaNgaysx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143)
                    .addComponent(jLabel144))
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iaHansd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel123)
                .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eaPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAddKhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpAddKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eaAddbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eaBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pnContainer.add(jpAddKho, "card12");

        jpDeleteKho.setBackground(new java.awt.Color(242, 231, 220));
        jpDeleteKho.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(100, 19, 19));
        jLabel147.setText("XOÁ SẢN PHẨM");

        edDeletebt3.setBackground(new java.awt.Color(100, 19, 19));
        edDeletebt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edDeletebt3.setForeground(new java.awt.Color(255, 255, 255));
        edDeletebt3.setText("Xoá");

        edBackbt3.setBackground(new java.awt.Color(255, 255, 255));
        edBackbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edBackbt3.setForeground(new java.awt.Color(0, 0, 0));
        edBackbt3.setText("Huỷ");
        edBackbt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBackbt3MouseClicked(evt);
            }
        });
        edBackbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBackbt3ActionPerformed(evt);
            }
        });

        emTable9.setBackground(new java.awt.Color(255, 255, 255));
        emTable9.setForeground(new java.awt.Color(0, 0, 0));
        emTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên NL", "Đơn vị", "Số lượng", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp"
            }
        ));
        emTable9.setGridColor(new java.awt.Color(100, 19, 19));
        emTable9.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(emTable9);

        emEnter5.setBackground(new java.awt.Color(255, 255, 255));
        emEnter5.setForeground(new java.awt.Color(0, 0, 0));

        emSearch5.setBackground(new java.awt.Color(0, 0, 0));
        emSearch5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch5.setForeground(new java.awt.Color(255, 255, 255));
        emSearch5.setText("Tìm");
        emSearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch5ActionPerformed(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(0, 0, 0));
        jLabel150.setText("Nhập thông tin");

        emCategory5.setBackground(new java.awt.Color(255, 255, 255));
        emCategory5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory5.setForeground(new java.awt.Color(0, 0, 0));
        emCategory5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên NL", "Đơn vị", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp" }));

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(0, 0, 0));
        jLabel151.setText("Tìm kiếm theo");

        javax.swing.GroupLayout jpDeleteKhoLayout = new javax.swing.GroupLayout(jpDeleteKho);
        jpDeleteKho.setLayout(jpDeleteKhoLayout);
        jpDeleteKhoLayout.setHorizontalGroup(
            jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel147)
                .addGap(36, 36, 36)
                .addGroup(jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel151)
                    .addComponent(emCategory5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150)
                    .addComponent(emEnter5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(emSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edDeletebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpDeleteKhoLayout.setVerticalGroup(
            jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147)
                    .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel151)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel150)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(emSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jpDeleteKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDeleteKhoLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(edDeletebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(edBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnContainer.add(jpDeleteKho, "card13");

        jpUpdateKho.setBackground(new java.awt.Color(242, 231, 220));
        jpUpdateKho.setPreferredSize(new java.awt.Dimension(900, 533));

        jLabel152.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(100, 19, 19));
        jLabel152.setText("CHỈNH SỬA NGUYÊN LIỆU");

        jLabel153.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(100, 19, 19));
        jLabel153.setText("Nhập thông tin cần chỉnh sửa");

        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(0, 0, 0));
        jLabel154.setText("Mã nguyên liệu");

        euID3.setBackground(new java.awt.Color(255, 255, 255));
        euID3.setForeground(new java.awt.Color(0, 0, 0));

        euName3.setBackground(new java.awt.Color(255, 255, 255));
        euName3.setForeground(new java.awt.Color(0, 0, 0));

        euSex3.setBackground(new java.awt.Color(255, 255, 255));
        euSex3.setForeground(new java.awt.Color(0, 0, 0));

        euPhone3.setBackground(new java.awt.Color(255, 255, 255));
        euPhone3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel155.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(0, 0, 0));
        jLabel155.setText("Tên nguyên liệu");

        jLabel156.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(0, 0, 0));
        jLabel156.setText("Đơn vị");

        jLabel157.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(0, 0, 0));
        jLabel157.setText("Số lượng");

        jLabel158.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(0, 0, 0));
        jLabel158.setText("Ngày sản xuất");

        jLabel159.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(0, 0, 0));
        jLabel159.setText("Hạn sử dụng");

        euSavebt3.setBackground(new java.awt.Color(100, 19, 19));
        euSavebt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euSavebt3.setForeground(new java.awt.Color(255, 255, 255));
        euSavebt3.setText("Lưu");
        euSavebt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euSavebt3ActionPerformed(evt);
            }
        });

        euBackbt3.setBackground(new java.awt.Color(255, 255, 255));
        euBackbt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        euBackbt3.setForeground(new java.awt.Color(0, 0, 0));
        euBackbt3.setText("Huỷ");
        euBackbt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euBackbt3MouseClicked(evt);
            }
        });

        jLabel163.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(0, 0, 0));
        jLabel163.setText("Tìm kiếm theo");

        emEnter6.setBackground(new java.awt.Color(255, 255, 255));
        emEnter6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel164.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(0, 0, 0));
        jLabel164.setText("Nhập thông tin");

        emSearch6.setBackground(new java.awt.Color(0, 0, 0));
        emSearch6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emSearch6.setForeground(new java.awt.Color(255, 255, 255));
        emSearch6.setText("Tìm");
        emSearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSearch6ActionPerformed(evt);
            }
        });

        emCategory7.setBackground(new java.awt.Color(255, 255, 255));
        emCategory7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emCategory7.setForeground(new java.awt.Color(0, 0, 0));
        emCategory7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên NL", "Đơn vị", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp" }));

        emTable11.setBackground(new java.awt.Color(255, 255, 255));
        emTable11.setForeground(new java.awt.Color(0, 0, 0));
        emTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên NL", "Đơn vị", "Số lượng", "Ngày sản xuất", "Hạn sử dụng", "Nhà cung cấp"
            }
        ));
        emTable11.setGridColor(new java.awt.Color(100, 19, 19));
        emTable11.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane14.setViewportView(emTable11);

        jLabel160.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(0, 0, 0));
        jLabel160.setText("Nhà cung cấp");

        iuHansd.setBackground(new java.awt.Color(255, 255, 255));
        iuHansd.setForeground(new java.awt.Color(0, 0, 0));

        euWorkDate5.setBackground(new java.awt.Color(255, 255, 255));
        euWorkDate5.setForeground(new java.awt.Color(0, 0, 0));

        iuNgaysx.setBackground(new java.awt.Color(255, 255, 255));
        iuNgaysx.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpUpdateKhoLayout = new javax.swing.GroupLayout(jpUpdateKho);
        jpUpdateKho.setLayout(jpUpdateKhoLayout);
        jpUpdateKhoLayout.setHorizontalGroup(
            jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel152)
                .addGap(38, 38, 38)
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163)
                    .addComponent(emCategory7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel164)
                    .addComponent(emEnter6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(emSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel153))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel154)
                .addGap(44, 44, 44)
                .addComponent(jLabel155)
                .addGap(41, 41, 41)
                .addComponent(jLabel156)
                .addGap(99, 99, 99)
                .addComponent(jLabel157))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euID3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euName3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euSex3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(euPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel160)
                .addGap(53, 53, 53)
                .addComponent(jLabel158)
                .addGap(51, 51, 51)
                .addComponent(jLabel159))
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(euWorkDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(iuNgaysx, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(iuHansd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(euSavebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(euBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUpdateKhoLayout.setVerticalGroup(
            jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel152)
                    .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel163)
                        .addGap(0, 0, 0)
                        .addComponent(emCategory7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel164)
                        .addGap(0, 0, 0)
                        .addComponent(emEnter6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUpdateKhoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(emSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel153)
                .addGap(20, 20, 20)
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel154)
                    .addComponent(jLabel155)
                    .addComponent(jLabel156)
                    .addComponent(jLabel157))
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euID3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euName3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSex3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel160)
                    .addComponent(jLabel158)
                    .addComponent(jLabel159))
                .addGroup(jpUpdateKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euWorkDate5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iuNgaysx, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iuHansd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euSavebt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euBackbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContainer.add(jpUpdateKho, "card14");

        jpHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        jpHoaDon.setPreferredSize(new java.awt.Dimension(900, 533));
        jpHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel148.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(100, 19, 19));
        jLabel148.setText("LỊCH SỬ HOÁ ĐƠN");
        jpHoaDon.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        pnContainer.add(jpHoaDon, "card2");

        jpThongKe.setBackground(new java.awt.Color(255, 255, 255));
        jpThongKe.setPreferredSize(new java.awt.Dimension(900, 533));
        jpThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel149.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(100, 19, 19));
        jLabel149.setText("THỐNG KÊ");
        jpThongKe.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        pnContainer.add(jpThongKe, "card2");

        pnMain.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, 533));

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

        adminUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminUsername.setForeground(new java.awt.Color(255, 255, 255));
        adminUsername.setText("Admin");
        pnMain.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 50, 30));

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

    // Thêm file svg vào giao diện
    public void addSVG() {
        openMenu.setSVGImage("image_svg/menu.svg", 30, 30);
        closeMenu.setSVGImage("image_svg/closemenu.svg", 30, 30);
        mainLogo.setSVGImage("image_svg/mainlogo.svg", 90, 90);
        svgEmp.setSVGImage("image_svg/emp.svg", 30, 30);
        svgPro.setSVGImage("image_svg/product.svg", 30, 30);
        svgVou.setSVGImage("image_svg/voucher.svg", 30, 30);
        svgUser.setSVGImage("image_svg/account.svg", 30, 30);
        svgBill.setSVGImage("image_svg/bill.svg", 30, 30);
        svgKho.setSVGImage("image_svg/kho.svg", 30, 30);
        svgSta.setSVGImage("image_svg/statistics.svg", 30, 30);
        svgLogout.setSVGImage("image_svg/logout.svg", 30, 30);
    }
    
    public void init(){
        textList.add(eaNgaysinh);
        textList.add(euNgaysinh);
        textList.add(vaNgaybd);
        textList.add(vaNgaykt);
        textList.add(vuNgaykt);
        textList.add(vuNgaykt);
        textList.add(iaNgaysx);
        textList.add(iaHansd);
        textList.add(iuNgaysx);
        textList.add(iuHansd);
    }

    public void createDate() {
        for (int i = 0; i < 10; i++) {
            DateChooser ngay = new DateChooser();
            dateList.add(ngay);
        }

        for (int i = 0; i < textList.size(); i++) {
            DateChooser ngay = dateList.get(i);
            ngay.setTextField(textList.get(i));
            ngay.setLabelCurrentDayVisible(false);
            ngay.setDateFormat(new SimpleDateFormat("dd-MMMM-yyyy"));
        }
    }
    
    // THIẾT KẾ GIAO DIỆN ------------------------------------------------------

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
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(true);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbAddMouseClicked

    private void lbEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEmployeeMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(true);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbEmployeeMouseClicked

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_openMenuMouseClicked

    private void closeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuMouseClicked

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked
        closeMenuBar();
        jpHome.setVisible(true);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_mainLogoMouseClicked

    private void lbVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVoucherMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(true);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbVoucherMouseClicked

    private void emSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearchActionPerformed
      
    }//GEN-LAST:event_emSearchActionPerformed

    private void emAddbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbtMouseClicked
        jpEmployee.setVisible(false);
        jpAddEmployee.setVisible(true);
    }//GEN-LAST:event_emAddbtMouseClicked

    private void emAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbtActionPerformed
       
    }//GEN-LAST:event_emAddbtActionPerformed

    private void emDeletebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebtMouseClicked
        jpEmployee.setVisible(false);
        jpDeleteEmployee.setVisible(true);
    }//GEN-LAST:event_emDeletebtMouseClicked

    private void emDeletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebtActionPerformed
        
    }//GEN-LAST:event_emDeletebtActionPerformed

    private void emUpdatebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebtMouseClicked
        jpEmployee.setVisible(false);
        jpUpdateEmployee.setVisible(true);
    }//GEN-LAST:event_emUpdatebtMouseClicked

    private void emUpdatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebtActionPerformed
        
    }//GEN-LAST:event_emUpdatebtActionPerformed

    private void eaAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbtActionPerformed
       
    }//GEN-LAST:event_eaAddbtActionPerformed

    private void eaBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpAddEmployee.setVisible(false);
    }//GEN-LAST:event_eaBackbtMouseClicked

    private void eaBackbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbtActionPerformed
        
    }//GEN-LAST:event_eaBackbtActionPerformed

    private void edEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnterActionPerformed
        
    }//GEN-LAST:event_edEnterActionPerformed

    private void edBackbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbtActionPerformed
       
    }//GEN-LAST:event_edBackbtActionPerformed

    private void euEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euEnterActionPerformed
        
    }//GEN-LAST:event_euEnterActionPerformed

    private void euSavebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebtActionPerformed
      
    }//GEN-LAST:event_euSavebtActionPerformed

    private void lbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(true);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbUserMouseClicked

    private void edBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpDeleteEmployee.setVisible(false);
    }//GEN-LAST:event_edBackbtMouseClicked

    private void euBackbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbtMouseClicked
        jpEmployee.setVisible(true);
        jpUpdateEmployee.setVisible(false);
    }//GEN-LAST:event_euBackbtMouseClicked

    private void lbUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUser1MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(true);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbUser1MouseClicked

    private void lbUser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUser2MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(true);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(false);
    }//GEN-LAST:event_lbUser2MouseClicked

    private void emSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch1ActionPerformed
        
    }//GEN-LAST:event_emSearch1ActionPerformed

    private void emAddbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbt1MouseClicked
        jpEmployee.setVisible(false);
        jpAddEmployee.setVisible(true);
    }//GEN-LAST:event_emAddbt1MouseClicked

    private void emAddbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbt1ActionPerformed
       
    }//GEN-LAST:event_emAddbt1ActionPerformed

    private void emDeletebt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebt1MouseClicked
        jpEmployee.setVisible(false);
        jpDeleteEmployee.setVisible(true);
    }//GEN-LAST:event_emDeletebt1MouseClicked

    private void emDeletebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebt1ActionPerformed
        
    }//GEN-LAST:event_emDeletebt1ActionPerformed

    private void emUpdatebt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebt1MouseClicked
        jpEmployee.setVisible(false);
        jpUpdateEmployee.setVisible(true);
    }//GEN-LAST:event_emUpdatebt1MouseClicked

    private void emUpdatebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebt1ActionPerformed
        
    }//GEN-LAST:event_emUpdatebt1ActionPerformed

    private void eaAddbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbt1ActionPerformed
       
    }//GEN-LAST:event_eaAddbt1ActionPerformed

    private void eaBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpAddEmployee.setVisible(false);
    }//GEN-LAST:event_eaBackbt1MouseClicked

    private void eaBackbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbt1ActionPerformed
        
    }//GEN-LAST:event_eaBackbt1ActionPerformed

    private void edEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter1ActionPerformed
        
    }//GEN-LAST:event_edEnter1ActionPerformed

    private void edBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpDeleteEmployee.setVisible(false);
    }//GEN-LAST:event_edBackbt1MouseClicked

    private void edBackbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbt1ActionPerformed
        
    }//GEN-LAST:event_edBackbt1ActionPerformed

    private void euSavebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebt1ActionPerformed
        
    }//GEN-LAST:event_euSavebt1ActionPerformed

    private void euBackbt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbt1MouseClicked
        jpEmployee.setVisible(true);
        jpUpdateEmployee.setVisible(false);
    }//GEN-LAST:event_euBackbt1MouseClicked

    private void emSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch2ActionPerformed
        
    }//GEN-LAST:event_emSearch2ActionPerformed

    private void emAddbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbt2MouseClicked
        jpVoucher.setVisible(false);
        jpAddVoucher.setVisible(true);
    }//GEN-LAST:event_emAddbt2MouseClicked

    private void emAddbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbt2ActionPerformed
        
    }//GEN-LAST:event_emAddbt2ActionPerformed

    private void emDeletebt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebt2MouseClicked
        jpVoucher.setVisible(false);
        jpDeleteVoucher.setVisible(true);
    }//GEN-LAST:event_emDeletebt2MouseClicked

    private void emDeletebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebt2ActionPerformed
        
    }//GEN-LAST:event_emDeletebt2ActionPerformed

    private void emUpdatebt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebt2MouseClicked
        jpVoucher.setVisible(false);
        jpUpdateVoucher.setVisible(true);
    }//GEN-LAST:event_emUpdatebt2MouseClicked

    private void emUpdatebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebt2ActionPerformed
        
    }//GEN-LAST:event_emUpdatebt2ActionPerformed

    private void eaAddbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbt2ActionPerformed
        
    }//GEN-LAST:event_eaAddbt2ActionPerformed

    private void eaBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpAddVoucher.setVisible(false);
    }//GEN-LAST:event_eaBackbt2MouseClicked

    private void eaBackbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbt2ActionPerformed
        
    }//GEN-LAST:event_eaBackbt2ActionPerformed

    private void edEnter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter2ActionPerformed
        
    }//GEN-LAST:event_edEnter2ActionPerformed

    private void edBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpDeleteVoucher.setVisible(false);
    }//GEN-LAST:event_edBackbt2MouseClicked

    private void edBackbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbt2ActionPerformed
       
    }//GEN-LAST:event_edBackbt2ActionPerformed

    private void euSavebt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebt2ActionPerformed
      
    }//GEN-LAST:event_euSavebt2ActionPerformed

    private void euBackbt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbt2MouseClicked
        jpVoucher.setVisible(true);
        jpUpdateVoucher.setVisible(false);
    }//GEN-LAST:event_euBackbt2MouseClicked

    private void edSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edSearchActionPerformed
        
    }//GEN-LAST:event_edSearchActionPerformed

    private void edEnter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter3ActionPerformed
       
    }//GEN-LAST:event_edEnter3ActionPerformed

    private void edEnter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEnter4ActionPerformed
      
    }//GEN-LAST:event_edEnter4ActionPerformed

    private void lbUser3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUser3MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpEmployee.setVisible(false);
        jpProduct.setVisible(false);
        jpVoucher.setVisible(false);
        jpUser.setVisible(false);
        jpKho.setVisible(false);
        jpHoaDon.setVisible(false);
        jpThongKe.setVisible(true);
    }//GEN-LAST:event_lbUser3MouseClicked

    private void emSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch3ActionPerformed
       
    }//GEN-LAST:event_emSearch3ActionPerformed

    private void emSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch4ActionPerformed
      
    }//GEN-LAST:event_emSearch4ActionPerformed

    private void emAddbt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emAddbt3MouseClicked
        jpKho.setVisible(false);
        jpAddKho.setVisible(true);
    }//GEN-LAST:event_emAddbt3MouseClicked

    private void emAddbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emAddbt3ActionPerformed
       
    }//GEN-LAST:event_emAddbt3ActionPerformed

    private void emDeletebt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emDeletebt3MouseClicked
        jpKho.setVisible(false);
        jpDeleteKho.setVisible(true);
    }//GEN-LAST:event_emDeletebt3MouseClicked

    private void emDeletebt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emDeletebt3ActionPerformed
       
    }//GEN-LAST:event_emDeletebt3ActionPerformed

    private void emUpdatebt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emUpdatebt3MouseClicked
        jpKho.setVisible(false);
        jpUpdateKho.setVisible(true);
    }//GEN-LAST:event_emUpdatebt3MouseClicked

    private void emUpdatebt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emUpdatebt3ActionPerformed
       
    }//GEN-LAST:event_emUpdatebt3ActionPerformed

    private void eaAddbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaAddbt3ActionPerformed
     
    }//GEN-LAST:event_eaAddbt3ActionPerformed

    private void eaBackbt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eaBackbt3MouseClicked
        jpKho.setVisible(true);
        jpAddKho.setVisible(false);
    }//GEN-LAST:event_eaBackbt3MouseClicked

    private void eaBackbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaBackbt3ActionPerformed
       
    }//GEN-LAST:event_eaBackbt3ActionPerformed

    private void edBackbt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBackbt3MouseClicked
        jpKho.setVisible(true);
        jpDeleteKho.setVisible(false);
    }//GEN-LAST:event_edBackbt3MouseClicked

    private void edBackbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBackbt3ActionPerformed
       
    }//GEN-LAST:event_edBackbt3ActionPerformed

    private void emSearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch5ActionPerformed
        
    }//GEN-LAST:event_emSearch5ActionPerformed

    private void euSavebt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euSavebt3ActionPerformed
      
    }//GEN-LAST:event_euSavebt3ActionPerformed

    private void euBackbt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euBackbt3MouseClicked
        jpKho.setVisible(true);
        jpUpdateKho.setVisible(false);
    }//GEN-LAST:event_euBackbt3MouseClicked

    private void emSearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emSearch6ActionPerformed
       
    }//GEN-LAST:event_emSearch6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel adminUsername;
    private userView.SVGImage closeMenu;
    private javax.swing.JButton eaAddbt;
    private javax.swing.JButton eaAddbt1;
    private javax.swing.JButton eaAddbt2;
    private javax.swing.JButton eaAddbt3;
    private javax.swing.JButton eaBackbt;
    private javax.swing.JButton eaBackbt1;
    private javax.swing.JButton eaBackbt2;
    private javax.swing.JButton eaBackbt3;
    private javax.swing.JTextField eaDiachi1;
    private javax.swing.JTextField eaID;
    private javax.swing.JTextField eaID1;
    private javax.swing.JTextField eaID2;
    private javax.swing.JTextField eaID3;
    private javax.swing.JTextField eaName;
    private javax.swing.JTextField eaName1;
    private javax.swing.JTextField eaName2;
    private javax.swing.JTextField eaName3;
    private javax.swing.JTextField eaNgaysinh;
    private javax.swing.JTextField eaPassword;
    private javax.swing.JTextField eaPassword1;
    private javax.swing.JTextField eaPhone;
    private javax.swing.JTextField eaPhone1;
    private javax.swing.JTextField eaPhone2;
    private javax.swing.JTextField eaPhone3;
    private javax.swing.JTextField eaSalary;
    private javax.swing.JTextField eaUsername;
    private javax.swing.JTextField eaUsername1;
    private javax.swing.JTextField eaUsername2;
    private javax.swing.JTextField eaUsername3;
    private javax.swing.JTextField eaWorkDate1;
    private javax.swing.JTextField eaWorkDate4;
    private javax.swing.JTextField eaWorkDate5;
    private javax.swing.JButton edBackbt;
    private javax.swing.JButton edBackbt1;
    private javax.swing.JButton edBackbt2;
    private javax.swing.JButton edBackbt3;
    private javax.swing.JComboBox<String> edCategory;
    private javax.swing.JComboBox<String> edCategory1;
    private javax.swing.JComboBox<String> edCategory2;
    private javax.swing.JComboBox<String> edCategory3;
    private javax.swing.JComboBox<String> edCategory4;
    private javax.swing.JButton edDeletebt;
    private javax.swing.JButton edDeletebt1;
    private javax.swing.JButton edDeletebt2;
    private javax.swing.JButton edDeletebt3;
    private javax.swing.JTextField edEnter;
    private javax.swing.JTextField edEnter1;
    private javax.swing.JTextField edEnter2;
    private javax.swing.JTextField edEnter3;
    private javax.swing.JTextField edEnter4;
    private javax.swing.JButton edSearch;
    private javax.swing.JButton edSearch1;
    private javax.swing.JButton edSearch2;
    private javax.swing.JButton edSearch3;
    private javax.swing.JButton edSearch4;
    private javax.swing.JTable edTable;
    private javax.swing.JTable edTable3;
    private javax.swing.JComboBox<String> eeSex;
    private javax.swing.JButton emAddbt;
    private javax.swing.JButton emAddbt1;
    private javax.swing.JButton emAddbt2;
    private javax.swing.JButton emAddbt3;
    private javax.swing.JComboBox<String> emCategory;
    private javax.swing.JComboBox<String> emCategory1;
    private javax.swing.JComboBox<String> emCategory2;
    private javax.swing.JComboBox<String> emCategory3;
    private javax.swing.JComboBox<String> emCategory4;
    private javax.swing.JComboBox<String> emCategory5;
    private javax.swing.JComboBox<String> emCategory7;
    private javax.swing.JButton emDeletebt;
    private javax.swing.JButton emDeletebt1;
    private javax.swing.JButton emDeletebt2;
    private javax.swing.JButton emDeletebt3;
    private javax.swing.JTextField emEnter;
    private javax.swing.JTextField emEnter1;
    private javax.swing.JTextField emEnter2;
    private javax.swing.JTextField emEnter3;
    private javax.swing.JTextField emEnter4;
    private javax.swing.JTextField emEnter5;
    private javax.swing.JTextField emEnter6;
    private javax.swing.JButton emSearch;
    private javax.swing.JButton emSearch1;
    private javax.swing.JButton emSearch2;
    private javax.swing.JButton emSearch3;
    private javax.swing.JButton emSearch4;
    private javax.swing.JButton emSearch5;
    private javax.swing.JButton emSearch6;
    private javax.swing.JTable emTable;
    private javax.swing.JTable emTable1;
    private javax.swing.JTable emTable11;
    private javax.swing.JTable emTable2;
    private javax.swing.JTable emTable3;
    private javax.swing.JTable emTable4;
    private javax.swing.JTable emTable5;
    private javax.swing.JTable emTable6;
    private javax.swing.JTable emTable7;
    private javax.swing.JTable emTable8;
    private javax.swing.JTable emTable9;
    private javax.swing.JButton emUpdatebt;
    private javax.swing.JButton emUpdatebt1;
    private javax.swing.JButton emUpdatebt2;
    private javax.swing.JButton emUpdatebt3;
    private javax.swing.JButton euBackbt;
    private javax.swing.JButton euBackbt1;
    private javax.swing.JButton euBackbt2;
    private javax.swing.JButton euBackbt3;
    private javax.swing.JTextField euDiachi1;
    private javax.swing.JTextField euEnter;
    private javax.swing.JTextField euID;
    private javax.swing.JTextField euID1;
    private javax.swing.JTextField euID2;
    private javax.swing.JTextField euID3;
    private javax.swing.JTextField euName;
    private javax.swing.JTextField euName1;
    private javax.swing.JTextField euName2;
    private javax.swing.JTextField euName3;
    private javax.swing.JTextField euNgaysinh;
    private javax.swing.JTextField euPhone;
    private javax.swing.JTextField euPhone1;
    private javax.swing.JTextField euPhone2;
    private javax.swing.JTextField euPhone3;
    private javax.swing.JTextField euSalary;
    private javax.swing.JTextField euSalary1;
    private javax.swing.JButton euSavebt;
    private javax.swing.JButton euSavebt1;
    private javax.swing.JButton euSavebt2;
    private javax.swing.JButton euSavebt3;
    private javax.swing.JButton euSearch;
    private javax.swing.JTextField euSex1;
    private javax.swing.JTextField euSex2;
    private javax.swing.JTextField euSex3;
    private javax.swing.JTextField euWorkDate1;
    private javax.swing.JTextField euWorkDate3;
    private javax.swing.JTextField euWorkDate5;
    private javax.swing.JTextField iaHansd;
    private javax.swing.JTextField iaNgaysx;
    private javax.swing.JTextField iuHansd;
    private javax.swing.JTextField iuNgaysx;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel jpAddEmployee;
    private javax.swing.JPanel jpAddKho;
    private javax.swing.JPanel jpAddProduct;
    private javax.swing.JPanel jpAddVoucher;
    private javax.swing.JPanel jpDeleteEmployee;
    private javax.swing.JPanel jpDeleteKho;
    private javax.swing.JPanel jpDeleteProduct;
    private javax.swing.JPanel jpDeleteVoucher;
    private javax.swing.JPanel jpEmployee;
    private javax.swing.JPanel jpHoaDon;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpKho;
    private javax.swing.JPanel jpProduct;
    private javax.swing.JPanel jpThongKe;
    private javax.swing.JPanel jpUpdateEmployee;
    private javax.swing.JPanel jpUpdateKho;
    private javax.swing.JPanel jpUpdateProduct;
    private javax.swing.JPanel jpUpdateVoucher;
    private javax.swing.JPanel jpUser;
    private javax.swing.JPanel jpVoucher;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbEmployee;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser1;
    private javax.swing.JLabel lbUser2;
    private javax.swing.JLabel lbUser3;
    private javax.swing.JLabel lbVoucher;
    private userView.SVGImage mainLogo;
    private userView.SVGImage openMenu;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSlideMenu;
    private userView.SVGImage svgBill;
    private userView.SVGImage svgEmp;
    private userView.SVGImage svgKho;
    private userView.SVGImage svgLogout;
    private userView.SVGImage svgManage1;
    private userView.SVGImage svgPro;
    private userView.SVGImage svgPro1;
    private userView.SVGImage svgSta;
    private userView.SVGImage svgUser;
    private userView.SVGImage svgVou;
    private javax.swing.JTextField vaNgaybd;
    private javax.swing.JTextField vaNgaykt;
    private javax.swing.JTextField vuNgaybd;
    private javax.swing.JTextField vuNgaykt;
    // End of variables declaration//GEN-END:variables
}
