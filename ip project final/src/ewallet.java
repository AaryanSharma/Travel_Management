
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahesh
 */
public class ewallet extends javax.swing.JFrame {

    /**
     * Creates new form ewallet
     */
    public ewallet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 280, 40));

        n2.setFont(new java.awt.Font("Amatic", 1, 36)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 50, 40));

        n3.setFont(new java.awt.Font("Amatic", 1, 36)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 50, 40));

        n4.setFont(new java.awt.Font("Amatic", 1, 36)); // NOI18N
        n4.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 50, 40));

        n1.setFont(new java.awt.Font("Amatic", 1, 36)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 50, 40));
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 280, 40));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 280, 30));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 280, 30));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 280, 30));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 280, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 250, 60));

        jLabel3.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARD NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "card details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 590, 240));

        jLabel7.setFont(new java.awt.Font("Amatic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("< Home ");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 50));

        jLabel4.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CVV");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 30));

        jLabel5.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EXIPRY  DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 110, 40));

        jLabel6.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ENTER  USERNAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 160, 40));

        jLabel8.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 110, 30));

        jLabel9.setFont(new java.awt.Font("Amatic", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AMOUNT  to  be  added");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 160, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eWallet.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String name=t5.getText();
String card=t4.getText();
String cvv=t3.getText();
String exp = t2.getText();
String user=username.getText();
   String amt = amount.getText();
        n1.setText("");
n2.setText("");
n3.setText("");
n4.setText("");

int i=0;
if(name.trim().isEmpty()){i=1;
n1.setText("X");}
if(card.trim().isEmpty()){i=1;
n2.setText("X");}
if(cvv.trim().isEmpty()){i=1;
n3.setText("X");}
if(exp.trim().isEmpty()){i=1;
n4.setText("X");}
 if (i==0){
 try{
 Class.forName("java.sql.DriverManager");
        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","12345");
        Statement stmt=(Statement) con.createStatement();
        String query="UPDATE signup set wallet=' "+amt+" ' where username = '"+user+"'; ";
        stmt.executeUpdate(query);
 JOptionPane.showMessageDialog(this,"Transaction is complete");
 }
  catch (Exception e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
 }
 else{
 JOptionPane.showMessageDialog(this, "ALL FIELDS ARE COMPULSORY");
 }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ewallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ewallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ewallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ewallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ewallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
