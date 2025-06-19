        import java.awt.Color;
        import java.awt.Font;
        import javax.swing.ImageIcon;
        import javax.swing.JOptionPane;
        import java.sql.*;
        
public class frmLogin extends javax.swing.JFrame {

    Connection conn= null;
    Statement stat = null;
    ResultSet rst = null;
    String query;
    frmForgot frmforgot;
    frmSignup frmsignup;
    public frmLogin() {
        initComponents();
        txtLogin.setText("");
        pfPassword.setText("");
        txtLogin.requestFocus();
        stat=MyConnection.getConnection();
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

        jLabel1 = new javax.swing.JLabel();
        bgPanel = new javax.swing.JPanel();
        fgPanel = new javax.swing.JPanel();
        lblmwss = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblNewUser = new javax.swing.JLabel();
        lblforgot = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bgPanel.setLayout(new java.awt.GridBagLayout());

        fgPanel.setMinimumSize(new java.awt.Dimension(311, 324));

        lblmwss.setBackground(new java.awt.Color(204, 204, 255));
        lblmwss.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 36)); // NOI18N
        lblmwss.setForeground(new java.awt.Color(255, 0, 0));
        lblmwss.setText(" Please Login");
        lblmwss.setOpaque(true);

        lblID.setText(" Login ID");

        lblPassword.setText(" Password");

        btnLogin.setBackground(new java.awt.Color(255, 153, 51));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 153, 51));
        btnCancel.setText("Clear");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblNewUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewUser.setForeground(new java.awt.Color(255, 0, 0));
        lblNewUser.setText("Create a new account");
        lblNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewUserMouseExited(evt);
            }
        });

        lblforgot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblforgot.setForeground(new java.awt.Color(255, 0, 0));
        lblforgot.setText("Forgot Password ??");
        lblforgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblforgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblforgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblforgotMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fgPanelLayout = new javax.swing.GroupLayout(fgPanel);
        fgPanel.setLayout(fgPanelLayout);
        fgPanelLayout.setHorizontalGroup(
            fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforgot)
                    .addComponent(lblNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fgPanelLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnCancel)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(fgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmwss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fgPanelLayout.createSequentialGroup()
                        .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        fgPanelLayout.setVerticalGroup(
            fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmwss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(fgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addGap(31, 31, 31)
                .addComponent(lblNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblforgot, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        bgPanel.add(fgPanel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(341, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try
        {
            rst=stat.executeQuery("select * from login where uid='"+txtLogin.getText()+"';");
            //rst.last();
            String pwd2="";
            if(rst.next()){
                pwd2 = rst.getString("pass") ;
        }
             

            String pwd1=new String(pfPassword.getPassword());
            if(rst.getRow()==0)
            {
                JOptionPane.showMessageDialog(this,"User not registered, Please Register the UserID...","Registration Failed",JOptionPane.ERROR_MESSAGE);
            }
            else
            if(pwd1.equals(pwd2))
            {
                JOptionPane.showMessageDialog(this,"Login successful...","Welcome",JOptionPane.INFORMATION_MESSAGE);
                {
                    dispose();
                    frmMain frm = new frmMain();
                    frm.pack();
                    frm.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Please Enter Valid Password...","SORRY",JOptionPane.ERROR_MESSAGE);
                clear();
            }

        }
        catch(SQLException e)
        {

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtLogin.setText("");
        pfPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseClicked
        dispose();
        frmsignup = new frmSignup();
        frmsignup.pack();
        frmsignup.setVisible(true);
    }//GEN-LAST:event_lblNewUserMouseClicked

    private void lblNewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseEntered
        lblNewUser.setFont(new Font("Tahoma",Font.BOLD,16));
        lblNewUser.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblNewUserMouseEntered

    private void lblNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewUserMouseExited
        lblNewUser.setFont(new Font("Tahoma",Font.BOLD,12));
        lblNewUser.setForeground(Color.RED);
    }//GEN-LAST:event_lblNewUserMouseExited

    private void lblforgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMouseClicked
        dispose();
        frmforgot = new frmForgot();
        frmforgot.pack();
        frmforgot.setVisible(true);
    }//GEN-LAST:event_lblforgotMouseClicked

    private void lblforgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMouseEntered
        lblforgot.setFont(new Font("Tahoma",Font.BOLD,16));
        lblforgot.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblforgotMouseEntered

    private void lblforgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMouseExited
        lblforgot.setFont(new Font("Tahoma",Font.BOLD,12));
        lblforgot.setForeground(Color.RED);
    }//GEN-LAST:event_lblforgotMouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        exiting();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel fgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblforgot;
    private javax.swing.JLabel lblmwss;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

    public void clear()
    {
        txtLogin.setText("");
        pfPassword.setText("");
        txtLogin.requestFocus();
    }
    private void ShowMessageDialog(frmLogin aThis, String string, String string0, int INFORMATION_MESSAGE, ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
