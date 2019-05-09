package main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Sahil Ali
 */
public class main2 extends javax.swing.JFrame {
    
    Base64.Encoder encoder = Base64.getEncoder(); 
    Base64.Decoder decoder = Base64.getDecoder();
    int flag2=0;
    public main2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        algorithm = new javax.swing.JComboBox<>();
        string = new javax.swing.JTextField();
        response = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        application = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Java Encryptor");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Select Application");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Select Algorithm");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Enter String");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Response");

        algorithm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        algorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AES", "RC4", "MD5", "DESede" }));
        algorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algorithmActionPerformed(evt);
            }
        });

        string.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        response.setEnabled(false);
        response.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        response.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Encrypt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        decrypt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("Copy Response");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        application.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        final DefaultComboBoxModel appName = new DefaultComboBoxModel();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airteldb","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from app");
            if(flag2==0);
            while(rs.next())
            appName.addElement(rs.getString(2));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        application.setModel(appName);
        application.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(decrypt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(application, 0, 110, Short.MAX_VALUE)
                                    .addComponent(algorithm, 0, 110, Short.MAX_VALUE)
                                    .addComponent(string)
                                    .addComponent(response)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(application, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(algorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(string, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(response, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(decrypt)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationActionPerformed
        
    }//GEN-LAST:event_applicationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        application.setSelectedIndex(0);
        algorithm.setSelectedIndex(0);
        string.setText("");
        response.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void responseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responseActionPerformed
        
    }//GEN-LAST:event_responseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fag=0;
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airteldb","root","");  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select app_key from app where app_name = '"+application.getItemAt(application.getSelectedIndex())+"'");
            rs.next();
            String key=rs.getString(1);
            String text=string.getText();
            String algo=algorithm.getItemAt(algorithm.getSelectedIndex());
            switch(algo){
                case "AES":
                    response.setText(aes.encrypt(text,key));
                    break;
                case "RC4":
                    rc42 code2=new rc42(key);
                    response.setText(new String(code2.encrypt(text.getBytes()),"UTF-8"));
                    break;
                case "MD5":
                    response.setText(md5.getMD5EncryptedValue(text));
                    break;
                case "DESede":
                    DESede code4=new DESede(key);
                    response.setText(code4.encrypt(text));
            }
            if(fag==0){
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from log");
                int c=0;
                while(rs.next())
                    c++;
                stmt=con.createStatement();
                rs=stmt.executeQuery("select user_type from user where user_id = '"+main.name+"'");
                rs.next();
                String name1=rs.getString(1);
                Calendar calendar = Calendar.getInstance();
                java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
                String query = " insert into log (sno, app, algo, etext, pdate, puser) values (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt (1, c+1);
                preparedStmt.setString (2, application.getItemAt(application.getSelectedIndex()));
                preparedStmt.setString (3, algo);
                preparedStmt.setString (4, string.getText());
                preparedStmt.setDate(5, startDate);
                preparedStmt.setString (6,name1);
                preparedStmt.execute();
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame,"Record added to Database!","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(HeadlessException | UnsupportedEncodingException | SQLException e){ 
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrame frame = new JFrame("");
        if(response.getText().equals(""))
            JOptionPane.showMessageDialog(frame,"Nothing to copy","Empty Field",JOptionPane.WARNING_MESSAGE);
        else{
            StringSelection s = new StringSelection(response.getText());
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            c.setContents(s,null);
            JOptionPane.showMessageDialog(frame,"Text Copied","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        JFrame frame = new JFrame("");
        try{
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airteldb","root","")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select app_key from app where app_name = '"+application.getItemAt(application.getSelectedIndex())+"'");
                rs.next();
                String key=rs.getString(1);
                String text=string.getText();
                String algo=algorithm.getItemAt(algorithm.getSelectedIndex());
                switch(algo){
                    case "AES":
                        response.setText(aes.decrypt(text,key));
                        break;
                    case "RC4":
                        rc42 code2=new rc42(key);
                        response.setText((new String(code2.decrypt(text.getBytes()),"UTF-8")));
                        break;
                    case "MD5":
                        JOptionPane.showMessageDialog(frame,"MD5 Hash cannoted be decrypted","Error",JOptionPane.ERROR_MESSAGE);
                        break;
                    case "DESede":
                        DESede code4=new DESede(key);
                        response.setText(code4.decrypt(text));
                        break;
                }
            } catch (Exception ex) {
                Logger.getLogger(main2.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch(HeadlessException e){ 
        }
    }//GEN-LAST:event_decryptActionPerformed

    private void algorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algorithmActionPerformed
        switch (algorithm.getItemAt(algorithm.getSelectedIndex())) {
            case "MD5":
                application.setEnabled(false);
                decrypt.setEnabled(false);
                break;
            case "DESede":
                for(int i=0;i<application.getItemCount();i++){
                    String qw=application.getItemAt(i);
                    DESede code4=new DESede(qw);
                    if(DESede.flag==1){
                        application.removeItem(qw);
                        i=0;
                    }
                }
                application.setEnabled(true);
                break;
            default:
                application.removeAllItems();
                try{
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airteldb","root","")) {
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery("select * from app");
                        if(flag2==0);
                        while(rs.next())
                            application.addItem(rs.getString(2));
                    }
                }catch(SQLException e){
                    System.out.println(e);
                }
                decrypt.setEnabled(true);
                application.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_algorithmActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new main2().setVisible(true);
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> algorithm;
    private javax.swing.JComboBox<String> application;
    private javax.swing.JButton decrypt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField response;
    private javax.swing.JTextField string;
    // End of variables declaration//GEN-END:variables
}
