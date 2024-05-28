/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cau_2.GUI;

import Cau_2.BUS.BenhNhanBUS;
import Cau_2.BUS.KhamBenhBUS;
import Cau_2.BUS.ThuPhiBUS;
import Cau_2.DTO.KhamBenhDTO;
import Cau_2.DTO.ThuPhiDTO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trant
 */
public class ThanhToanGUI extends javax.swing.JFrame {

    private final BenhNhanBUS benhNhanBUS;
    private final KhamBenhBUS khamBenhBUS;
    private final ThuPhiBUS thuPhiBUS;
    private String makb;
    private String mabn;

    /**
     * Creates new form BenhNhanGUI
     */
    public ThanhToanGUI() {
        this.benhNhanBUS = new BenhNhanBUS();
        this.khamBenhBUS = new KhamBenhBUS();
        this.thuPhiBUS = new ThuPhiBUS();
        initComponents();
        
        txt_mabn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        hienThiTenBN();
                    } catch (SQLException ex) {
                        Logger.getLogger(DatLichKhamGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        date_nkham.getDateEditor().addPropertyChangeListener(
        new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())) {
                    try {
                        hienThiThongTinKB();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChiTietKhamBenhGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        checkbox_dathanhtoan.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    btn_thanhtoan.setEnabled(false);
                } else {
                    btn_thanhtoan.setEnabled(true);
                }
            }
        });
    }
    
    
    public void hienThiTenBN() throws SQLException {
        mabn = txt_mabn.getText();
        String tenbn = benhNhanBUS.layTenBN(mabn);
        if (tenbn != null) {
            txt_tenbn.setText(tenbn);
            txt_tenbn.setEditable(false);
            hienThiThongTinKB();
        }
        else {
            JOptionPane.showMessageDialog(null, "Bệnh nhân chưa đăng ký", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            txt_tenbn.setText("");
        }
    }
    
    public void hienThiThongTinKB() throws SQLException{
         LocalDate ngKham = LocalDate.of(1950, 1, 1);
        if (date_nkham.getDate() != null){
            ngKham = date_nkham.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        makb = khamBenhBUS.layMaKB(mabn, ngKham);
        KhamBenhDTO khamBenhDTO = khamBenhBUS.layThongTinKhamBenh(makb);
        if (!makb.equals("")) {
            String ketluan = khamBenhDTO.getKetLuan();
            String yckham = khamBenhDTO.getYCKham();
            txt_ketluan.setText(ketluan);
            txt_yckham.setText(yckham);
            int tongTien = thuPhiBUS.layTongTien(makb);
            txt_tongtien.setText(Integer.toString(tongTien));
        }
        else {
            txt_ketluan.setText("");
            txt_yckham.setText("");
            txt_tongtien.setText("");
        }
        
        if (khamBenhBUS.isThanhToan(makb)){
            checkbox_dathanhtoan.setSelected(true);
        } else {
            checkbox_dathanhtoan.setSelected(false);
        }
        
        updateTable();
    }
    
    public void updateTable() throws SQLException{
        DefaultTableModel tb_dsdv_dakham = (DefaultTableModel) table_dsdv_dakham.getModel();
        tb_dsdv_dakham.setRowCount(0);
        
        List<ThuPhiDTO> dsThuPhi = thuPhiBUS.layDichVu(makb);
        for (ThuPhiDTO tp : dsThuPhi) {
            tb_dsdv_dakham.addRow(new String[]{
                tp.getTenDV(), 
                String.valueOf(tp.getSoLuong()), 
                String.valueOf(tp.getThanhTien())});
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

        lb_mabn = new javax.swing.JLabel();
        lb_tenbn = new javax.swing.JLabel();
        lb_nkham = new javax.swing.JLabel();
        lb_yckham = new javax.swing.JLabel();
        lb_kluan = new javax.swing.JLabel();
        txt_yckham = new javax.swing.JTextField();
        btn_thanhtoan = new javax.swing.JButton();
        date_nkham = new com.toedter.calendar.JDateChooser();
        txt_ketluan = new javax.swing.JTextField();
        lb_dsdv_dakham = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_dsdv_dakham = new javax.swing.JTable();
        lb_tongtien = new javax.swing.JLabel();
        txt_tongtien = new javax.swing.JTextField();
        checkbox_dathanhtoan = new javax.swing.JCheckBox();
        txt_tenbn = new javax.swing.JTextField();
        txt_mabn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_mabn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_mabn.setText("Mã bệnh nhân");

        lb_tenbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tenbn.setText("Tên bệnh nhân");

        lb_nkham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nkham.setText("Ngày khám");

        lb_yckham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_yckham.setText("Yêu cầu khám");

        lb_kluan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kluan.setText("Kết luận");

        btn_thanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thanhtoan.setText("Thanh toán");
        btn_thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhtoanActionPerformed(evt);
            }
        });

        lb_dsdv_dakham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dsdv_dakham.setText("Danh sách dịch vụ đã khám");

        table_dsdv_dakham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(table_dsdv_dakham);

        lb_tongtien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tongtien.setText("Tổng tiền");

        checkbox_dathanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkbox_dathanhtoan.setText("Đã thanh toán");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_dsdv_dakham)
                                .addGap(149, 149, 149)
                                .addComponent(checkbox_dathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_mabn)
                                    .addComponent(lb_tenbn)
                                    .addComponent(lb_kluan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ketluan, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txt_tenbn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_mabn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_yckham)
                                    .addComponent(lb_nkham)
                                    .addComponent(lb_tongtien))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date_nkham, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_yckham, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btn_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_mabn)
                        .addComponent(txt_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date_nkham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_nkham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tenbn)
                    .addComponent(lb_yckham)
                    .addComponent(txt_yckham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kluan)
                    .addComponent(txt_ketluan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tongtien)
                    .addComponent(txt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dsdv_dakham)
                    .addComponent(checkbox_dathanhtoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhtoanActionPerformed
        int luaChon = JOptionPane.showConfirmDialog(
				this, 
				"Xác nhận thanh toán?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
            if (luaChon == JOptionPane.YES_OPTION) {
                try {
                    khamBenhBUS.updateThanhToan(makb);
                    checkbox_dathanhtoan.setSelected(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ThanhToanGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btn_thanhtoanActionPerformed

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
            java.util.logging.Logger.getLogger(ThanhToanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ThanhToanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thanhtoan;
    private javax.swing.JCheckBox checkbox_dathanhtoan;
    private com.toedter.calendar.JDateChooser date_nkham;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_dsdv_dakham;
    private javax.swing.JLabel lb_kluan;
    private javax.swing.JLabel lb_mabn;
    private javax.swing.JLabel lb_nkham;
    private javax.swing.JLabel lb_tenbn;
    private javax.swing.JLabel lb_tongtien;
    private javax.swing.JLabel lb_yckham;
    private javax.swing.JTable table_dsdv_dakham;
    private javax.swing.JTextField txt_ketluan;
    private javax.swing.JTextField txt_mabn;
    private javax.swing.JTextField txt_tenbn;
    private javax.swing.JTextField txt_tongtien;
    private javax.swing.JTextField txt_yckham;
    // End of variables declaration//GEN-END:variables
}
