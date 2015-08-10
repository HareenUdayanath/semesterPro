package gui.login;

import Domain.DataEntryClerk;
import Domain.Doctor;
import Domain.Employee;
import Domain.LabTechniciant;
import Domain.Reception;
import gui.doctor.DocGUI;
import gui.lab.LabReportGUI;
import gui.reception.ReceptionFace;
import javax.swing.JFrame;


public class InterFaceFactory {

    public JFrame getInterFace(Employee employee){
       
        switch(employee.getPosition()){
            case "Doctor":
                return new DocGUI();
            case "Reception":
                return new ReceptionFace();
            //case "DataEntryClerck":
              //  return new DataEntryClerkFace();
            case "LabTechniciant":
                return new LabReportGUI();
            default:
                return null;
        }
       
    }

}
