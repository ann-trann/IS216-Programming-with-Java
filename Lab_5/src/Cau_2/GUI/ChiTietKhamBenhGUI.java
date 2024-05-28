/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cau_2.GUI;

import Cau_2.BUS.BacSiBUS;
import Cau_2.BUS.DichVuBUS;
import Cau_2.BUS.KhamBenhBUS;
import Cau_2.BUS.ThuPhiBUS;
import Cau_2.DTO.ThuPhiDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author trant
 */
public class ChiTietKhamBenhGUI extends javax.swing.JFrame {

    private KhamBenhBUS khamBenhBUS;
    private final BacSiBUS bacSiBUS;
    private final DichVuBUS dichVuBUS;
    private final ThuPhiBUS thuPhiBUS;
    private String makb;
    private String mabs;
    private String mabn;
    private LocalDate ngKham;
    private DefaultTableModel tb_dsdvModel;
    private DefaultTableModel tb_dsdvChonModel;
    private List<String> dsBenhNhan;
    private List<String> dsDichVu;
    private Map<String, Integer> dsDichVuChon;

    /**
     * Creates new form BenhNhanGUI
     * @throws java.sql.SQLException
     */
    public ChiTietKhamBenhGUI() throws SQLException {
        bacSiBUS = new BacSiBUS();
        khamBenhBUS = new KhamBenhBUS();
        dichVuBUS = new DichVuBUS();
        thuPhiBUS = new ThuPhiBUS();
        initComponents();
        setTitle("Khám bệnh");
        loadTenBS();
        setTableDV();
        
        date_nkham.getDateEditor().addPropertyChangeListener(
        new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())) {
                    try {
                        loadDSBenhNhan();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        combo_tenbn.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    layMaBN();
                    String selectedBN = (String) combo_tenbn.getSelectedItem();
                    if (selectedBN != null && !selectedBN.isEmpty()) {
                        makb = khamBenhBUS.layMaKB(mabn, ngKham);
                        String yeuCauKham = khamBenhBUS.layYeuCauKham(makb);
                        txt_yckham.setText(yeuCauKham);
                        txt_yckham.setEditable(false);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        dsDichVuChon= new HashMap<>();
        table_dsdv.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedRow = table_dsdv.getSelectedRow();
                    if (selectedRow != -1) {
                        String dichVuChon = (String) tb_dsdvModel.getValueAt(selectedRow, 0);
                        String soluong = JOptionPane.showInputDialog("Nhap so luong cho " + dichVuChon);
                        if (soluong != null && !soluong.isEmpty()) {
                            tb_dsdvChonModel.addRow(new Object[]{dichVuChon, soluong});
                            tb_dsdvModel.removeRow(selectedRow);
                            dsDichVuChon.put(dichVuChon, Integer.valueOf(soluong));
                        }
                    }
                }
            }
        });
    }
    
    public final void loadTenBS() throws SQLException {
        List<String> danhSachTenBS = bacSiBUS.layDSTenBS();
        combo_tenbs.removeAllItems();
        for (String tenBS : danhSachTenBS) {
            combo_tenbs.addItem(tenBS);
        }
    }
    
    public final void setTableDV() throws SQLException{
        tb_dsdvModel = (DefaultTableModel) table_dsdv.getModel();
        tb_dsdvModel.setRowCount(0);
        dsDichVu = dichVuBUS.layDSDV();
        for (String tendv : dsDichVu) {
            tb_dsdvModel.addRow(new Object[]{tendv});
        }
        
        tb_dsdvChonModel = (DefaultTableModel) table_dsdv_chon.getModel();
        tb_dsdvChonModel.setRowCount(0);
    }
    
    public void layMaBS() throws SQLException{
        String tenbs = (String)combo_tenbs.getSelectedItem();
        String mabs = bacSiBUS.layMaBS(tenbs);
        this.mabs = mabs;
    }
    
    public void layMaBN() throws SQLException{
        String tenbn = (String)combo_tenbn.getSelectedItem();
        if (ngKham != null) {
            this.mabn = khamBenhBUS.layMaBN(mabs, ngKham, tenbn);
        }
    }
    
    public void loadDSBenhNhan() throws SQLException {
        ngKham = date_nkham.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        layMaBS();
        if (ngKham != null) {
            dsBenhNhan = khamBenhBUS.layBN(mabs, ngKham);
            combo_tenbn.removeAllItems();
            for (String tenBN : dsBenhNhan) {
                combo_tenbn.addItem(tenBN);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_bs = new javax.swing.JLabel();
        lb_tenbn = new javax.swing.JLabel();
        lb_nkham = new javax.swing.JLabel();
        lb_yckham = new javax.swing.JLabel();
        lb_kluan = new javax.swing.JLabel();
        txt_yckham = new javax.swing.JTextField();
        combo_tenbs = new javax.swing.JComboBox<>();
        btn_kham = new javax.swing.JButton();
        date_nkham = new com.toedter.calendar.JDateChooser();
        combo_tenbn = new javax.swing.JComboBox<>();
        txt_ketluan = new javax.swing.JTextField();
        lb_dsdv = new javax.swing.JLabel();
        lb_dsdv_chon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_dsdv = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_dsdv_chon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_bs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_bs.setText("Bác sĩ khám");

        lb_tenbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tenbn.setText("Tên bệnh nhân");

        lb_nkham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nkham.setText("Ngày khám");

        lb_yckham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_yckham.setText("Yêu cầu khám");

        lb_kluan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kluan.setText("Kết luận");

        combo_tenbs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_kham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_kham.setText("Thêm");
        btn_kham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khamActionPerformed(evt);
            }
        });

        combo_tenbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lb_dsdv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dsdv.setText("Danh sách dịch vụ");

        lb_dsdv_chon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dsdv_chon.setText("Danh sách dịch vụ bác sĩ chọn");

        table_dsdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_dsdv);

        table_dsdv_chon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_dsdv_chon);
        if (table_dsdv_chon.getColumnModel().getColumnCount() > 0) {
            table_dsdv_chon.getColumnModel().getColumn(0).setResizable(false);
            table_dsdv_chon.getColumnModel().getColumn(1).setResizable(false);
            table_dsdv_chon.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_dsdv)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_dsdv_chon)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_bs)
                            .addComponent(lb_tenbn)
                            .addComponent(lb_kluan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_tenbs, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_yckham)
                                    .addComponent(lb_nkham))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_nkham, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_yckham, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ketluan, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btn_kham, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_bs)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date_nkham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nkham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_tenbs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tenbn)
                    .addComponent(lb_yckham)
                    .addComponent(txt_yckham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kluan)
                    .addComponent(txt_ketluan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_dsdv_chon)
                    .addComponent(lb_dsdv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_kham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_khamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khamActionPerformed
        boolean flag = true;
        
        String ketLuan = txt_ketluan.getText();
        
        try {
            khamBenhBUS.updateKetLuan(makb, ketLuan);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            thuPhiBUS.xoa(makb);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Map.Entry<String, Integer> entry : dsDichVuChon.entrySet()) {
            String tendv = entry.getKey();
            String madv = "";
            try {
                madv = dichVuBUS.layMaDV(tendv);
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int donGia = 0;
            try {
                donGia = dichVuBUS.layDonGia(tendv);
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            int soluong = entry.getValue();
            int thanhTien = donGia * soluong;
            ThuPhiDTO tp = new ThuPhiDTO(madv, soluong, thanhTien);
            ThuPhiBUS bus = new ThuPhiBUS();
            
            try {
                if (!bus.addThuPhi(tp)){
                    flag = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if (ngKham == null || mabn == null || ketLuan.equals("") || dsDichVuChon.isEmpty()){
            flag = false;
        }
        
        if (flag){
            JOptionPane.showMessageDialog(this, "Thêm thông tin thành công!");
            try {
                clearChiTietKhamBenh();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                thuPhiBUS.xoa(makb);
                JOptionPane.showMessageDialog(this, "Thêm chi tiết khám bệnh không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_khamActionPerformed

    public void clearChiTietKhamBenh() throws SQLException{
        txt_ketluan.setText("");
        txt_yckham.setText("");
        combo_tenbs.setSelectedIndex(0);
        combo_tenbn.setSelectedIndex(-1);
        dsBenhNhan.clear();
        dsDichVu.clear();
        dsDichVuChon.clear();
        setTableDV();
        mabs = null;
        makb = null;
        mabn = null;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChiTietKhamBenhGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kham;
    private javax.swing.JComboBox<String> combo_tenbn;
    private javax.swing.JComboBox<String> combo_tenbs;
    private com.toedter.calendar.JDateChooser date_nkham;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_bs;
    private javax.swing.JLabel lb_dsdv;
    private javax.swing.JLabel lb_dsdv_chon;
    private javax.swing.JLabel lb_kluan;
    private javax.swing.JLabel lb_nkham;
    private javax.swing.JLabel lb_tenbn;
    private javax.swing.JLabel lb_yckham;
    private javax.swing.JTable table_dsdv;
    private javax.swing.JTable table_dsdv_chon;
    private javax.swing.JTextField txt_ketluan;
    private javax.swing.JTextField txt_yckham;
    // End of variables declaration//GEN-END:variables
}