package Domain;

import java.sql.Date;


public class MedicalReport extends Document{
   
    private Date date;
    private int doctorID;
    private int medicalReportNum;
    private String testTypes;    
    private String treatementDescription;
       


    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the doctorID
     */
    public int getDoctorID() {
        return doctorID;
    }

    /**
     * @return the medicalReportNum
     */
    public int getMedicalReportNum() {
        return medicalReportNum;
    }

    /**
     * @return the testTypes
     */
    public String getTestTypes() {
        return testTypes;
    }

    /**
     * @return the treatmentDescription
     */
    public String getTreatementDescription() {
        return treatementDescription;
    }

  
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @param doctorID the doctorID to set
     */
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    /**
     * @param medicalReportNum the medicalReportNum to set
     */
    public void setMedicalReportNum(int medicalReportNum) {
        this.medicalReportNum = medicalReportNum;
    }

    /**
     * @param testTypes the testTypes to set
     */
    public void setTestTypes(String testTypes) {
        this.testTypes = testTypes;
    }

    /**
     * @param treatmentDescription the treatmentDescription to set
     */
    public void setTreatementDescription(String treatmentDescription) {
        this.treatementDescription = treatmentDescription;
    }

    
}
