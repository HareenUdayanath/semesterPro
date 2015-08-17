/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reception;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import DataBase.Help;
import Domain.Patient;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Irfad Hussain
 */
public class AddPatientFrame extends javax.swing.JFrame {

    private ReceptionGUI parent;
    
    /**
     * Creates new form AddPatientFrame
     */
    public AddPatientFrame() {
        initComponents();
    }
    
    public AddPatientFrame(ReceptionGUI parent){
        this();
        try {
            this.parent = parent;
            txtPID.setText(Integer.toString(DBOperations.getInstace().getLastPID()+1));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Sorry,an error occured while retrieving Patient ID", "Errror", JOptionPane.WARNING_MESSAGE);
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(this, "Cannot load patient ID. Connection Timed out. Please try again.", "Time out", JOptionPane.WARNING_MESSAGE);
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

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFullName1 = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtPatientContactNo = new javax.swing.JTextField();
        txtNameOfGuardian = new javax.swing.JTextField();
        txtGuardianContact = new javax.swing.JTextField();
        txtAllergies1 = new javax.swing.JTextField();
        cmbxGender = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFullName2 = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress3 = new javax.swing.JTextField();
        txtAllergies2 = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        btnCanel = new javax.swing.JButton();
        cmbxBloodGroup = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Patient");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Full Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date of Birth :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NIC :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Contact No :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Name of Guardian :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Guardian Contact No :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Blood Group :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Allergies :");

        txtPID.setEditable(false);
        txtPID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPID.setEnabled(false);

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFullName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAddress1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNIC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPatientContactNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNameOfGuardian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtGuardianContact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAllergies1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmbxGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("YYYY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("MM");

        txtMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("DD");

        txtFullName2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAddress2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAddress3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAllergies2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAddPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/user_add.png"))); // NOI18N
        btnAddPatient.setText(" Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        btnAddPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnAddPatientKeyReleased(evt);
            }
        });

        btnCanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/remove.png"))); // NOI18N
        btnCanel.setText(" Cancel");
        btnCanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanelActionPerformed(evt);
            }
        });
        btnCanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnCanelKeyReleased(evt);
            }
        });

        cmbxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFullName1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName2)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAllergies2)
                            .addComponent(txtAllergies1)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGuardianContact, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCanel)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPatient))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameOfGuardian)
                            .addComponent(txtPatientContactNo)
                            .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtAddress2)
                            .addComponent(txtAddress3))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFullName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPatientContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNameOfGuardian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGuardianContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAllergies1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAllergies2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        if (!txtPID.getText().equals("") && validateDetails()){
            try {
                Patient p = new Patient();
                p.setFirstName(txtFirstName.getText());
                p.setLastName(txtLastName.getText());
                p.setFullName(txtFullName1.getText() + " " + txtFullName2.getText());
                if (!txtYear.getText().equals("") && !txtMonth.getText().equals("") && !txtDay.getText().equals("")){
                    try{
                        p.setDateOfBirth(Help.getDate(Integer.parseInt(txtYear.getText()), Integer.parseInt(txtMonth.getText()), Integer.parseInt(txtDay.getText())));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, ex.toString(), "Invalid detail", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                p.setGender(cmbxGender.getSelectedItem().toString().substring(0, 1));
                p.setAddress(txtAddress1.getText() + " " + txtAddress2.getText() + " " + txtAddress3.getText());
                if (txtNIC.getText().equals("")){
                    p.setNIC(null);
                }else{
                    p.setNIC(txtNIC.getText());
                }
                if (!txtPatientContactNo.getText().equals("")){
                    try{
                        p.setPatientContactNo(Integer.parseInt(txtPatientContactNo.getText()));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, "Invalid Patient Contact number!", "Invalid detail", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                p.setNameOfTheGuardian(txtNameOfGuardian.getText());
                if (!txtGuardianContact.getText().equals("")){
                    try{
                        p.setGuardianContactNo(Integer.parseInt(txtGuardianContact.getText()));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(this, "Invalid guardian contact number.", "Invalid detail", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                p.setBloodGroup(cmbxBloodGroup.getSelectedItem().toString());
                p.setAllergies(txtAllergies1.getText() + " " + txtAllergies2.getText());
                DBOperations.getInstace().addPatient(p);
                JOptionPane.showMessageDialog(this, "Successfully added patient.", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnCanelActionPerformed(null);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "An error occured while adding.Please try again.", "Error", JOptionPane.WARNING_MESSAGE);
            } catch (ConnectionTimeOutException ex) {
                Logger.getLogger(AddPatientFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnCanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanelActionPerformed
        parent.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnCanelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnCanelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCanelKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnCanelActionPerformed(null);
    }//GEN-LAST:event_btnCanelKeyReleased

    private void btnAddPatientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddPatientKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnAddPatientActionPerformed(null);
    }//GEN-LAST:event_btnAddPatientKeyReleased

    private boolean validateDetails(){
        try {
            if (txtFirstName.getText().equals("")){
                JOptionPane.showMessageDialog(this, "First Name cannot be empty!", "Invalid Detail", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (txtFullName1.getText().equals("") && txtFullName2.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Full Name cannot be empty!", "Invalid Detail", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            String NIC = txtNIC.getText();
            if (!NIC.equals("") && !(NIC.length()==10 && (NIC.substring(NIC.length()-1, NIC.length()).equalsIgnoreCase("V") || NIC.substring(NIC.length()-1, NIC.length()).equalsIgnoreCase("V")))){
                JOptionPane.showMessageDialog(this, "Invalid NIC","Invalid Detail", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (DBOperations.getInstace().checkPatientNIC(NIC)){
                JOptionPane.showMessageDialog(this, "NIC already exsits","Invalid Detail", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(this, "Cannot check NIC. Connection Timed out. Please try again.", "Time out", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnCanel;
    private javax.swing.JComboBox cmbxBloodGroup;
    private javax.swing.JComboBox cmbxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtAllergies1;
    private javax.swing.JTextField txtAllergies2;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFullName1;
    private javax.swing.JTextField txtFullName2;
    private javax.swing.JTextField txtGuardianContact;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNameOfGuardian;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPatientContactNo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
