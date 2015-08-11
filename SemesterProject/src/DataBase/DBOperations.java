package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Domain.*;
import java.sql.Date;


public class DBOperations {
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet use = null;
    private EmployeeFactory emfac = null;
    private static DBOperations instance = null;
    //private String url = "jdbc:odbc://192.168.173.1:3306/test2";    
    //private String url = "jdbc:mysql://192.168.173.1:3306/SemesterProject";
    private String url = "jdbc:mysql://localhost:3306/SemesterProject";
    private String user = "hosdataadmin";
    private String password = "coperativehos7456391";
    
    private DBOperations(){
        this.emfac = new EmployeeFactory();
    }
    
    /*
     * Add singleton................................................................
     */
    public static DBOperations getInstace(){
        if(instance==null){
            synchronized(DBOperations.class){
                if(instance==null){
                    instance = new DBOperations();
                }
            }
        }     
        return instance;
    }
    
    /*
     * Add Data......................................................................
     */
    public boolean addPatient(Patient patient) throws SQLException{
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            con = DriverManager.getConnection(url, user, password);             
            pst = con.prepareStatement("INSERT INTO PatientFile VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");               

            pst.setInt(1,patient.getPID());
            pst.setString(2,patient.getFirstName());
            pst.setString(3,patient.getFullName());
            pst.setString(4,patient.getLastName());            
            pst.setDate(5,patient.getDateOfBirth());
            pst.setString(6, patient.getGender());
            pst.setString(7, patient.getAddress());
            pst.setString(8, patient.getNIC());
            pst.setInt(9, patient.getPatientContactNo());
            pst.setString(10, patient.getNameOfTheGuardian());
            pst.setInt(11, patient.getGuardianContactNo());
            pst.setString(12, patient.getBloodGroup());
            pst.setString(13, patient.getAllergies());
            
            pst.executeUpdate();
            con.close();
            
            result = true;
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
        return result;
    }
    public boolean addMedicalReport(MedicalReport medicalReport) throws SQLException{
        boolean result = false; 
        // For insert to medical report there should be a PID which has same PID in medical report
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO MedicalReport VALUES(?,?,?,?,?,?)");               
             
            pst.setInt(1,medicalReport.getPID());
            pst.setDate(2, medicalReport.getDate());
            pst.setInt(3, medicalReport.getDoctorID());
            pst.setInt(4,medicalReport.getMedicalReportNum());
            pst.setString(5, medicalReport.getTestTypes());
            pst.setString(6, medicalReport.getTreatementDescription());            
           
            pst.executeUpdate();
            con.close();
            
            result = true;
           
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    public boolean addLabReport(LabReport labReport) throws SQLException {
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO LabReport VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
            int index;

            pst.setInt(1,labReport.getPID());
            pst.setDate(2, labReport.getDate());
            pst.setInt(3, labReport.getLabReportNo());
            pst.setInt(4,labReport.getTestType());
            pst.setInt(5, labReport.getLabTechID());
            index = 6;
            for(String data:labReport.getDataList()){
                pst.setString(index++, data);
            }
            for(int i = 0;(i+index)<22;i++){               
                pst.setString(index+i, null);
            }           
            pst.executeUpdate();
            con.close();

            result = true;
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    public boolean addEmployee(Employee employee){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            //pst = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?,MD5(?))");  
            pst = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?,?)");  

            pst.setInt(1,employee.getEID());            
            pst.setString(2, employee.getPosition());
            pst.setString(3,employee.getName());
            pst.setString(4, employee.getNIC());
            pst.setString(5, employee.getUsername());
            pst.setString(6, employee.getPassword());           
            pst.executeUpdate();
            con.close();

            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    public boolean addChronicConditionsReport(ChronicConditionsReport chronicConditionsReport){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO ChronicConditions VALUES(?,?,?,?,?,?,?,?)");     

            pst.setInt(1,chronicConditionsReport.getPID());            
            pst.setString(2, chronicConditionsReport.getChronicConditionsCol());
            pst.setBoolean(3,chronicConditionsReport.isHeartDisease());
            pst.setBoolean(4, chronicConditionsReport.isStroke());
            pst.setBoolean(5, chronicConditionsReport.isCancer());
            pst.setBoolean(6, chronicConditionsReport.isDiabetes()); 
            pst.setBoolean(7, chronicConditionsReport.isObesity()); 
            pst.setBoolean(8, chronicConditionsReport.isArthritis()); 
            pst.executeUpdate();
            con.close();

            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    /*
     * Update data............................................................................. 
     */
    public boolean updatePatient(Patient patient){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            con = DriverManager.getConnection(url, user, password);             
            pst = con.prepareStatement("UPDATE PatientFile SET FirstName = ?,FullName = ?,LastName = ?,DateOfBirth = ?,Gender = ?,"
                    + "Address = ?,NIC = ?,PatientContactNo = ?,NameOfTheGuardian = ?,GuardianContactNo = ?,BloodGroup = ?,Allergies = ?"
                    + " WHERE PID = ?");               

            pst.setInt(13,patient.getPID());
            pst.setString(1,patient.getFirstName());
            pst.setString(2,patient.getFullName());
            pst.setString(3,patient.getLastName());            
            pst.setDate(4,patient.getDateOfBirth());
            pst.setString(5, patient.getGender());
            pst.setString(6, patient.getAddress());
            pst.setString(7, patient.getNIC());
            pst.setInt(8, patient.getPatientContactNo());
            pst.setString(9, patient.getNameOfTheGuardian());
            pst.setInt(10, patient.getGuardianContactNo());
            pst.setString(11, patient.getBloodGroup());
            pst.setString(12, patient.getAllergies());
            
            pst.executeUpdate();
            con.close();
            
            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
        return result;
    }
    
    public boolean updateMedicalReport(MedicalReport medicalReport){
        boolean result = false; 
        
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("Update MedicalReport SET PID = ?,Date = ?,DoctorID = ?,TestTypes = ?, TreatementDescription = ? WHERE MedicalReportNum = ?");               
             
            pst.setInt(1,medicalReport.getPID());
            pst.setDate(2, medicalReport.getDate());
            pst.setInt(3, medicalReport.getDoctorID());
            pst.setInt(6,medicalReport.getMedicalReportNum());
            pst.setString(4, medicalReport.getTestTypes());
            pst.setString(5, medicalReport.getTreatementDescription());            
           
            pst.executeUpdate();
            con.close();
            
            result = true;
           
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    
    public boolean updateLabReport(LabReport labReport){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("UPDATE LabReport SET PID = ?,Date = ?,TestType = ?,LabTechID = ?,"
                    + "Data1 = ?,Data2 = ?,Data3 = ?,Data4 = ?,Data5 = ?,Data6 = ?,Data7 = ?,Data8 = ?,Data9 = ?,Data10 = ?,"
                    + "Data11 = ?,Data12 = ?,Data13 = ?,Data14 = ?,Data15 = ?,Data16 = ? WHERE LabReportNo = ?");  
            int index;

            pst.setInt(1,labReport.getPID());
            pst.setDate(2, labReport.getDate());
            pst.setInt(21, labReport.getLabReportNo());
            pst.setInt(3,labReport.getTestType());
            pst.setInt(4, labReport.getLabTechID());
            index = 5;
            for(String data:labReport.getDataList()){
                pst.setString(index++, data);
            }
            for(int i = 0;(i+index)<21;i++){               
                pst.setString(index+i, null);
            }           
            pst.executeUpdate();
            con.close();

            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    
    public boolean updateEmployee(Employee employee){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("UPDATE Employee SET EID = ?,Name = ?,NIC = ?");              

            pst.setInt(1,employee.getEID());          
            pst.setString(3,employee.getName());
            pst.setString(4, employee.getNIC());
             
            pst.executeUpdate();
            con.close();

            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    
    
    /*
     * Load Data.................................................
     */
    
    public  ArrayList<Patient> loadPatients(){
        ArrayList<Patient> patientList = new ArrayList<>();
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM PatientFile");              
            use = pst.executeQuery();                
                           
            while(use.next()){                   
                Patient patient = new Patient();
               
                patient.setPID(use.getInt(1));
                patient.setFirstName(use.getString(2));
                patient.setFullName(use.getString(3));
                patient.setLastName(use.getString(4));
                patient.setDateOfBirth(use.getDate(5));
                patient.setGender(use.getString(6));
                patient.setAddress(use.getString(7));
                patient.setNIC(use.getString(8));
                patient.setPatientContactNo(use.getInt(9));
                patient.setNameOfTheGuardian(use.getString(10));
                patient.setGuardianContactNo(use.getInt(11));
                patient.setBloodGroup(use.getString(12));
                patient.setAllergies(use.getString(13));              
                patientList.add(patient);
            }       
            
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return patientList;
    }
   
    public Patient getPatient(int PID){
        Patient patient = null;
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM PatientFile WHERE PID = ?");
            pst.setInt(1,PID);
            use = pst.executeQuery();                
                           
            if(use.next()){                   
                patient = new Patient();
               
                patient.setPID(use.getInt(1));
                patient.setFirstName(use.getString(2));
                patient.setFullName(use.getString(3));
                patient.setLastName(use.getString(4));
                patient.setDateOfBirth(use.getDate(5));
                patient.setGender(use.getString(6));
                patient.setAddress(use.getString(7));
                patient.setNIC(use.getString(8));
                patient.setPatientContactNo(use.getInt(9));
                patient.setNameOfTheGuardian(use.getString(10));
                patient.setGuardianContactNo(use.getInt(11));
                patient.setBloodGroup(use.getString(12));
                patient.setAllergies(use.getString(13));              
                
            }       
            
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return patient;
    }
    
    public ArrayList<Doctor> loadDoctors(){
        ArrayList<Doctor> doctorList = new ArrayList<>();
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Employee WHERE Position='Doctor'");              
            use = pst.executeQuery();                
                          
            while(use.next()){                   
                Doctor doctor = new Doctor();
                
                doctor.setEID(use.getInt(1));
                doctor.setName(use.getString(3));
                doctor.setNIC(use.getString(4));
                doctor.setUsername(use.getString(5));
                doctor.setPassword(use.getString(6));   
                             
                doctorList.add(doctor);
            }             
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return doctorList;
    }
    
    public ArrayList<Employee> loadEmplyee(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Employee WHERE Position<>'Manager'");              
            
            use = pst.executeQuery();
            
            while(use.next()){                   
                Employee employee = emfac.getEmployee(use.getString(2));                
                employee.setEID(use.getInt(1));
                employee.setName(use.getString(3));
                employee.setNIC(use.getString(4));
                employee.setUsername(use.getString(5));
                employee.setPassword(use.getString(6));         
            }             
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return employeeList;
    }
    public Employee getEmplyee(int EID){
        Employee employee=null;
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Employee WHERE EID=?");              
            pst.setInt(1, EID);
            use = pst.executeQuery();
            
            while(use.next()){                   
                employee = emfac.getEmployee(use.getString(2));                
                employee.setEID(use.getInt(1));
                employee.setName(use.getString(3));
                employee.setNIC(use.getString(4));
                employee.setUsername(use.getString(5));
                employee.setPassword(use.getString(6));         
            }             
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return employee;
    }
    public ArrayList<Date> getLabDates(int PID){
        ArrayList<Date> dateList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM LabReport WHERE PID= ?");
            pst.setInt(1,PID);
            use = pst.executeQuery();                
                            
            while(use.next()){                   
                dateList.add(use.getDate(2));
            }         
            con.close();            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return dateList;
    }
    public ArrayList<Date> getMedicalDates(int PID){
        ArrayList<Date> dateList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM MedicalReport WHERE PID= ?");
            pst.setInt(1,PID);
            use = pst.executeQuery();                
                            
            while(use.next()){                   
                dateList.add(use.getDate(2));
            }         
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return dateList;
    }
    public ArrayList<MedicalReport> getMedicalReports(int PID,Date date){
        ArrayList<MedicalReport> medicalReportList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM MedicalReport WHERE PID= ? AND Date =?");
            pst.setInt(1,PID);
            pst.setDate(2, date);
            use = pst.executeQuery();                
                            
            while(use.next()){                  
                MedicalReport medicalReport =  new MedicalReport();
                medicalReport.setPID(use.getInt(1));
                medicalReport.setDate(use.getDate(2));
                medicalReport.setDoctorID(use.getInt(3));
                medicalReport.setMedicalReportNum(use.getInt(4));
                medicalReport.setTestTypes(use.getString(5));
                medicalReport.setTreatementDescription(use.getString(6));     
                medicalReportList.add(medicalReport);
            }         
            con.close();;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return medicalReportList;
    }
    
    public MedicalReport getMedicalReport(int medicalReportNum){
        MedicalReport medicalReport = null;
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM MedicalReport WHERE MedicalReportNum = ?");
            pst.setInt(1,medicalReportNum);
           
            use = pst.executeQuery();                
                            
            if(use.next()){                  
                medicalReport =  new MedicalReport();
                medicalReport.setPID(use.getInt(1));
                medicalReport.setDate(use.getDate(2));
                medicalReport.setDoctorID(use.getInt(3));
                medicalReport.setMedicalReportNum(use.getInt(4));
                medicalReport.setTestTypes(use.getString(5));
                medicalReport.setTreatementDescription(use.getString(6));     
                
            }         
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return medicalReport;
    }
    
    public ArrayList<LabReport> getLabReports(int PID,Date date){
        ArrayList<LabReport> labReportList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM LabReport WHERE PID = ? AND Date = ?");
            pst.setInt(1,PID);
            pst.setDate(2, date);
            use = pst.executeQuery();             
            
            while(use.next()){       
                
                LabReport labReport =  new LabReport();
                labReport.setPID(use.getInt(1));
                labReport.setDate(use.getDate(2));
                labReport.setLabReportNo(use.getInt(3));
                labReport.setTestType(use.getInt(4));
                labReport.setLabTechID(use.getInt(5));          
                
                int index = 6;
                
                for(int i = 0;(i+index)<22;i++){               
                    String data = use.getString(index++);
                    if(data!=null)
                        labReport.addDataToTheList(data);
                }                
                labReportList.add(labReport);
            }         
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return labReportList;
    }
    
    public LabReport getLabReport(int labReportNo){
        LabReport labReport = null;
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM LabReport WHERE LabReportNo = ?");
            pst.setInt(1,labReportNo);
            
            use = pst.executeQuery();             
            
            if(use.next()){       
                
                labReport =  new LabReport();
                labReport.setPID(use.getInt(1));
                labReport.setDate(use.getDate(2));
                labReport.setLabReportNo(use.getInt(3));
                labReport.setTestType(use.getInt(4));
                labReport.setLabTechID(use.getInt(5));          
                
                int index = 6;
                
                for(int i = 0;(i+index)<22;i++){               
                    String data = use.getString(index++);
                    if(data!=null)
                        labReport.addDataToTheList(data);
                }                
               
            }         
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return labReport;
    }
     public LabReport getLastLabReport(){
        LabReport labReport = null;
        int labReportNo = getLastLabReportNo();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM LabReport WHERE LabReportNo = ?");
            
            pst.setInt(1,labReportNo);            
            use = pst.executeQuery();      
            if(use.next()){       
                
                labReport =  new LabReport();
                labReport.setPID(use.getInt(1));
                labReport.setDate(use.getDate(2));
                labReport.setLabReportNo(use.getInt(3));
                labReport.setTestType(use.getInt(4));
                labReport.setLabTechID(use.getInt(5));          
                
                int index = 6;
                
                for(int i = 0;(i+index)<22;i++){               
                    String data = use.getString(index++);
                    if(data!=null)
                        labReport.addDataToTheList(data);
                }                
               
            }         
            con.close();
        }catch(SQLException ex){
            System.out.println("ee"+ex);
            
        }
        return labReport;
    }
    public int getLastPID(){
        int pid = -1;
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT MAX(PID) FROM PatientFile");
            use = pst.executeQuery();   
            if(use.next())
                pid = use.getInt(1);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return pid;
    }
    public int getLastLabReportNo(){
        int labReportNo = -1;
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT MAX(LabReportNo) FROM LabReport");
            use = pst.executeQuery();  
            
            if(use.next())
                labReportNo = use.getInt(1);
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return labReportNo;
    }
     
    /*
     * Search Data...........................................................................
     */
     public ArrayList<Doctor> searchDoctors(String name){
        ArrayList<Doctor> doctorList = new ArrayList<>();
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Employee WHERE Position='Doctor' AND Name LIKE '%"+name+"%'");              
            use = pst.executeQuery();                
            System.out.println(pst);              
            while(use.next()){                   
                Doctor doctor = new Doctor();
                
                doctor.setEID(use.getInt(1));
                doctor.setName(use.getString(3));
                doctor.setNIC(use.getString(4));
                doctor.setUsername(use.getString(5));
                doctor.setPassword(use.getString(6));   
                             
                doctorList.add(doctor);
            }             
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return doctorList;
    } 
    public ArrayList<Patient> searchPatients(String name,String NIC){
        ArrayList<Patient> patientList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM PatientFile WHERE FullName LIKE '%"+name+"%' OR NIC=?");
            
            pst.setString(1, NIC);
            use = pst.executeQuery();                
            System.out.println(pst);
            while(use.next()){     
                
                Patient patient = new Patient();               
                patient.setPID(use.getInt(1));
                patient.setFirstName(use.getString(2));
                patient.setFullName(use.getString(3));
                patient.setLastName(use.getString(4));
                patient.setDateOfBirth(use.getDate(5));
                patient.setGender(use.getString(6));
                patient.setAddress(use.getString(7));
                patient.setNIC(use.getString(8));
                patient.setPatientContactNo(use.getInt(9));
                patient.setNameOfTheGuardian(use.getString(10));
                patient.setGuardianContactNo(use.getInt(11));
                patient.setBloodGroup(use.getString(12));
                patient.setAllergies(use.getString(13));   
                
                patientList.add(patient);
            }    
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return patientList;
    }
    public ArrayList<Patient> searchPatientsByNIC(String NIC){
        ArrayList<Patient> patientList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM PatientFile WHERE NIC=?");
            
            pst.setString(1, NIC);
            use = pst.executeQuery();                
            System.out.println(pst);
            while(use.next()){     
                
                Patient patient = new Patient();               
                patient.setPID(use.getInt(1));
                patient.setFirstName(use.getString(2));
                patient.setFullName(use.getString(3));
                patient.setLastName(use.getString(4));
                patient.setDateOfBirth(use.getDate(5));
                patient.setGender(use.getString(6));
                patient.setAddress(use.getString(7));
                patient.setNIC(use.getString(8));
                patient.setPatientContactNo(use.getInt(9));
                patient.setNameOfTheGuardian(use.getString(10));
                patient.setGuardianContactNo(use.getInt(11));
                patient.setBloodGroup(use.getString(12));
                patient.setAllergies(use.getString(13));   
                
                patientList.add(patient);
            }    
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return patientList;
    }
    /*
     * Delete Data............................................................................
     */
    
    public boolean deleteEmployee(int EID){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("DELETE FROM Employee WHERE EID=?");
            pst.setInt(1, EID);

            pst.executeUpdate();
            con.close();
             
            result = true;
        }catch(  SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println(ex);
        }
           return result;
    }
    /*
     * check Data.....................................................................
     */
     public Employee checkEmplyee(String uname,String pword){
        Employee employee=null;
        try{
            con = DriverManager.getConnection(url, user, password);               
            //pst = con.prepareStatement("SELECT * FROM Employee WHERE UserName = ? AND Password=MD5(?)"); 
            pst = con.prepareStatement("SELECT * FROM Employee WHERE UserName = ? AND Password=?");   
            pst.setString(1,uname);
            pst.setString(2,pword);
            use = pst.executeQuery();
            
            while(use.next()){                   
                employee = emfac.getEmployee(use.getString(2));                
                employee.setEID(use.getInt(1));
                employee.setName(use.getString(3));
                employee.setNIC(use.getString(4));
                employee.setUsername(use.getString(5));
                employee.setPassword(use.getString(6));         
            }             
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return employee;
    }
}
