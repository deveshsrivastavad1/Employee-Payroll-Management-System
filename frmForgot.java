
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmForgot extends javax.swing.JFrame {

            Connection conn= null;
            Statement stat = null;
            ResultSet rst = null;
    
        String ans = null , id = null  ;
        String query;
        
        frmLogin frmlogin;
    
        public frmForgot() {
        initComponents();
 }
    
    public void insertNewRow(String pwd) throws SQLException
    {
        rst = stat.executeQuery("SELECT * FROM login where uid='"+tfLogin.getText()+"';");
        rst.next();
       
        rst.updateString("pass",pwd);
             
        rst.updateRow();
       
       
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

        dPassword = new javax.swing.JDialog();
        fgpnl = new javax.swing.JPanel();
        bgPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNewPwd = new javax.swing.JPasswordField();
        txtRNewPwd = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        lblmess = new javax.swing.JLabel();
        lbluid = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tfQuestion = new javax.swing.JTextField();
        tfAnswer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        blnClear = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        dPassword.setTitle("Change Password");
        dPassword.setAlwaysOnTop(true);
        dPassword.setResizable(false);

        fgpnl.setMinimumSize(new java.awt.Dimension(1, 1));
        fgpnl.setOpaque(false);
        fgpnl.setLayout(new java.awt.GridBagLayout());

        bgPanel.setOpaque(false);

        jLabel4.setText("New Password :");

        jLabel3.setText("<html>Re-Type<br> Password :</html>");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Change Password");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNewPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnSave))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fgpnl.add(bgPanel, gridBagConstraints);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        labelImage.setDoubleBuffered(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fgpnl.add(labelImage, gridBagConstraints);

        javax.swing.GroupLayout dPasswordLayout = new javax.swing.GroupLayout(dPassword.getContentPane());
        dPassword.getContentPane().setLayout(dPasswordLayout);
        dPasswordLayout.setHorizontalGroup(
            dPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fgpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        dPasswordLayout.setVerticalGroup(
            dPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fgpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Forgot");
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

        pnl.setOpaque(false);
        pnl.setLayout(new java.awt.GridBagLayout());

        panel.setOpaque(false);

        lblmess.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 14)); // NOI18N
        lblmess.setForeground(new java.awt.Color(255, 0, 51));
        lblmess.setText("<html>We are Happy To Help You !!!<br>Forgot Password ..  <br> Do not Worry<br> It Happens<br> Just fill below fields to get a new password</html> ");

        lbluid.setText("User ID");

        btnCheck.setText("CHECK");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Question");

        tfQuestion.setEnabled(false);

        tfAnswer.setEnabled(false);

        jLabel2.setText("Answer");

        btnsubmit.setText("Submit");
        btnsubmit.setEnabled(false);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        blnClear.setText("Clear");
        blnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbluid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnsubmit)
                        .addGap(42, 42, 42)
                        .addComponent(blnClear))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblmess, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnCheck))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAnswer)
                            .addComponent(tfQuestion, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmess, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCheck)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(blnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        lblImage.setDoubleBuffered(true);
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
            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(445, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
    try
        {
            rst=stat.executeQuery("select * from login where uid ='"+ tfLogin.getText()+"';");
            rst.last();
            if(rst.getRow()==0)
            {
                JOptionPane.showMessageDialog(this,"User not registered, Please Register the UserID...","Registration Failed",0);
                tfLogin.setText("");
                tfAnswer.setText("");
                tfQuestion.setText("");
                tfLogin.requestFocus();
                tfQuestion.setEnabled(false);
                tfAnswer.setEnabled(false);
                btnsubmit.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"User ID Found!!!","Info.",1);
                tfQuestion.setEnabled(true);
                tfAnswer.setEnabled(true);
                btnsubmit.setEnabled(true);
            }
        }
        catch(SQLException e)
        {
        }
        catch(Exception e)
        {
        }
    
            try
            {
                
                query="select * from login where uid='" +tfLogin.getText()+"';";
                rst=stat.executeQuery(query);
                    if(rst.next())
                        {
                            String question = rst.getString("squestion");
                            tfQuestion.setText(question);
                        }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
            }
}//GEN-LAST:event_btnCheckActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
}//GEN-LAST:event_formWindowOpened

private void blnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnClearActionPerformed
        tfLogin.setText("");
        tfAnswer.setText("");
        tfQuestion.setText("");
        tfQuestion.setEnabled(false);
        tfAnswer.setEnabled(false);
        btnsubmit.setEnabled(false);
}//GEN-LAST:event_blnClearActionPerformed

private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try
        {
            
            String pwd2 = rst.getString("ans") ;
            
            String pwd1=tfAnswer.getText();
            if(rst.getRow()==0)
            {
                JOptionPane.showMessageDialog(this,"User not registered, Please Register the UserID...","Registration Failed",0);
            }
            else 
                if(pwd1.equals(pwd2))
            {
                JOptionPane.showMessageDialog(this,"You are a authentic user...Please set your new password","Authentic user",1);
                dispose();
                dPassword.setVisible(true);
                dPassword.pack();
            }
                else{
                    JOptionPane.showMessageDialog(this,"Please Enter Valid Password...","SORRY",0);
                    tfLogin.setText("");
                    tfQuestion.setText("");
                    tfAnswer.setText("");
                    tfQuestion.setEnabled(false);
                    tfAnswer.setEnabled(false);
                    btnsubmit.setEnabled(false);
                    }
            
        }
        catch(SQLException e)
        {
            
        }
        catch(Exception e)
        {
            
        } 
        
        
}//GEN-LAST:event_btnsubmitActionPerformed

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
String pwd1,pwd2;
         pwd1=new String(txtNewPwd.getPassword());
         pwd2=new String(txtRNewPwd.getPassword());
         if(pwd1.equals(pwd2))
         {
            try
            {
                insertNewRow(txtNewPwd.getText());
                JOptionPane.showMessageDialog(this,"Password Updated...","Success",1);
                dPassword.dispose();
                frmlogin= new frmLogin();
                frmlogin.setVisible(true);
                frmlogin.pack();
                
                
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
                //e.printStackTrace();
            }
            
         }
         else
        {
            JOptionPane.showMessageDialog(this,"Password doesn't match, Try Again!!!","Error",0);
            txtNewPwd.setText("");
            txtRNewPwd.setText("");
            txtNewPwd.requestFocus();
        }

}//GEN-LAST:event_btnSaveActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
}//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(frmForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmForgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmForgot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton blnClear;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JDialog dPassword;
    private javax.swing.JPanel fgpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblmess;
    private javax.swing.JLabel lbluid;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField tfAnswer;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfQuestion;
    private javax.swing.JPasswordField txtNewPwd;
    private javax.swing.JPasswordField txtRNewPwd;
    // End of variables declaration//GEN-END:variables
}
