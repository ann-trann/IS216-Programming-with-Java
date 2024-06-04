/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cau_1.view;

import Cau_1.controller.SignUp_SIgnIn_Controller;
import Cau_1.model.ModelUser;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */
public class SignUp_SignIn_View extends javax.swing.JFrame {

    private ModelUser dataUser; //Model thông tin đăng nhập
    
    /**
     * Creates new form SignUp_SignIn
     */
    public SignUp_SignIn_View() {
        initComponents();
        setTitle("Sign in & Sign up Form");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_username = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_confirm = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_signin = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        pf_confirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_username.setText("Username");

        lb_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_password.setText("Password");

        lb_confirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_confirm.setText("Confirm");

        btn_signin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_signin.setText("Sign in");
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });

        btn_signup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_signup.setText("Sign up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_username)
                            .addGap(30, 30, 30)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_password)
                                .addComponent(lb_confirm))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pf_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_username)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_confirm)
                    .addComponent(pf_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = String.valueOf(pf_password.getPassword());
        
        StringBuilder sb = new StringBuilder();
        
        if (username.equals("")) {
            sb.append("Username không được bỏ trống !\n");
        }
        if (password.equals("")) {
            sb.append("Password không được bỏ trống !\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dataUser = new ModelUser(username, password);
        SignUp_SIgnIn_Controller controller = new SignUp_SIgnIn_Controller();
        ModelUser authenticatedUser = controller.signIn(dataUser);
        
        if (authenticatedUser != null) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Proceed to the next part of your application
        } else {
            JOptionPane.showMessageDialog(this, "Username hoặc Password không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signinActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = String.valueOf(pf_password.getPassword());
        String confirm = String.valueOf(pf_confirm.getPassword());
        
        StringBuilder sb = new StringBuilder();
        
        if (username.equals("")) {
            sb.append("Username không được bỏ trống !\n");
        }
        if (password.equals("")) {
            sb.append("Password và Confirm pasword không được bỏ trống !\n");
        }
        if (!password.equals("") && confirm.equals("")) {
            sb.append("Confirm password không được bỏ trống !\n");
        }
        if (!password.equals(confirm)) {
        sb.append("Password và Confirm password không trùng nhau!\n");
        }
        if (sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dataUser = new ModelUser(username, password);
        SignUp_SIgnIn_Controller controller = new SignUp_SIgnIn_Controller();
        ModelUser signedUpUser = controller.signUp(dataUser);
        
        if (signedUpUser != null) {
            JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Tên người dùng đã tồn tại hoặc xảy ra lỗi!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        int luaChon = JOptionPane.showConfirmDialog(
				this, 
				"Bạn có muốn thoát khỏi chương trình?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
		if (luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp_SignIn_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_SignIn_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_SignIn_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_SignIn_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_SignIn_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_signin;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel lb_confirm;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_username;
    private javax.swing.JPasswordField pf_confirm;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
