/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donor;

import configuration.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Funds.DonateFundsJPanel;
import ui.Funds.DonateFundsPanel;
import ui.KitSupply.DonateDisasterKitSupplyJPanel;
import ui.KitSupply.DonateEducationKitSupplyJPanel;

/**
 *
 * @author team-11
 */
public class DonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public DonorJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDonateEduKit = new javax.swing.JButton();
        btnDonateDisasterKit = new javax.swing.JButton();
        btnDonateFunds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDonateFunds1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 215, 201));
        jLabel2.setText("Welcome Donor");

        btnDonateEduKit.setBackground(new java.awt.Color(220, 215, 201));
        btnDonateEduKit.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDonateEduKit.setText("Donate Education Kits");
        btnDonateEduKit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonateEduKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateEduKitActionPerformed(evt);
            }
        });

        btnDonateDisasterKit.setBackground(new java.awt.Color(220, 215, 201));
        btnDonateDisasterKit.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDonateDisasterKit.setText("Donate Disaster Relief Kits");
        btnDonateDisasterKit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonateDisasterKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateDisasterKitActionPerformed(evt);
            }
        });

        btnDonateFunds.setBackground(new java.awt.Color(220, 215, 201));
        btnDonateFunds.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDonateFunds.setText("Donate Funds");
        btnDonateFunds.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonateFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateFundsActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/donor_image.png"))); // NOI18N

        btnDonateFunds1.setBackground(new java.awt.Color(220, 215, 201));
        btnDonateFunds1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        btnDonateFunds1.setText("My Profile");
        btnDonateFunds1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonateFunds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateFunds1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 457, Short.MAX_VALUE)
                .addComponent(btnDonateFunds1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(463, 463, 463))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnDonateFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnDonateEduKit, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnDonateDisasterKit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDonateFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonateEduKit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonateDisasterKit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(btnDonateFunds1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1191, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateEduKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateEduKitActionPerformed
        // TODO add your handling code here:
        DonateEducationKitSupplyJPanel panel = new DonateEducationKitSupplyJPanel(ecosystem, network, enterprise, jPanel, userAccount);
        panel.setVisible(true);
    }//GEN-LAST:event_btnDonateEduKitActionPerformed

    private void btnDonateFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateFundsActionPerformed
        // TODO add your handling code here:
        DonateFundsPanel panel = new DonateFundsPanel(ecosystem, network, enterprise, jPanel, userAccount);
        panel.setVisible(true);
    }//GEN-LAST:event_btnDonateFundsActionPerformed

    private void btnDonateDisasterKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateDisasterKitActionPerformed
        // TODO add your handling code here:
        DonateDisasterKitSupplyJPanel panel = new DonateDisasterKitSupplyJPanel(ecosystem, network, enterprise, jPanel, userAccount);
        panel.setVisible(true);
    }//GEN-LAST:event_btnDonateDisasterKitActionPerformed

    private void btnDonateFunds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateFunds1ActionPerformed
        // TODO add your handling code here:
        DonorProfilePanel panel = new DonorProfilePanel(ecosystem, network, enterprise, jPanel, userAccount);
        panel.setVisible(true);
    }//GEN-LAST:event_btnDonateFunds1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonateDisasterKit;
    private javax.swing.JButton btnDonateEduKit;
    private javax.swing.JButton btnDonateFunds;
    private javax.swing.JButton btnDonateFunds1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
