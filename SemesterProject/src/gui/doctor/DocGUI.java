/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.doctor;

import DataBase.DBOperations;
import Domain.LabReport;
import Domain.MedicalReport;
import Domain.Patient;
import gui.lab.ShowLabReportGUI;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author DJ
 */
public class DocGUI extends javax.swing.JFrame {

    /**
     * Creates new form DocGUI
     */
    public DocGUI() {
        initComponents();
    }
    Patient pnt;
    DBOperations ptDB;
    int pid;
    int mode;
    ReportViewer report;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailList = new javax.swing.JList();
        backBtn = new javax.swing.JButton();
        ptDetailsBtn = new javax.swing.JButton();
        TreatReportsBtn = new javax.swing.JButton();
        labReportsBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SearchCatChooser = new javax.swing.JComboBox();
        SearchBox = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 255, 204));

        jPanel1.setBackground(new java.awt.Color(51, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Details"));

        detailList.setModel(new DefaultListModel());
        detailList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(detailList);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/doctor/previous.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        ptDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/doctor/genetics.png"))); // NOI18N
        ptDetailsBtn.setText("Patient details");
        ptDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptDetailsBtnActionPerformed(evt);
            }
        });

        TreatReportsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/doctor/patient_chart.png"))); // NOI18N
        TreatReportsBtn.setText("Treatment Reports");
        TreatReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatReportsBtnActionPerformed(evt);
            }
        });

        labReportsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/doctor/ecg_chart.png"))); // NOI18N
        labReportsBtn.setText("Lab Reports");
        labReportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labReportsBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search"));

        jLabel1.setText("Category");

        SearchCatChooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PID", "NIC", " " }));
        SearchCatChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCatChooserActionPerformed(evt);
            }
        });

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/zoom_in.png"))); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchCatChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SearchCatChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ptDetailsBtn)
                    .addComponent(TreatReportsBtn)
                    .addComponent(labReportsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(ptDetailsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(TreatReportsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(labReportsBtn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        mode = 1;
        pid = Integer.parseInt(SearchBox.getText());
        DBOperations dateOpr = DBOperations.getInstace(); 
        try {
            pnt = dateOpr.getPatient(pid);
        } catch (SQLException ex) {
            Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        int index = SearchCatChooser.getSelectedIndex();
        if(index==1){
            String nic = SearchBox.getText();
            //pnt = dateOpr.searchPatients(null,nic );
        }
        detailList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel)detailList.getModel(); 
        model.addElement(pnt.getFullName());
        model.addElement(pnt.getDateOfBirth());
        model.addElement(pnt.getGender());
        model.addElement(("Blood group : " + pnt.getBloodGroup()));
        model.addElement(("Allergies : " + pnt.getAllergies()));
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ptDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptDetailsBtnActionPerformed
        // TODO add your handling code here:
        detailList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel)detailList.getModel(); 
        model.addElement(pnt.getFullName());
        model.addElement(pnt.getDateOfBirth());
        model.addElement(pnt.getGender());
        model.addElement(("Blood group : " + pnt.getBloodGroup()));
        model.addElement(("Allergies : " + pnt.getAllergies()));
    }//GEN-LAST:event_ptDetailsBtnActionPerformed

    private void TreatReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatReportsBtnActionPerformed
        // TODO add your handling code here:
        mode = 2;
        detailList.setModel(new DefaultListModel());
         
         DefaultListModel model = (DefaultListModel)detailList.getModel(); 

         ArrayList<Date> medicalDates = null;
         ptDB = DBOperations.getInstace();
        try {
            medicalDates = ptDB.getMedicalDates(pid);
        } catch (SQLException ex) {
            Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
         for(Date dt : medicalDates){
             model.addElement(dt);
         }
         
    }//GEN-LAST:event_TreatReportsBtnActionPerformed

    private void SearchCatChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCatChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCatChooserActionPerformed

    private void labReportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labReportsBtnActionPerformed
        // TODO add your handling code here:
        mode = 3;
        detailList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel)detailList.getModel(); 
        ArrayList<Date> labDates = null;
        try {
            labDates = ptDB.getLabDates(pid);
        } catch (SQLException ex) {
            Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Date dt : labDates){
             model.addElement(dt);
         }
        
    }//GEN-LAST:event_labReportsBtnActionPerformed

    private void detailListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailListMouseClicked
        // TODO add your handling code here:
        if(mode == 2){
            Date selectedDate = (Date)detailList.getSelectedValue();
            ArrayList<MedicalReport> mediReports = null;
                try {
                    mediReports = ptDB.getMedicalReports(pid, selectedDate);
                } catch (SQLException ex) {
                    Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            detailList.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel)detailList.getModel(); 
            for(MedicalReport mdRpt : mediReports){
                 model.addElement((mdRpt.getMedicalReportNum()+" Test types : "+ mdRpt.getTestTypes()));
            }
        mode = 4;
        
        }
        
        if(mode == 3){
        Date selectedDate = (Date)detailList.getSelectedValue();
        ArrayList<LabReport> labReports = null;
            try {
                labReports = ptDB.getLabReports(pid, selectedDate);
            } catch (SQLException ex) {
                Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        detailList.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel)detailList.getModel(); 
        for(LabReport lbRpt : labReports){
             model.addElement((lbRpt.getLabReportNo()+" Test types : "+ lbRpt.getTestType()));
         }
        mode = 5;
        }
        
        if(mode == 4){
            
            String reqReportStr = detailList.getSelectedValue().toString();
            String rptNumStr =reqReportStr.substring(0, reqReportStr.indexOf(" ")); 
            int reportNum = Integer.parseInt(rptNumStr);
            MedicalReport reqReport = null;
            try {
                reqReport = ptDB.getMedicalReport(reportNum);
            } catch (SQLException ex) {
                Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            report = new ReportViewer();
            report.showReport(reportNum,reqReport.getTreatementDescription());
        }
        
        if(mode == 5){
            String reqlabReportStr = detailList.getSelectedValue().toString();
            String labrptNumStr =reqlabReportStr.substring(0, reqlabReportStr.indexOf(" ")); 
            int labreportNum = Integer.parseInt(labrptNumStr);
            LabReport reqReport = null;            
            try {
                reqReport = ptDB.getLabReport(labreportNum);
            } catch (SQLException ex) {
                Logger.getLogger(DocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            ShowLabReportGUI labReport = new ShowLabReportGUI(reqReport);
            labReport.setVisible(true);
           
        }
        
    }//GEN-LAST:event_detailListMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(mode==5){
            labReportsBtnActionPerformed(evt);
        }
        if(mode==4){
            TreatReportsBtnActionPerformed(evt);
        }
        
        if(mode==3||mode==2){
            ptDetailsBtnActionPerformed(evt);
        }
                      
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox SearchCatChooser;
    private javax.swing.JButton TreatReportsBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JList detailList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton labReportsBtn;
    private javax.swing.JButton ptDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
