/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cau_2.GUI;

/**
 *
 * @author trant
 */
public class ThanhToanGUI extends javax.swing.JFrame {

    /**
     * Creates new form BenhNhanGUI
     */
    public ThanhToanGUI() {
        initComponents();
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
        cb_gtinh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        date_nkham = new com.toedter.calendar.JDateChooser();
        cb_gtinh1 = new javax.swing.JComboBox<>();
        txt_kluan = new javax.swing.JTextField();
        lb_dsdv_dakham = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dsdv_dakham = new javax.swing.JTable();
        lb_tongtien = new javax.swing.JLabel();
        txt_tongtien = new javax.swing.JTextField();
        checkb_dathanhtoan = new javax.swing.JCheckBox();

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

        cb_gtinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_gtinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Thanh toán");

        cb_gtinh1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_gtinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        lb_dsdv_dakham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dsdv_dakham.setText("Danh sách dịch vụ đã khám");

        tb_dsdv_dakham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tb_dsdv_dakham);

        lb_tongtien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tongtien.setText("Tổng tiền");

        checkb_dathanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkb_dathanhtoan.setText("Đã thanh toán");

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
                                .addComponent(checkb_dathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_mabn)
                                    .addComponent(lb_tenbn)
                                    .addComponent(lb_kluan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_gtinh, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cb_gtinh1, 0, 160, Short.MAX_VALUE)
                                    .addComponent(txt_kluan))
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_mabn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date_nkham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nkham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_gtinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tenbn)
                    .addComponent(lb_yckham)
                    .addComponent(txt_yckham, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_gtinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kluan)
                    .addComponent(txt_kluan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tongtien)
                    .addComponent(txt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_dsdv_dakham)
                    .addComponent(checkb_dathanhtoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JComboBox<String> cb_gtinh;
    private javax.swing.JComboBox<String> cb_gtinh1;
    private javax.swing.JCheckBox checkb_dathanhtoan;
    private com.toedter.calendar.JDateChooser date_nkham;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_dsdv_dakham;
    private javax.swing.JLabel lb_kluan;
    private javax.swing.JLabel lb_mabn;
    private javax.swing.JLabel lb_nkham;
    private javax.swing.JLabel lb_tenbn;
    private javax.swing.JLabel lb_tongtien;
    private javax.swing.JLabel lb_yckham;
    private javax.swing.JTable tb_dsdv_dakham;
    private javax.swing.JTextField txt_kluan;
    private javax.swing.JTextField txt_tongtien;
    private javax.swing.JTextField txt_yckham;
    // End of variables declaration//GEN-END:variables
}
