package gui.login;


import Domain.Doctor;
import Domain.Employee;
import gui.dataEntryClerk.DataEntryGUI;
import gui.doctor.DocGUI;
import gui.lab.LabReportGUI;
import gui.manager.ManagerFace;
import gui.reception.ReceptionGUI;
import javax.swing.JFrame;


public class InterFaceFactory {

    public JFrame getInterFace(Employee employee){
       
        switch(employee.getPosition()){
            case "Manager":
                return new ManagerFace();
            case "Doctor":
                return new DocGUI((Doctor)employee);
            case "Reception":
                return new ReceptionGUI();
            case "DataEntryClerk":
                return new DataEntryGUI();
            case "LabTechniciant":
                return new LabReportGUI();
            default:
                return null;
        }
       
    }

}
