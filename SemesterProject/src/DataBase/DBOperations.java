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


public class DBOperations {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet use = null;
    String url = "jdbc:odbc://192.168.173.1:3306/test2";    
    String user = "hosdataadmin";
    String password = "coperativehos7456391";
   
    public boolean addPatient(Patient patient){
        boolean result = false; 
        try{               
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
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
        try{               
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
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
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO LabReport VALUES(?,?,?,?,?)");  
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
    public boolean addEmployee(Employee employee){
        boolean result = false; 
        try{               
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
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
     public boolean addChronicConditionsReport(ChronicConditionsReport chronicConditionsReport){
        boolean result = false; 
        try{               
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
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
    public boolean deleteStudent(int index){
        boolean result = false;
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("DELETE FROM Table1 WHERE Table1.index = ?");
            pst.setInt(1,index);               
            pst.executeUpdate();
            result = true;
        }catch(SQLException se){}
        return result;
    }
    public void loadStudent(ArrayList<Patient> patientList){
        try{

            con = DriverManager.getConnection(url, user, password);               
            pst = con.prepareStatement("SELECT * FROM Table1");              
            use = pst.executeQuery();                
            patientList.clear();                
            while(use.next()){                   
                Patient patient = new Patient();
               /* patient.setIndex(use.getInt(1));
                patient.setFirstName(use.getString(2));
                patient.setLastName(use.getString(3));
                patient.setAddress(use.getString(4));
                patient.setAge(use.getInt(5));*/
                patientList.add(patient);
            }               
        }catch(SQLException ex){
            System.out.println("ssss");
        }
    }
}
