/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DisasterRelief;

import configuration.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.Enterprise.EntType;
import model.Network.Network;
import model.Organization.DisasterReliefKitSupplyOrg;
import model.Organization.DisasterReliefOrg;
import model.Organization.EducationDonationOrg;
import model.Organization.EducationKitSupplyOrg;
import model.Organization.Organization;
import static model.Organization.Organization.orgType.DisasterReliefKitSupplyOrg;
import static model.Organization.Organization.orgType.EducationKitSupplyOrg;
import model.UserAccount.UserAccount;
import model.WorkQueue.DisasterReliefKitSupplyWorkRequest;
import model.WorkQueue.EducationKitSupplyWorkRequest;
import model.WorkQueue.FundsWorkRequest;
import model.WorkQueue.WorkRequest;
import model.WorkQueue.WorkQueue;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


/**
 *
 * @author team-11
 */
public class DisasterReliefOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisasterReliefOrgJPanel
     * 
     */
    
     private  JPanel jPanel;
    private  UserAccount userAccount;
    private Organization org;
    private  Network network;
    private  Enterprise enterprise;
    private  DisasterReliefOrg disasterReliefOrg;
    private DisasterReliefKitSupplyOrg disasterReliefKitSupplyOrg;
  
    public DisasterReliefOrgJPanel(UserAccount userAccount, Enterprise enterprise, Organization org, Network network) {
        initComponents();
        this.userAccount =userAccount;
        this.enterprise = enterprise;
        this.org =org;
        this.network = network;
        this.disasterReliefOrg = (DisasterReliefOrg) org;
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType() == Enterprise.EntType.KitSupplyEntDirectory){
                for(Organization organization : e.getOrgDirectory().getOrgList()){
                    if(organization.getOrgType()== Organization.orgType.DisasterReliefKitSupplyOrg){
                        this.disasterReliefKitSupplyOrg = (DisasterReliefKitSupplyOrg) organization;
                    }
                }
            }
        }
        
