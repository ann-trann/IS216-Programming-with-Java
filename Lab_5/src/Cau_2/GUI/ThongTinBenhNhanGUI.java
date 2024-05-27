/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cau_2.GUI;

import Cau_2.BUS.BenhNhanBUS;
import Cau_2.DTO.BenhNhanDTO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */
public class ThongTinBenhNhanGUI extends javax.swing.JFrame {

    /**
     * Creates new form BenhNhanGUI
     */
    public ThongTinBenhNhanGUI() {
        initComponents();
        setTitle("Thông tin bệnh nhân");
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
        lb_nsinh = new javax.swing.JLabel();
        lb_dchi = new javax.swing.JLabel();
        lb_dthoai = new javax.swing.JLabel();
        lb_gtinh = new javax.swing.JLabel();
        txt_mabn = new javax.swing.JTextField();
        txt_tenbn = new javax.swing.JTextField();
        txt_dchi = new javax.swing.JTextField();
        txt_dthoai = new javax.swing.JTextField();
        combo_gtinh = new javax.swing.JComboBox<>();
        btn_them = new javax.swing.JButton();
        date_nsinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_mabn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_mabn.setText("Mã bệnh nhân");

        lb_tenbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tenbn.setText("Tên bệnh nhân");

        lb_nsinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nsinh.setText("Ngày sinh");

        lb_dchi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dchi.setText("Địa chỉ");

        lb_dthoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dthoai.setText("Điện thoại");

        lb_gtinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_gtinh.setText("Giới tính");

        combo_gtinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        combo_gtinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_mabn)
                            .addComponent(lb_tenbn)
                            .addComponent(lb_nsinh)
                            .addComponent(lb_dchi)
                            .addComponent(lb_dthoai)
                            .addComponent(lb_gtinh))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_gtinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dchi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_mabn)
                    .addComponent(txt_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tenbn)
                    .addComponent(txt_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_nsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nsinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dchi)
                    .addComponent(txt_dchi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dthoai)
                    .addComponent(txt_dthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_gtinh)
                    .addComponent(combo_gtinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String mabn = txt_mabn.getText();
        String tenbn = txt_tenbn.getText();
        
        Date selectedDate = date_nsinh.getDate();
        LocalDate nsinh;
        if (selectedDate != null) {
            nsinh = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            nsinh = LocalDate.of(2000, 1, 3);
        }
        
        String dchi = txt_dchi.getText();
        String dthoai = txt_dthoai.getText();
        String gtinh = (String) combo_gtinh.getSelectedItem();
        
        boolean flag = true;
        if (mabn.equals("") || tenbn.equals("") || nsinh.isAfter(LocalDate.now()) || dchi.equals("") || dthoai.equals("")) {
            flag = false;
        }
        
        try {
            if (flag){
                BenhNhanDTO bn = new BenhNhanDTO(mabn, tenbn, nsinh, dchi, dthoai, gtinh);
                BenhNhanBUS bus = new BenhNhanBUS();

                if (bus.addBenhNhan(bn) && flag) {
                    JOptionPane.showMessageDialog(this, "Thêm bệnh nhân thành công!");
                    clearBN();
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Thêm bệnh không nhân không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void clearBN(){
        txt_mabn.setText("");
        txt_tenbn.setText("");
        txt_dchi.setText("");
        txt_dthoai.setText("");
        date_nsinh.setDate(null);
        combo_gtinh.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(ThongTinBenhNhanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinBenhNhanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinBenhNhanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinBenhNhanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinBenhNhanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JComboBox<String> combo_gtinh;
    private com.toedter.calendar.JDateChooser date_nsinh;
    private javax.swing.JLabel lb_dchi;
    private javax.swing.JLabel lb_dthoai;
    private javax.swing.JLabel lb_gtinh;
    private javax.swing.JLabel lb_mabn;
    private javax.swing.JLabel lb_nsinh;
    private javax.swing.JLabel lb_tenbn;
    private javax.swing.JTextField txt_dchi;
    private javax.swing.JTextField txt_dthoai;
    private javax.swing.JTextField txt_mabn;
    private javax.swing.JTextField txt_tenbn;
    // End of variables declaration//GEN-END:variables
}
