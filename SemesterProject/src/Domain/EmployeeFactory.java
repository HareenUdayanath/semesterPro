package Domain;

public class EmployeeFactory {

    public Employee getEmployee(String position){
        switch (position) {
            case "Doctor":
                return new Doctor();
            case "Reception":
                return new Reception();
            case "DataEntryClerck":
                return new DataEntryClerk();
            case "LabTechniciant":
                return new LabTechniciant();
            default:
                return null;
        }
            
    }
    
}
