    import java.sql.*;
    import javax.swing.JOptionPane;
    import java.util.Random;
    import javax.swing.ImageIcon;
    
    
    
public class frmSignup extends javax.swing.JFrame {

    Statement stat=null;
    ResultSet uprs=null;
    String  Squestion,choice;
    String sql,name,l,UID,Pass,Repass,yq,ans,Que;
    int[] dig = new int[2];
    char[] chr = new char[5];
    frmLogin frmlogin;
    
    
    public frmSignup() {
        initComponents();
        txtUrQuestion.setEnabled(false);
        lblCaptcha.setText(captcha());
        stat=MyConnection.getConnection();
        System.out.println("LoginDetail dialog connected...");
        
        
    }

    public String getMyDate()
            {
                String year=(String)cbYear.getSelectedItem();
                int month=cbMonth.getSelectedIndex();
                String Date=(String)cbDate.getSelectedItem();
                return(year.trim()+"-"+month+"-"+Date);
            }
            
            public String getGender()
            {
            String sex = (String)cbGender.getSelectedItem();
            return(sex);
            }
            
            public String sQuestion()
            {
            String Que = (String)cbSecQuestio.getSelectedItem();
            return(Que);
            }
            
            private String captcha()
    {
        Random RandGen=new Random();
        dig=new int[3];
        chr=new char[5];
        
            for(int i=0;i<2;i++)
            dig[i]=RandGen.nextInt(10);
        
            for(int i=0;i<5;i++)
            chr[i]=(char)(RandGen.nextInt(90-65+1)+65);    
          
         return(""+dig[0] + chr[0] + chr[1] + dig[1] + chr[3] + chr[4]);
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

        bgpnl = new javax.swing.JPanel();
        fgpnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        PassStrength = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbSecQuestio = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtUrQuestion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        cbDate = new javax.swing.JComboBox();
        txtCreate = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        pfRePass = new javax.swing.JPasswordField();
        lblCaptcha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCaptcha = new javax.swing.JTextField();
        lblimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgpnl.setMinimumSize(new java.awt.Dimension(537, 750));
        bgpnl.setLayout(new java.awt.GridBagLayout());

        fgpnl.setOpaque(false);
        fgpnl.setPreferredSize(new java.awt.Dimension(537, 750));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("          Sign Up");

        jLabel2.setText(" First Name ");

        jLabel3.setText(" Last Name");

        jLabel4.setText(" User ID");

        jLabel5.setText(" Password");

        pfPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pfPassCaretUpdate(evt);
            }
        });
        pfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPassActionPerformed(evt);
            }
        });

        PassStrength.setForeground(new java.awt.Color(255, 153, 0));
        PassStrength.setMaximum(15);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel14.setText("Password Strength:");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel16.setText("Minimum 6 Characters:");

        jLabel6.setText("<html>  Retype<br>Password</html>");

        jLabel7.setText("Gender");

        cbGender.setBackground(new java.awt.Color(255, 204, 102));
        cbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Male", "Female" }));

        jLabel8.setText("<html>Security <br> Question");

        cbSecQuestio.setBackground(new java.awt.Color(255, 204, 102));
        cbSecQuestio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Your Own Question", "What is Your nick Name ?", "What is your First pet's Name ?", "What is your Birth place ?", "What is the name of your first teacher ?", "What is your first phone no. ?", "what is your pet name ?", "Write Your Own Question ?", " " }));
        cbSecQuestio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSecQuestioActionPerformed(evt);
            }
        });

        jLabel9.setText("<html> Your <br>Question</html> ");

        txtUrQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrQuestionActionPerformed(evt);
            }
        });

        jLabel10.setText("Answer");

        jLabel15.setText("<html>Date  of<br>Joining</html> ");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004 ", "2003 ", "2002 ", "2001", "2000", "1999 ", "1998 ", "1997 ", "1996", "1995 ", "1994 ", "1993", "1992 ", "1991" }));

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "Feb", "March", "April", "May", "June", "July", "August", "Septemper", "Octuber", "November", "december" }));

        cbDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCreate.setText("Create");
        txtCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateActionPerformed(evt);
            }
        });

        lblCaptcha.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCaptcha.setForeground(new java.awt.Color(255, 255, 255));
        lblCaptcha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setText("Please Enter Above Code Here :-");

        javax.swing.GroupLayout fgpnlLayout = new javax.swing.GroupLayout(fgpnl);
        fgpnl.setLayout(fgpnlLayout);
        fgpnlLayout.setHorizontalGroup(
            fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgpnlLayout.createSequentialGroup()
                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fgpnlLayout.createSequentialGroup()
                                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fgpnlLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(fgpnlLayout.createSequentialGroup()
                                                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(pfPass)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(PassStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                            .addComponent(cbGender, 0, 420, Short.MAX_VALUE)
                                            .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(pfRePass, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtUid, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtLname, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                                            .addComponent(txtAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                            .addComponent(txtUrQuestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fgpnlLayout.createSequentialGroup()
                                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71))
                                            .addComponent(txtCaptcha, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
                                    .addGroup(fgpnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSecQuestio, 0, 420, Short.MAX_VALUE)))))
                        .addGap(77, 77, 77))
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(txtCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fgpnlLayout.setVerticalGroup(
            fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fgpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fgpnlLayout.createSequentialGroup()
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PassStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fgpnlLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(pfRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fgpnlLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSecQuestio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUrQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fgpnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fgpnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fgpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(lblCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgpnl.add(fgpnl, gridBagConstraints);

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcd.jpg"))); // NOI18N
        lblimg.setMaximumSize(new java.awt.Dimension(600, 750));
        lblimg.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        bgpnl.add(lblimg, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 644, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(564, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pfPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pfPassCaretUpdate

        String pwd=pfPass.getText();
        int pwdi=pwd.length();
        PassStrength.setValue(pwdi);
        if(pwdi==0)
        {
            lblPass.setText("");
        }
        if(pwdi==4)
        {
            lblPass.setText("Too Short");
        }
        if(pwdi==8)
        {
            lblPass.setText("Standard");
        }
        if(pwdi==10)
        {
            lblPass.setText("Fair");
        }
        if(pwdi==15)
        {
            lblPass.setText("Strong ");
        }
        }

        private void cbSecQuestionActionPerformed(java.awt.event.ActionEvent evt)
        {
            choice=(String)cbSecQuestio.getSelectedItem();
            if(choice.equals("Write Your Own Question ?"))
            {
               txtUrQuestion.setEnabled(true);
                System.out.println("Question textfield enabled...");
            }
            else
            {
                txtUrQuestion.setEnabled(false);
                System.out.println("Question textfield disabled...");
                Squestion=(String)cbSecQuestio.getSelectedItem();
            }

    }//GEN-LAST:event_pfPassCaretUpdate

    private void cbSecQuestioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSecQuestioActionPerformed

        choice=(String)cbSecQuestio.getSelectedItem();
        if(choice.equals("Write Your Own Question ?"))
        {
            txtUrQuestion.setEnabled(true);
            System.out.println("Question textfield enabled...");
        }
        else
        {
            txtUrQuestion.setEnabled(false);
            System.out.println("Question textfield disabled...");
            Squestion=(String)cbSecQuestio.getSelectedItem();
        }
    }//GEN-LAST:event_cbSecQuestioActionPerformed

    private void txtCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateActionPerformed
        String  captcha1,captcha2 ;
        captcha1= new String(lblCaptcha.getText());
        captcha2 = new String(txtCaptcha.getText());

        String pwd1,pwd2;
        pwd1=new String(pfPass.getPassword());
        pwd2=new String(pfRePass.getPassword());

        if(pwd1.equals(pwd2) && captcha1.equals(captcha2))
        {
            try
            {

                sql="insert into login values('"+ txtFname.getText()+"','"+ txtLname.getText()+"','"+ txtUid.getText()+"','"+ pfPass.getText()+"','"+pfRePass.getText()+"','"+getGender()+"','"+sQuestion()+"','"+txtUrQuestion.getText()+"','"+txtAnswer.getText()+"','"+getMyDate()+"');";
                stat.executeUpdate(sql);
                {
                    JOptionPane.showMessageDialog(this,"User registered...","Success",1);
                    dispose();
                    frmlogin = new frmLogin();
                    frmlogin.pack();
                    frmlogin.setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage()+"\n","Error",0);

            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Password OR the Veification code  doesn't match, Try Again!!!","Error",0);
            pfPass.setText("");
            pfRePass.setText("");
            txtCaptcha.setText("");
            pfPass.requestFocus();
        }

    }//GEN-LAST:event_txtCreateActionPerformed

    private void txtUrQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrQuestionActionPerformed

    private void pfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPassActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
            stat=MyConnection.getConnection();
            System.out.println("LoginDetail dialog connected...");
    }                                 

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
            exiting();
    }                                  

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
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PassStrength;
    private javax.swing.JPanel bgpnl;
    private javax.swing.JComboBox cbDate;
    private javax.swing.JComboBox cbGender;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbSecQuestio;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JPanel fgpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCaptcha;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblimg;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPasswordField pfRePass;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtCaptcha;
    private javax.swing.JButton txtCreate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtUid;
    private javax.swing.JTextField txtUrQuestion;
    // End of variables declaration//GEN-END:variables
}
