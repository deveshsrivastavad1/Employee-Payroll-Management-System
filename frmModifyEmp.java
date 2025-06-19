        
    import javax.swing.JOptionPane;
    import java.sql.*;
import javax.swing.ImageIcon;
    
        public class frmModifyEmp extends javax.swing.JFrame {
            
            Connection conn= null;
            Statement stat = null;
            ResultSet rst = null;
            String query;
            String Query;

            frmMain fmain;
    public frmModifyEmp() {
        initComponents();
    }
    
    void exiting()
        {
        int xyz = JOptionPane.showConfirmDialog(this,"Are u sure u want to exit","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon("src/LoginImages/close_p.png"));
        
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
        jLabel10 = new javax.swing.JLabel();
        tfBasic = new javax.swing.JTextField();
        tfPF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSex = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        tfHRA = new javax.swing.JTextField();
        tfDA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfGross = new javax.swing.JTextField();
        tfIT = new javax.swing.JTextField();
        tfNet = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfDes = new javax.swing.JTextField();
        tfDept = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtEmpno = new javax.swing.JTextField();
        tfDOJ = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modify Employee");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnl.setMinimumSize(new java.awt.Dimension(1, 1));
        pnl.setLayout(new java.awt.GridBagLayout());

        Panel.setOpaque(false);
        Panel.setRequestFocusEnabled(false);

        jLabel17.setFont(new java.awt.Font("Vivaldi", 3, 18)); // NOI18N
        jLabel17.setText("Modify Employee");

        jLabel2.setText("Emp No.");

        jLabel10.setText("Basic");

        tfBasic.setEnabled(false);

        tfPF.setEnabled(false);

        jLabel11.setText("PF");

        tfEname.setEnabled(false);

        jLabel3.setText("EName");

        jLabel4.setText("Sex");

        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Male", "Female" }));

        jLabel12.setText("HRA");

        tfHRA.setEnabled(false);

        tfDA.setEnabled(false);

        jLabel13.setText("DA");

        tfAdd.setEnabled(false);

        jLabel6.setText("City");

        jLabel5.setText("Address");

        tfCity.setEnabled(false);

        jLabel14.setText("GROSS");

        tfGross.setEnabled(false);

        tfIT.setEnabled(false);

        tfNet.setEnabled(false);

        jLabel16.setText("NET");

        jLabel15.setText("IT");

        tfDes.setEnabled(false);

        tfDept.setEnabled(false);

        jLabel9.setText("Department");

        jLabel8.setText("Designation");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel18.setText("DOJ");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tfDOJ.setEnabled(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(35, 35, 35))
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel18))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDes)
                                            .addComponent(tfDept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(tfCity, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(tfDOJ, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfAdd)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmpno, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(tfEname))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(85, 85, 85)))
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfGross)
                                .addComponent(tfIT)
                                .addComponent(tfNet)
                                .addComponent(tfPF)
                                .addComponent(tfBasic, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(tfHRA)
                                .addComponent(tfDA))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch)
                    .addComponent(jLabel10)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(tfPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(tfDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(tfGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tfDOJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tfNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnExit)
                    .addComponent(jButton3))
                .addContainerGap(93, Short.MAX_VALUE))
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
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(545, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
}//GEN-LAST:event_btnExitActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
}//GEN-LAST:event_formWindowClosing

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        fmain = new frmMain();
        fmain.pack();
        fmain.setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        
    String basic = tfBasic.getText();
    String name = tfEname.getText();
    String PF = tfPF.getText();
    String address = tfAdd.getText();
    String HRA = tfHRA.getText();
    String city = tfCity.getText();
    String gross = tfGross.getText();
    String it = tfIT.getText();
    String des = tfDes.getText();
    String dept = tfDept.getText();
    String net = tfNet.getText();
    
    try
    {
        stat.executeUpdate("UPDATE emp set address = '"+tfAdd.getText()+"' ,Ename = '"+tfEname.getText()+"', basic = '"+tfBasic.getText()+"' , pf = '" +tfPF.getText()+ "' , hra = '" +tfHRA.getText()+ "' ,da = '" +tfDA.getText()+ "' , city = '"+tfCity.getText()+"' ,gross = '" +tfGross.getText()+ "' , it = '" +tfIT.getText()+"' , department = '" +tfDept.getText()+"' , designation = '"+tfDes.getText()+"' , net = '"+tfNet.getText()+"' WHERE empno = '"+txtEmpno.getText()+"';") ;
        
        {
            JOptionPane.showMessageDialog(null, "Modification Successful !!!!");
            tfBasic.setText("");
            tfEname.setText("");
            tfPF.setText("");
            tfAdd.setText("");
            tfHRA.setText("");
            tfCity.setText("");
            tfGross.setText("");
            tfIT.setText("");
            tfDes.setText("");
            tfDept.setText("");
            tfNet.setText("");
            tfDA.setText("");
            tfDOJ.setText("");
            cbSex.setSelectedIndex(0);
            txtEmpno.setText("");
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Only Numeric values allowed in salary block!!", "Failure!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e.getMessage());
    }
      
    
    
}//GEN-LAST:event_btnSaveActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
        
        
}//GEN-LAST:event_formWindowOpened

