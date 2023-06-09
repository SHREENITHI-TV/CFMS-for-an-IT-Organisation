/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package customerfeedbackmanagementsystem;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 *
 * @author shree
 */
public class IT_review extends javax.swing.JFrame {

    /**
     * Creates new form IT_review
     */
    public IT_review() {
        initComponents();
        DisplayReviews();
    }

    private void DisplayReviews() {
        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database");
                String q = "SELECT * FROM it_organization_reviews";
                PreparedStatement pstmt = conn1.prepareStatement(q);
                ResultSet rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Company Reviews");
        setPreferredSize(new java.awt.Dimension(1500, 770));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\27review.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 30, 577, 97);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\26discuss.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1310, 0, 170, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\25charts.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1070, 0, 260, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\24review-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1280, 480, 250, 240);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\28quote.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1240, 170, 260, 320);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Enter which company's reviews you want to see:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 160, 460, 30);

        jTextField1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(610, 160, 250, 40);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Company Name", "Revies", "Title 4"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setRowMargin(2);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 1180, 350);

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.setToolTipText("For better result click on show all companies to get the company name");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(880, 160, 140, 40);

        jButton2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton2.setText("Go Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 20, 160, 40);

        jButton3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton3.setText("Show all companies");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 640, 220, 40);

        jButton6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton6.setText("Show all reviews");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(750, 640, 230, 40);

        jButton4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton4.setText("Home Page");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 80, 200, 40);

        jButton5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton5.setText("Delete  Review");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 640, 160, 40);

        jButton7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton7.setText("Show deleted reviews");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(480, 640, 230, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\30spl.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-110, -210, 2630, 1170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        DisplayReviews();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new IT_details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database");
                String q = "SELECT id, company_name from it_organizations;";
                PreparedStatement pstmt = conn1.prepareStatement(q);
                ResultSet rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cname = jTextField1.getText();
        if (cname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide the company name to search.");
        } else {
            Connection conn1 = null;

            try {
                // connect way #1
                String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
                String user = "root";
                String password = "";

                conn1 = DriverManager.getConnection(url1, user, password);
                if (conn1 != null) {
                    System.out.println("Connected to the database");
                    Statement stmt = conn1.createStatement();   //Creating Statement.
                    String q1 = "SELECT Reviewer_Name, Review_Date, Review_Rating, Review_Comment FROM IT_Organization_Reviews WHERE Company_Name = '" + cname + "'";
                    ResultSet rs = stmt.executeQuery(q1);
                    if (rs.next()) {
                        PreparedStatement pstmt = conn1.prepareStatement(q1);
                        rs = pstmt.executeQuery();
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    } else {
                        JOptionPane.showMessageDialog(this, "No such Company found!");
                        
                    }
                }
            } catch (SQLException ex) {
                System.out.println("An error occurred. Maybe user/password is invalid");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        jTextField1.setText("");
        String rname = JOptionPane.showInputDialog(this, "Enter the Reviewer Name you want to delete:");
        if (rname == null || rname.isEmpty()) {
            // The user either cancelled the dialog or did not enter anything
            JOptionPane.showMessageDialog(null, "Please provide the reviewer name to proceed .");
        } else {
            // The user entered a valid input

            String cname = JOptionPane.showInputDialog(this, "Enter the Company Name associated with that review:");
            Connection conn1;
            try {
                // connect way #1
                String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
                String user = "root";
                String password = "";

                conn1 = DriverManager.getConnection(url1, user, password);
                if (conn1 != null) {
                    System.out.println("Connected to the database");
                    Statement stmt = conn1.createStatement();   //Creating Statement.
                    String q1 = "SELECT Company_Name,Reviewer_Name FROM IT_Organization_reviews WHERE Company_Name = '" + cname + "' and Reviewer_Name ='" + rname + "';";
                    ResultSet rs = stmt.executeQuery(q1);
                    if (rs.next()) {
                        String q2 = "DELETE FROM IT_Organization_reviews WHERE Company_Name = '" + cname + "';";
                        stmt.executeUpdate(q2);
                        String rsn = JOptionPane.showInputDialog(this, "Reason to delete the review:");
                        LocalDate currentDate = LocalDate.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String date = currentDate.format(formatter);
                        String q3 = "INSERT INTO Deleted_Reviews (Company_Name, Reviewer_Name, Reason_To_Delete, Deletion_Date) VALUES ('" + cname + "','" + rname + "','" + rsn + "','" + date + "');";
                        stmt.executeUpdate(q3);
                        JOptionPane.showMessageDialog(this, "Review Deleted Successfully!\nUploaded in Deleted Review Table ");
                    } else {
                        JOptionPane.showMessageDialog(this, "No such Company or Reviewer found !");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred.\n Maybe user/password is invalid.\n" + ex);
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database");
                String q = "SELECT * FROM `deleted_reviews`";
                PreparedStatement pstmt = conn1.prepareStatement(q);
                ResultSet rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(IT_review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IT_review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IT_review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IT_review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IT_review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
