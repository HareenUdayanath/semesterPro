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
    private int guardianContactNo;
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
    public int getGuardianContactNo() {
        return guardianContactNo;
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

    /**
     * @param PID the PID to set
     */
    public void setPID(int PID) {
        this.PID = PID;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @param patientContactNo the patientContactNo to set
     */
    public void setPatientContactNo(int patientContactNo) {
        this.patientContactNo = patientContactNo;
    }

    /**
     * @param nameOfTheGuardian the nameOfTheGuardian to set
     */
    public void setNameOfTheGuardian(String nameOfTheGuardian) {
        this.nameOfTheGuardian = nameOfTheGuardian;
    }

    /**
     * @param guardianCinatactNo the guardianCinatactNo to set
     */
    public void setGuardianContactNo(int guardianCinatactNo) {
        this.guardianContactNo = guardianCinatactNo;
    }

    /**
     * @param bloodGroup the bloodGroup to set
     */
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    /**
     * @param Allergies the Allergies to set
     */
    public void setAllergies(String Allergies) {
        this.Allergies = Allergies;
    }

    
    
}