//        txtTotalKits.setText(String.valueOf(disasterReliefOrg.getTotalSupplyKits()));
//        txtTotalFunds.setText(String.valueOf(disasterReliefOrg.getTotalFunds()));
//        txtTotalKits.setText(String.valueOf(disasterReliefOrg.getTotalSupplyKits()));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFunds = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKits = new javax.swing.JTable();
        jLabelIncomingFunds = new javax.swing.JLabel();
        btnProcessKit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        btnProcess3 = new javax.swing.JButton();
        btnProcess4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(null);

        tableFunds.setBackground(new java.awt.Color(220, 215, 224));
        tableFunds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Funds", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFunds);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 220, 900, 120);

        jLabelIncomingKit.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(220, 215, 201));
        jLabelIncomingKit.setText("Kits Requests:");
        jPanel1.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(130, 500, 178, 37);

        btnProcess.setBackground(new java.awt.Color(220, 215, 201));
        btnProcess.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess);
        btnProcess.setBounds(520, 350, 110, 36);

        jScrollPane2.setBorder(null);

        tableKits.setBackground(new java.awt.Color(220, 215, 224));
        tableKits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Quantity", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableKits);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 540, 910, 130);

        jLabelIncomingFunds.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabelIncomingFunds.setForeground(new java.awt.Color(220, 215, 201));
        jLabelIncomingFunds.setText("Funds Requests:");
        jPanel1.add(jLabelIncomingFunds);
        jLabelIncomingFunds.setBounds(130, 170, 178, 37);

        btnProcessKit.setBackground(new java.awt.Color(220, 215, 201));
        btnProcessKit.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnProcessKit.setText("Process");
        btnProcessKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcessKit);
        btnProcessKit.setBounds(530, 680, 100, 36);

        jLabelTitle.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(220, 215, 201));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Disaster Relief Org Admin");
        jPanel1.add(jLabelTitle);
        jLabelTitle.setBounds(120, 20, 940, 80);

        btnProcess3.setBackground(new java.awt.Color(220, 215, 201));
        btnProcess3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnProcess3.setText("View Plot");
        btnProcess3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcess3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess3);
        btnProcess3.setBounds(860, 350, 170, 36);

        btnProcess4.setBackground(new java.awt.Color(220, 215, 201));
        btnProcess4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnProcess4.setText("View Plot");
        btnProcess4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcess4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess4);
        btnProcess4.setBounds(870, 680, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Donated")) {
                JOptionPane.showMessageDialog(null, "Please wait for Finance Team to process.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
           
            else {
                if (req instanceof FundsWorkRequest) {
                    FundsWorkRequest fundRequest = (FundsWorkRequest) tableFunds.getValueAt(selectedRow, 0);
                    double amount = fundRequest.getFunds();
                    double totalFunds = disasterReliefOrg.getTotalFunds() + amount;
                    disasterReliefOrg.setTotalFunds(totalFunds);
//                    txtTotalFunds.setText(String.valueOf(disasterReliefOrg.getTotalFunds()));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed and funds added to the organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnProcessKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessKitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {

                if (req instanceof DisasterReliefKitSupplyWorkRequest) {
                    DisasterReliefKitSupplyWorkRequest fundRequest = (DisasterReliefKitSupplyWorkRequest) tableKits.getValueAt(selectedRow, 0);

                    int quantity = (int) fundRequest.getKitCount();
                    int totalKits = disasterReliefOrg.getTotalSupplyKits()+ quantity;
                    disasterReliefOrg.setTotalSupplyKits(totalKits);
//                    txtTotalKits.setText(String.valueOf(disasterReliefOrg.addTotalSupplyKits(WIDTH)));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is processed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please wait for Kit Supply team to process.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnProcessKitActionPerformed

    private void btnProcess3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcess3ActionPerformed
        // TODO add your handling code here:
        createAndShowFundsBarChart( "Total Fund" );
        
    }//GEN-LAST:event_btnProcess3ActionPerformed

    private void btnProcess4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcess4ActionPerformed
        // TODO add your handling code here:
        createAndShowKitsBarChart( "Total Kits" );
    }//GEN-LAST:event_btnProcess4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProcess3;
    private javax.swing.JButton btnProcess4;
    private javax.swing.JButton btnProcessKit;
    private javax.swing.JLabel jLabelIncomingFunds;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableFunds;
    private javax.swing.JTable tableKits;
    // End of variables declaration//GEN-END:variables

  public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableFunds.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType()== EntType.FundsEntDirectory){
                for(Organization org : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType()== Organization.orgType.FundsOrg){
                        for (WorkRequest req : org.getWorkQueue().getWorkReqList()) {
                            if (req instanceof FundsWorkRequest) {
                                Object[] row = new Object[model.getColumnCount()];
                                row[0] = req;
                                row[1] = formatter.format(((FundsWorkRequest) req).getRequestDateTime());
                                row[2] = ((FundsWorkRequest) req).getFunds();
                                row[3] = ((FundsWorkRequest) req).getName();
                                row[4] = ((FundsWorkRequest) req).getType();
                                row[5] = ((FundsWorkRequest) req).getStatus();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
        
        DefaultTableModel model1 = (DefaultTableModel) tableKits.getModel();

        model1.setRowCount(0);

        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType() == EntType.KitSupplyEntDirectory){
                for(Organization org : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType() == Organization.orgType.DisasterReliefKitSupplyOrg){
                        for (WorkRequest workReq : org.getWorkQueue().getWorkReqList()) {

                           if (workReq instanceof DisasterReliefKitSupplyWorkRequest) {
                            Object[] row = new Object[model1.getColumnCount()];
                            row[0] = workReq;
                            row[1] = formatter.format(((DisasterReliefKitSupplyWorkRequest) workReq).getRequestDateTime());
                            row[2] = ((DisasterReliefKitSupplyWorkRequest) workReq).getKitCount();
                            row[3] = ((DisasterReliefKitSupplyWorkRequest) workReq).getName();
                            row[4] = ((DisasterReliefKitSupplyWorkRequest) workReq).getType();
                            row[5] = ((DisasterReliefKitSupplyWorkRequest) workReq).getStatus();

                            model1.addRow(row);
                        }
                    }
                    }
                }
            }
        }
        

    }

  public CategoryDataset createFundsDatasetByName() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    Map<String, Double> fundsByName = new HashMap<>();

    for (Enterprise e : network.getEnterpriseDirectory().getEntList()) {
        if (e.getEntType() == EntType.FundsEntDirectory) {
            for (Organization org : e.getOrgDirectory().getOrgList()) {
                if (org.getOrgType() == Organization.orgType.FundsOrg) {
                    for (WorkRequest req : org.getWorkQueue().getWorkReqList()) {
                        if (req instanceof FundsWorkRequest) {
                            FundsWorkRequest fundsReq = (FundsWorkRequest) req;
                            fundsByName.merge(fundsReq.getName(), fundsReq.getFunds(), Double::sum);
                        }
                    }
                }
            }
        }
    }

    // Add the aggregated data to the dataset
    for (Map.Entry<String, Double> entry : fundsByName.entrySet()) {
        dataset.addValue(entry.getValue(), "Funds", entry.getKey());
    }
//dataset.addValue( po.getTotalPrice() , po.getMarket().getMarketType() , "Total Sales" );    
    return dataset;
}
  
  public void createAndShowFundsBarChart(String title) {
    JFreeChart barChart = ChartFactory.createBarChart(
        title,
        "Names",
        "Total Funds",
        createFundsDatasetByName(),
        PlotOrientation.VERTICAL,
        true, true, false);

    ChartFrame frame = new ChartFrame("Funds by Name", barChart);
    frame.pack();
    frame.setVisible(true);
}

  public CategoryDataset createKitsDatasetByName() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
    Map<String, Integer> kitCounts = new HashMap<>();

    for (Enterprise e : network.getEnterpriseDirectory().getEntList()) {
        if (e.getEntType() == EntType.KitSupplyEntDirectory) {
            for (Organization org : e.getOrgDirectory().getOrgList()) {
                if (org.getOrgType() == Organization.orgType.DisasterReliefKitSupplyOrg) {
                    for (WorkRequest workReq : org.getWorkQueue().getWorkReqList()) {
                        if (workReq instanceof DisasterReliefKitSupplyWorkRequest) {
                            DisasterReliefKitSupplyWorkRequest kitReq = (DisasterReliefKitSupplyWorkRequest) workReq;
                            String kitName = kitReq.getName();
                            int count = (int) kitReq.getKitCount();

                            kitCounts.put(kitName, kitCounts.getOrDefault(kitName, 0) + count);
                        }
                    }
                }
            }
        }
    }

    for (Map.Entry<String, Integer> entry : kitCounts.entrySet()) {
        dataset.addValue(entry.getValue(), "Total Kits", entry.getKey());
    }

    return dataset;

}
  
  public void createAndShowKitsBarChart(String title) {
    JFreeChart barChart = ChartFactory.createBarChart(
        title,
        "Names",
        "Total Kits",
        createKitsDatasetByName(),
        PlotOrientation.VERTICAL,
        true, true, false);

    ChartFrame frame = new ChartFrame("Kits by Name", barChart);
    frame.pack();
    frame.setVisible(true);
}



}