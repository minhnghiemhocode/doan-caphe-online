package userView;

import dao.KhuyenMaiDao;
import dao.SanPhamDao;
import dao.UserDao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import model.Khach;
import model.KhuyenMai;
import model.SanPham;

public class UserDashboard extends JFrame {

    int width = 200; // Biến sử dụng cho thao tác đóng, mở menu
    int height = 600;

    UserDao user = new UserDao();
    KhuyenMaiDao khuyenmaidao = new KhuyenMaiDao();
    SanPhamDao sanphamdao = new SanPhamDao();
    public static Khach khach = new Khach();
    KhuyenMai khuyenmai = new KhuyenMai();

    private JSpinner[] spinners; // Group để dễ dàng xử lí (Menu Panel)
    private JCheckBox[] checkBoxes;
    private JComboBox<String>[] comboBoxes;
    
    private int menusl = 0; // biến xử lí ở Menu Panel
    private double menutt = 0.0;

    public UserDashboard() {
        initComponents();
        init();
        addSVG();
        account(); // xong
        khuyenmai(); // xong
        sanpham(); // xong
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnSlideMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        lbHome = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbPurchase1 = new javax.swing.JLabel();
        lbPurchase2 = new javax.swing.JLabel();
        lbAccount1 = new javax.swing.JLabel();
        pnContainer = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jpHomea = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jpAccount = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        amUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        amSavebt = new javax.swing.JButton();
        amSignDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        amSex = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        userUsername = new javax.swing.JLabel();
        amDeletebt = new javax.swing.JButton();
        amNameDisplay = new javax.swing.JLabel();
        amID = new javax.swing.JLabel();
        jLabela = new javax.swing.JLabel();
        amDiem = new javax.swing.JTextField();
        jLabel369 = new javax.swing.JLabel();
        jpVoucher = new javax.swing.JPanel();
        jLabel312 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKhuyenMai = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        ngayktTextfield = new javax.swing.JTextField();
        makmTextfield = new javax.swing.JTextField();
        loaikmTextfield = new javax.swing.JTextField();
        ngaybdTextfield = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        tenkmLb = new javax.swing.JLabel();
        ngayLb = new javax.swing.JLabel();
        makmLb = new javax.swing.JLabel();
        dieukienLb = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbCaphe = new javax.swing.JLabel();
        lbTra = new javax.swing.JLabel();
        lbBanh = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        MenuCard = new javax.swing.JPanel();
        MenuCaphe = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jLabel342 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel341 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel327 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel329 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel24 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel25 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel332 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel333 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel28 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel335 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel336 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jPanel31 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jCheckBox20 = new javax.swing.JCheckBox();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        MenuTra = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jPanel34 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jComboBox22 = new javax.swing.JComboBox<>();
        jLabel345 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jSpinner24 = new javax.swing.JSpinner();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jComboBox23 = new javax.swing.JComboBox<>();
        jLabel346 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jPanel37 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        jCheckBox26 = new javax.swing.JCheckBox();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jLabel348 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jCheckBox27 = new javax.swing.JCheckBox();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jComboBox26 = new javax.swing.JComboBox<>();
        jLabel349 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jSpinner28 = new javax.swing.JSpinner();
        jCheckBox28 = new javax.swing.JCheckBox();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jComboBox27 = new javax.swing.JComboBox<>();
        jPanel40 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jSpinner29 = new javax.swing.JSpinner();
        jCheckBox29 = new javax.swing.JCheckBox();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel351 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jSpinner30 = new javax.swing.JSpinner();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jComboBox29 = new javax.swing.JComboBox<>();
        jPanel42 = new javax.swing.JPanel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jSpinner31 = new javax.swing.JSpinner();
        jCheckBox31 = new javax.swing.JCheckBox();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jComboBox30 = new javax.swing.JComboBox<>();
        jLabel353 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jSpinner32 = new javax.swing.JSpinner();
        jCheckBox32 = new javax.swing.JCheckBox();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jComboBox31 = new javax.swing.JComboBox<>();
        MenuBanh = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jSpinner33 = new javax.swing.JSpinner();
        jCheckBox33 = new javax.swing.JCheckBox();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jComboBox32 = new javax.swing.JComboBox<>();
        jPanel45 = new javax.swing.JPanel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jSpinner34 = new javax.swing.JSpinner();
        jCheckBox34 = new javax.swing.JCheckBox();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jComboBox33 = new javax.swing.JComboBox<>();
        jPanel46 = new javax.swing.JPanel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jSpinner35 = new javax.swing.JSpinner();
        jCheckBox35 = new javax.swing.JCheckBox();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jPanel47 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jSpinner36 = new javax.swing.JSpinner();
        jCheckBox36 = new javax.swing.JCheckBox();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jComboBox35 = new javax.swing.JComboBox<>();
        jPanel48 = new javax.swing.JPanel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jCheckBox37 = new javax.swing.JCheckBox();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        jComboBox36 = new javax.swing.JComboBox<>();
        jPanel49 = new javax.swing.JPanel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jSpinner38 = new javax.swing.JSpinner();
        jCheckBox38 = new javax.swing.JCheckBox();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox<>();
        jPanel50 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jSpinner39 = new javax.swing.JSpinner();
        jCheckBox39 = new javax.swing.JCheckBox();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jComboBox38 = new javax.swing.JComboBox<>();
        jPanel51 = new javax.swing.JPanel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jSpinner40 = new javax.swing.JSpinner();
        jCheckBox40 = new javax.swing.JCheckBox();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jComboBox39 = new javax.swing.JComboBox<>();
        jPanel52 = new javax.swing.JPanel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jSpinner41 = new javax.swing.JSpinner();
        jCheckBox41 = new javax.swing.JCheckBox();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jComboBox44 = new javax.swing.JComboBox<>();
        jPanel53 = new javax.swing.JPanel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jSpinner42 = new javax.swing.JSpinner();
        jCheckBox42 = new javax.swing.JCheckBox();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jComboBox41 = new javax.swing.JComboBox<>();
        jPanel54 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jSpinner43 = new javax.swing.JSpinner();
        jCheckBox43 = new javax.swing.JCheckBox();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jComboBox42 = new javax.swing.JComboBox<>();
        jPanel55 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jSpinner44 = new javax.swing.JSpinner();
        jCheckBox44 = new javax.swing.JCheckBox();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jComboBox43 = new javax.swing.JComboBox<>();
        jPanel56 = new javax.swing.JPanel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jSpinner45 = new javax.swing.JSpinner();
        jCheckBox45 = new javax.swing.JCheckBox();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jComboBox40 = new javax.swing.JComboBox<>();
        MenuTim = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        fieldComboBox = new javax.swing.JComboBox<>();
        timsanphamTextfield = new javax.swing.JTextField();
        timsanphamButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        slSpinner = new javax.swing.JSpinner();
        giaLb = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        sizeComboBox = new javax.swing.JComboBox<>();
        ThemButton = new javax.swing.JButton();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jLabel419 = new javax.swing.JLabel();
        tenspLb = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        lbTimKiem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        lbmenusl = new javax.swing.JLabel();
        lbmenutt = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel415 = new javax.swing.JLabel();
        jpThanhtoan = new javax.swing.JPanel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        scrollPane2 = new java.awt.ScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();

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

        jLabel314.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setText("ĐÓNG");
        jLabel314.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel314MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, -1));

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
        pnSlideMenu.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        lbHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("Trang chủ");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lbAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount.setText("Tài khoản");
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccountMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lbMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMenu.setForeground(new java.awt.Color(255, 255, 255));
        lbMenu.setText("Mua hàng");
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        lbPurchase1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPurchase1.setForeground(new java.awt.Color(255, 255, 255));
        lbPurchase1.setText("Lịch sử");
        lbPurchase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPurchase1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbPurchase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lbPurchase2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPurchase2.setForeground(new java.awt.Color(255, 255, 255));
        lbPurchase2.setText("TCH CARE");
        lbPurchase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPurchase2MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbPurchase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        lbAccount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount1.setText("Khuyến mãi");
        lbAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccount1MouseClicked(evt);
            }
        });
        pnSlideMenu.add(lbAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        pnMain.add(pnSlideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 600));

        pnContainer.setBackground(new java.awt.Color(204, 255, 255));
        pnContainer.setPreferredSize(new java.awt.Dimension(900, 500));
        pnContainer.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(255, 255, 255));
        jpHome.setPreferredSize(new java.awt.Dimension(900, 531));
        jpHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHomea.setBackground(new java.awt.Color(255, 255, 255));
        jpHomea.setPreferredSize(new java.awt.Dimension(800, 450));
        jpHomea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("MUA");
        jpHomea.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 187, 24));
        jLabel12.setText("TẶNG");
        jpHomea.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 160)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 187, 24));
        jLabel13.setText("1");
        jpHomea.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Áp dụng cho 3 món sau");
        jpHomea.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Matcha latte");
        jpHomea.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cappuccino");
        jpHomea.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Espresso");
        jpHomea.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(100, 19, 19));
        jLabel19.setText("Áp dụng từ 18.05 - 31.05.2024");
        jpHomea.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 190, -1));

        jpHome.add(jpHomea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 532));

        pnContainer.add(jpHome, "card4");

        jpAccount.setBackground(new java.awt.Color(255, 255, 255));
        jpAccount.setForeground(new java.awt.Color(0, 0, 0));
        jpAccount.setPreferredSize(new java.awt.Dimension(900, 531));
        jpAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tên đăng nhập *");
        jpAccount.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        amUsername.setBackground(new java.awt.Color(255, 255, 255));
        amUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amUsername.setForeground(new java.awt.Color(0, 0, 0));
        amUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amUsernameActionPerformed(evt);
            }
        });
        jpAccount.add(amUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên *");
        jpAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        amName.setBackground(new java.awt.Color(255, 255, 255));
        amName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amName.setForeground(new java.awt.Color(0, 0, 0));
        amName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amNameActionPerformed(evt);
            }
        });
        jpAccount.add(amName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Số điện thoại *");
        jpAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, -1));

        amPhone.setBackground(new java.awt.Color(255, 255, 255));
        amPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amPhone.setForeground(new java.awt.Color(0, 0, 0));
        amPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amPhoneActionPerformed(evt);
            }
        });
        jpAccount.add(amPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mật khẩu *");
        jpAccount.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        amPassword.setBackground(new java.awt.Color(255, 255, 255));
        amPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amPassword.setForeground(new java.awt.Color(0, 0, 0));
        amPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amPasswordActionPerformed(evt);
            }
        });
        jpAccount.add(amPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Địa chỉ *");
        jpAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 60, -1));

        amAddress.setBackground(new java.awt.Color(255, 255, 255));
        amAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amAddress.setForeground(new java.awt.Color(0, 0, 0));
        amAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amAddressActionPerformed(evt);
            }
        });
        jpAccount.add(amAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 19, 19));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");
        jpAccount.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        amSavebt.setBackground(new java.awt.Color(100, 19, 19));
        amSavebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amSavebt.setForeground(new java.awt.Color(255, 255, 255));
        amSavebt.setText("Lưu");
        amSavebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amSavebtActionPerformed(evt);
            }
        });
        jpAccount.add(amSavebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 40));

        amSignDate.setBackground(new java.awt.Color(238, 238, 238));
        amSignDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amSignDate.setForeground(new java.awt.Color(0, 0, 0));
        amSignDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amSignDateActionPerformed(evt);
            }
        });
        jpAccount.add(amSignDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 200, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Giới tính");
        jpAccount.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Ngày đăng ký");
        jpAccount.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        amSex.setBackground(new java.awt.Color(255, 255, 255));
        amSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amSex.setForeground(new java.awt.Color(0, 0, 0));
        amSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jpAccount.add(amSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 100, 40));

        jPanel5.setBackground(new java.awt.Color(100, 19, 19));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userUsername.setForeground(new java.awt.Color(255, 255, 255));
        userUsername.setText("Username");
        jPanel5.add(userUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, -1));

        amDeletebt.setBackground(new java.awt.Color(255, 255, 255));
        amDeletebt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amDeletebt.setForeground(new java.awt.Color(0, 0, 0));
        amDeletebt.setText("Xoá tài khoản");
        amDeletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amDeletebtActionPerformed(evt);
            }
        });
        jPanel5.add(amDeletebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 290, 40));

        amNameDisplay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        amNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        amNameDisplay.setText("Nguyễn Văn A");
        jPanel5.add(amNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, -1));

        amID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        amID.setForeground(new java.awt.Color(255, 255, 255));
        amID.setText("ID");
        jPanel5.add(amID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, -1));

        jLabela.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabela.setForeground(new java.awt.Color(255, 255, 255));
        jLabela.setText("Điểm");
        jPanel5.add(jLabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 40, -1));

        amDiem.setBackground(new java.awt.Color(255, 255, 255));
        amDiem.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        amDiem.setForeground(new java.awt.Color(100, 19, 19));
        jPanel5.add(amDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 50, 30));

        jpAccount.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 330, 531));

        jLabel369.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel369.setForeground(new java.awt.Color(100, 19, 19));
        jLabel369.setText("Thông tin tài khoản");
        jpAccount.add(jLabel369, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        pnContainer.add(jpAccount, "card3");

        jpVoucher.setBackground(new java.awt.Color(255, 255, 255));
        jpVoucher.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.setPreferredSize(new java.awt.Dimension(900, 531));
        jpVoucher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel312.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel312.setForeground(new java.awt.Color(100, 19, 19));
        jLabel312.setText("DANH SÁCH KHUYẾN MÃI");
        jpVoucher.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tableKhuyenMai.setBackground(new java.awt.Color(255, 255, 255));
        tableKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableKhuyenMai.setForeground(new java.awt.Color(0, 0, 0));
        tableKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Loại KM", "Điều kiện", "%", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ));
        jScrollPane2.setViewportView(tableKhuyenMai);
        if (tableKhuyenMai.getColumnModel().getColumnCount() > 0) {
            tableKhuyenMai.getColumnModel().getColumn(0).setPreferredWidth(70);
        }

        jpVoucher.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 490, 470));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(100, 19, 19));
        jLabel16.setText("Các mã khuyến mãi hiện có");
        jpVoucher.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Ngày kết thúc khuyến mãi");
        jpVoucher.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel308.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(0, 0, 0));
        jLabel308.setText("Mã khuyến mãi");
        jpVoucher.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel309.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(0, 0, 0));
        jLabel309.setText("Loại khuyến mãi");
        jpVoucher.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel310.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(0, 0, 0));
        jLabel310.setText("Ngày bắt đầu khuyến mãi");
        jpVoucher.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        ngayktTextfield.setBackground(new java.awt.Color(243, 243, 243));
        ngayktTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ngayktTextfield.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.add(ngayktTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 140, 40));

        makmTextfield.setBackground(new java.awt.Color(243, 243, 243));
        makmTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        makmTextfield.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.add(makmTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, 40));

        loaikmTextfield.setBackground(new java.awt.Color(243, 243, 243));
        loaikmTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loaikmTextfield.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.add(loaikmTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 140, 40));

        ngaybdTextfield.setBackground(new java.awt.Color(243, 243, 243));
        ngaybdTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ngaybdTextfield.setForeground(new java.awt.Color(0, 0, 0));
        jpVoucher.add(ngaybdTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 140, 40));

        jPanel6.setBackground(new java.awt.Color(242, 231, 220));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenkmLb.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        tenkmLb.setForeground(new java.awt.Color(174, 165, 155));
        tenkmLb.setText("GIẢM 50%");
        jPanel6.add(tenkmLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 45, -1, -1));

        ngayLb.setForeground(new java.awt.Color(174, 165, 155));
        ngayLb.setText("5 July 7 2003 - 5 July 7 2024   ");
        jPanel6.add(ngayLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        makmLb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        makmLb.setForeground(new java.awt.Color(174, 165, 155));
        makmLb.setText("ID: VN113");
        jPanel6.add(makmLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        dieukienLb.setForeground(new java.awt.Color(174, 165, 155));
        dieukienLb.setText("*Đơn tối thiểu 100000");
        jPanel6.add(dieukienLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));

        jpVoucher.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, 140));

        pnContainer.add(jpVoucher, "card3");

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setPreferredSize(new java.awt.Dimension(900, 531));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 531));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCaphe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCaphe.setForeground(new java.awt.Color(100, 19, 19));
        lbCaphe.setText("Cà phê");
        lbCaphe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCapheMouseClicked(evt);
            }
        });
        jPanel1.add(lbCaphe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbTra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTra.setForeground(new java.awt.Color(100, 19, 19));
        lbTra.setText("Trà");
        lbTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTraMouseClicked(evt);
            }
        });
        jPanel1.add(lbTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lbBanh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBanh.setForeground(new java.awt.Color(100, 19, 19));
        lbBanh.setText("Bánh");
        lbBanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBanhMouseClicked(evt);
            }
        });
        jPanel1.add(lbBanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        MenuCard.setBackground(new java.awt.Color(255, 255, 204));
        MenuCard.setPreferredSize(new java.awt.Dimension(548, 1628));
        MenuCard.setLayout(new java.awt.CardLayout());

        MenuCaphe.setBackground(new java.awt.Color(255, 255, 255));
        MenuCaphe.setPreferredSize(new java.awt.Dimension(728, 1088));
        MenuCaphe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(242, 231, 220));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(146, 124, 102));
        jLabel21.setText("Cà phê óc chó");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel22.setForeground(new java.awt.Color(146, 124, 102));
        jLabel22.setText("Giá");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel23.setForeground(new java.awt.Color(146, 124, 102));
        jLabel23.setText("Số lượng");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel15.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox5.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox5.setText("Mua");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("65.000");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Còn");
        jPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel82.setForeground(new java.awt.Color(146, 124, 102));
        jLabel82.setText("Kho");
        jPanel15.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf16.png"))); // NOI18N
        jPanel15.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox20.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox20.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel15.add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel342.setForeground(new java.awt.Color(146, 124, 102));
        jLabel342.setText("Size");
        jPanel15.add(jLabel342, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1370, 160, 250));

        jPanel17.setBackground(new java.awt.Color(242, 231, 220));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(146, 124, 102));
        jLabel31.setText("Caramel đá xay");
        jPanel17.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel32.setForeground(new java.awt.Color(146, 124, 102));
        jLabel32.setText("Giá");
        jPanel17.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel33.setForeground(new java.awt.Color(146, 124, 102));
        jLabel33.setText("Số lượng");
        jPanel17.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel17.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox7.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox7.setText("Mua");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel17.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("65.000");
        jPanel17.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Còn");
        jPanel17.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel85.setForeground(new java.awt.Color(146, 124, 102));
        jLabel85.setText("Kho");
        jPanel17.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf13.png"))); // NOI18N
        jPanel17.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel339.setForeground(new java.awt.Color(146, 124, 102));
        jLabel339.setText("Size");
        jPanel17.add(jLabel339, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox17.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox17.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel17.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 160, 250));

        jPanel16.setBackground(new java.awt.Color(242, 231, 220));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(146, 124, 102));
        jLabel26.setText("Oreo đá xay");
        jPanel16.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel27.setForeground(new java.awt.Color(146, 124, 102));
        jLabel27.setText("Giá");
        jPanel16.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel28.setForeground(new java.awt.Color(146, 124, 102));
        jLabel28.setText("Số lượng");
        jPanel16.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel16.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox6.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox6.setText("Mua");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel16.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("65.000");
        jPanel16.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Còn");
        jPanel16.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel83.setForeground(new java.awt.Color(146, 124, 102));
        jLabel83.setText("Kho");
        jPanel16.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf14.png"))); // NOI18N
        jLabel84.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel16.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel340.setForeground(new java.awt.Color(146, 124, 102));
        jLabel340.setText("Size");
        jPanel16.add(jLabel340, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox18.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox18.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel16.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1100, 160, 250));

        jPanel18.setBackground(new java.awt.Color(242, 231, 220));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(146, 124, 102));
        jLabel36.setText("Cookie đá xay");
        jPanel18.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel37.setForeground(new java.awt.Color(146, 124, 102));
        jLabel37.setText("Giá");
        jPanel18.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel38.setForeground(new java.awt.Color(146, 124, 102));
        jLabel38.setText("Số lượng");
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel18.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox8.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox8.setText("Mua");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel18.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("65.000");
        jPanel18.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Còn");
        jPanel18.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel87.setForeground(new java.awt.Color(146, 124, 102));
        jLabel87.setText("Kho");
        jPanel18.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf15.png"))); // NOI18N
        jPanel18.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox19.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox19.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel18.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel341.setForeground(new java.awt.Color(146, 124, 102));
        jLabel341.setText("Size");
        jPanel18.add(jLabel341, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1100, 160, 250));

        jPanel19.setBackground(new java.awt.Color(242, 231, 220));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(146, 124, 102));
        jLabel41.setText("Coldbrew");
        jPanel19.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 80, -1));

        jCheckBox9.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox9.setText("Mua");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel19.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel42.setForeground(new java.awt.Color(146, 124, 102));
        jLabel42.setText("Giá");
        jPanel19.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel43.setForeground(new java.awt.Color(146, 124, 102));
        jLabel43.setText("Size");
        jPanel19.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner9StateChanged(evt);
            }
        });
        jPanel19.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("35.000");
        jPanel19.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Còn");
        jPanel19.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel89.setForeground(new java.awt.Color(146, 124, 102));
        jLabel89.setText("Kho");
        jPanel19.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf1.png"))); // NOI18N
        jLabel90.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel19.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel19.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel327.setForeground(new java.awt.Color(146, 124, 102));
        jLabel327.setText("Số lượng");
        jPanel19.add(jLabel327, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        MenuCaphe.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel20.setBackground(new java.awt.Color(242, 231, 220));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(146, 124, 102));
        jLabel46.setText("Bạc sĩu");
        jPanel20.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        jLabel47.setForeground(new java.awt.Color(146, 124, 102));
        jLabel47.setText("Giá");
        jPanel20.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel48.setForeground(new java.awt.Color(146, 124, 102));
        jLabel48.setText("Số lượng");
        jPanel20.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel20.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox10.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox10.setText("Mua");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel20.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("39.000");
        jPanel20.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Còn");
        jPanel20.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel91.setForeground(new java.awt.Color(146, 124, 102));
        jLabel91.setText("Kho");
        jPanel20.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf2.png"))); // NOI18N
        jLabel92.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel20.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel328.setForeground(new java.awt.Color(146, 124, 102));
        jLabel328.setText("Size");
        jPanel20.add(jLabel328, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel20.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel21.setBackground(new java.awt.Color(242, 231, 220));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(146, 124, 102));
        jLabel51.setText("Cà phê muối");
        jPanel21.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel52.setForeground(new java.awt.Color(146, 124, 102));
        jLabel52.setText("Giá");
        jPanel21.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel53.setForeground(new java.awt.Color(146, 124, 102));
        jLabel53.setText("Số lượng");
        jPanel21.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel21.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox11.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox11.setText("Mua");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel21.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("39.000");
        jPanel21.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Còn");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel93.setForeground(new java.awt.Color(146, 124, 102));
        jLabel93.setText("Kho");
        jPanel21.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf3.png"))); // NOI18N
        jLabel94.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel21.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox7.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox7.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel21.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel329.setForeground(new java.awt.Color(146, 124, 102));
        jLabel329.setText("Size");
        jPanel21.add(jLabel329, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel22.setBackground(new java.awt.Color(242, 231, 220));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(146, 124, 102));
        jLabel56.setText("Cà phê caramel");
        jPanel22.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel57.setForeground(new java.awt.Color(146, 124, 102));
        jLabel57.setText("Giá");
        jPanel22.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel58.setForeground(new java.awt.Color(146, 124, 102));
        jLabel58.setText("Số lượng");
        jPanel22.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel22.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox12.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox12.setText("Mua");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jPanel22.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("49.000");
        jPanel22.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Còn");
        jPanel22.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel95.setForeground(new java.awt.Color(146, 124, 102));
        jLabel95.setText("Kho");
        jPanel22.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf4.png"))); // NOI18N
        jPanel22.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel330.setForeground(new java.awt.Color(146, 124, 102));
        jLabel330.setText("Size");
        jPanel22.add(jLabel330, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel22.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel24.setBackground(new java.awt.Color(242, 231, 220));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(146, 124, 102));
        jLabel61.setText("Bạc sĩu caramel");
        jPanel24.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel62.setForeground(new java.awt.Color(146, 124, 102));
        jLabel62.setText("Giá");
        jPanel24.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel63.setForeground(new java.awt.Color(146, 124, 102));
        jLabel63.setText("Số lượng");
        jPanel24.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel24.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox13.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox13.setText("Mua");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        jPanel24.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("65.000");
        jPanel24.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Còn");
        jPanel24.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel97.setForeground(new java.awt.Color(146, 124, 102));
        jLabel97.setText("Kho");
        jPanel24.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf5.png"))); // NOI18N
        jPanel24.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel331.setForeground(new java.awt.Color(146, 124, 102));
        jLabel331.setText("Size");
        jPanel24.add(jLabel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox9.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel24.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel25.setBackground(new java.awt.Color(242, 231, 220));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(146, 124, 102));
        jLabel66.setText("Cà phê trứng");
        jPanel25.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel67.setForeground(new java.awt.Color(146, 124, 102));
        jLabel67.setText("Giá");
        jPanel25.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel68.setForeground(new java.awt.Color(146, 124, 102));
        jLabel68.setText("Số lượng");
        jPanel25.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel25.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox14.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox14.setText("Mua");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        jPanel25.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("39.000");
        jPanel25.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Còn");
        jPanel25.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel99.setForeground(new java.awt.Color(146, 124, 102));
        jLabel99.setText("Kho");
        jPanel25.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf6.png"))); // NOI18N
        jLabel100.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel25.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox10.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox10.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel25.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel332.setForeground(new java.awt.Color(146, 124, 102));
        jLabel332.setText("Size");
        jPanel25.add(jLabel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel26.setBackground(new java.awt.Color(242, 231, 220));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(146, 124, 102));
        jLabel71.setText("Cà phê kem sữa");
        jPanel26.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel72.setForeground(new java.awt.Color(146, 124, 102));
        jLabel72.setText("Giá");
        jPanel26.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel73.setForeground(new java.awt.Color(146, 124, 102));
        jLabel73.setText("Số lượng");
        jPanel26.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel26.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox15.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox15.setText("Mua");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        jPanel26.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("39.000");
        jPanel26.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Còn");
        jPanel26.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel101.setForeground(new java.awt.Color(146, 124, 102));
        jLabel101.setText("Kho");
        jPanel26.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf7.png"))); // NOI18N
        jPanel26.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox11.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox11.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel26.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel333.setForeground(new java.awt.Color(146, 124, 102));
        jLabel333.setText("Size");
        jPanel26.add(jLabel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel27.setBackground(new java.awt.Color(242, 231, 220));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(146, 124, 102));
        jLabel76.setText("Cà phê sữa tươi");
        jPanel27.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel77.setForeground(new java.awt.Color(146, 124, 102));
        jLabel77.setText("Giá");
        jPanel27.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel78.setForeground(new java.awt.Color(146, 124, 102));
        jLabel78.setText("Số lượng");
        jPanel27.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel27.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox16.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox16.setText("Mua");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        jPanel27.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("35.000");
        jPanel27.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Còn");
        jPanel27.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel103.setForeground(new java.awt.Color(146, 124, 102));
        jLabel103.setText("Kho");
        jPanel27.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf8.png"))); // NOI18N
        jPanel27.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel334.setForeground(new java.awt.Color(146, 124, 102));
        jLabel334.setText("Size");
        jPanel27.add(jLabel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox12.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox12.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel27.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel28.setBackground(new java.awt.Color(242, 231, 220));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(146, 124, 102));
        jLabel105.setText("Cà phê sương sáo");
        jPanel28.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 120, -1));

        jLabel106.setForeground(new java.awt.Color(146, 124, 102));
        jLabel106.setText("Giá");
        jPanel28.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel107.setForeground(new java.awt.Color(146, 124, 102));
        jLabel107.setText("Số lượng");
        jPanel28.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel28.add(jSpinner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox17.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox17.setText("Mua");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        jPanel28.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("45.000");
        jPanel28.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("Còn");
        jPanel28.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel110.setForeground(new java.awt.Color(146, 124, 102));
        jLabel110.setText("Kho");
        jPanel28.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf9.png"))); // NOI18N
        jPanel28.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox13.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox13.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel28.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel335.setForeground(new java.awt.Color(146, 124, 102));
        jLabel335.setText("Size");
        jPanel28.add(jLabel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        jPanel29.setBackground(new java.awt.Color(242, 231, 220));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(146, 124, 102));
        jLabel112.setText("Cà phê dừa");
        jPanel29.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel113.setForeground(new java.awt.Color(146, 124, 102));
        jLabel113.setText("Giá");
        jPanel29.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel114.setForeground(new java.awt.Color(146, 124, 102));
        jLabel114.setText("Số lượng");
        jPanel29.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel29.add(jSpinner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox18.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox18.setText("Mua");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        jPanel29.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("59.000");
        jPanel29.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Còn");
        jPanel29.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel117.setForeground(new java.awt.Color(146, 124, 102));
        jLabel117.setText("Kho");
        jPanel29.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf10.png"))); // NOI18N
        jPanel29.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox14.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox14.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel29.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel336.setForeground(new java.awt.Color(146, 124, 102));
        jLabel336.setText("Size");
        jPanel29.add(jLabel336, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuCaphe.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel30.setBackground(new java.awt.Color(242, 231, 220));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(146, 124, 102));
        jLabel119.setText("Chocolate đá xay");
        jPanel30.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 110, -1));

        jLabel120.setForeground(new java.awt.Color(146, 124, 102));
        jLabel120.setText("Giá");
        jPanel30.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel121.setForeground(new java.awt.Color(146, 124, 102));
        jLabel121.setText("Số lượng");
        jPanel30.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel30.add(jSpinner19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox19.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox19.setText("Mua");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        jPanel30.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("65.000");
        jPanel30.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("Còn");
        jPanel30.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel124.setForeground(new java.awt.Color(146, 124, 102));
        jLabel124.setText("Kho");
        jPanel30.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf11.png"))); // NOI18N
        jPanel30.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel337.setForeground(new java.awt.Color(146, 124, 102));
        jLabel337.setText("Size");
        jPanel30.add(jLabel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox15.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox15.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel30.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel31.setBackground(new java.awt.Color(242, 231, 220));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(146, 124, 102));
        jLabel126.setText("Milo đá xay");
        jPanel31.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 80, -1));

        jLabel127.setForeground(new java.awt.Color(146, 124, 102));
        jLabel127.setText("Giá");
        jPanel31.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel128.setForeground(new java.awt.Color(146, 124, 102));
        jLabel128.setText("Số lượng");
        jPanel31.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel31.add(jSpinner20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox20.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox20.setText("Mua");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        jPanel31.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setText("65.000");
        jPanel31.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Còn");
        jPanel31.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel131.setForeground(new java.awt.Color(146, 124, 102));
        jLabel131.setText("Kho");
        jPanel31.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cf/cf12.png"))); // NOI18N
        jPanel31.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel338.setForeground(new java.awt.Color(146, 124, 102));
        jLabel338.setText("Size");
        jPanel31.add(jLabel338, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox16.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox16.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel31.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuCaphe.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        MenuCard.add(MenuCaphe, "card2");

        MenuTra.setBackground(new java.awt.Color(255, 255, 255));
        MenuTra.setPreferredSize(new java.awt.Dimension(728, 1088));
        MenuTra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(242, 231, 220));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(146, 124, 102));
        jLabel96.setText("Trà cam đào");
        jPanel32.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 80, -1));

        jLabel98.setForeground(new java.awt.Color(146, 124, 102));
        jLabel98.setText("Giá");
        jPanel32.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel135.setForeground(new java.awt.Color(146, 124, 102));
        jLabel135.setText("Size");
        jPanel32.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jSpinner21.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel32.add(jSpinner21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox21.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox21.setText("Mua");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        jPanel32.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel136.setForeground(new java.awt.Color(0, 0, 0));
        jLabel136.setText("45.000");
        jPanel32.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel137.setForeground(new java.awt.Color(0, 0, 0));
        jLabel137.setText("56");
        jPanel32.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel138.setForeground(new java.awt.Color(146, 124, 102));
        jLabel138.setText("Kho");
        jPanel32.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t1.png"))); // NOI18N
        jPanel32.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel343.setForeground(new java.awt.Color(146, 124, 102));
        jLabel343.setText("Số lượng");
        jPanel32.add(jLabel343, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel32.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel33.setBackground(new java.awt.Color(242, 231, 220));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(146, 124, 102));
        jLabel140.setText("Trà xoài");
        jPanel33.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel141.setForeground(new java.awt.Color(146, 124, 102));
        jLabel141.setText("Giá");
        jPanel33.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel142.setForeground(new java.awt.Color(146, 124, 102));
        jLabel142.setText("Số lượng");
        jPanel33.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel33.add(jSpinner22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox22.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox22.setText("Mua");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        jPanel33.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel143.setForeground(new java.awt.Color(0, 0, 0));
        jLabel143.setText("45.000");
        jPanel33.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel144.setForeground(new java.awt.Color(0, 0, 0));
        jLabel144.setText("56");
        jPanel33.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel145.setForeground(new java.awt.Color(146, 124, 102));
        jLabel145.setText("Kho");
        jPanel33.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t2.png"))); // NOI18N
        jPanel33.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel344.setForeground(new java.awt.Color(146, 124, 102));
        jLabel344.setText("Size");
        jPanel33.add(jLabel344, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox21.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox21.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel33.add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel34.setBackground(new java.awt.Color(242, 231, 220));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(146, 124, 102));
        jLabel147.setText("Trà đào mâm xôi");
        jPanel34.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 110, -1));

        jLabel148.setForeground(new java.awt.Color(146, 124, 102));
        jLabel148.setText("Giá");
        jPanel34.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel149.setForeground(new java.awt.Color(146, 124, 102));
        jLabel149.setText("Số lượng");
        jPanel34.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel34.add(jSpinner23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox23.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox23.setText("Mua");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });
        jPanel34.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel150.setForeground(new java.awt.Color(0, 0, 0));
        jLabel150.setText("65.000");
        jPanel34.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel151.setForeground(new java.awt.Color(0, 0, 0));
        jLabel151.setText("56");
        jPanel34.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel152.setForeground(new java.awt.Color(146, 124, 102));
        jLabel152.setText("Kho");
        jPanel34.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t3.png"))); // NOI18N
        jPanel34.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox22.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox22.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel34.add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel345.setForeground(new java.awt.Color(146, 124, 102));
        jLabel345.setText("Size");
        jPanel34.add(jLabel345, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel35.setBackground(new java.awt.Color(242, 231, 220));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(146, 124, 102));
        jLabel154.setText("Trà ổi hồng");
        jPanel35.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel155.setForeground(new java.awt.Color(146, 124, 102));
        jLabel155.setText("Giá");
        jPanel35.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel156.setForeground(new java.awt.Color(146, 124, 102));
        jLabel156.setText("Số lượng");
        jPanel35.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel35.add(jSpinner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox24.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox24.setText("Mua");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });
        jPanel35.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel157.setForeground(new java.awt.Color(0, 0, 0));
        jLabel157.setText("55.000");
        jPanel35.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel158.setForeground(new java.awt.Color(0, 0, 0));
        jLabel158.setText("56");
        jPanel35.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel159.setForeground(new java.awt.Color(146, 124, 102));
        jLabel159.setText("Kho");
        jPanel35.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t4.png"))); // NOI18N
        jPanel35.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox23.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox23.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel35.add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel346.setForeground(new java.awt.Color(146, 124, 102));
        jLabel346.setText("Size");
        jPanel35.add(jLabel346, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel36.setBackground(new java.awt.Color(242, 231, 220));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel161.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(146, 124, 102));
        jLabel161.setText("Trà lựu đỏ");
        jPanel36.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 80, -1));

        jLabel162.setForeground(new java.awt.Color(146, 124, 102));
        jLabel162.setText("Giá");
        jPanel36.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel163.setForeground(new java.awt.Color(146, 124, 102));
        jLabel163.setText("Số lượng");
        jPanel36.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner25.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel36.add(jSpinner25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox25.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox25.setText("Mua");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel164.setForeground(new java.awt.Color(0, 0, 0));
        jLabel164.setText("55.000");
        jPanel36.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel165.setForeground(new java.awt.Color(0, 0, 0));
        jLabel165.setText("56");
        jPanel36.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel166.setForeground(new java.awt.Color(146, 124, 102));
        jLabel166.setText("Kho");
        jPanel36.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t5.png"))); // NOI18N
        jPanel36.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel347.setForeground(new java.awt.Color(146, 124, 102));
        jLabel347.setText("Size");
        jPanel36.add(jLabel347, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox24.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox24.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel36.add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel37.setBackground(new java.awt.Color(242, 231, 220));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel168.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(146, 124, 102));
        jLabel168.setText("Trà dâu");
        jPanel37.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel169.setForeground(new java.awt.Color(146, 124, 102));
        jLabel169.setText("Giá");
        jPanel37.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel170.setForeground(new java.awt.Color(146, 124, 102));
        jLabel170.setText("Số lượng");
        jPanel37.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner26.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel37.add(jSpinner26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox26.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox26.setText("Mua");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });
        jPanel37.add(jCheckBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel171.setForeground(new java.awt.Color(0, 0, 0));
        jLabel171.setText("50.000");
        jPanel37.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel172.setForeground(new java.awt.Color(0, 0, 0));
        jLabel172.setText("56");
        jPanel37.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel173.setForeground(new java.awt.Color(146, 124, 102));
        jLabel173.setText("Kho");
        jPanel37.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t6.png"))); // NOI18N
        jPanel37.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox25.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox25.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel37.add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel348.setForeground(new java.awt.Color(146, 124, 102));
        jLabel348.setText("Size");
        jPanel37.add(jLabel348, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel38.setBackground(new java.awt.Color(242, 231, 220));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel175.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(146, 124, 102));
        jLabel175.setText("Sữa đá dâu");
        jPanel38.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel176.setForeground(new java.awt.Color(146, 124, 102));
        jLabel176.setText("Giá");
        jPanel38.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel177.setForeground(new java.awt.Color(146, 124, 102));
        jLabel177.setText("Số lượng");
        jPanel38.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner27.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel38.add(jSpinner27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox27.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox27.setText("Mua");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        jPanel38.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel178.setForeground(new java.awt.Color(0, 0, 0));
        jLabel178.setText("55.000");
        jPanel38.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel179.setForeground(new java.awt.Color(0, 0, 0));
        jLabel179.setText("56");
        jPanel38.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel180.setForeground(new java.awt.Color(146, 124, 102));
        jLabel180.setText("Kho");
        jPanel38.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t7.png"))); // NOI18N
        jPanel38.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox26.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox26.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel38.add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel349.setForeground(new java.awt.Color(146, 124, 102));
        jLabel349.setText("Size");
        jPanel38.add(jLabel349, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel39.setBackground(new java.awt.Color(242, 231, 220));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel182.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(146, 124, 102));
        jLabel182.setText("Matcha đá xay");
        jPanel39.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel183.setForeground(new java.awt.Color(146, 124, 102));
        jLabel183.setText("Giá");
        jPanel39.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel184.setForeground(new java.awt.Color(146, 124, 102));
        jLabel184.setText("Số lượng");
        jPanel39.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner28.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel39.add(jSpinner28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox28.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox28.setText("Mua");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        jPanel39.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel185.setForeground(new java.awt.Color(0, 0, 0));
        jLabel185.setText("60.000");
        jPanel39.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel186.setForeground(new java.awt.Color(0, 0, 0));
        jLabel186.setText("56");
        jPanel39.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel187.setForeground(new java.awt.Color(146, 124, 102));
        jLabel187.setText("Kho");
        jPanel39.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t8.png"))); // NOI18N
        jPanel39.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel350.setForeground(new java.awt.Color(146, 124, 102));
        jLabel350.setText("Size");
        jPanel39.add(jLabel350, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox27.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox27.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel39.add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel40.setBackground(new java.awt.Color(242, 231, 220));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel189.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(146, 124, 102));
        jLabel189.setText("Dừa việt quốc");
        jPanel40.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 120, -1));

        jLabel190.setForeground(new java.awt.Color(146, 124, 102));
        jLabel190.setText("Giá");
        jPanel40.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel191.setForeground(new java.awt.Color(146, 124, 102));
        jLabel191.setText("Số lượng");
        jPanel40.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner29.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel40.add(jSpinner29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox29.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox29.setText("Mua");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });
        jPanel40.add(jCheckBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel192.setForeground(new java.awt.Color(0, 0, 0));
        jLabel192.setText("65.000");
        jPanel40.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel193.setForeground(new java.awt.Color(0, 0, 0));
        jLabel193.setText("56");
        jPanel40.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel194.setForeground(new java.awt.Color(146, 124, 102));
        jLabel194.setText("Kho");
        jPanel40.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t9.png"))); // NOI18N
        jPanel40.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        jComboBox28.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox28.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel40.add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel351.setForeground(new java.awt.Color(146, 124, 102));
        jLabel351.setText("Size");
        jPanel40.add(jLabel351, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        jPanel41.setBackground(new java.awt.Color(242, 231, 220));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel196.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(146, 124, 102));
        jLabel196.setText("Xoài mâm xôi");
        jPanel41.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 120, -1));

        jLabel197.setForeground(new java.awt.Color(146, 124, 102));
        jLabel197.setText("Giá");
        jPanel41.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel198.setForeground(new java.awt.Color(146, 124, 102));
        jLabel198.setText("Số lượng");
        jPanel41.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner30.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel41.add(jSpinner30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox30.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox30.setText("Mua");
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });
        jPanel41.add(jCheckBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel199.setForeground(new java.awt.Color(0, 0, 0));
        jLabel199.setText("65.000");
        jPanel41.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel200.setForeground(new java.awt.Color(0, 0, 0));
        jLabel200.setText("56");
        jPanel41.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel201.setForeground(new java.awt.Color(146, 124, 102));
        jLabel201.setText("Kho");
        jPanel41.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t10.png"))); // NOI18N
        jPanel41.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, -1));

        jLabel352.setForeground(new java.awt.Color(146, 124, 102));
        jLabel352.setText("Size");
        jPanel41.add(jLabel352, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox29.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox29.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel41.add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel42.setBackground(new java.awt.Color(242, 231, 220));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel203.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(146, 124, 102));
        jLabel203.setText(" Cookie sữa");
        jPanel42.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 110, -1));

        jLabel204.setForeground(new java.awt.Color(146, 124, 102));
        jLabel204.setText("Giá");
        jPanel42.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel205.setForeground(new java.awt.Color(146, 124, 102));
        jLabel205.setText("Số lượng");
        jPanel42.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner31.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel42.add(jSpinner31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox31.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox31.setText("Mua");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });
        jPanel42.add(jCheckBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel206.setForeground(new java.awt.Color(0, 0, 0));
        jLabel206.setText("65.000");
        jPanel42.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel207.setForeground(new java.awt.Color(0, 0, 0));
        jLabel207.setText("56");
        jPanel42.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel208.setForeground(new java.awt.Color(146, 124, 102));
        jLabel208.setText("Kho");
        jPanel42.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t11.png"))); // NOI18N
        jPanel42.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jComboBox30.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox30.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel42.add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        jLabel353.setForeground(new java.awt.Color(146, 124, 102));
        jLabel353.setText("Size");
        jPanel42.add(jLabel353, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        MenuTra.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel43.setBackground(new java.awt.Color(242, 231, 220));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel210.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(146, 124, 102));
        jLabel210.setText("Cookie sữa dâu");
        jPanel43.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 110, -1));

        jLabel211.setForeground(new java.awt.Color(146, 124, 102));
        jLabel211.setText("Giá");
        jPanel43.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel212.setForeground(new java.awt.Color(146, 124, 102));
        jLabel212.setText("Số lượng");
        jPanel43.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner32.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel43.add(jSpinner32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox32.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox32.setText("Mua");
        jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox32ActionPerformed(evt);
            }
        });
        jPanel43.add(jCheckBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel213.setForeground(new java.awt.Color(0, 0, 0));
        jLabel213.setText("65.000");
        jPanel43.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel214.setForeground(new java.awt.Color(0, 0, 0));
        jLabel214.setText("56");
        jPanel43.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel215.setForeground(new java.awt.Color(146, 124, 102));
        jLabel215.setText("Kho");
        jPanel43.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tea/t12.png"))); // NOI18N
        jPanel43.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel354.setForeground(new java.awt.Color(146, 124, 102));
        jLabel354.setText("Size");
        jPanel43.add(jLabel354, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox31.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox31.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel43.add(jComboBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuTra.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        MenuCard.add(MenuTra, "card3");

        MenuBanh.setBackground(new java.awt.Color(255, 255, 255));
        MenuBanh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(242, 231, 220));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel217.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(146, 124, 102));
        jLabel217.setText("Bánh mì ");
        jPanel44.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel218.setForeground(new java.awt.Color(146, 124, 102));
        jLabel218.setText("Giá");
        jPanel44.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel219.setForeground(new java.awt.Color(146, 124, 102));
        jLabel219.setText("Size ");
        jPanel44.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jSpinner33.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel44.add(jSpinner33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox33.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox33.setText("Mua");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });
        jPanel44.add(jCheckBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel220.setForeground(new java.awt.Color(0, 0, 0));
        jLabel220.setText("30.000");
        jPanel44.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel221.setForeground(new java.awt.Color(0, 0, 0));
        jLabel221.setText("Còn");
        jLabel221.setToolTipText("");
        jPanel44.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel222.setForeground(new java.awt.Color(146, 124, 102));
        jLabel222.setText("Kho");
        jPanel44.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck1.png"))); // NOI18N
        jPanel44.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel355.setForeground(new java.awt.Color(146, 124, 102));
        jLabel355.setText("Số lượng ");
        jPanel44.add(jLabel355, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jComboBox32.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox32.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel44.add(jComboBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));
        jComboBox32.getAccessibleContext().setAccessibleName("");

        MenuBanh.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 250));

        jPanel45.setBackground(new java.awt.Color(242, 231, 220));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel224.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(146, 124, 102));
        jLabel224.setText("Bánh sừng bò");
        jPanel45.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 90, -1));

        jLabel225.setForeground(new java.awt.Color(146, 124, 102));
        jLabel225.setText("Giá");
        jPanel45.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel226.setForeground(new java.awt.Color(146, 124, 102));
        jLabel226.setText("Số lượng ");
        jPanel45.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner34.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel45.add(jSpinner34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox34.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox34.setText("Mua");
        jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox34ActionPerformed(evt);
            }
        });
        jPanel45.add(jCheckBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel227.setForeground(new java.awt.Color(0, 0, 0));
        jLabel227.setText("40.000");
        jPanel45.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel228.setForeground(new java.awt.Color(0, 0, 0));
        jLabel228.setText("Còn");
        jPanel45.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel229.setForeground(new java.awt.Color(146, 124, 102));
        jLabel229.setText("Kho");
        jPanel45.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck2.png"))); // NOI18N
        jPanel45.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel356.setForeground(new java.awt.Color(146, 124, 102));
        jLabel356.setText("Size ");
        jPanel45.add(jLabel356, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox33.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox33.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel45.add(jComboBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, 250));

        jPanel46.setBackground(new java.awt.Color(242, 231, 220));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel231.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(146, 124, 102));
        jLabel231.setText("Bánh vòng");
        jPanel46.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel232.setForeground(new java.awt.Color(146, 124, 102));
        jLabel232.setText("Giá");
        jPanel46.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel233.setForeground(new java.awt.Color(146, 124, 102));
        jLabel233.setText("Số lượng ");
        jPanel46.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner35.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel46.add(jSpinner35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox35.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox35.setText("Mua");
        jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox35ActionPerformed(evt);
            }
        });
        jPanel46.add(jCheckBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel234.setForeground(new java.awt.Color(0, 0, 0));
        jLabel234.setText("35.000");
        jPanel46.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel235.setForeground(new java.awt.Color(0, 0, 0));
        jLabel235.setText("Còn");
        jPanel46.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel236.setForeground(new java.awt.Color(146, 124, 102));
        jLabel236.setText("Kho");
        jPanel46.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck3.png"))); // NOI18N
        jPanel46.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel357.setForeground(new java.awt.Color(146, 124, 102));
        jLabel357.setText("Size ");
        jPanel46.add(jLabel357, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox34.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox34.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel46.add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 160, 250));

        jPanel47.setBackground(new java.awt.Color(242, 231, 220));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel238.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(146, 124, 102));
        jLabel238.setText("Bánh tổ ong");
        jPanel47.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 80, -1));

        jLabel239.setForeground(new java.awt.Color(146, 124, 102));
        jLabel239.setText("Giá");
        jPanel47.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel240.setForeground(new java.awt.Color(146, 124, 102));
        jLabel240.setText("Số lượng ");
        jPanel47.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner36.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel47.add(jSpinner36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox36.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox36.setText("Mua");
        jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox36ActionPerformed(evt);
            }
        });
        jPanel47.add(jCheckBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel241.setForeground(new java.awt.Color(0, 0, 0));
        jLabel241.setText("40.000");
        jPanel47.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel242.setForeground(new java.awt.Color(0, 0, 0));
        jLabel242.setText("Còn");
        jPanel47.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel243.setForeground(new java.awt.Color(146, 124, 102));
        jLabel243.setText("Kho");
        jPanel47.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck4.png"))); // NOI18N
        jPanel47.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel358.setForeground(new java.awt.Color(146, 124, 102));
        jLabel358.setText("Size ");
        jPanel47.add(jLabel358, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox35.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox35.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel47.add(jComboBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 250));

        jPanel48.setBackground(new java.awt.Color(242, 231, 220));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel245.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(146, 124, 102));
        jLabel245.setText("Hamburger");
        jPanel48.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel246.setForeground(new java.awt.Color(146, 124, 102));
        jLabel246.setText("Giá");
        jPanel48.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel247.setForeground(new java.awt.Color(146, 124, 102));
        jLabel247.setText("Số lượng ");
        jPanel48.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner37.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel48.add(jSpinner37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox37.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox37.setText("Mua");
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });
        jPanel48.add(jCheckBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel248.setForeground(new java.awt.Color(0, 0, 0));
        jLabel248.setText("65.000");
        jPanel48.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel249.setForeground(new java.awt.Color(0, 0, 0));
        jLabel249.setText("Còn");
        jPanel48.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel250.setForeground(new java.awt.Color(146, 124, 102));
        jLabel250.setText("Kho");
        jPanel48.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck5.png"))); // NOI18N
        jPanel48.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel359.setForeground(new java.awt.Color(146, 124, 102));
        jLabel359.setText("Size ");
        jPanel48.add(jLabel359, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox36.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox36.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel48.add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 250));

        jPanel49.setBackground(new java.awt.Color(242, 231, 220));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel252.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(146, 124, 102));
        jLabel252.setText("Bánh hoa sen");
        jLabel252.setToolTipText("");
        jPanel49.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        jLabel253.setForeground(new java.awt.Color(146, 124, 102));
        jLabel253.setText("Giá");
        jPanel49.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel254.setForeground(new java.awt.Color(146, 124, 102));
        jLabel254.setText("Số lượng ");
        jPanel49.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner38.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel49.add(jSpinner38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox38.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox38.setText("Mua");
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });
        jPanel49.add(jCheckBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel255.setForeground(new java.awt.Color(0, 0, 0));
        jLabel255.setText("35.000");
        jPanel49.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel256.setForeground(new java.awt.Color(0, 0, 0));
        jLabel256.setText("Còn");
        jPanel49.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel257.setForeground(new java.awt.Color(146, 124, 102));
        jLabel257.setText("Kho");
        jPanel49.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck6.png"))); // NOI18N
        jPanel49.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel360.setForeground(new java.awt.Color(146, 124, 102));
        jLabel360.setText("Size ");
        jPanel49.add(jLabel360, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox37.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox37.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel49.add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 160, 250));

        jPanel50.setBackground(new java.awt.Color(242, 231, 220));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel259.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(146, 124, 102));
        jLabel259.setText("Tiramisu");
        jPanel50.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel260.setForeground(new java.awt.Color(146, 124, 102));
        jLabel260.setText("Giá");
        jPanel50.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel261.setForeground(new java.awt.Color(146, 124, 102));
        jLabel261.setText("Số lượng ");
        jPanel50.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner39.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel50.add(jSpinner39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox39.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox39.setText("Mua");
        jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox39ActionPerformed(evt);
            }
        });
        jPanel50.add(jCheckBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel262.setForeground(new java.awt.Color(0, 0, 0));
        jLabel262.setText("45.000");
        jPanel50.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel263.setForeground(new java.awt.Color(0, 0, 0));
        jLabel263.setText("Còn");
        jPanel50.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel264.setForeground(new java.awt.Color(146, 124, 102));
        jLabel264.setText("Kho");
        jPanel50.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck7.png"))); // NOI18N
        jPanel50.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel361.setForeground(new java.awt.Color(146, 124, 102));
        jLabel361.setText("Size ");
        jPanel50.add(jLabel361, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox38.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox38.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel50.add(jComboBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 250));

        jPanel51.setBackground(new java.awt.Color(242, 231, 220));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel266.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(146, 124, 102));
        jLabel266.setText("Mousse chanh dây");
        jPanel51.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        jLabel267.setForeground(new java.awt.Color(146, 124, 102));
        jLabel267.setText("Giá");
        jPanel51.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel268.setForeground(new java.awt.Color(146, 124, 102));
        jLabel268.setText("Số lượng ");
        jPanel51.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner40.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel51.add(jSpinner40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox40.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox40.setText("Mua");
        jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox40ActionPerformed(evt);
            }
        });
        jPanel51.add(jCheckBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel269.setForeground(new java.awt.Color(0, 0, 0));
        jLabel269.setText("45.000");
        jPanel51.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel270.setForeground(new java.awt.Color(0, 0, 0));
        jLabel270.setText("Còn");
        jPanel51.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel271.setForeground(new java.awt.Color(146, 124, 102));
        jLabel271.setText("Kho");
        jPanel51.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck8.png"))); // NOI18N
        jPanel51.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel362.setForeground(new java.awt.Color(146, 124, 102));
        jLabel362.setText("Size ");
        jPanel51.add(jLabel362, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox39.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox39.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel51.add(jComboBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 250));

        jPanel52.setBackground(new java.awt.Color(242, 231, 220));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel273.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(146, 124, 102));
        jLabel273.setText("Cupcake");
        jPanel52.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel274.setForeground(new java.awt.Color(146, 124, 102));
        jLabel274.setText("Giá");
        jPanel52.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel275.setForeground(new java.awt.Color(146, 124, 102));
        jLabel275.setText("Số lượng ");
        jPanel52.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner41.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel52.add(jSpinner41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox41.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox41.setText("Mua");
        jCheckBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox41ActionPerformed(evt);
            }
        });
        jPanel52.add(jCheckBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel276.setForeground(new java.awt.Color(0, 0, 0));
        jLabel276.setText("50.000");
        jPanel52.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel277.setForeground(new java.awt.Color(0, 0, 0));
        jLabel277.setText("Còn");
        jPanel52.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel278.setForeground(new java.awt.Color(146, 124, 102));
        jLabel278.setText("Kho");
        jPanel52.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel279.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck13.png"))); // NOI18N
        jPanel52.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel367.setForeground(new java.awt.Color(146, 124, 102));
        jLabel367.setText("Size ");
        jPanel52.add(jLabel367, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox44.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox44.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel52.add(jComboBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 160, 250));

        jPanel53.setBackground(new java.awt.Color(242, 231, 220));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel280.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(146, 124, 102));
        jLabel280.setText("Donut cầu vòng");
        jPanel53.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, -1));

        jLabel281.setForeground(new java.awt.Color(146, 124, 102));
        jLabel281.setText("Giá");
        jPanel53.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel282.setForeground(new java.awt.Color(146, 124, 102));
        jLabel282.setText("Số lượng ");
        jPanel53.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner42.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel53.add(jSpinner42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox42.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox42.setText("Mua");
        jCheckBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox42ActionPerformed(evt);
            }
        });
        jPanel53.add(jCheckBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel283.setForeground(new java.awt.Color(0, 0, 0));
        jLabel283.setText("50.000");
        jPanel53.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel284.setForeground(new java.awt.Color(0, 0, 0));
        jLabel284.setText("Còn");
        jPanel53.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel285.setForeground(new java.awt.Color(146, 124, 102));
        jLabel285.setText("Kho");
        jPanel53.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel286.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck10.png"))); // NOI18N
        jPanel53.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel364.setForeground(new java.awt.Color(146, 124, 102));
        jLabel364.setText("Size ");
        jPanel53.add(jLabel364, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox41.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox41.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel53.add(jComboBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 160, 250));

        jPanel54.setBackground(new java.awt.Color(242, 231, 220));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel287.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(146, 124, 102));
        jLabel287.setText("Bánh quy");
        jPanel54.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel288.setForeground(new java.awt.Color(146, 124, 102));
        jLabel288.setText("Giá");
        jPanel54.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel289.setForeground(new java.awt.Color(146, 124, 102));
        jLabel289.setText("Số lượng ");
        jPanel54.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner43.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel54.add(jSpinner43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox43.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox43.setText("Mua");
        jCheckBox43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox43ActionPerformed(evt);
            }
        });
        jPanel54.add(jCheckBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel290.setForeground(new java.awt.Color(0, 0, 0));
        jLabel290.setText("35.000");
        jPanel54.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel291.setForeground(new java.awt.Color(0, 0, 0));
        jLabel291.setText("Còn");
        jPanel54.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel292.setForeground(new java.awt.Color(146, 124, 102));
        jLabel292.setText("Kho");
        jPanel54.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel293.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck11.png"))); // NOI18N
        jPanel54.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel365.setForeground(new java.awt.Color(146, 124, 102));
        jLabel365.setText("Size ");
        jPanel54.add(jLabel365, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox42.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox42.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel54.add(jComboBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 830, 160, 250));

        jPanel55.setBackground(new java.awt.Color(242, 231, 220));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel294.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(146, 124, 102));
        jLabel294.setText("Macaroon");
        jPanel55.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel295.setForeground(new java.awt.Color(146, 124, 102));
        jLabel295.setText("Giá");
        jPanel55.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel296.setForeground(new java.awt.Color(146, 124, 102));
        jLabel296.setText("Số lượng ");
        jPanel55.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner44.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel55.add(jSpinner44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox44.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox44.setText("Mua");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });
        jPanel55.add(jCheckBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel297.setForeground(new java.awt.Color(0, 0, 0));
        jLabel297.setText("55.000");
        jPanel55.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel298.setForeground(new java.awt.Color(0, 0, 0));
        jLabel298.setText("Còn");
        jPanel55.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel299.setForeground(new java.awt.Color(146, 124, 102));
        jLabel299.setText("Kho");
        jPanel55.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck12.png"))); // NOI18N
        jPanel55.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel366.setForeground(new java.awt.Color(146, 124, 102));
        jLabel366.setText("Size ");
        jPanel55.add(jLabel366, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox43.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox43.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel55.add(jComboBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 160, 250));

        jPanel56.setBackground(new java.awt.Color(242, 231, 220));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel301.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(146, 124, 102));
        jLabel301.setText("Donut");
        jPanel56.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 70, -1));

        jLabel302.setForeground(new java.awt.Color(146, 124, 102));
        jLabel302.setText("Giá");
        jPanel56.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, -1, -1));

        jLabel303.setForeground(new java.awt.Color(146, 124, 102));
        jLabel303.setText("Số lượng ");
        jPanel56.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        jSpinner45.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        jPanel56.add(jSpinner45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jCheckBox45.setForeground(new java.awt.Color(146, 124, 102));
        jCheckBox45.setText("Mua");
        jCheckBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox45ActionPerformed(evt);
            }
        });
        jPanel56.add(jCheckBox45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel304.setForeground(new java.awt.Color(0, 0, 0));
        jLabel304.setText("35.000");
        jPanel56.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel305.setForeground(new java.awt.Color(0, 0, 0));
        jLabel305.setText("Còn");
        jPanel56.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel306.setForeground(new java.awt.Color(146, 124, 102));
        jLabel306.setText("Kho");
        jPanel56.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ck/ck9.png"))); // NOI18N
        jPanel56.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel363.setForeground(new java.awt.Color(146, 124, 102));
        jLabel363.setText("Size ");
        jPanel56.add(jLabel363, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jComboBox40.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox40.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jPanel56.add(jComboBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, 70, 30));

        MenuBanh.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 250));

        MenuCard.add(MenuBanh, "card4");

        MenuTim.setBackground(new java.awt.Color(255, 255, 255));
        MenuTim.setPreferredSize(new java.awt.Dimension(728, 1088));
        MenuTim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel315.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(0, 0, 0));
        jLabel315.setText("Tìm kiếm theo");
        MenuTim.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel316.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(0, 0, 0));
        jLabel316.setText("Nhập thông tin");
        MenuTim.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        fieldComboBox.setBackground(new java.awt.Color(255, 255, 255));
        fieldComboBox.setForeground(new java.awt.Color(0, 0, 0));
        fieldComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại SP", "Tên SP", "Giá", "Tình trạng" }));
        MenuTim.add(fieldComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 40));

        timsanphamTextfield.setBackground(new java.awt.Color(255, 255, 255));
        timsanphamTextfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timsanphamTextfield.setForeground(new java.awt.Color(0, 0, 0));
        MenuTim.add(timsanphamTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, 40));

        timsanphamButton.setBackground(new java.awt.Color(100, 19, 19));
        timsanphamButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timsanphamButton.setForeground(new java.awt.Color(255, 255, 255));
        timsanphamButton.setText("Tra cứu");
        timsanphamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timsanphamButtonActionPerformed(evt);
            }
        });
        MenuTim.add(timsanphamButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 90, 40));

        tableSanPham.setBackground(new java.awt.Color(255, 255, 255));
        tableSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSanPham.setForeground(new java.awt.Color(0, 0, 0));
        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại SP", "Tên SP", "Giá", "Tình trạng"
            }
        ));
        jScrollPane3.setViewportView(tableSanPham);

        MenuTim.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 480, 270));

        slSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        MenuTim.add(slSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, 30));

        giaLb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaLb.setForeground(new java.awt.Color(0, 0, 0));
        MenuTim.add(giaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 200, 20));

        jLabel317.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(0, 0, 0));
        jLabel317.setText("Size:");
        MenuTim.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        sizeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        sizeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        MenuTim.add(sizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 80, 30));

        ThemButton.setBackground(new java.awt.Color(100, 19, 19));
        ThemButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThemButton.setForeground(new java.awt.Color(255, 255, 255));
        ThemButton.setText("Thêm");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });
        MenuTim.add(ThemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 90, 40));

        jLabel417.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel417.setForeground(new java.awt.Color(0, 0, 0));
        jLabel417.setText("Số lượng:");
        MenuTim.add(jLabel417, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel418.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel418.setForeground(new java.awt.Color(0, 0, 0));
        jLabel418.setText("Tên sản phẩm:");
        MenuTim.add(jLabel418, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 100, -1));

        jLabel419.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel419.setForeground(new java.awt.Color(0, 0, 0));
        jLabel419.setText("Giá:");
        MenuTim.add(jLabel419, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        tenspLb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenspLb.setForeground(new java.awt.Color(0, 0, 0));
        MenuTim.add(tenspLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 290, 20));

        MenuCard.add(MenuTim, "card4");

        scrollPane1.add(MenuCard);

        jPanel1.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 460));

        btnReset.setBackground(new java.awt.Color(100, 19, 19));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Hoàn tác");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, 35));

        lbTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTimKiem.setForeground(new java.awt.Color(100, 19, 19));
        lbTimKiem.setText("Tìm kiếm");
        lbTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTimKiemMouseClicked(evt);
            }
        });
        jPanel1.add(lbTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jpMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 580, -1));

        jPanel3.setBackground(new java.awt.Color(242, 231, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(100, 19, 19));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mua hàng");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, 40));

        tableMenu.setBackground(new java.awt.Color(255, 255, 255));
        tableMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableMenu.setForeground(new java.awt.Color(0, 0, 0));
        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "SL", "Giá", "Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableMenu.setSelectionBackground(new java.awt.Color(100, 19, 19));
        tableMenu.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableMenu);
        if (tableMenu.getColumnModel().getColumnCount() > 0) {
            tableMenu.getColumnModel().getColumn(0).setResizable(false);
            tableMenu.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableMenu.getColumnModel().getColumn(1).setResizable(false);
            tableMenu.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 390));

        lbmenusl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbmenusl.setForeground(new java.awt.Color(0, 0, 0));
        lbmenusl.setText("0");
        jPanel3.add(lbmenusl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 110, -1));

        lbmenutt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbmenutt.setForeground(new java.awt.Color(0, 0, 0));
        lbmenutt.setText("0");
        jPanel3.add(lbmenutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, -1));

        jLabel370.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel370.setForeground(new java.awt.Color(0, 0, 0));
        jLabel370.setText("Số lượng:");
        jPanel3.add(jLabel370, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 420, -1, -1));

        jLabel415.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel415.setForeground(new java.awt.Color(0, 0, 0));
        jLabel415.setText("Tổng thanh toán:");
        jPanel3.add(jLabel415, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 450, -1, -1));

        jpMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 531));

        pnContainer.add(jpMenu, "card5");

        jpThanhtoan.setBackground(new java.awt.Color(255, 255, 255));
        jpThanhtoan.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.setPreferredSize(new java.awt.Dimension(900, 531));
        jpThanhtoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel320.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(0, 0, 0));
        jLabel320.setText("Phương thức thanh toán");
        jpThanhtoan.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel321.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(100, 19, 19));
        jLabel321.setText("THANH TOÁN");
        jpThanhtoan.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel322.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(0, 0, 0));
        jLabel322.setText("Mã giảm giá");
        jpThanhtoan.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel323.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(0, 0, 0));
        jLabel323.setText("Địa chỉ");
        jpThanhtoan.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel324.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(0, 0, 0));
        jLabel324.setText("Địa chỉ chi tiết (nếu có)");
        jpThanhtoan.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel325.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(0, 0, 0));
        jLabel325.setText("Lưu ý cho nhân viên");
        jpThanhtoan.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel326.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel326.setForeground(new java.awt.Color(0, 0, 0));
        jLabel326.setText("Hẹn giờ đặt (nếu có)");
        jpThanhtoan.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "VNPay", "Momo", "Apple Pay" }));
        jpThanhtoan.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TETVN", "TCH50", "TCH70", "TCH0D" }));
        jpThanhtoan.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Địa chỉ khác" }));
        jpThanhtoan.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 40));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 250, 40));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 125, 40));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jpThanhtoan.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 250, 50));

        jButton1.setBackground(new java.awt.Color(100, 19, 19));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xác nhận");
        jpThanhtoan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 100, 40));

        jButton2.setBackground(new java.awt.Color(100, 19, 19));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Quay lại");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpThanhtoan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 100, 40));

        jPanel4.setBackground(new java.awt.Color(100, 19, 19));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(320, 720));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel371.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel371.setForeground(new java.awt.Color(168, 138, 107));
        jLabel371.setText("THE COFFEE HOME");
        jPanel8.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel372.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel372.setForeground(new java.awt.Color(0, 0, 0));
        jLabel372.setText("HOÁ ĐƠN THANH TOÁN");
        jPanel8.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel373.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel373.setForeground(new java.awt.Color(0, 0, 0));
        jLabel373.setText("Mã hoá đơn: HD01");
        jPanel8.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel374.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel374.setForeground(new java.awt.Color(0, 0, 0));
        jLabel374.setText("Ngày: 19-05-2024");
        jPanel8.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "SL", "Giá", "Tiền"
            }
        ));
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 170));

        jLabel375.setForeground(new java.awt.Color(0, 0, 0));
        jLabel375.setText("Tổng số món: 5");
        jPanel8.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel376.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel376.setForeground(new java.awt.Color(0, 0, 0));
        jLabel376.setText("Tiền ship:");
        jPanel8.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel377.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel377.setForeground(new java.awt.Color(0, 0, 0));
        jLabel377.setText("Tổng tiền:");
        jPanel8.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel378.setForeground(new java.awt.Color(0, 0, 0));
        jLabel378.setText("Thanh toán tiền mặt");
        jPanel8.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel379.setForeground(new java.awt.Color(0, 0, 0));
        jLabel379.setText("----------------------------------------------------------------------------");
        jPanel8.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 370, -1));

        jLabel380.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel380.setForeground(new java.awt.Color(0, 0, 0));
        jLabel380.setText("Khuyến mãi:");
        jPanel8.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel381.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel381.setForeground(new java.awt.Color(0, 0, 0));
        jLabel381.setText("Điểm tích luỹ:");
        jPanel8.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel382.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel382.setForeground(new java.awt.Color(0, 0, 0));
        jLabel382.setText("Cảm ơn quý khách!");
        jPanel8.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        jLabel383.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel383.setForeground(new java.awt.Color(0, 0, 0));
        jLabel383.setText("   thecoffeehome.com.vn");
        jPanel8.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 130, -1));

        jLabel384.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel384.setForeground(new java.awt.Color(0, 0, 0));
        jLabel384.setText("TP. Thủ Đức, TP. Hồ Chí Minh");
        jPanel8.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel385.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel385.setForeground(new java.awt.Color(0, 0, 0));
        jLabel385.setText("Địa chỉ: 22/52 Đường Võ Văn Ngân, ");
        jPanel8.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel386.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel386.setForeground(new java.awt.Color(0, 0, 0));
        jLabel386.setText("20,000 Đ");
        jPanel8.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel387.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel387.setForeground(new java.awt.Color(0, 0, 0));
        jLabel387.setText("100,000 Đ");
        jPanel8.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel388.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel388.setForeground(new java.awt.Color(0, 0, 0));
        jLabel388.setText("10");
        jPanel8.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, -1));

        jLabel389.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel389.setForeground(new java.awt.Color(0, 0, 0));
        jLabel389.setText("490,000 Đ");
        jPanel8.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 60, -1));

        jLabel390.setForeground(new java.awt.Color(0, 0, 0));
        jLabel390.setText("Khách hàng: Đỗ Minh Nghiêm");
        jPanel8.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLabel391.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel391.setForeground(new java.awt.Color(0, 0, 0));
        jLabel391.setText("Thành tiền:");
        jPanel8.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel392.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel392.setForeground(new java.awt.Color(0, 0, 0));
        jLabel392.setText("580,000 Đ");
        jPanel8.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel393.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel393.setForeground(new java.awt.Color(168, 138, 107));
        jLabel393.setText("THE COFFEE HOME");
        jPanel14.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel394.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel394.setForeground(new java.awt.Color(0, 0, 0));
        jLabel394.setText("HOÁ ĐƠN THANH TOÁN");
        jPanel14.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel395.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel395.setForeground(new java.awt.Color(0, 0, 0));
        jLabel395.setText("Mã hoá đơn: HD01");
        jPanel14.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel396.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel396.setForeground(new java.awt.Color(0, 0, 0));
        jLabel396.setText("Ngày: 19-05-2024");
        jPanel14.add(jLabel396, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "SL", "Giá", "Thành tiền"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 170));

        jLabel397.setForeground(new java.awt.Color(0, 0, 0));
        jLabel397.setText("Tổng số món: 5");
        jPanel14.add(jLabel397, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel398.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel398.setForeground(new java.awt.Color(0, 0, 0));
        jLabel398.setText("Tiền ship:");
        jPanel14.add(jLabel398, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel399.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel399.setForeground(new java.awt.Color(0, 0, 0));
        jLabel399.setText("Tổng tiền:");
        jPanel14.add(jLabel399, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel400.setForeground(new java.awt.Color(0, 0, 0));
        jLabel400.setText("Thanh toán tiền mặt");
        jPanel14.add(jLabel400, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel401.setForeground(new java.awt.Color(0, 0, 0));
        jLabel401.setText("--------------------------------------------------------------");
        jPanel14.add(jLabel401, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel402.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel402.setForeground(new java.awt.Color(0, 0, 0));
        jLabel402.setText("Khuyến mãi:");
        jPanel14.add(jLabel402, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel403.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel403.setForeground(new java.awt.Color(0, 0, 0));
        jLabel403.setText("Điểm tích luỹ:");
        jPanel14.add(jLabel403, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel404.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel404.setForeground(new java.awt.Color(0, 0, 0));
        jLabel404.setText("Cảm ơn quý khách!");
        jPanel14.add(jLabel404, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        jLabel405.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel405.setForeground(new java.awt.Color(0, 0, 0));
        jLabel405.setText("   thecoffeehome.com.vn");
        jPanel14.add(jLabel405, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 130, -1));

        jLabel406.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel406.setForeground(new java.awt.Color(0, 0, 0));
        jLabel406.setText("TP. Thủ Đức, TP. Hồ Chí Minh");
        jPanel14.add(jLabel406, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel407.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel407.setForeground(new java.awt.Color(0, 0, 0));
        jLabel407.setText("Địa chỉ: 22/52 Đường Võ Văn Ngân, ");
        jPanel14.add(jLabel407, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel408.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel408.setForeground(new java.awt.Color(0, 0, 0));
        jLabel408.setText("20,000 Đ");
        jPanel14.add(jLabel408, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel409.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel409.setForeground(new java.awt.Color(0, 0, 0));
        jLabel409.setText("100,000 Đ");
        jPanel14.add(jLabel409, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel410.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel410.setForeground(new java.awt.Color(0, 0, 0));
        jLabel410.setText("10");
        jPanel14.add(jLabel410, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, -1));

        jLabel411.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel411.setForeground(new java.awt.Color(0, 0, 0));
        jLabel411.setText("490,000 Đ");
        jPanel14.add(jLabel411, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 60, -1));

        jLabel412.setForeground(new java.awt.Color(0, 0, 0));
        jLabel412.setText("Khách hàng: Đỗ Minh Nghiêm");
        jPanel14.add(jLabel412, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLabel413.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel413.setForeground(new java.awt.Color(0, 0, 0));
        jLabel413.setText("Thành tiền:");
        jPanel14.add(jLabel413, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel414.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel414.setForeground(new java.awt.Color(0, 0, 0));
        jLabel414.setText("580,000 Đ");
        jPanel14.add(jLabel414, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 330, 720));

        scrollPane2.add(jPanel8);

        jPanel4.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 0, 350, 460));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(100, 19, 19));
        jButton10.setText("Thanh toán");
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, 350, 40));

        jpThanhtoan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 410, 530));

        pnContainer.add(jpThanhtoan, "card3");

        pnMain.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, -1, 531));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 185, 130));
        jLabel8.setText("THE COFFEE HOME");
        pnMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel313.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel313.setForeground(new java.awt.Color(255, 255, 255));
        jLabel313.setText("MỞ");
        jLabel313.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel313MouseClicked(evt);
            }
        });
        pnMain.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        // Thiết lập mảng 
        spinners = new JSpinner[]{
            jSpinner5, jSpinner6, jSpinner7, jSpinner8, jSpinner9,
            jSpinner10, jSpinner11, jSpinner12, jSpinner13, jSpinner14,
            jSpinner15, jSpinner16, jSpinner17, jSpinner18, jSpinner19,
            jSpinner20, jSpinner21, jSpinner22, jSpinner23, jSpinner24,
            jSpinner25, jSpinner26, jSpinner27, jSpinner28, jSpinner29,
            jSpinner30, jSpinner31, jSpinner32, jSpinner33, jSpinner34,
            jSpinner35, jSpinner36, jSpinner37, jSpinner38, jSpinner39,
            jSpinner40, jSpinner41, jSpinner42, jSpinner43, jSpinner44,
            jSpinner45, slSpinner
        };

        // Thiết lập mảng 
        checkBoxes = new JCheckBox[]{
            jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8, jCheckBox9,
            jCheckBox10, jCheckBox11, jCheckBox12, jCheckBox13, jCheckBox14,
            jCheckBox15, jCheckBox16, jCheckBox17, jCheckBox18, jCheckBox19,
            jCheckBox20, jCheckBox21, jCheckBox22, jCheckBox23, jCheckBox24,
            jCheckBox25, jCheckBox26, jCheckBox27, jCheckBox28, jCheckBox29,
            jCheckBox30, jCheckBox31, jCheckBox32, jCheckBox33, jCheckBox34,
            jCheckBox35, jCheckBox36, jCheckBox37, jCheckBox38, jCheckBox39,
            jCheckBox40, jCheckBox41, jCheckBox42, jCheckBox43, jCheckBox44,
            jCheckBox45
        };

        // Thiết lập mảng
        comboBoxes = new JComboBox[]{
            jComboBox4, jComboBox5, jComboBox6, jComboBox7, jComboBox8,
            jComboBox9, jComboBox10, jComboBox11, jComboBox12, jComboBox13,
            jComboBox14, jComboBox15, jComboBox16, jComboBox17, jComboBox18,
            jComboBox19, jComboBox20, jComboBox21, jComboBox22, jComboBox23,
            jComboBox24, jComboBox25, jComboBox26, jComboBox27, jComboBox28,
            jComboBox29, jComboBox30, jComboBox31, jComboBox32, jComboBox33,
            jComboBox34, jComboBox35, jComboBox36, jComboBox37, jComboBox38,
            jComboBox39, jComboBox40, jComboBox41, jComboBox42, jComboBox43,
            jComboBox44, sizeComboBox
        };
    }

    public void addSVG() // Thêm file svg vào giao diện
    {
//        svgA.setSVGImage("image_svg/logo.svg", 300, 300);
//        svgB.setSVGImage("image_svg/discount.svg", 60, 60);
//        openMenu.setSVGImage("image_svg/menu.svg", 30, 30);
//        closeMenu.setSVGImage("image_svg/closemenu.svg", 30, 30);
//        mainLogo.setSVGImage("image_svg/mainlogo.svg", 90, 90);
//        svgHome.setSVGImage("image_svg/home.svg", 30, 30);
//        svgAccount.setSVGImage("image_svg/account.svg", 30, 30);
//        svgVou.setSVGImage("image_svg/voucher.svg", 30, 30);
//        svgShop.setSVGImage("image_svg/shop.svg", 30, 30);
//        svgHistory.setSVGImage("image_svg/his.svg", 30, 30);
//        svgChat.setSVGImage("image_svg/chat.svg", 30, 30);
//        svgLogout.setSVGImage("image_svg/logout.svg", 30, 30);
    }

    // THIẾT KẾ GIAO DIỆN ------------------------------------------------------

    public void openMenuBar()
    {
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    pnSlideMenu.setSize(i, height);
                    // mở từ từ 
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    } 

    public void closeMenuBar()
    {
        // Tạo luồng chạy song song với luồng chính 
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    pnSlideMenu.setSize(i, height);
                    // mở từ từ 
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    // XỬ LÝ TRÊN PANEL XEM KHUYẾN MÃI -----------------------------------------

    public void khuyenmai() {
        ArrayList<KhuyenMai> kml = new ArrayList<>();
        kml = khuyenmaidao.getVoucherData();

        DefaultTableModel tableModel = (DefaultTableModel) tableKhuyenMai.getModel();

        for (KhuyenMai khuyenmai : kml) {
            Vector v = new Vector();
            v.add(khuyenmai.getId_km());
            v.add(khuyenmai.getLoaikm());
            v.add(khuyenmai.getDieukien());
            v.add(khuyenmai.getGiamgia());
            v.add(khuyenmai.getNgaybd());
            v.add(khuyenmai.getNgaykt());
            tableModel.addRow(v);
        }

        tableKhuyenMai.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableKhuyenMai.getSelectedRow();
                if (selectedRow != -1) {
                    Object makm = tableKhuyenMai.getValueAt(selectedRow, 0);
                    // Giao diện xem khuyến mãi
                    KhuyenMai k = khuyenmaidao.getVoucherDataBaseOnID(Integer.parseInt(makm.toString()));
                    
                    makmTextfield.setText(makm.toString());
                    loaikmTextfield.setText(k.getLoaikm());
                    ngaybdTextfield.setText(new SimpleDateFormat("dd/MM/yyyy").format(k.getNgaybd()));
                    ngayktTextfield.setText(new SimpleDateFormat("dd/MM/yyyy").format(k.getNgaykt()));
                    
                    makmLb.setText("ID: " + makm.toString());
                    dieukienLb.setText("*Đơn tối thiểu " + String.format("%.0f", k.getDieukien()));
                    tenkmLb.setText("GIẢM " + ((int) k.getGiamgia()) + "%");
                    ngayLb.setText("HSD: " + new SimpleDateFormat("dd/MM/yyyy").format(k.getNgaybd()) + " - " + new SimpleDateFormat("dd/MM/yyyy").format(k.getNgaykt()));
                    
                    makmTextfield.setEditable(false);
                    loaikmTextfield.setEditable(false);
                    ngaybdTextfield.setEditable(false);
                    ngayktTextfield.setEditable(false);
                }
            }
        });
    }

    // XỬ LÝ TRÊN PANEL QUẢN LÝ TÀI KHOẢN --------------------------------------
 
    public boolean isAccountEmpty()
    {
        return amUsername.getText().isEmpty() || amPassword.getText().isEmpty() || amPhone.getText().isEmpty() || 
           amName.getText().isEmpty() || amSex.getSelectedItem() == null || amAddress.getText().isEmpty();
    }
    
    public void account() {
        Khach k = user.getUserData(khach.getUsername());
        
        // Thêm dữ liệu cho đối tượng chung
        khach.setId_k(k.getId_k()); 
        khach.setSdt(k.getSdt()); 

        amID.setText("ID: " + String.valueOf(k.getId_k()));
        amNameDisplay.setText(k.getTenk());
        userUsername.setText(k.getUsername());
        amDiem.setText(String.valueOf(k.getDiem()));

        amUsername.setText(k.getUsername());
        amPassword.setText(k.getPassword());
        amPhone.setText(k.getSdt());
        amName.setText(k.getTenk());
        amAddress.setText(k.getDiachi());
        amSignDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(k.getNgaydk()));

        amSignDate.setEditable(false);
        amDiem.setEditable(false);

