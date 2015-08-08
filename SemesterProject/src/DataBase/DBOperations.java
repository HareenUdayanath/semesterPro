package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Domain.*;
import java.sql.Date;


public class DBOperations {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet use = null;
    EmployeeFactory emfac = null;
    //String url = "jdbc:odbc://192.168.173.1:3306/test2";    
    //String url = "jdbc:mysql://192.168.173.1:3306/SemesterProject";
    String url = "jdbc:mysql://localhost:3306/SemesterProject";
    String user = "hosdataadmin";
    String password = "coperativehos7456391";
    
    public DBOperations(){
        this.emfac = new EmployeeFactory();
    }
   
    public boolean addPatient(Patient patient){
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
            pst.setInt(11, patient.getGuardianCinatactNo());
            pst.setString(12, patient.getBloodGroup());
            pst.setString(13, patient.getAllergies());
            
            pst.executeUpdate();

            result = true;
        }catch(SQLException ex){
            System.out.println("SQLException");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
           return result;
    }
    public boolean addMedicalReport(MedicalReport medicalReport){
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
            pst.setString(6, medicalReport.getTreatmentDescription());            
           
            pst.executeUpdate();
            
            result = true;
        }catch(SQLException ex){
            System.out.println("dd");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
           return result;
    }
    public boolean addLabReport(LabReport labReport){
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

            result = true;
        }catch(SQLException ex){
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
           return result;
    }
    public boolean addEmployee(Employee employee){
        boolean result = false; 
        try{               
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?,?)");              

            pst.setInt(1,employee.getEID());            
            pst.setString(2, employee.getPosition());
            pst.setString(3,employee.getName());
            pst.setString(4, employee.getNIC());
            pst.setString(5, employee.getUsername());
            pst.setString(6, employee.getPassword());           
            pst.executeUpdate();

            result = true;
        }catch(SQLException ex){
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
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

            result = true;
        }catch(SQLException ex){
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
           return result;
    }
   
    public void loadPatients(ArrayList<Patient> patientList){
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM PatientFile");              
            use = pst.executeQuery();                
            patientList.clear();                
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
                patient.setGuardianCinatactNo(use.getInt(11));
                patient.setBloodGroup(use.getString(12));
                patient.setAllergies(use.getString(13));              
                patientList.add(patient);
            }               
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void loadDoctors(ArrayList<Employee> doctorList){
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Employee WHERE Position='Doctor'");              
            use = pst.executeQuery();                
            doctorList.clear();                
            while(use.next()){                   
                Employee doctor = new Doctor();
                
                doctor.setEID(use.getInt(1));
                doctor.setName(use.getString(3));
                doctor.setNIC(use.getString(4));
                doctor.setUsername(use.getString(5));
                doctor.setPassword(use.getString(6));   
                             
                doctorList.add(doctor);
            }               
        }catch(SQLException ex){
            System.out.println(ex);
        }
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
            return dateList;
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
            return dateList;
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
                medicalReport.setTreatmentDescription(use.getString(6));     
                medicalReportList.add(medicalReport);
            }         
            return medicalReportList;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return medicalReportList;
    }
    public ArrayList<LabReport> getLabReports(int PID,Date date){
        ArrayList<LabReport> labReportList = new ArrayList<>();
        try{
            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM LabReport WHERE PID= ? AND Date =?");
            pst.setInt(1,PID);
            pst.setDate(2, date);
            use = pst.executeQuery();                
            System.out.println("rr");
            while(use.next()){       
                System.out.println("rraa");
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
            return labReportList;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return labReportList;
    }
}
