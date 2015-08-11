package gui.login;


import Domain.Employee;
import gui.dataEntryClerk.DataEntryGUI;
import gui.doctor.DocGUI;
import gui.lab.LabReportGUI;
import gui.reception.ReceptionGUI;
import javax.swing.JFrame;


public class InterFaceFactory {

    public JFrame getInterFace(Employee employee){
       
        switch(employee.getPosition()){
            case "Doctor":
                return new DocGUI();
            case "Reception":
                return new ReceptionGUI();
            case "DataEntryClerck":
                return new DataEntryGUI();
            case "LabTechniciant":
                return new LabReportGUI();
            default:
                return null;
        }
       
    }

}