private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
try
            {
                
        query="select * from emp where empno='" +txtEmpno.getText()+"';";
        rst=stat.executeQuery(query);
        
        if(rst.next())
        {
        String eno = rst.getString("empno");
        String bas = rst.getString("basic");
        String name = rst.getString("ename");
        String PF = rst.getString("pf");
        String Sex = rst.getString("sex");
        String HRA = rst.getString("hra");
        String Add = rst.getString("address");
        String DA = rst.getString("da");
        String cit = rst.getString("city");
        String gros = rst.getString("gross");
        String DOJ = rst.getString("dob");
        String IT = rst.getString("it");
        String Des = rst.getString("designation");
        String Net = rst.getString("net");
        String dept = rst.getString("department");
        
        txtEmpno.setText(eno);
        tfBasic.setText(bas);
        tfEname.setText(name);
        tfPF.setText(PF);
        cbSex.setSelectedItem(Sex);
        tfHRA.setText(HRA);
        tfAdd.setText(Add);
        tfDA.setText(DA);
        tfCity.setText(cit);
        tfGross.setText(gros);
        tfDOJ.setText(DOJ);
        tfIT.setText(IT);
        tfDes.setText(Des);
        tfNet.setText(Net);
        tfDept.setText(dept);
        
        btnSave.setEnabled(true);
        
        JOptionPane.showMessageDialog(this,"Employee Record Found...","Success",1);
         tfAdd.setEnabled(true);
         tfBasic.setEnabled(true);
         tfCity.setEnabled(true);
         tfDA.setEnabled(true);
         tfDept.setEnabled(true);
         tfEname.setEnabled(true);
         tfGross.setEnabled(true);
         tfHRA.setEnabled(true);
         tfIT.setEnabled(true);
         tfNet.setEnabled(true);
         tfPF.setEnabled(true);
         tfDes.setEnabled(true);
         }
        else
        {
                JOptionPane.showMessageDialog(this,"No Record Found..!!","Error",JOptionPane.ERROR_MESSAGE);
                txtEmpno.setText("");
        }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
                
            }        
        
}//GEN-LAST:event_btnSearchActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmModifyEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModifyEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModifyEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModifyEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmModifyEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField tfAdd;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfDA;
    private javax.swing.JTextField tfDOJ;
    private javax.swing.JTextField tfDept;
    private javax.swing.JTextField tfDes;
    private javax.swing.JTextField tfEname;
    private javax.swing.JTextField tfGross;
    private javax.swing.JTextField tfHRA;
    private javax.swing.JTextField tfIT;
    private javax.swing.JTextField tfNet;
    private javax.swing.JTextField tfPF;
    private javax.swing.JTextField txtEmpno;
    // End of variables declaration//GEN-END:variables
}
