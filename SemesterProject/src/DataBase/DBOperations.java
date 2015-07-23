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
            pst = con.prepareStatement("INSERT INTO Table1 VALUES(?,?,?,?,?)");               

            //pst.setInt(5,patient.getAge());
            
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
    public boolean addMedicalReport(MedicalReport patient){
        boolean result = false; 
        try{               
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            con = DriverManager.getConnection(url, user, password);              
            pst = con.prepareStatement("INSERT INTO Table1 VALUES(?,?,?,?,?)");               

            //pst.setInt(5,patient.getAge());
            
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
