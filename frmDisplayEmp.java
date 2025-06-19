    import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    import java.sql.*;

    public class frmDisplayEmp extends javax.swing.JFrame {
        
            Connection conn= null;
            Statement stat = null;
            ResultSet rst = null;
            String query;
            frmMain fmain;

    
    public frmDisplayEmp() {
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
        tfEmpno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfEname = new javax.swing.JTextField();
        tfAdd = new javax.swing.JTextField();
        tfCity = new javax.swing.JTextField();
        tfDes = new javax.swing.JTextField();
        tfDept = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBasic = new javax.swing.JTextField();
        tfPF = new javax.swing.JTextField();
        tfHRA = new javax.swing.JTextField();
        tfDA = new javax.swing.JTextField();
        tfGross = new javax.swing.JTextField();
        tfIT = new javax.swing.JTextField();
        tfNet = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tfDOJ = new javax.swing.JTextField();
        tfSex = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Display Employee");
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
        jLabel17.setText("Display Employee");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfEname.setEditable(false);

        tfAdd.setEditable(false);

        tfCity.setEditable(false);

        tfDes.setEditable(false);

        tfDept.setEditable(false);

        jLabel9.setText("Department");

        jLabel8.setText("Designation");

        jLabel7.setText("DOJ");

        jLabel6.setText("City");

        jLabel5.setText("Address");

        jLabel4.setText("Sex");

        jLabel3.setText("EName");

        jLabel2.setText("Emp No.");

        tfBasic.setEditable(false);

        tfPF.setEditable(false);

        tfHRA.setEditable(false);

        tfDA.setEditable(false);

        tfGross.setEditable(false);

        tfIT.setEditable(false);

        tfNet.setEditable(false);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel16.setText("NET");

        jLabel15.setText("IT");

        jLabel14.setText("GROSS");

        jLabel13.setText("DA");

        jLabel12.setText("HRA");

        jLabel11.setText("PF");

        jLabel10.setText("Basic");

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfDOJ.setEditable(false);

        tfSex.setEditable(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDes)
                                    .addComponent(tfDept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tfCity, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tfDOJ, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmpno, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tfEname)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSex, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tfAdd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfIT, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfGross)
                                        .addComponent(tfNet)
                                        .addComponent(tfPF)
                                        .addComponent(tfBasic, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(tfHRA)
                                        .addComponent(tfDA))))
                            .addComponent(jButton2)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnExit)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jLabel10)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(tfPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel7)
                    .addComponent(jLabel15)
                    .addComponent(tfIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(528, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
}//GEN-LAST:event_formWindowClosing

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
}//GEN-LAST:event_formWindowOpened

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        fmain = new frmMain();
        fmain.pack();
        fmain.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
}//GEN-LAST:event_btnExitActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
            {
                
        query="select * from emp where empno='" +tfEmpno.getText()+"';";
        rst=stat.executeQuery(query);
        
        if(rst.next())
        {
        String eno = rst.getString("empno");
        String bas = rst.getString("basic");
        String name = rst.getString("Ename");
        String PF = rst.getString("pf");
        String Sex = rst.getString("sex");
        String HRA = rst.getString("hra");
        String Add = rst.getString("address");
        String DA = rst.getString("da");
        String cit = rst.getString("city");
        String gros = rst.getString("gross");
        String DOJ = rst.getString("doj");
        String IT = rst.getString("it");
        String Des = rst.getString("designation");
        String Net = rst.getString("net");
        String dept = rst.getString("department");
        
        tfEmpno.setText(eno);
        tfBasic.setText(bas);
        tfEname.setText(name);
        tfPF.setText(PF);
        tfSex.setText(Sex);
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
        
        JOptionPane.showMessageDialog(this,"Employee Record Found...","Success",1);
        }
         else
         {
             JOptionPane.showMessageDialog(this,"No Record Found..!!","Error",JOptionPane.ERROR_MESSAGE);
         }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
                tfEmpno.setText("");
            }
}//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmDisplayEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDisplayEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDisplayEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDisplayEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmDisplayEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField tfAdd;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfDA;
    private javax.swing.JTextField tfDOJ;
    private javax.swing.JTextField tfDept;
    private javax.swing.JTextField tfDes;
    private javax.swing.JTextField tfEmpno;
    private javax.swing.JTextField tfEname;
    private javax.swing.JTextField tfGross;
    private javax.swing.JTextField tfHRA;
    private javax.swing.JTextField tfIT;
    private javax.swing.JTextField tfNet;
    private javax.swing.JTextField tfPF;
    private javax.swing.JTextField tfSex;
    // End of variables declaration//GEN-END:variables
}
