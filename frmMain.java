    import java.awt.Color;
    import java.awt.Font;
    import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    import javax.swing.tree.DefaultMutableTreeNode;
    
public class frmMain extends javax.swing.JFrame {

    private frmAddEmp emp;
    private frmAttendance Emp;
    private frmDeleteEmp Empl;
    private frmDisplayEmp empl;
    private frmModifyEmp Emplo;
    private frmSalaryEmp emplo;
    frmLogin frmlogin;
    
    
    public frmMain() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTree = new javax.swing.JTree();
        lblAdd = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        lblDisplay = new javax.swing.JLabel();
        lblModify = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblAttendance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setMinimumSize(new java.awt.Dimension(1, 1));
        pnl.setLayout(new java.awt.GridBagLayout());

        Panel.setOpaque(false);
        Panel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Select Categories");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Project Employee Pay Processing System");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("GCET");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employee");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Add Employee");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Delete Employee");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Display Employee");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Modify Employee");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Salary of Employee");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Attendance of Employee");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        EmployeeTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        EmployeeTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                EmployeeTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTree);

        lblAdd.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(255, 0, 51));
        lblAdd.setText("Add Employee");
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMouseExited(evt);
            }
        });

        lblDelete.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(255, 0, 51));
        lblDelete.setText("Delete Employee");
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeleteMouseExited(evt);
            }
        });

        lblDisplay.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblDisplay.setForeground(new java.awt.Color(255, 0, 51));
        lblDisplay.setText("Display Employee");
        lblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisplayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDisplayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDisplayMouseExited(evt);
            }
        });

        lblModify.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblModify.setForeground(new java.awt.Color(255, 0, 51));
        lblModify.setText("Modify Employee");
        lblModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModifyMouseExited(evt);
            }
        });

        lblSalary.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(255, 0, 51));
        lblSalary.setText("Salary of Employee");
        lblSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalaryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalaryMouseExited(evt);
            }
        });

        lblAttendance.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 18)); // NOI18N
        lblAttendance.setForeground(new java.awt.Color(255, 0, 51));
        lblAttendance.setText("Attendance of Employee");
        lblAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAttendanceMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ZapfChancery-MediumItalic bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Sign Out");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblModify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(lblAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl.add(Panel, new java.awt.GridBagConstraints());

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
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_EmployeeTreeValueChanged
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)EmployeeTree.getLastSelectedPathComponent();
        String str="";
        if (node == null) return;

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf())
        {
            str=(String)nodeInfo;
            System.out.println(str);

            if(str.equals("Add Employee"))
            {
                dispose();
                emp=new frmAddEmp();
                emp.pack();
                emp.setVisible(true);
            }
            else
            if(str.equals("Attendance of Employee"))
            {
                dispose();
                Emp=new frmAttendance();
                Emp.pack();
                Emp.setVisible(true);
            }

            else
            if(str.equals("Delete Employee"))
            {
                dispose();
                Empl=new frmDeleteEmp();
                Empl.pack();
                Empl.setVisible(true);
            }
            else
            if(str.equals("Display Employee"))
            {
                dispose();
                empl=new frmDisplayEmp();
                empl.pack();
                empl.setVisible(true);
            }
            else
            if(str.equals("Modify Employee"))
            {
                dispose();
                Emplo=new frmModifyEmp();
                Emplo.pack();
                Emplo.setVisible(true);
            }
            else
            if(str.equals("Salary of Employee"))
            {
                dispose();
                emplo=new frmSalaryEmp();
                emplo.pack();
                emplo.setVisible(true);
            }

        }

    }//GEN-LAST:event_EmployeeTreeValueChanged

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        dispose();
        frmAddEmp frm = new frmAddEmp();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblAddMouseClicked

    private void lblAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseEntered
        lblAdd.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblAdd.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblAddMouseEntered

    private void lblAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseExited
        lblAdd.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblAdd.setForeground(Color.RED);
    }//GEN-LAST:event_lblAddMouseExited

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        dispose();
        frmDeleteEmp frm = new frmDeleteEmp();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void lblDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseEntered
        lblDelete.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblDelete.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblDeleteMouseEntered

    private void lblDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseExited
        lblDelete.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblDelete.setForeground(Color.RED);
    }//GEN-LAST:event_lblDeleteMouseExited

    private void lblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisplayMouseClicked
        dispose();
        frmDisplayEmp frm = new frmDisplayEmp();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblDisplayMouseClicked

    private void lblDisplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisplayMouseEntered
        lblDisplay.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblDisplay.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblDisplayMouseEntered

    private void lblDisplayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisplayMouseExited
        lblDisplay.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblDisplay.setForeground(Color.RED);
    }//GEN-LAST:event_lblDisplayMouseExited

    private void lblModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMouseClicked
        dispose();
        frmModifyEmp frm = new frmModifyEmp();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblModifyMouseClicked

    private void lblModifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMouseEntered
        lblModify.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblModify.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblModifyMouseEntered

    private void lblModifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMouseExited
        lblModify.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblModify.setForeground(Color.RED);
    }//GEN-LAST:event_lblModifyMouseExited

    private void lblSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryMouseClicked
        dispose();
        frmSalaryEmp frm = new frmSalaryEmp();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblSalaryMouseClicked

    private void lblSalaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryMouseEntered
        lblSalary.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblSalary.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblSalaryMouseEntered

    private void lblSalaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalaryMouseExited
        lblSalary.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblSalary.setForeground(Color.RED);
    }//GEN-LAST:event_lblSalaryMouseExited

    private void lblAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendanceMouseClicked
        dispose();
        frmAttendance frm = new frmAttendance();
        frm.pack();
        frm.setVisible(true);
    }//GEN-LAST:event_lblAttendanceMouseClicked

    private void lblAttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendanceMouseEntered
        lblAttendance.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,24));
        lblAttendance.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblAttendanceMouseEntered

    private void lblAttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttendanceMouseExited
        lblAttendance.setFont(new Font("ZapfChancery-MediumItalic bold",Font.BOLD,18));
        lblAttendance.setForeground(Color.RED);
    }//GEN-LAST:event_lblAttendanceMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        frmlogin = new frmLogin();
        frmlogin.pack();
        frmlogin.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree EmployeeTree;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblAttendance;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblModify;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
