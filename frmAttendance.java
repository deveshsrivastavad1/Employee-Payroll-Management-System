    import java.sql.*;    
import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    public class frmAttendance extends javax.swing.JFrame {
        
        Connection conn= null;
        Statement stat = null;
        ResultSet rst = null;
        String query,cls,pls,mls,lwp;

    
    frmMain fmain;
    public frmAttendance() {
        initComponents();}
        
        void exiting()
        {
        int xyz = JOptionPane.showConfirmDialog(this,"Are u sure u want to exit","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon("src/LoginImages/close_p.png"));
        
        if(xyz == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
        }
        
         public String getMyDate()
            {
                String year=(String)cbYear.getSelectedItem();
                int month=cbMonth.getSelectedIndex();
                String Date=(String)cbDate.getSelectedItem();
                return(year+"-"+month+"-"+Date);
            }
         
         public String Empno()
         {
         String empNo = (String)cbAtten.getSelectedItem();
         return(empNo);
         }
        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnl = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAtten = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        cbAtten = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCLS = new javax.swing.JTextField();
        txtPLS = new javax.swing.JTextField();
        txtMLS = new javax.swing.JTextField();
        txtLWP = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cbYear = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        cbDate = new javax.swing.JComboBox();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Attendance");
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

        panel.setMinimumSize(new java.awt.Dimension(0, 0));
        panel.setOpaque(false);
        panel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Walnuts", 1, 18)); // NOI18N
        jLabel1.setText("Add Attendance");

        jLabel3.setText("Emp no.");

        btnAtten.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnAtten.setText("Add Attendance");
        btnAtten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttenActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        cbAtten.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbAtten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbAttenMousePressed(evt);
            }
        });

        jLabel4.setText("For Date");

        jLabel5.setText("For Month");

        jLabel6.setText("For Year");

        jLabel7.setText("CLS");

        jLabel8.setText("PLS");

        jLabel9.setText("MLS");

        jLabel10.setText("LWP");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004 ", "2003 ", "2002 ", "2001", "2000", "1999 ", "1998 ", "1997 ", "1996", "1995 ", "1994 ", "1993", "1992 ", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980" }));

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Janauary", "February", "March", "April", "May", "June", "July", "August", "September", "october", "November", "December" }));

        cbDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCLS, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(txtPLS, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(txtMLS, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(txtLWP, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(cbYear, 0, 293, Short.MAX_VALUE)
                                    .addComponent(cbMonth, 0, 293, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAtten, 0, 292, Short.MAX_VALUE)
                                    .addComponent(cbDate, 0, 292, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbAtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLWP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtten)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(48, 48, 48))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnl.add(panel, gridBagConstraints);

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
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(388, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
    
}//GEN-LAST:event_formWindowClosing

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
}//GEN-LAST:event_btnExitActionPerformed

private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
dispose();
        fmain = new frmMain();
        fmain.pack();
        fmain.setVisible(true);
}//GEN-LAST:event_btnHomeActionPerformed

private void btnAttenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttenActionPerformed
        cls = txtCLS.getText();   
        pls = txtPLS.getText();
        mls = txtMLS.getText();
        lwp = txtLWP.getText();
        
        try
            {
                
        query="insert into Attendance values('"+Empno()+"','"+getMyDate()+"',"+cls+","+pls+","+mls+","+lwp+");";
        stat.executeUpdate(query);
           
        {            
            JOptionPane.showMessageDialog(this,"Attendance Marked!!!!!","Success",1);
            txtCLS.setText("");
            txtLWP.setText("");
            txtMLS.setText("");
            txtPLS.setText("");
            cbAtten.setSelectedIndex(0);
            cbDate.setSelectedIndex(0);
            cbMonth.setSelectedIndex(0);
            cbYear.setSelectedIndex(0);
        }
            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
                
            }
    
}//GEN-LAST:event_btnAttenActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
        
        try 
        {
            query = "select empno from emp;";            
            rst = stat.executeQuery(query);
            
            while(rst.next())
            {
                cbAtten.addItem(rst.getString(1));
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error loading...!!", "Failure!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("" + e.getMessage());
        }
}//GEN-LAST:event_formWindowOpened

private void cbAttenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAttenMousePressed
        
}//GEN-LAST:event_cbAttenMousePressed

   
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
            java.util.logging.Logger.getLogger(frmAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmAttendance().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtten;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JComboBox cbAtten;
    private javax.swing.JComboBox cbDate;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtCLS;
    private javax.swing.JTextField txtLWP;
    private javax.swing.JTextField txtMLS;
    private javax.swing.JTextField txtPLS;
    // End of variables declaration//GEN-END:variables
}
