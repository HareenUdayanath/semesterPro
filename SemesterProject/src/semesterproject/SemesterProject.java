package semesterproject;


import DataBase.*;
import Domain.*;
import gui.lab.LabReportGUI;
import gui.login.ChangeLogInSetting;
import gui.login.LoginFace;
import java.sql.Date;
import java.util.ArrayList;
import gui.manager.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemesterProject {

   
    public static void main(String[] args) {
        
        DBOperations ad = DBOperations.getInstace();
       /*LabReportGUI l=new LabReportGUI();
        l.setVisible(true);*/
        
        // Check for add patient
        /*Patient patient = new Patient();
        //patient.setPID(0);
        patient.setFirstName("Gayan");
        patient.setFullName("Gayan Perera");
        patient.setLastName("Perera");
        patient.setDateOfBirth(new Date(1992,02,03));
        patient.setGender("M");
        patient.setAddress("ABC");
        patient.setNIC("123456589V");
        //patient.setPatientContactNo(0412222222);
        patient.setNameOfTheGuardian("Akila");
        patient.setGuardianContactNo(0412222222);
        patient.setBloodGroup("B+");
        patient.setAllergies("None");        
        try {
            ad.addPatient(patient);
        } catch (SQLException ex) {
            System.out.println(ex);
        }*/
            //Check for add medical report
            /*
            MedicalReport mr = new MedicalReport();
            mr.setPID(1);
            mr.setDate(new Date(2001,02,03));
            mr.setDoctorID(0);
            mr.setMedicalReportNum(0);
            mr.setTestTypes("A,B");
            mr.setTreatmentDescription("ABC");
            ad.addMedicalReport(mr);*/
          
           //Check for LabReport
            
            /*LabReport lr = new LabReport();
            lr.setPID(1);
            lr.setDate(new Date(1992,02,03));
            lr.setLabReportNo(1);
            lr.setTestType(1);
            lr.setLabTechID(1);
            
            for(int i=0;i<3;i++){
                lr.addDataToTheList("A"+i);
            }
            ad.addLabReport(lr);*/
            
          /* Doctor e = new Doctor();
            e.setEID(0);
           
            e.setName("Pasan");
            e.setNIC("123456789V");
            e.setUsername("S");
            e.setPassword("P");
            ad.addEmployee(e);*/
          
            /*ChronicConditionsReport cr = new ChronicConditionsReport();
            cr.setPID(1);
            cr.setChronicConditionsCol("AAA");
            cr.setHeartDisease(false);
            cr.setStroke(true);
            cr.setCancer(true);
            cr.setDiabetes(true);
            cr.setObesity(true);
            cr.setArthritis(true);
            ad.addChronicConditionsReport(cr);*/
            /*
            ArrayList<Patient> patientList = ad.loadPatients();        
            for(Patient p:patientList){
                
                System.out.println(p.getPID());
                System.out.println(p.getFirstName());
                System.out.println(p.getFullName());
                System.out.println(p.getLastName());
                System.out.println(p.getDateOfBirth());
                System.out.println(p.getGender());
                System.out.println(p.getAddress());
                System.out.println(p.getNIC());
                System.out.println(p.getPatientContactNo());
                System.out.println(p.getNameOfTheGuardian());
                System.out.println(p.getGuardianCinatactNo());
                System.out.println(p.getBloodGroup());
                System.out.println(p.getAllergies());   
            }*/
            /*
            ArrayList<Doctor> doctorlist = ad.searchDoctors("Saman");
            
            for(Doctor p:doctorlist){
                
                System.out.println(p.getEID());
                System.out.println(p.getPosition());
                System.out.println(p.getName());            
                System.out.println(p.getNIC());
                System.out.println(p.getUsername());
                System.out.println(p.getPassword());              
            }
            */
            
            /*ArrayList<Date> dateList = ad.getMedicalDates(1);
            System.out.println(dateList.get(0));*/
            /*
            ArrayList<LabReport> labDataList = ad.getLabReports(1,new Date(1992,02,03));
            System.out.println(labDataList.get(0).getPID());
            for(String s:labDataList.get(0).getDataList()){
                System.out.println(s);
            }
            */
            /*Employee em = ad.getEmplyee(1);
            System.out.println(em.getName());*/
            
            //System.out.println(ad.getLastPID());
            
            /*
            ArrayList<Patient> plist = ad.searchPatients("Saman","");
            System.out.println(plist.size());
            for(Patient p:plist){
                System.out.println(p.getFullName());
            }
             */
            //ad.deleteEmployee(3);
            /*
            ManagerFace mf = new ManagerFace();
            mf.setVisible(true);*/
            /*
            Employee n = ad.checkEmplyee("S","P");
            System.out.println(n.getPosition());*/
            
            /*ArrayList<Patient>  list = ad.searchPatients("12");
            System.out.println(list.get(0).getFullName());*/
            
            /*Patient pa = ad.getPatient(1);
            pa.setDateOfBirth(Help.getDate(1992,10,5));
            ad.updatePatient(pa);*/
            
            /*MedicalReport r = ad.getMedicalReport(3);
            r.setDate(Help.getDate(1992,10,5));
            ad.updateMedicalReport(r);*/
            
           /* LabReport l = ad.getLastLabReport();
            System.out.println(l.getLabTechID());
            l.setLabTechID(2);
            ad.updateLabReport(l);*/
            /*
            LoginFace face = new LoginFace();
            face.setVisible(true);*/
            ChangeLogInSetting c = new ChangeLogInSetting();
            c.setVisible(true);
    }
}
