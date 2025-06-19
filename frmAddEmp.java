import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.sql.*;
        
    public class frmAddEmp extends javax.swing.JFrame {
            
            Connection conn= null;
            Statement stat = null;
            ResultSet rst = null;
            String query,no,bas,name,add,city,des,dept,pf,hra,da,gros,it,net;
            frmMain fmain;
       
        public frmAddEmp() {
        initComponents();
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
            
            void home()
            {
                int abc = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out","Log Out",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
                
                    if(abc == JOptionPane.YES_OPTION)
                    {
                    
                    }
                    
                    else
                    {
                    
                    }
            }
    
            public void check()
            {
                if(txtEname.getText().isEmpty() || txtEmpno.getText().isEmpty() || txtAdd.getText().isEmpty()|| txtCity.getText().isEmpty()||  txtDesignation.getText().isEmpty()|| txtDept.getText().isEmpty()|| txtBasic.getText().isEmpty()|| txtPf.getText().isEmpty()|| txtHra.getText().isEmpty()|| txtDa.getText().isEmpty()|| txtGross.getText().isEmpty()|| txtIT.getText().isEmpty()|| txtNet.getText().isEmpty())
                    {
                        btnSave.setEnabled(false);
                    }
                    else
                        {
                            btnSave.setEnabled(true);
                        }
            
            }
        
            public String getMyDate()
            {
                String year=(String)cbYear.getSelectedItem();
                int month=cbMonth.getSelectedIndex();
                String Date=(String)cbDate.getSelectedItem();
                return(year+"-"+month+"-"+Date);
            }
            
            public String getGender()
            {
            String sex = (String)cbSex.getSelectedItem();
            return(sex);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEname = new javax.swing.JTextField();
        txtEmpno = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtBasic = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPf = new javax.swing.JTextField();
        txtHra = new javax.swing.JTextField();
        txtDa = new javax.swing.JTextField();
        txtGross = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtIT = new javax.swing.JTextField();
        txtNet = new javax.swing.JTextField();
        cbSex = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        cbDate = new javax.swing.JComboBox();
        btnHome = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Empoyee");
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
        pnl.setPreferredSize(new java.awt.Dimension(570, 479));
        pnl.setLayout(new java.awt.GridBagLayout());

        panel.setMinimumSize(new java.awt.Dimension(0, 0));
        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(385, 485));
        panel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 18)); // NOI18N
        jLabel1.setText("Add Employee");

        jLabel2.setText("Emp No.");

        jLabel3.setText("EName");

        jLabel4.setText("Sex");

        jLabel5.setText("Address");

        jLabel6.setText("City");

        jLabel7.setText("DOJ");

        jLabel8.setText("Designation");

        jLabel9.setText("Department");

        txtEname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtEmpno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtAdd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtCity.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtDesignation.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtDept.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel10.setText("Basic");

        txtBasic.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        jLabel11.setText("PF");

        jLabel12.setText("HRA");

        jLabel13.setText("DA");

        jLabel14.setText("GROSS");

        jLabel15.setText("IT");

        jLabel16.setText("NET");

        txtPf.setEditable(false);
        txtPf.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtHra.setEditable(false);
        txtHra.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtDa.setEditable(false);
        txtDa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtGross.setEditable(false);
        txtGross.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtIT.setEditable(false);
        txtIT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        txtNet.setEditable(false);
        txtNet.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Caret(evt);
            }
        });

        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select your Gender", "Male", "Female", "Other" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004 ", "2003 ", "2002 ", "2001", "2000", "1999 ", "1998 ", "1997 ", "1996", "1995 ", "1994 ", "1993", "1992 ", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980" }));

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Janauary", "February", "March", "April", "May", "June", "July", "August", "September", "october", "November", "December" }));

        cbDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel1))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtEmpno))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSex, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEname)
                                    .addComponent(txtAdd)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDept)
                                    .addComponent(txtDesignation)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCity)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel14)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnSave)
                        .addGap(39, 39, 39)
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNet, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtHra, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIT, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGross, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addComponent(txtBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel5))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtHra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtDa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGap(9, 9, 9)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(btnHome))
                    .addComponent(btnShow))
                .addContainerGap(76, Short.MAX_VALUE))
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
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(487, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exiting();
}//GEN-LAST:event_btnExitActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exiting();
        
        try
        {
        rst.close();
        stat.close();
        conn.close();
        }
        catch(Exception e)
        {
        
        }
}//GEN-LAST:event_formWindowClosing

