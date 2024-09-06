/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Education;

import configuration.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Organization.Organization;
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequest;
import model.WorkQueue.EducationKitSupplyWorkRequest;
import javax.swing.JOptionPane;


/**
 *
 * @author team-11
 */
public class EducationKitSupplyManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EducationKitSupplyManagerJPanel
     */
        private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    private static Organization organization;

    public EducationKitSupplyManagerJPanel(EcoSystem ecosystem, Network network, Organization organization,Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
         this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.organization=organization;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitSupplyManagertable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 54, 57));
        setForeground(new java.awt.Color(220, 215, 201));
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 215, 201));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Education Kit Supply Manager ");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 215, 201));
        jLabel2.setText("Kits Requests: ");

        kitSupplyManagertable.setBackground(new java.awt.Color(220, 215, 224));
        kitSupplyManagertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request", "Date", "Quantity", "Donar Name", "Source", "Status"
            }
        ));
        jScrollPane1.setViewportView(kitSupplyManagertable);

        jButton2.setBackground(new java.awt.Color(220, 215, 201));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jButton2.setText("Process");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(220, 215, 201));
        btnReject.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnReject.setText("Reject");
        btnReject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = kitSupplyManagertable.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) kitSupplyManagertable.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to the Donation organization.");
                return;
            }
            else {
                if (req instanceof EducationKitSupplyWorkRequest) {
                    EducationKitSupplyWorkRequest fr = (EducationKitSupplyWorkRequest) kitSupplyManagertable.getValueAt(selectedRow, 0);
                }
                req.setReceiver(userAccount);
                req.setStatus("Processed to Donation Organization");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is processed to the Donation organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to accept.");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = kitSupplyManagertable.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) kitSupplyManagertable.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to Donation Organization");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else {
                request.setReceiver(userAccount);
                request.setStatus("Rejected");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is rejected");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to reject.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kitSupplyManagertable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel) kitSupplyManagertable.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        if (organization.getWorkQueue() == null) {
            organization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest wr : organization.getWorkQueue().getWorkReqList()) {

            if (wr instanceof  EducationKitSupplyWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = wr;
                row[1] = formatter.format(((EducationKitSupplyWorkRequest) wr).getRequestDateTime());
                row[2] = ((EducationKitSupplyWorkRequest) wr).getKitCount();
                row[3] = ((EducationKitSupplyWorkRequest) wr).getName();
                row[4] = ((EducationKitSupplyWorkRequest) wr).getType();
                row[5] = ((EducationKitSupplyWorkRequest) wr).getStatus();

                model.addRow(row);
            }
        }
    }
}
