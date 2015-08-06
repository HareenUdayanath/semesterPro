package Domain;

import java.sql.Date;


public class MedicalReport {
        private int PID;    
        private Date date;
        private int doctorID;
        private int medicalReportNum;
        private String testTypes;    
        private String treatmentDescription;
       

    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

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
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(int PID) {
        this.PID = PID;
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
    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    
}
