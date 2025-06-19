import static com.mysql.cj.protocol.x.CompressionMode.MESSAGE;
import java.sql.*;
 import javax.swing.JOptionPane;
    
    public class frmSalaryEmp extends javax.swing.JFrame {

        frmMain fmain;
        Connection conn= null;
        Statement stat = null;
        ResultSet rst = null;
        String query;
        String Query;
        
    public frmSalaryEmp() {
        initComponents();
    }
    
    void exiting()
        {
        int xyz = JOptionPane.showConfirmDialog(this,"Are u sure u want to exit","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(xyz == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnl = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfDept = new javax.swing.JTextField();
        tfDes = new javax.swing.JTextField();
        tfNet = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        tfEname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfBasic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        tfNetoffer = new javax.swing.JTextField();
        tfdeDuctionleave = new javax.swing.JTextField();
        tfGross = new javax.swing.JTextField();
        tfDeduction = new javax.swing.JTextField();
        tfLeaves = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        txtEmpno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Salary Statement");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnl.setMinimumSize(new java.awt.Dimension(1, 1));
        pnl.setLayout(new java.awt.GridBagLayout());

        Panel.setOpaque(false);
        Panel.setRequestFocusEnabled(false);

        jLabel17.setFont(new java.awt.Font("Vivaldi", 3, 18)); // NOI18N
        jLabel17.setText("Salary Statement");

        jLabel2.setText("Emp No.");

        jLabel3.setText("EName");

        jLabel8.setText("Designation");

        jLabel9.setText("Department");

        tfDept.setEditable(false);

        tfDes.setEditable(false);

        tfNet.setEditable(false);

        jLabel16.setText("Net");

        btnShow.setText("Show");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tfEname.setEditable(false);

        jLabel4.setText("For Month");

        jLabel5.setText("Year");

        jLabel10.setText("Basic");

        jLabel14.setText("Gross");

        tfBasic.setEditable(false);

        jLabel6.setText("Net Offer");

        jLabel7.setText("<html>Deduction<br>of<br>Leaves");

        jLabel11.setText("Deduction");

        jLabel12.setText("No. of leaves");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janauary", "February", "March", "April", "May", "June", "July", "August", "September", "october", "November", "December", " " }));

        tfNetoffer.setEditable(false);

        tfdeDuctionleave.setEditable(false);

        tfGross.setEditable(false);

        tfDeduction.setEditable(false);

        tfLeaves.setEditable(false);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", " " }));

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Go");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel16))
                                .addGap(21, 21, 21)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpno)
                                    .addComponent(tfEname)
                                    .addComponent(tfDes)
                                    .addComponent(tfNetoffer)
                                    .addComponent(tfDept)
                                    .addComponent(tfNet)
                                    .addComponent(tfdeDuctionleave, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnShow)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton1)))
                                .addGap(1, 1, 1)))
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfLeaves)
                            .addComponent(tfGross)
                            .addComponent(tfBasic, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDeduction)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(153, 153, 153))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(22, 22, 22)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNetoffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(tfGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(tfDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdeDuctionleave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShow)
                            .addComponent(btnExit)
                            .addComponent(jButton1))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnl.add(Panel, gridBagConstraints);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        lblImage.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnl.add(lblImage, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(501, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
}//GEN-LAST:event_btnExitActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
}//GEN-LAST:event_formWindowClosing

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        dispose();
        fmain = new frmMain();
        fmain.pack();
        fmain.setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();

        fmain = new frmMain();
        fmain.pack(); 
        fmain.setVisible(true);



       try{

            query="select * from emp where empno='" +txtEmpno.getText()+"';";
            rst=stat.executeQuery(query);
            if(rst.next()){
                String eno= rst.getString("empno");
         //       String bas rst.getString("basic");
                String name = rst.getString("ename");
                String PF= rst.getString("pf");
                String Sex = rst.getString("sex");
           //     String HRA rst.getString("hra");
                String Add = rst.getString("address");
                String DA = rst.getString("da");
                String cit= rst.getString("city");
                String gros = rst.getString("gross"); 
                String DOJ = rst.getString("doj");
                String IT=rst.getString("it");
                String Des=rst.getString("designation");
                String Net =rst.getString("net");
                String dept = rst.getString("department");
                txtEmpno.setText(eno);
               // tfBasic.setText(basic);
                tfEname.setText(name);
               // tfPF.setText(PF);
               // cbSex.setSelectedItem(Sex);
               // tfHRA.setText(HRA);
               // tfAdd.setText(Add);
             //   tfDA.setText(DA);
           //     tfCity.setText(cit);
                tfGross.setText(gros);
         //       tfDOJ.setText(DOJ);
       //         tfIT.setText(IT);
                tfDes.setText(Des);
                tfNet.setText(Net); 
                tfDept.setText(dept);
     //           btnSave.setEnabled(true);
//                JOptionPane.showMessageDialog(this, "Employee Record Found...".  "Success", 1);
 //               tfAdd.setEnabled(true);
                tfBasic.setEnabled(true);
 //               tfCity.setEnabled(true);
  //              tfDA.setEnabled(true);
                tfDept.setEnabled(true);
                tfEname.setEnabled(true);
                tfGross.setEnabled(true);
   //             tfHRA.setEnabled(true);
   //             tfIT.setEnabled(true);
                tfNet.setEnabled(true);
     //           tfPF.setEnabled(true);
                tfDes.setEnabled(true);
            }
            else{
//                JOptionPane.showMessageDialog(this, "No Record Found..!!", "Error",JOptionPane.ERROR MESSAGE); 
                txtEmpno.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage()+"\n", "Error", 0);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSalaryEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalaryEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalaryEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalaryEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmSalaryEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfDeduction;
    private javax.swing.JTextField tfDept;
    private javax.swing.JTextField tfDes;
    private javax.swing.JTextField tfEname;
    private javax.swing.JTextField tfGross;
    private javax.swing.JTextField tfLeaves;
    private javax.swing.JTextField tfNet;
    private javax.swing.JTextField tfNetoffer;
    private javax.swing.JTextField tfdeDuctionleave;
    private javax.swing.JTextField txtEmpno;
    // End of variables declaration//GEN-END:variables
}
