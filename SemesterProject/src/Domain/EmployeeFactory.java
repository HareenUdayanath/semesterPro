package Domain;

public class EmployeeFactory {

    public Employee getEmployee(String position){
        if(position=="Doctor")
            return new Doctor();
        else if(position=="Reception")
            return new Reception();
        else if(position=="DataEntryClerck")
            return new DataEntryClerk();
        else if(position=="LabTechniciant")
            return new LabTechniciant();
        else
            return null;
            
    }
    
}
