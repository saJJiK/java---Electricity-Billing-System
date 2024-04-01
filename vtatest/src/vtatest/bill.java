
package vtatest;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajjitha Walallawita
 */
public class bill extends javax.swing.JFrame {

    
    public bill() {
        initComponents();
    }
     dbconnector dbc = new dbconnector();
    com.mysql.jdbc.Connection con = dbc.databaseConnection();

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtfmr = new javax.swing.JTextField();
        txtunit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        txtname1 = new javax.swing.JTextField();
        txtlmr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnfinal = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        getContentPane().add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 60, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Electricity Billing System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, 30));

        jLabel2.setText("Customer Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 20));

        jLabel3.setText("Custemor Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 20));

        jLabel4.setText("Unit");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 20));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));
        getContentPane().add(txtfmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, -1));
        getContentPane().add(txtunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, -1));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 150));

        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));
        getContentPane().add(txtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, -1));
        getContentPane().add(txtlmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));

        jLabel5.setText("L.M.R");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("F.M.R");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btnfinal.setText("final");
        btnfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, -1));

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jButton4.setText("exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 String cid;
        double charge,gramount ;
        int count;
        
 public void print(){
 String cid = txtid.getText();
 String cname = txtname1.getText();
 String unit = txtunit.getText();
 
 TextArea.setText(TextArea.getText() + "\n");
 TextArea.setText(TextArea.getText() + "Electresity Billing System" + "\n");
 TextArea.setText(TextArea.getText() + "\n");
 TextArea.setText(TextArea.getText() + "Customer Id : " + cid +  "\n");
  TextArea.setText(TextArea.getText() + "Customer Name : " + cname +  "\n");
   TextArea.setText(TextArea.getText() + "Unit : " + unit +  "\n");
    TextArea.setText(TextArea.getText() + "Amount : " + gramount +  "\n");
     TextArea.setText(TextArea.getText() + "THANK YOU COME AGEIN");
 }       
        
        
        
    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
       
        cid = txtid.getText();
        count = Integer.parseInt(txtunit.getText());
        
          int units;
        double cost = 0;
        units = Integer.parseInt(txtunit.getText());

        if (units <= 30) {
            cost += units * 10;
        } else {
            cost += 30 * 10;
            units -= 30;
            if (units > 30) {
                cost += 30 * 20;
                units -= 30;
                if (units > 30) {
                    cost += 30 * 30;
                    units -= 30;
                    if (units > 0) {
                        cost += units * 50;
                    }
                } else {
                    cost += units * 30;
                }
            } else {
                cost += units * 20;
            }
        }

        gramount = cost;
       
    print();
    
    
    
    }//GEN-LAST:event_btnokActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            TextArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
                String query = "INSERT into bill VALUE (?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, txtname1.getText());
                pst.setString(2, txtunit.getText());
                pst.setDouble(3, gramount);
                

                pst.execute();

                JOptionPane.showMessageDialog(bill.this, "successful");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(bill.this, e);

            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalActionPerformed
       
         int lmr = Integer.parseInt(txtlmr.getText());
    int fmr = Integer.parseInt(txtfmr.getText());
        
    int result = lmr - fmr;
    txtunit.setText(String.valueOf(result));
    
        
    }//GEN-LAST:event_btnfinalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtid.setText("");
        txtname1.setText("");
        txtunit.setText("");
        txtfmr.setText("");
        txtlmr.setText("");
        TextArea.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btnfinal;
    private javax.swing.JButton btnok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfmr;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlmr;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtunit;
    // End of variables declaration//GEN-END:variables
}