//        svgAva.setSVGImage("image_svg/nam.svg", 160, 160);
//        if ("Nữ".equals(k.getGioitinh())) {
//            svgAva.setSVGImage("image_svg/nu.svg", 160, 160);
//            amSex.setSelectedItem("Nữ");
//        }
    }

    // XỬ LÝ TRÊN PANEL MENU ---------------------------------------------------
    
    public void reset() {
        // Reset lựa chọn
        for (JSpinner spinner : spinners) {
            spinner.setValue(0);
        }

        // Reset các checkbox
        for (JCheckBox checkBox : checkBoxes) {
            checkBox.setSelected(false);
        }

        // Reset ác combobox
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.setSelectedItem("M");
        }
        
        // Reset tổng
        menusl = 0; menutt = 0.0;
        lbmenusl.setText("0"); lbmenutt.setText("0");

        // Reset bảng (xoá hết dữ liệu vừa thêm vào bảng)
        DefaultTableModel tableModel = (DefaultTableModel) tableMenu.getModel();
        tableModel.setRowCount(0);
    }

    public Boolean checkCheckBox(JSpinner jSpinner, JCheckBox jCheckbox) {
        if (jCheckbox.isSelected()) {
            if ((Integer) jSpinner.getValue() <= 0) {
                jCheckbox.setSelected(false);
                JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            } else {
                return true;
            }
        }
        return false;
    }

    public void addMenuTable(String tensp, String size, Integer soluong, Double gia) {
        if (size.equals("L")) {gia += 10000.0;}
        String ten = tensp + "  (" + size + ")";
        double thanhtien = soluong * gia;

        DefaultTableModel tableModel = (DefaultTableModel) tableMenu.getModel();
        Vector v = new Vector();
        v.add(ten);
        v.add(soluong);
        v.add(gia);
        v.add(thanhtien);
        tableModel.addRow(v);
        
        // Cập nhật tổng số lượng và tổng thành tiền
        menusl += soluong;
        menutt += thanhtien;
        lbmenusl.setText(String.valueOf(menusl));
        lbmenutt.setText(String.format("%.2f", menutt));
    }

    // XỬ LÝ TRÊN PANEL MENU (TIMKIEM) -----------------------------------------
    
    public void sanpham() {
        ArrayList<SanPham> spl = new ArrayList<>();
        spl = sanphamdao.getProductData();

        DefaultTableModel tableModel = (DefaultTableModel) tableSanPham.getModel();

        for (SanPham sanpham : spl) {
            Vector v = new Vector();
            v.add(sanpham.getLoaisp());
            v.add(sanpham.getTensp());
            v.add(sanpham.getGia());
            v.add(sanpham.getTinhtrang());
            tableModel.addRow(v);
        }
        
        tableSanPham.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableSanPham.getSelectedRow();
                if (selectedRow != -1) {
                    // Lấy tên và giá sản phẩm
                    tenspLb.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    giaLb.setText(tableModel.getValueAt(selectedRow, 2).toString());
                }
            }
        });
    }
 
    public void timSanPham() {
        String selected = fieldComboBox.getSelectedItem().toString();
        if (selected.equals("Loại SP")) {
            selected = "loaisp";
        } else if (selected.equals("Tên SP")) {
            selected = "tensp";
        } else if (selected.equals("Giá")) {
            selected = "gia";
        } else if (selected.equals("Tình trạng")) {
            selected = "tinhtrang";
        }

        DefaultTableModel tableModel = (DefaultTableModel) tableSanPham.getModel();
        tableModel.setRowCount(0);

        ArrayList<SanPham> spl = sanphamdao.searchProductData(selected, timsanphamTextfield.getText());

        for (SanPham sanpham : spl) {
            Vector v = new Vector();
            v.add(sanpham.getLoaisp());
            v.add(sanpham.getTensp());
            v.add(sanpham.getGia());
            v.add(sanpham.getTinhtrang());
            tableModel.addRow(v);
        }
    }
    
    public void themSanPham() {
        int soluong = Integer.parseInt(slSpinner.getValue().toString());
        Double gia = Double.parseDouble(giaLb.getText());

        if (sizeComboBox.getSelectedItem().equals("L")) {gia += 10000.0;}
        String ten = tenspLb.getText() + "  (" + sizeComboBox.getSelectedItem() + ")";
        double thanhtien = soluong * gia;

        DefaultTableModel tableModel = (DefaultTableModel) tableMenu.getModel();
        Vector v = new Vector();
        v.add(ten);
        v.add(soluong);
        v.add(gia);
        v.add(thanhtien);
        tableModel.addRow(v);

        // Cập nhật tổng số lượng và tổng thành tiền
        menusl += soluong;
        menutt += thanhtien;
        lbmenusl.setText(String.valueOf(menusl));
        lbmenutt.setText(String.format("%.2f", menutt));
    }
      
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(true);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbAccountMouseClicked

    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        closeMenuBar();
        jpHomea.setVisible(true);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbHomeMouseClicked

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_openMenuMouseClicked

    private void closeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuMouseClicked

    private void mainLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLogoMouseClicked
        closeMenuBar();
        jpHomea.setVisible(true);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_mainLogoMouseClicked

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(false);
        jpMenu.setVisible(true);
        jpVoucher.setVisible(false);
    }//GEN-LAST:event_lbMenuMouseClicked

    private void amAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amAddressActionPerformed

    }//GEN-LAST:event_amAddressActionPerformed

    private void amPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amPasswordActionPerformed

    }//GEN-LAST:event_amPasswordActionPerformed

    private void amPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amPhoneActionPerformed

    }//GEN-LAST:event_amPhoneActionPerformed

    private void amNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amNameActionPerformed

    }//GEN-LAST:event_amNameActionPerformed

    private void amUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amUsernameActionPerformed

    }//GEN-LAST:event_amUsernameActionPerformed

    private void amSignDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amSignDateActionPerformed

    }//GEN-LAST:event_amSignDateActionPerformed

    // Chỉnh sửa tài khoản
    private void amSavebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amSavebtActionPerformed
        if (!isAccountEmpty()) {
            if (!user.isUsernameExist(amUsername.getText()) || amUsername.getText().equals(khach.getUsername())) {
                if (!user.isPhoneExist(amPhone.getText()) || amPhone.getText().equals(khach.getSdt())) {
                    user.updateAccount(khach.getId_k(), amUsername.getText(), amPassword.getText(), amName.getText(), amPhone.getText(), amSex.getSelectedItem().toString(), amAddress.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin bắt buộc.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_amSavebtActionPerformed

    // Xoá tài khoản
    private void amDeletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amDeletebtActionPerformed
        if (user.deleteAccount(khach.getId_k())) {
            new First().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_amDeletebtActionPerformed

    private void lbPurchase1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPurchase1MouseClicked

    }//GEN-LAST:event_lbPurchase1MouseClicked

    private void lbPurchase2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPurchase2MouseClicked

    }//GEN-LAST:event_lbPurchase2MouseClicked

    private void lbCapheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCapheMouseClicked
        MenuCaphe.setVisible(true);
        MenuTra.setVisible(false);
        MenuBanh.setVisible(false);
        MenuTim.setVisible(false);
    }//GEN-LAST:event_lbCapheMouseClicked

    private void lbTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTraMouseClicked
        MenuCaphe.setVisible(false);
        MenuTra.setVisible(true);
        MenuBanh.setVisible(false);
        MenuTim.setVisible(false);
    }//GEN-LAST:event_lbTraMouseClicked

    private void lbBanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBanhMouseClicked
        MenuCaphe.setVisible(false);
        MenuTra.setVisible(false);
        MenuBanh.setVisible(true);
        MenuTim.setVisible(false);
    }//GEN-LAST:event_lbBanhMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void lbAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccount1MouseClicked
        closeMenuBar();
        jpHome.setVisible(false);
        jpAccount.setVisible(false);
        jpMenu.setVisible(false);
        jpVoucher.setVisible(true);
    }//GEN-LAST:event_lbAccount1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (tableMenu.getRowCount() > 0) {
            jpMenu.setVisible(false);
            jpThanhtoan.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Giỏ hàng của bạn trống", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jpMenu.setVisible(true);
        jpThanhtoan.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner9StateChanged

    }//GEN-LAST:event_jSpinner9StateChanged

    // Các CheckBox ở menu cà phê
    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if (checkCheckBox(jSpinner9, jCheckBox9)) {
            addMenuTable("Coldbrew", (String) jComboBox5.getSelectedItem(), (Integer) jSpinner9.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if (checkCheckBox(jSpinner10, jCheckBox10)) {
            addMenuTable("Bạc sĩu", (String) jComboBox6.getSelectedItem(), (Integer) jSpinner10.getValue(), 39000.0);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        if (checkCheckBox(jSpinner11, jCheckBox11)) {
            addMenuTable("Cà phê muối", (String) jComboBox7.getSelectedItem(), (Integer) jSpinner11.getValue(), 39000.0);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        if (checkCheckBox(jSpinner12, jCheckBox12)) {
            addMenuTable("Cà phê caramel", (String) jComboBox8.getSelectedItem(), (Integer) jSpinner12.getValue(), 49000.0);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        if (checkCheckBox(jSpinner13, jCheckBox13)) {
            addMenuTable("Bạc sĩu caramel", (String) jComboBox9.getSelectedItem(), (Integer) jSpinner13.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        if (checkCheckBox(jSpinner14, jCheckBox14)) {
            addMenuTable("Cà phê trứng", (String) jComboBox10.getSelectedItem(), (Integer) jSpinner14.getValue(), 39000.0);
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        if (checkCheckBox(jSpinner15, jCheckBox15)) {
            addMenuTable("Cà phê kem sữa", (String) jComboBox11.getSelectedItem(), (Integer) jSpinner15.getValue(), 39000.0);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        if (checkCheckBox(jSpinner16, jCheckBox16)) {
            addMenuTable("Cà phê sữa tươi", (String) jComboBox12.getSelectedItem(), (Integer) jSpinner16.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        if (checkCheckBox(jSpinner17, jCheckBox17)) {
            addMenuTable("Cà phê sương sáo", (String) jComboBox13.getSelectedItem(), (Integer) jSpinner17.getValue(), 45000.0);
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        if (checkCheckBox(jSpinner18, jCheckBox18)) {
            addMenuTable("Cà phê dừa", (String) jComboBox14.getSelectedItem(), (Integer) jSpinner18.getValue(), 59000.0);
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        if (checkCheckBox(jSpinner19, jCheckBox19)) {
            addMenuTable("Chocolate đá xay", (String) jComboBox15.getSelectedItem(), (Integer) jSpinner19.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        if (checkCheckBox(jSpinner20, jCheckBox20)) {
            addMenuTable("Milo đá xay", (String) jComboBox16.getSelectedItem(), (Integer) jSpinner20.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (checkCheckBox(jSpinner7, jCheckBox7)) {
            addMenuTable("Caramel đá xay", (String) jComboBox17.getSelectedItem(), (Integer) jSpinner7.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (checkCheckBox(jSpinner6, jCheckBox6)) {
            addMenuTable("Oreo đá xay", (String) jComboBox18.getSelectedItem(), (Integer) jSpinner6.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (checkCheckBox(jSpinner8, jCheckBox8)) {
            addMenuTable("Cookie đá xay", (String) jComboBox19.getSelectedItem(), (Integer) jSpinner8.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (checkCheckBox(jSpinner5, jCheckBox5)) {
            addMenuTable("Cà phê óc chó", (String) jComboBox20.getSelectedItem(), (Integer) jSpinner5.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    // Các CheckBox ở menu trà
    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        if (checkCheckBox(jSpinner21, jCheckBox21)) {
            addMenuTable("Trà cam đào", (String) jComboBox4.getSelectedItem(), (Integer) jSpinner21.getValue(), 45000.0);
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        if (checkCheckBox(jSpinner22, jCheckBox22)) {
            addMenuTable("Trà xoài", (String) jComboBox21.getSelectedItem(), (Integer) jSpinner22.getValue(), 45000.0);
        }
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        if (checkCheckBox(jSpinner23, jCheckBox23)) {
            addMenuTable("Trà đào mâm xôi", (String) jComboBox22.getSelectedItem(), (Integer) jSpinner23.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        if (checkCheckBox(jSpinner24, jCheckBox24)) {
            addMenuTable("Trà ổi hồng", (String) jComboBox23.getSelectedItem(), (Integer) jSpinner24.getValue(), 55000.0);
        }
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        if (checkCheckBox(jSpinner25, jCheckBox25)) {
            addMenuTable("Trà lựu đỏ", (String) jComboBox24.getSelectedItem(), (Integer) jSpinner25.getValue(), 55000.0);
        }
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        if (checkCheckBox(jSpinner26, jCheckBox26)) {
            addMenuTable("Trà dâu", (String) jComboBox25.getSelectedItem(), (Integer) jSpinner26.getValue(), 50000.0);
        }
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        if (checkCheckBox(jSpinner27, jCheckBox27)) {
            addMenuTable("Sữa đá dâu", (String) jComboBox26.getSelectedItem(), (Integer) jSpinner27.getValue(), 55000.0);
        }
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
        if (checkCheckBox(jSpinner28, jCheckBox28)) {
            addMenuTable("Matcha đá xay", (String) jComboBox27.getSelectedItem(), (Integer) jSpinner28.getValue(), 60000.0);
        }
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
        if (checkCheckBox(jSpinner29, jCheckBox29)) {
            addMenuTable("Dừa việt quốc", (String) jComboBox28.getSelectedItem(), (Integer) jSpinner29.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        if (checkCheckBox(jSpinner30, jCheckBox30)) {
            addMenuTable("Xoài mâm xôi", (String) jComboBox29.getSelectedItem(), (Integer) jSpinner30.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        if (checkCheckBox(jSpinner31, jCheckBox31)) {
            addMenuTable("Cookie sữa", (String) jComboBox30.getSelectedItem(), (Integer) jSpinner31.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox32ActionPerformed
        if (checkCheckBox(jSpinner32, jCheckBox32)) {
            addMenuTable("Cookie sữa dâu", (String) jComboBox31.getSelectedItem(), (Integer) jSpinner32.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox32ActionPerformed

    // Các CheckBox ở menu bánh
    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox33ActionPerformed
        if (checkCheckBox(jSpinner33, jCheckBox33)) {
            addMenuTable("Bánh mì", (String) jComboBox32.getSelectedItem(), (Integer) jSpinner33.getValue(), 30000.0);
        }
    }//GEN-LAST:event_jCheckBox33ActionPerformed

    private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox34ActionPerformed
        if (checkCheckBox(jSpinner34, jCheckBox34)) {
            addMenuTable("Bánh sừng bò", (String) jComboBox33.getSelectedItem(), (Integer) jSpinner34.getValue(), 40000.0);
        }
    }//GEN-LAST:event_jCheckBox34ActionPerformed

    private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox35ActionPerformed
        if (checkCheckBox(jSpinner35, jCheckBox35)) {
            addMenuTable("Bánh vòng", (String) jComboBox34.getSelectedItem(), (Integer) jSpinner35.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox35ActionPerformed

    private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox36ActionPerformed
        if (checkCheckBox(jSpinner36, jCheckBox36)) {
            addMenuTable("Bánh tổ ong", (String) jComboBox35.getSelectedItem(), (Integer) jSpinner36.getValue(), 40000.0);
        }
    }//GEN-LAST:event_jCheckBox36ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox37ActionPerformed
        if (checkCheckBox(jSpinner37, jCheckBox37)) {
            addMenuTable("Hamburger", (String) jComboBox36.getSelectedItem(), (Integer) jSpinner37.getValue(), 65000.0);
        }
    }//GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox38ActionPerformed
        if (checkCheckBox(jSpinner38, jCheckBox38)) {
            addMenuTable("Bánh hoa sen", (String) jComboBox37.getSelectedItem(), (Integer) jSpinner38.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox38ActionPerformed

    private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox39ActionPerformed
        if (checkCheckBox(jSpinner39, jCheckBox39)) {
            addMenuTable("Tiramisu", (String) jComboBox38.getSelectedItem(), (Integer) jSpinner39.getValue(), 45000.0);
        }
    }//GEN-LAST:event_jCheckBox39ActionPerformed

    private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox40ActionPerformed
        if (checkCheckBox(jSpinner40, jCheckBox40)) {
            addMenuTable("Mousse chanh dây", (String) jComboBox39.getSelectedItem(), (Integer) jSpinner40.getValue(), 45000.0);
        }
    }//GEN-LAST:event_jCheckBox40ActionPerformed

    private void jCheckBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox45ActionPerformed
        if (checkCheckBox(jSpinner45, jCheckBox45)) {
            addMenuTable("Donut", (String) jComboBox40.getSelectedItem(), (Integer) jSpinner45.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox45ActionPerformed

    private void jCheckBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox42ActionPerformed
        if (checkCheckBox(jSpinner42, jCheckBox42)) {
            addMenuTable("Donut cầu vòng", (String) jComboBox41.getSelectedItem(), (Integer) jSpinner42.getValue(), 50000.0);
        }
    }//GEN-LAST:event_jCheckBox42ActionPerformed

    private void jCheckBox43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox43ActionPerformed
        if (checkCheckBox(jSpinner43, jCheckBox43)) {
            addMenuTable("Bánh quy", (String) jComboBox42.getSelectedItem(), (Integer) jSpinner43.getValue(), 35000.0);
        }
    }//GEN-LAST:event_jCheckBox43ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed
        if (checkCheckBox(jSpinner44, jCheckBox44)) {
            addMenuTable("Macaroon", (String) jComboBox43.getSelectedItem(), (Integer) jSpinner44.getValue(), 55000.0);
        }
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jCheckBox41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox41ActionPerformed
        if (checkCheckBox(jSpinner41, jCheckBox41)) {
            addMenuTable("Cupcake", (String) jComboBox44.getSelectedItem(), (Integer) jSpinner41.getValue(), 50000.0);
        }
    }//GEN-LAST:event_jCheckBox41ActionPerformed

    private void lbTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTimKiemMouseClicked
        MenuCaphe.setVisible(false);
        MenuTra.setVisible(false);
        MenuBanh.setVisible(false);
        MenuTim.setVisible(true);
    }//GEN-LAST:event_lbTimKiemMouseClicked

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        themSanPham();
    }//GEN-LAST:event_ThemButtonActionPerformed

    private void timsanphamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timsanphamButtonActionPerformed
        timSanPham();
    }//GEN-LAST:event_timsanphamButtonActionPerformed

    private void jLabel313MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel313MouseClicked
        openMenuBar();
    }//GEN-LAST:event_jLabel313MouseClicked

    private void jLabel314MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel314MouseClicked
        closeMenuBar();
    }//GEN-LAST:event_jLabel314MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBanh;
    private javax.swing.JPanel MenuCaphe;
    private javax.swing.JPanel MenuCard;
    private javax.swing.JPanel MenuTim;
    private javax.swing.JPanel MenuTra;
    private javax.swing.JButton ThemButton;
    private javax.swing.JTextField amAddress;
    private javax.swing.JButton amDeletebt;
    private javax.swing.JTextField amDiem;
    private javax.swing.JLabel amID;
    private javax.swing.JTextField amName;
    private javax.swing.JLabel amNameDisplay;
    private javax.swing.JTextField amPassword;
    private javax.swing.JTextField amPhone;
    private javax.swing.JButton amSavebt;
    private javax.swing.JComboBox<String> amSex;
    private javax.swing.JTextField amSignDate;
    public static javax.swing.JTextField amUsername;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel dieukienLb;
    private javax.swing.JComboBox<String> fieldComboBox;
    private javax.swing.JLabel giaLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JLabel jLabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner34;
    private javax.swing.JSpinner jSpinner35;
    private javax.swing.JSpinner jSpinner36;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner39;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JSpinner jSpinner42;
    private javax.swing.JSpinner jSpinner43;
    private javax.swing.JSpinner jSpinner44;
    private javax.swing.JSpinner jSpinner45;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel jpAccount;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpHomea;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpThanhtoan;
    private javax.swing.JPanel jpVoucher;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbAccount1;
    private javax.swing.JLabel lbBanh;
    private javax.swing.JLabel lbCaphe;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbPurchase1;
    private javax.swing.JLabel lbPurchase2;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JLabel lbTra;
    private javax.swing.JLabel lbmenusl;
    private javax.swing.JLabel lbmenutt;
    private javax.swing.JTextField loaikmTextfield;
    private javax.swing.JLabel makmLb;
    private javax.swing.JTextField makmTextfield;
    private javax.swing.JLabel ngayLb;
    private javax.swing.JTextField ngaybdTextfield;
    private javax.swing.JTextField ngayktTextfield;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSlideMenu;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JComboBox<String> sizeComboBox;
    private javax.swing.JSpinner slSpinner;
    private javax.swing.JTable tableKhuyenMai;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JLabel tenkmLb;
    private javax.swing.JLabel tenspLb;
    private javax.swing.JButton timsanphamButton;
    private javax.swing.JTextField timsanphamTextfield;
    public static javax.swing.JLabel userUsername;
    // End of variables declaration//GEN-END:variables
}
