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

    
}
