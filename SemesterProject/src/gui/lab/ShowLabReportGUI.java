/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.lab;

import DataBase.DBOperations;
import DataBase.Help;
import Domain.LabReport;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class ShowLabReportGUI extends javax.swing.JFrame {
    java.awt.event.ActionEvent evtt;
    private String testNumber;
    private String str;
    private DefaultCellEditor cellEditor;
    private DBOperations ad ; 
    private LabReport l;
    private boolean updateState;
    LabReport labreport;
    public ShowLabReportGUI(LabReport labreport) {
        this.labreport=labreport;
        this.str = "";
        ad=DBOperations.getInstace();
        initComponents();
        updateState=false;
        FBCpanel.setVisible(false);
        FBSpanel.setVisible(false);
        TCpanel.setVisible(false);
        UFRpanel.setVisible(false);
        LPpanel.setVisible(false);
        setPanel();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private int chooseTest(){
        int testType=labreport.getTestType() ;
        switch (testType) {
            case 1:
                lblTestName.setText("Fasting Blood Sugar");
                FBCpanel.setVisible(false);
                FBSpanel.setVisible(true);
                TCpanel.setVisible(false);
                UFRpanel.setVisible(false);
                LPpanel.setVisible(false);
                return testType;
            case 2:
                lblTestName.setText("Urine Full Report");
                FBCpanel.setVisible(false);
                FBSpanel.setVisible(false);
                TCpanel.setVisible(false);
                UFRpanel.setVisible(true);
                LPpanel.setVisible(false);
                return testType;
            case 3:
                lblTestName.setText("Full Blood Count");
                FBCpanel.setVisible(true);
                FBSpanel.setVisible(false);
                TCpanel.setVisible(false);
                UFRpanel.setVisible(false);
                LPpanel.setVisible(false);
                return testType;
            case 4:
                lblTestName.setText("Serum Lipid Profile");
                FBCpanel.setVisible(false);
                FBSpanel.setVisible(false);
                TCpanel.setVisible(false);
                UFRpanel.setVisible(false);
                LPpanel.setVisible(true);
                return testType;
            case 5:
                lblTestName.setText("Total Cholesterol");
                FBCpanel.setVisible(false);
                FBSpanel.setVisible(false);
                TCpanel.setVisible(true);
                UFRpanel.setVisible(false);
                LPpanel.setVisible(false);
                return testType;
        }
        return -1;
        
    }
    private void setPanel(){
        
            
            updateState=true;
            
            
            
            
           
            
            String s=String.valueOf(labreport.getTestType());
            lblTestID.setText(s);
            
            
           
            textPatientID.setText(String.valueOf(labreport.getPID()));
            jLabel12.setText(String.valueOf(labreport.getLabTechID()));
            lblDate.setText(String.valueOf(Help.getDay(labreport.getDate())));
            lblMonth.setText(String.valueOf(Help.getMonth(labreport.getDate())));
            lblYear.setText(String.valueOf(Help.getYear(labreport.getDate())));
            
            ArrayList<String> datalist=labreport.getDataList();
            System.out.println(datalist.get(0));
            int test=chooseTest();
            System.out.println("sahan");
            switch (test) {
                case 1:
                    System.out.println("test 01");
                    lblFbsAmount.setText(datalist.get(0));
                    
                    System.out.println(lblFbsAmount.getText());
                    System.out.println("after setting fbsamount");
                    break;
                case 2:
                    for(int i=0;i<datalist.size();i++){
                        UFRtable.setValueAt(datalist.get(i), i, 1);
                    }
                    System.out.println("after setting ufr");
                    break;
                case 3:
                    for(int i=0;i<datalist.size();i++){
                        FBCtable.setValueAt(datalist.get(i), i, 1);
                    }
                    System.out.println("after setting fbc");
                    break;
                case 4:
                    System.out.println("in editing lp");
                    for(int i=0;i<datalist.size();i++){
                        LPtable.setValueAt(datalist.get(i), i, 1);
                    }
                    System.out.println("after setting lp");
                    break;
                case 5:
                    lblCholesterolAmount.setText(datalist.get(0));
                    System.out.println("after setting tc");
                    break;
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

        detailPanel = new javax.swing.JPanel();
        TCpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCholesterolAmount = new javax.swing.JLabel();
        FBSpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFbsAmount = new javax.swing.JLabel();
        FBCpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FBCtable = new javax.swing.JTable();
        UFRpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UFRtable = new javax.swing.JTable();
        LPpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LPtable = new javax.swing.JTable();
        generalDetailPanel = new javax.swing.JPanel();
        patientID = new javax.swing.JLabel();
        labTechnicianID = new javax.swing.JLabel();
        testID = new javax.swing.JLabel();
        testName = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTestName = new javax.swing.JLabel();
        textPatientID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTestID = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleName = new javax.swing.JLabel();
        reportName = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        detailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Details of the test", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Cholesterol");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("mg/dl");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("( ANALYZED BY 3000 EVOLUTION SEMI AUTOMATED BIIO CHEMISTRY ANALYZER )");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Reference range : 140-239 mg/dl");

        lblCholesterolAmount.setText("jLabel13");

        javax.swing.GroupLayout TCpanelLayout = new javax.swing.GroupLayout(TCpanel);
        TCpanel.setLayout(TCpanelLayout);
        TCpanelLayout.setHorizontalGroup(
            TCpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TCpanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCholesterolAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(124, 124, 124))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TCpanelLayout.setVerticalGroup(
            TCpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TCpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TCpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lblCholesterolAmount))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Fasting Blood Sugar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("mg/dl");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reference values : 70 - 110 mg/dl");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("( ANALYZED BY 3000 EVOLUTION SEMI AUTOMATED BIO CHEMISTRY ANALYZER )");

        lblFbsAmount.setText("jLabel13");

        javax.swing.GroupLayout FBSpanelLayout = new javax.swing.GroupLayout(FBSpanel);
        FBSpanel.setLayout(FBSpanelLayout);
        FBSpanelLayout.setHorizontalGroup(
            FBSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBSpanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lblFbsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(295, 295, 295))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FBSpanelLayout.setVerticalGroup(
            FBSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBSpanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(FBSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblFbsAmount))
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        FBCpanel.setPreferredSize(new java.awt.Dimension(489, 278));

        FBCtable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FBCtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"White blood cells", null, "        K/µL", "   (4.0-11.0)"},
                {"Neutrophiles", null, "         %", "     (40-64)"},
                {"Lymphocytes", null, "         %", "     (10-40)"},
                {"Eosinophiles", null, "         %", "     (01-04)"},
                {"Monocytes", null, "         %", "     (02-05)"},
                {"Basophiles", null, "         %", "     (00-01)"},
                {"Abnormal cells", null, "         %", "     (00-00)"},
                {"Haemoglobin", null, "        g/dL", "(F 11-15)  (M 12-17.5)"},
                {"Red blood count", null, "        M/µL", "     (3.5-6)"},
                {"PCV", null, "         %", "(F 32-47)  (M 40-54)"},
                {"MCV", null, null, "    (70-96)"},
                {"MCH", null, "         pg", "    (27-32)"},
                {"MCHC", null, "        g/dL", "    (30-35)"},
                {"Platelet count", null, null, "   (150-450)"}
            },
            new String [] {
                "Descripition", "Result ", "Units", "Normal range"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FBCtable.setColumnSelectionAllowed(true);
        FBCtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FBCtableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(FBCtable);
        FBCtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout FBCpanelLayout = new javax.swing.GroupLayout(FBCpanel);
        FBCpanel.setLayout(FBCpanelLayout);
        FBCpanelLayout.setHorizontalGroup(
            FBCpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );
        FBCpanelLayout.setVerticalGroup(
            FBCpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FBCpanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        UFRtable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UFRtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"COLOUR", null},
                {"APPEARANCE", null},
                {"PH", null},
                {"S.G", null},
                {"PROTEIN", null},
                {"SUGAR", null},
                {"BILIRUBIN", null},
                {"NITIRITE", null},
                {"KEYTONE", null},
                {"UROBILINOGEN", null},
                {"PUS CELLS", null},
                {"RED CELLS", null},
                {"EPI CELLS", null},
                {"CRYSTALS ", null},
                {"CAST", null},
                {"OTHER", null}
            },
            new String [] {
                "Symptoms", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UFRtable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(UFRtable);
        UFRtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout UFRpanelLayout = new javax.swing.GroupLayout(UFRpanel);
        UFRpanel.setLayout(UFRpanelLayout);
        UFRpanelLayout.setHorizontalGroup(
            UFRpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UFRpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UFRpanelLayout.setVerticalGroup(
            UFRpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UFRpanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        LPtable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LPtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total Cholesterol", null, "               mg/dl", "               239<"},
                {"Triglyserides", null, "               mg/dl", "            (40-160)"},
                {"HDL", null, "               mg/dl ", "                >35"},
                {"LDL", null, "               mg/dl", "               <160"},
                {"VLDL", null, "               mg/dl", "                <40"},
                {"CHO/HDL", null, "               mg/dl", "            (2.0-5.0)"}
            },
            new String [] {
                "Description", "Result", "Units", "Reference"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LPtable.setColumnSelectionAllowed(true);
        LPtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LPtableKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LPtableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(LPtable);
        LPtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout LPpanelLayout = new javax.swing.GroupLayout(LPpanel);
        LPpanel.setLayout(LPpanelLayout);
        LPpanelLayout.setHorizontalGroup(
            LPpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        LPpanelLayout.setVerticalGroup(
            LPpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPpanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FBSpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 196, Short.MAX_VALUE)
                    .addComponent(FBCpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 197, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(UFRpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 205, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 186, Short.MAX_VALUE)
                    .addComponent(TCpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 186, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 152, Short.MAX_VALUE)
                    .addComponent(LPpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 153, Short.MAX_VALUE)))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addComponent(FBSpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(FBCpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(UFRpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 27, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(TCpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 66, Short.MAX_VALUE)))
            .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailPanelLayout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(LPpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE)))
        );

        generalDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "General details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        patientID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        patientID.setText("Patient ID:");

        labTechnicianID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        labTechnicianID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labTechnicianID.setText("Lab Technician ID:");

        testID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        testID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        testID.setText("Test ID :");

        testName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        testName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        testName.setText("Test Name:");

        date.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        date.setText("Date:");

        jLabel3.setText("/");

        jLabel5.setText("/");

        lblYear.setText("year");

        lblMonth.setText("jLabel12");

        lblDate.setText("jLabel12");

        lblTestName.setText("jLabel12");

        textPatientID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textPatientID.setText("jLabel12");

        jLabel12.setText("jLabel12");

        lblTestID.setText("jLabel13");

        javax.swing.GroupLayout generalDetailPanelLayout = new javax.swing.GroupLayout(generalDetailPanel);
        generalDetailPanel.setLayout(generalDetailPanelLayout);
        generalDetailPanelLayout.setHorizontalGroup(
            generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailPanelLayout.createSequentialGroup()
                .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textPatientID)
                        .addGap(241, 241, 241)
                        .addComponent(testID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTestID)
                        .addGap(175, 175, 175))
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addComponent(labTechnicianID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addComponent(testName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTestName))
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMonth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate)))
                .addGap(53, 53, 53))
        );
        generalDetailPanelLayout.setVerticalGroup(
            generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(testName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTestName))
                            .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(testID)
                                .addComponent(lblTestID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonth)
                            .addComponent(lblDate)
                            .addComponent(lblYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))
                    .addGroup(generalDetailPanelLayout.createSequentialGroup()
                        .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientID)
                            .addComponent(textPatientID))
                        .addGap(8, 8, 8)
                        .addGroup(generalDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTechnicianID)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        titlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        titleName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        titleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/login/Secound5.png"))); // NOI18N

        reportName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        reportName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportName.setText("Patient Lab Report");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(reportName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportName)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generalDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7AncestorMoved

    private void LPtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LPtableKeyReleased
        int num=evt.getKeyCode();
        //System.out.println(evt.getKeyCode()+"  keycode");
        if((96<=num && 105>=num)||num==110 || evt.isActionKey()|| num==10){
            
        }else{
            cellEditor=(DefaultCellEditor)LPtable.getCellEditor(LPtable.getSelectedRow(),LPtable.getSelectedColumn());
            ((JTextField)cellEditor.getComponent()).setText(str);
        }
    }//GEN-LAST:event_LPtableKeyReleased

    private void LPtableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LPtableKeyTyped
        
    }//GEN-LAST:event_LPtableKeyTyped

    private void FBCtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FBCtableKeyReleased
        int num=evt.getKeyCode();
        //System.out.println(evt.getKeyCode()+"  keycode");
        if((96<=num && 105>=num)||num==110 || evt.isActionKey()|| num==10){
            
        }else{
            cellEditor=(DefaultCellEditor)FBCtable.getCellEditor(FBCtable.getSelectedRow(),FBCtable.getSelectedColumn());
            ((JTextField)cellEditor.getComponent()).setText(null);
        }
    }//GEN-LAST:event_FBCtableKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    
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
            java.util.logging.Logger.getLogger(ShowLabReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowLabReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowLabReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowLabReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*ShowLabReportGUI l=new ShowLabReportGUI();
                l.setTitle("Lab Report");
                l.setVisible(true);*/
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FBCpanel;
    private javax.swing.JTable FBCtable;
    private javax.swing.JPanel FBSpanel;
    private javax.swing.JPanel LPpanel;
    private javax.swing.JTable LPtable;
    private javax.swing.JPanel TCpanel;
    private javax.swing.JPanel UFRpanel;
    private javax.swing.JTable UFRtable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel date;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JPanel generalDetailPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labTechnicianID;
    private javax.swing.JLabel lblCholesterolAmount;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFbsAmount;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblTestID;
    private javax.swing.JLabel lblTestName;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel patientID;
    private javax.swing.JLabel reportName;
    private javax.swing.JLabel testID;
    private javax.swing.JLabel testName;
    private javax.swing.JLabel textPatientID;
    private javax.swing.JLabel titleName;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}