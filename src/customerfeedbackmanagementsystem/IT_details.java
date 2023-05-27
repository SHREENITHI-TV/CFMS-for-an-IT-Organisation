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

import javax.swing.JOptionPane;

/**
 *
 * @author shree
 */
public class IT_details extends javax.swing.JFrame {

    /**
     * Creates new form IT_details
     */
    public IT_details() {
        initComponents();
        DisplayTable();
    }

    private void DisplayTable() {
        Connection conn1 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/customer_feedback";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database");
                String q = "select * from it_Organizations";
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Company Details");
        setPreferredSize(new java.awt.Dimension(1500, 770));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\22company.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 0, 340, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\22company.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1050, 0, 340, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\23details.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 50, 630, 85);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Company_Name", "Headquarters", "Year_Founded", "Industry", "Services_Products", "No_Employees", "Revenue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(40);
        jTable1.setRowMargin(2);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 172, 1450, 440);

        jButton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton1.setText("Add Company");
        jButton1.setToolTipText("Please click refresh table to see the updates");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 630, 230, 27);

        jButton2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton2.setText("Edit Company Details");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 680, 240, 27);

        jButton3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton3.setText("Delete Company Information");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 630, 280, 27);

        jButton4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton4.setText("Home Page");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1220, 630, 230, 27);

        jButton5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton5.setText("Go Back");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1080, 680, 230, 27);

        jButton6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton6.setText("View Company Reviews");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(930, 630, 230, 27);

        jButton7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton7.setText("Refresh Table");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(650, 630, 230, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shree\\Pictures\\CFMS pics\\2whitebg.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1560, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new addCompany().setVisible(true);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DisplayTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new IT_review().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cname = JOptionPane.showInputDialog(this, "Enter the Name of the Company you want to delete:");
        if (cname == null || cname.isEmpty()) {
            // The user either cancelled the dialog or did not enter anything
            JOptionPane.showMessageDialog(null, "Deletion process was terminated due to inavalid input!.");
        } else {
            // The user entered a valid input

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
                    String q1 = "SELECT Company_Name FROM IT_Organizations WHERE Company_Name = '" + cname + "'";
                    ResultSet rs = stmt.executeQuery(q1);
                    if (rs.next()) {
                        String q2 = "DELETE FROM IT_Organizations WHERE Company_Name = '" + cname + "';";
                        stmt.executeUpdate(q2);
                        JOptionPane.showMessageDialog(this, "Company Information Deleted Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No such Company found!");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred.\n Maybe user/password is invalid.\n" + ex);
            }

            DisplayTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cname = JOptionPane.showInputDialog(this, "Enter the Name of the Company you want to modify:");
        if (cname == null || cname.isEmpty()) {
            // The user either cancelled the dialog or did not enter anything
            JOptionPane.showMessageDialog(null, "Modification process was terminated due to inavalid input!.");
        } else {
            // The user entered a valid input
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
                    String q1 = "SELECT Company_Name FROM IT_Organizations WHERE Company_Name = '" + cname + "'";
                    ResultSet rs = stmt.executeQuery(q1);
                    if (rs.next()) {
                        String col_name = JOptionPane.showInputDialog(this, "Enter the field name you want to edit:");
                        String data = JOptionPane.showInputDialog(this, "Enter the data to be updated");
                        String q2 = "UPDATE IT_Organizations SET " + col_name + " = '" + data + "' WHERE company_name = '" + cname + "'";
                        stmt.executeUpdate(q2);
                        JOptionPane.showMessageDialog(this, "Company Information modified Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No such Company found!");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred.\n Maybe user/password is invalid.\n" + ex);
            }

            DisplayTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(IT_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IT_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IT_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IT_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IT_details().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