private void Caret(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Caret
        check();
}//GEN-LAST:event_Caret

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            no=txtEmpno.getText();
            bas=txtBasic.getText();
            name=txtEname.getText();
            pf=txtPf.getText();
            hra=txtHra.getText();
            add=txtAdd.getText();
            da=txtDa.getText();
            city=txtCity.getText();
            gros=txtGross.getText();
            it=txtIT.getText();
            des=txtDesignation.getText();
            net=txtNet.getText();
            dept=txtDept.getText();
        
            try
            {
                
        query="insert into emp values('"+no+"',"+bas+",'"+name+"',"+pf+",'"+getGender()+"',"+hra+",'"+add+"',"+da+",'"+city+"',"+gros+",'"+getMyDate()+"',"+it+",'"+des+"',"+net+",'"+dept+"');";
        stat.executeUpdate(query);
        {   
            JOptionPane.showMessageDialog(this,"User registered...","Success",1);
            txtEmpno.setText("");
            txtBasic.setText("");
            txtEname.setText("");
            txtPf.setText("");
            txtAdd.setText("");
            txtHra.setText("");
            txtCity.setText("");
            txtGross.setText("");
            txtIT.setText("");
            txtDesignation.setText("");
            txtDept.setText("");
            txtNet.setText("");
            txtDa.setText("");
            cbYear.setSelectedIndex(0);
            cbMonth.setSelectedIndex(0);
            cbDate.setSelectedIndex(0);
            cbSex.setSelectedIndex(0);
            txtEmpno.setText("");
        }       
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);
                
            }
       
         
}//GEN-LAST:event_btnSaveActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
}//GEN-LAST:event_formWindowOpened

private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        dispose();
        fmain = new frmMain();
        fmain.pack();
        fmain.setVisible(true);
}//GEN-LAST:event_btnHomeActionPerformed

private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
      double  basic,pf,hra,da,gross,it,net;
      basic = Double.parseDouble(txtBasic.getText());
        if(basic <= 10000)
        {
            pf = (basic*10)/100;
            txtPf.setText(""+pf);
        }
          else
        {
            pf = (basic*15)/100;
            txtPf.setText(""+pf);
        }
        hra=(basic*10)/100;
        txtHra.setText(""+hra);
        da=(basic*5)/100;
        txtDa.setText(""+da);
        gross=basic+hra+da;
        txtGross.setText(""+gross);
        if(basic<=20000&&basic>30000){
            it=0;
        }
        else if(basic>=30000&&basic>=40000){
            it=(basic*5)/100;
        }
        else if(basic>=40000&&basic<=50000){
            it=(basic*20)/100;
        }
        else{
            it=(basic*30)/100;
        }
        txtIT.setText(""+it);
        net=gross-it;
        txtNet.setText(""+net);
}//GEN-LAST:event_btnShowActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmAddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmAddEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox cbDate;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JComboBox cbYear;
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
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtBasic;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDa;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEmpno;
    private javax.swing.JTextField txtEname;
    private javax.swing.JTextField txtGross;
    private javax.swing.JTextField txtHra;
    private javax.swing.JTextField txtIT;
    private javax.swing.JTextField txtNet;
    private javax.swing.JTextField txtPf;
    // End of variables declaration//GEN-END:variables

        private void insertNewRow(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String string, String myDate) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
        
    }
