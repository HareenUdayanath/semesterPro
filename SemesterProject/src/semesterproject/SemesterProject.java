package semesterproject;

import gui.lab.LabReportGUI;
import gui.login.ChangeLogInSetting;
import gui.login.LoginFace;


public class SemesterProject {

   
    public static void main(String[] args) {
       //new ChangeLogInSetting().setVisible(true);
       //new LoginFace().setVisible(true);
        LabReportGUI l=new LabReportGUI();
        l.setVisible(true);
        l.setResizable(false);
        l.setTitle("Lab Report");
        
    }
}
