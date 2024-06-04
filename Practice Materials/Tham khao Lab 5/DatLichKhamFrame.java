
public class DatLichKhamFrame extends javax.swing.JFrame {
    public DatLichKhamFrame() throws SQLException {
        ArrayList<KhamBenhModel> DSBS = new ArrayList<KhamBenhModel>();
        initComponents();
        settextMaKB_default();
        jComboBox1.removeAllItems();
        DSBS = KhamBenh.getDSBacsi();
        for(KhamBenhModel kb : DSBS) {
        jComboBox1.addItem(kb.getTENBS());
}
    }


    private void initComponents() {

        DatLichKhamButton = new javax.swing.JButton();
        NgayNhapJDate = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đặt lịch khám");

        DatLichKhamButton.setText("Đặt lịch khám");
        DatLichKhamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatLichKhamButtonMouseClicked(evt);
            }
        });
        DatLichKhamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatLichKhamButtonActionPerformed(evt);
            }
        });


        jTextField1.setText("Mã bệnh nhân");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setText("Tên bệnh nhân");
        jTextField2.setEnabled(false);

        jTextField3.setText("Yêu cầu khám");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên bác sĩ" }));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

  
        String MaKB,MaBN,MaBS,YeuCau;
        Date NgayKham;
        MaKB = jTextField4.getText();
        MaBN = jTextField1.getText();
        MaBS = String.valueOf(jComboBox1.getSelectedItem());
        YeuCau = jTextField3.getText();
        NgayKham = new Date(NgayNhapJDate.getDate().getTime());        
        KhamBenhModel kb = new KhamBenhModel(MaKB, MaBN, MaBS, NgayKham, YeuCau);
        KhamBenh nhdao = new KhamBenh();
        }
    }
	
	
    public static void main(String args[]) {
  
    private javax.swing.JButton DatLichKhamButton;
    private com.toedter.calendar.JDateChooser NgayNhapJDate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
   
}
