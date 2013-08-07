package sun.natee.winapp.pos.view;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MainPOS extends javax.swing.JFrame {

    public MainPOS() {
        initComponents();
        
        initProgramLoad();        
    }
    
    private DefaultTableModel model;
    
    private void loadDataTable(){
        Object []cols= new Object[]{"V","R_ETD","KIC","ON/OFF","Print","PLU-Code","Description","Qty","Price",
            "Amount","P,PRType","Disc","R_Sub","R_PrCu","R_Time","R_Emp",
            "Void Reason", "User Void", "Void Time", "Move"};
        model = new DefaultTableModel(cols, 5);
        tbBill.setModel(model);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        jButton161 = new javax.swing.JButton();
        jButton162 = new javax.swing.JButton();
        jButton163 = new javax.swing.JButton();
        jButton164 = new javax.swing.JButton();
        jButton165 = new javax.swing.JButton();
        jButton166 = new javax.swing.JButton();
        jButton167 = new javax.swing.JButton();
        jButton168 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        jButton180 = new javax.swing.JButton();
        jButton181 = new javax.swing.JButton();
        jButton182 = new javax.swing.JButton();
        jButton183 = new javax.swing.JButton();
        jButton184 = new javax.swing.JButton();
        jButton185 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        jButton189 = new javax.swing.JButton();
        jButton190 = new javax.swing.JButton();
        jButton191 = new javax.swing.JButton();
        jButton192 = new javax.swing.JButton();
        jButton193 = new javax.swing.JButton();
        jButton194 = new javax.swing.JButton();
        jButton195 = new javax.swing.JButton();
        jButton196 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbTableNo = new javax.swing.JLabel();
        txtTableNo = new javax.swing.JTextField();
        lbEmpCode = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        lbCusCount = new javax.swing.JLabel();
        txtCusCount = new javax.swing.JTextField();
        lbMenuType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBill = new javax.swing.JTable();
        txtEmpCode = new javax.swing.JPasswordField();
        lbEmpName = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnPrintOn = new javax.swing.JButton();
        btnEatIN = new javax.swing.JButton();
        btnTakeAway = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        btnPinto = new javax.swing.JButton();
        btnWholeSale = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNumAdd = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNumMinus = new javax.swing.JButton();
        btnESC = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnNumPoint = new javax.swing.JButton();
        btnCLR = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnOSK = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMoveItem = new javax.swing.JButton();
        btnFloorPlan = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnDataMember = new javax.swing.JButton();
        btnRecordUp = new javax.swing.JButton();
        btnRecordDown = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lbItem = new javax.swing.JLabel();
        lbCountItem = new javax.swing.JLabel();
        lbTotalAmt = new javax.swing.JLabel();
        lbTotalAmtCount = new javax.swing.JLabel();
        lbService = new javax.swing.JLabel();
        lbServiceCount = new javax.swing.JLabel();
        lbDiscount = new javax.swing.JLabel();
        lbDiscountCount = new javax.swing.JLabel();
        lbAmontDueCount = new javax.swing.JLabel();
        lbAmontDue = new javax.swing.JLabel();
        lbMenuCode = new javax.swing.JLabel();
        txtMenuCode = new javax.swing.JTextField();
        lbPriceMenu = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point of sale 2014");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setLayout(new java.awt.GridLayout(7, 4));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("jButton1");
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("jButton1");
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("jButton1");
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("jButton1");
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("jButton1");
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("jButton1");
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("jButton1");
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("jButton1");
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setText("jButton1");
        jPanel1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("jButton1");
        jPanel1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton12.setText("jButton1");
        jPanel1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setText("jButton1");
        jPanel1.add(jButton13);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setText("jButton1");
        jPanel1.add(jButton14);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("jButton1");
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setText("jButton1");
        jPanel1.add(jButton16);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("jButton1");
        jPanel1.add(jButton17);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("jButton1");
        jPanel1.add(jButton18);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setText("jButton1");
        jPanel1.add(jButton19);

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("jButton1");
        jPanel1.add(jButton20);

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setText("jButton1");
        jPanel1.add(jButton21);

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setText("jButton1");
        jPanel1.add(jButton22);

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setText("jButton1");
        jPanel1.add(jButton23);

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton24.setText("jButton1");
        jPanel1.add(jButton24);

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton25.setText("jButton1");
        jPanel1.add(jButton25);

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton26.setText("jButton1");
        jPanel1.add(jButton26);

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton27.setText("jButton1");
        jPanel1.add(jButton27);

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton28.setText("jButton1");
        jPanel1.add(jButton28);

        jTabbedPane1.addTab("อาหาร", jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(7, 4));

        jButton113.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton113.setText("jButton1");
        jPanel2.add(jButton113);

        jButton114.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton114.setText("jButton1");
        jPanel2.add(jButton114);

        jButton115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton115.setText("jButton1");
        jPanel2.add(jButton115);

        jButton116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton116.setText("jButton1");
        jPanel2.add(jButton116);

        jButton117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton117.setText("jButton1");
        jPanel2.add(jButton117);

        jButton118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton118.setText("jButton1");
        jPanel2.add(jButton118);

        jButton119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton119.setText("jButton1");
        jPanel2.add(jButton119);

        jButton120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton120.setText("jButton1");
        jPanel2.add(jButton120);

        jButton121.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton121.setText("jButton1");
        jPanel2.add(jButton121);

        jButton122.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton122.setText("jButton1");
        jPanel2.add(jButton122);

        jButton123.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton123.setText("jButton1");
        jPanel2.add(jButton123);

        jButton124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton124.setText("jButton1");
        jPanel2.add(jButton124);

        jButton125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton125.setText("jButton1");
        jPanel2.add(jButton125);

        jButton126.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton126.setText("jButton1");
        jPanel2.add(jButton126);

        jButton127.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton127.setText("jButton1");
        jPanel2.add(jButton127);

        jButton128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton128.setText("jButton1");
        jPanel2.add(jButton128);

        jButton129.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton129.setText("jButton1");
        jPanel2.add(jButton129);

        jButton130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton130.setText("jButton1");
        jPanel2.add(jButton130);

        jButton131.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton131.setText("jButton1");
        jPanel2.add(jButton131);

        jButton132.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton132.setText("jButton1");
        jPanel2.add(jButton132);

        jButton133.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton133.setText("jButton1");
        jPanel2.add(jButton133);

        jButton134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton134.setText("jButton1");
        jPanel2.add(jButton134);

        jButton135.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton135.setText("jButton1");
        jPanel2.add(jButton135);

        jButton136.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton136.setText("jButton1");
        jPanel2.add(jButton136);

        jButton137.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton137.setText("jButton1");
        jPanel2.add(jButton137);

        jButton138.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton138.setText("jButton1");
        jPanel2.add(jButton138);

        jButton139.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton139.setText("jButton1");
        jPanel2.add(jButton139);

        jButton140.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton140.setText("jButton1");
        jPanel2.add(jButton140);

        jTabbedPane1.addTab("เครื่องดื่ม", jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(7, 4));

        jButton141.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton141.setText("jButton1");
        jPanel3.add(jButton141);

        jButton142.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton142.setText("jButton1");
        jPanel3.add(jButton142);

        jButton143.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton143.setText("jButton1");
        jPanel3.add(jButton143);

        jButton144.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton144.setText("jButton1");
        jPanel3.add(jButton144);

        jButton145.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton145.setText("jButton1");
        jPanel3.add(jButton145);

        jButton146.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton146.setText("jButton1");
        jPanel3.add(jButton146);

        jButton147.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton147.setText("jButton1");
        jPanel3.add(jButton147);

        jButton148.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton148.setText("jButton1");
        jPanel3.add(jButton148);

        jButton149.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton149.setText("jButton1");
        jPanel3.add(jButton149);

        jButton150.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton150.setText("jButton1");
        jPanel3.add(jButton150);

        jButton151.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton151.setText("jButton1");
        jPanel3.add(jButton151);

        jButton152.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton152.setText("jButton1");
        jPanel3.add(jButton152);

        jButton153.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton153.setText("jButton1");
        jPanel3.add(jButton153);

        jButton154.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton154.setText("jButton1");
        jPanel3.add(jButton154);

        jButton155.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton155.setText("jButton1");
        jPanel3.add(jButton155);

        jButton156.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton156.setText("jButton1");
        jPanel3.add(jButton156);

        jButton157.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton157.setText("jButton1");
        jPanel3.add(jButton157);

        jButton158.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton158.setText("jButton1");
        jPanel3.add(jButton158);

        jButton159.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton159.setText("jButton1");
        jPanel3.add(jButton159);

        jButton160.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton160.setText("jButton1");
        jPanel3.add(jButton160);

        jButton161.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton161.setText("jButton1");
        jPanel3.add(jButton161);

        jButton162.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton162.setText("jButton1");
        jPanel3.add(jButton162);

        jButton163.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton163.setText("jButton1");
        jPanel3.add(jButton163);

        jButton164.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton164.setText("jButton1");
        jPanel3.add(jButton164);

        jButton165.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton165.setText("jButton1");
        jPanel3.add(jButton165);

        jButton166.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton166.setText("jButton1");
        jPanel3.add(jButton166);

        jButton167.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton167.setText("jButton1");
        jPanel3.add(jButton167);

        jButton168.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton168.setText("jButton1");
        jPanel3.add(jButton168);

        jTabbedPane1.addTab("สนามกอล์ฟ", jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(7, 4));

        jButton169.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton169.setText("jButton1");
        jPanel4.add(jButton169);

        jButton170.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton170.setText("jButton1");
        jPanel4.add(jButton170);

        jButton171.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton171.setText("jButton1");
        jPanel4.add(jButton171);

        jButton172.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton172.setText("jButton1");
        jPanel4.add(jButton172);

        jButton173.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton173.setText("jButton1");
        jPanel4.add(jButton173);

        jButton174.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton174.setText("jButton1");
        jPanel4.add(jButton174);

        jButton175.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton175.setText("jButton1");
        jPanel4.add(jButton175);

        jButton176.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton176.setText("jButton1");
        jPanel4.add(jButton176);

        jButton177.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton177.setText("jButton1");
        jPanel4.add(jButton177);

        jButton178.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton178.setText("jButton1");
        jPanel4.add(jButton178);

        jButton179.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton179.setText("jButton1");
        jPanel4.add(jButton179);

        jButton180.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton180.setText("jButton1");
        jPanel4.add(jButton180);

        jButton181.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton181.setText("jButton1");
        jPanel4.add(jButton181);

        jButton182.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton182.setText("jButton1");
        jPanel4.add(jButton182);

        jButton183.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton183.setText("jButton1");
        jPanel4.add(jButton183);

        jButton184.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton184.setText("jButton1");
        jPanel4.add(jButton184);

        jButton185.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton185.setText("jButton1");
        jPanel4.add(jButton185);

        jButton186.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton186.setText("jButton1");
        jPanel4.add(jButton186);

        jButton187.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton187.setText("jButton1");
        jPanel4.add(jButton187);

        jButton188.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton188.setText("jButton1");
        jPanel4.add(jButton188);

        jButton189.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton189.setText("jButton1");
        jPanel4.add(jButton189);

        jButton190.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton190.setText("jButton1");
        jPanel4.add(jButton190);

        jButton191.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton191.setText("jButton1");
        jPanel4.add(jButton191);

        jButton192.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton192.setText("jButton1");
        jPanel4.add(jButton192);

        jButton193.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton193.setText("jButton1");
        jPanel4.add(jButton193);

        jButton194.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton194.setText("jButton1");
        jPanel4.add(jButton194);

        jButton195.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton195.setText("jButton1");
        jPanel4.add(jButton195);

        jButton196.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton196.setText("jButton1");
        jPanel4.add(jButton196);

        jTabbedPane1.addTab("พาร์ 3", jPanel4);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new java.awt.GridLayout(2, 5));

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton30.setText("Paid in");
        jPanel5.add(jButton30);

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton31.setText("Paid out");
        jPanel5.add(jButton31);

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton32.setText("พิมพ์สำเนา");
        jPanel5.add(jButton32);

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton33.setText("ตรวจสอบโต๊ะ");
        jPanel5.add(jButton33);

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton34.setText("ย้ายโต๊ะ");
        jPanel5.add(jButton34);

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton35.setText("Logout");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton35);

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton36.setText("Refund");
        jPanel5.add(jButton36);

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton37.setText("รับชำระลูกหนี้");
        jPanel5.add(jButton37);

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton38.setText("MTD Report");
        jPanel5.add(jButton38);

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton39.setText("Dialy Report");
        jPanel5.add(jButton39);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbTableNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTableNo.setText("เบอร์โต๊ะ");

        txtTableNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTableNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTableNoKeyPressed(evt);
            }
        });

        lbEmpCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmpCode.setText("รหัสบริกร");

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton29.setText("...");

        lbCusCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCusCount.setText("ลูกค้า");

        txtCusCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCusCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCusCountKeyPressed(evt);
            }
        });

        lbMenuType.setBackground(new java.awt.Color(0, 0, 0));
        lbMenuType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMenuType.setForeground(new java.awt.Color(204, 0, 0));
        lbMenuType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenuType.setText("E");
        lbMenuType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tbBill.setAutoCreateRowSorter(true);
        tbBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbBill);

        txtEmpCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpCodeKeyPressed(evt);
            }
        });

        lbEmpName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmpName.setText("XXXX");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTableNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEmpCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCusCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCusCount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMenuType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbTableNo)
                    .addComponent(txtTableNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmpCode)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCusCount)
                    .addComponent(txtCusCount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMenuType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmpName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel7.setLayout(new java.awt.GridLayout(1, 6));

        btnPrintOn.setText("Print ON");
        jPanel7.add(btnPrintOn);

        btnEatIN.setText("Eat in");
        jPanel7.add(btnEatIN);

        btnTakeAway.setText("TakeAway");
        jPanel7.add(btnTakeAway);

        btnDelivery.setText("Delivery");
        jPanel7.add(btnDelivery);

        btnPinto.setText("Pinto");
        jPanel7.add(btnPinto);

        btnWholeSale.setText("Whole Sale");
        jPanel7.add(btnWholeSale);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new java.awt.GridLayout(4, 5));

        btnNum7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum7.setText("7");
        jPanel9.add(btnNum7);

        btnNum8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum8.setText("8");
        jPanel9.add(btnNum8);

        btnNum9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum9.setText("9");
        jPanel9.add(btnNum9);

        btnNumAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNumAdd.setText("+");
        jPanel9.add(btnNumAdd);

        btnBackSpace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBackSpace.setText("BS");
        jPanel9.add(btnBackSpace);

        btnNum4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum4.setText("4");
        jPanel9.add(btnNum4);

        btnNum5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum5.setText("5");
        jPanel9.add(btnNum5);

        btnNum6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum6.setText("6");
        jPanel9.add(btnNum6);

        btnNumMinus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNumMinus.setText("-");
        jPanel9.add(btnNumMinus);

        btnESC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnESC.setText("ESC");
        jPanel9.add(btnESC);

        btnNum1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum1.setText("1");
        jPanel9.add(btnNum1);

        btnNum2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum2.setText("2");
        jPanel9.add(btnNum2);

        btnNum3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum3.setText("3");
        jPanel9.add(btnNum3);

        btnMul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMul.setText("X");
        jPanel9.add(btnMul);

        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEnter.setText("ENT");
        jPanel9.add(btnEnter);

        btnNum0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNum0.setText("0");
        jPanel9.add(btnNum0);

        btnNumPoint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNumPoint.setText(".");
        jPanel9.add(btnNumPoint);

        btnCLR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCLR.setText("CLR");
        jPanel9.add(btnCLR);

        btnDivide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDivide.setText("/");
        jPanel9.add(btnDivide);

        btnOSK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOSK.setText("...");
        btnOSK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOSKActionPerformed(evt);
            }
        });
        jPanel9.add(btnOSK);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Show Table");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("For Checkbill");

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnMoveItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoveItem.setText("F12-ย้ายรายการ");

        btnFloorPlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFloorPlan.setText("Floor Plan");

        btnMainMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMainMenu.setText("Main Menu");

        btnDataMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDataMember.setText("F11-ข้อมูลสมาชิก");

        btnRecordUp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRecordUp.setText("Record Up");

        btnRecordDown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRecordDown.setText("Record Down");

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));

        lbItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItem.setForeground(new java.awt.Color(0, 153, 0));
        lbItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbItem.setText("Item");

        lbCountItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCountItem.setForeground(new java.awt.Color(255, 255, 51));
        lbCountItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCountItem.setText("0");
        lbCountItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTotalAmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTotalAmt.setForeground(new java.awt.Color(0, 153, 0));
        lbTotalAmt.setText("Total Amt");

        lbTotalAmtCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTotalAmtCount.setForeground(new java.awt.Color(255, 255, 51));
        lbTotalAmtCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTotalAmtCount.setText("0.00");
        lbTotalAmtCount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbService.setForeground(new java.awt.Color(0, 153, 0));
        lbService.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbService.setText("Service");

        lbServiceCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbServiceCount.setForeground(new java.awt.Color(255, 255, 51));
        lbServiceCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbServiceCount.setText("0.00");
        lbServiceCount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbDiscount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDiscount.setForeground(new java.awt.Color(0, 153, 0));
        lbDiscount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDiscount.setText("Discount");

        lbDiscountCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDiscountCount.setForeground(new java.awt.Color(255, 255, 51));
        lbDiscountCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDiscountCount.setText("0.00");
        lbDiscountCount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbAmontDueCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAmontDueCount.setForeground(new java.awt.Color(255, 255, 51));
        lbAmontDueCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAmontDueCount.setText("0.00");
        lbAmontDueCount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbAmontDue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAmontDue.setForeground(new java.awt.Color(0, 153, 0));
        lbAmontDue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAmontDue.setText("Amont Due");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbItem, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lbCountItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTotalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTotalAmtCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbServiceCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDiscountCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAmontDue, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(lbAmontDueCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDiscount)
                    .addComponent(lbTotalAmt)
                    .addComponent(lbItem)
                    .addComponent(lbService)
                    .addComponent(lbAmontDue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCountItem)
                    .addComponent(lbTotalAmtCount)
                    .addComponent(lbServiceCount)
                    .addComponent(lbDiscountCount)
                    .addComponent(lbAmontDueCount))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(btnDataMember, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecordUp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecordDown, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataMember)
                    .addComponent(btnRecordUp)
                    .addComponent(btnRecordDown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbMenuCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMenuCode.setText("รายการ");

        txtMenuCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbPriceMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPriceMenu.setText("ราคาขาย");

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(204, 204, 204));
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.setText("0.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFloorPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(txtMenuCode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPriceMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lbMenuCode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnMoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnFloorPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPriceMenu)
                            .addComponent(txtMenuCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMenuCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("หมายเลขเครื่อง     001");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Online");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("รหัสอนุมัติ  XXXXXXXXXXXX");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("เลขที่ใบเสร็จ    00000021");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("รหัสพนักงาน   1001");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Login Time: 07/08/2013 10:47:00");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTableNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTableNoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtEmpCode.requestFocus();
        }
    }//GEN-LAST:event_txtTableNoKeyPressed

    private void txtCusCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusCountKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtMenuCode.requestFocus();
        }
    }//GEN-LAST:event_txtCusCountKeyPressed

    private void btnOSKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOSKActionPerformed
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("osk");
        } catch (IOException ex) {
            Logger.getLogger(MainPOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOSKActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void txtEmpCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpCodeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtCusCount.requestFocus();
        }
    }//GEN-LAST:event_txtEmpCodeKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPOS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnCLR;
    private javax.swing.JButton btnDataMember;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnESC;
    private javax.swing.JButton btnEatIN;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnFloorPlan;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnMoveItem;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnNumAdd;
    private javax.swing.JButton btnNumMinus;
    private javax.swing.JButton btnNumPoint;
    private javax.swing.JButton btnOSK;
    private javax.swing.JButton btnPinto;
    private javax.swing.JButton btnPrintOn;
    private javax.swing.JButton btnRecordDown;
    private javax.swing.JButton btnRecordUp;
    private javax.swing.JButton btnTakeAway;
    private javax.swing.JButton btnWholeSale;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton159;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton162;
    private javax.swing.JButton jButton163;
    private javax.swing.JButton jButton164;
    private javax.swing.JButton jButton165;
    private javax.swing.JButton jButton166;
    private javax.swing.JButton jButton167;
    private javax.swing.JButton jButton168;
    private javax.swing.JButton jButton169;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton180;
    private javax.swing.JButton jButton181;
    private javax.swing.JButton jButton182;
    private javax.swing.JButton jButton183;
    private javax.swing.JButton jButton184;
    private javax.swing.JButton jButton185;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton191;
    private javax.swing.JButton jButton192;
    private javax.swing.JButton jButton193;
    private javax.swing.JButton jButton194;
    private javax.swing.JButton jButton195;
    private javax.swing.JButton jButton196;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAmontDue;
    private javax.swing.JLabel lbAmontDueCount;
    private javax.swing.JLabel lbCountItem;
    private javax.swing.JLabel lbCusCount;
    private javax.swing.JLabel lbDiscount;
    private javax.swing.JLabel lbDiscountCount;
    private javax.swing.JLabel lbEmpCode;
    private javax.swing.JLabel lbEmpName;
    private javax.swing.JLabel lbItem;
    private javax.swing.JLabel lbMenuCode;
    private javax.swing.JLabel lbMenuType;
    private javax.swing.JLabel lbPriceMenu;
    private javax.swing.JLabel lbService;
    private javax.swing.JLabel lbServiceCount;
    private javax.swing.JLabel lbTableNo;
    private javax.swing.JLabel lbTotalAmt;
    private javax.swing.JLabel lbTotalAmtCount;
    private javax.swing.JTable tbBill;
    private javax.swing.JTextField txtCusCount;
    private javax.swing.JPasswordField txtEmpCode;
    private javax.swing.JTextField txtMenuCode;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTableNo;
    // End of variables declaration//GEN-END:variables

    private void initProgramLoad() {
        loadDataMenu();
        loadDataTable();        
        txtTableNo.requestFocus();    
    }

    private void loadDataMenu() {
        
    }
}
