package Domain;
import java.sql.Date;

public class Patient {
    private int PID;
    private String firstName;
    private String lastName;
    private String fullName;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String NIC;
    private int patientContactNo;
    private String nameOfTheGuardian;
    private int guardianCinatactNo;
    private String bloodGroup;
    private String Allergies;

    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @return the date
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @return the patientContactNo
     */
    public int getPatientContactNo() {
        return patientContactNo;
    }

    /**
     * @return the nameOfTheGuardian
     */
    public String getNameOfTheGuardian() {
        return nameOfTheGuardian;
    }

    /**
     * @return the guardianCinatactNo
     */
    public int getGuardianCinatactNo() {
        return guardianCinatactNo;
    }

    /**
     * @return the bloodGroup
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * @return the Allergies
     */
    public String getAllergies() {
        return Allergies;
    }

    
    
}
