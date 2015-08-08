package Domain;

import java.sql.Date;
import java.util.ArrayList;


public class LabReport extends Document{
    private int PID;
    private Date date;
    private int labReportNo;
    private int testType;
    private int labTechID;
    private ArrayList<String> dataList = new ArrayList();

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
     * @return the labReportNo
     */
    public int getLabReportNo() {
        return labReportNo;
    }

    /**
     * @return the testType
     */
    public int getTestType() {
        return testType;
    }

    /**
     * @return the labTechID
     */
    public int getLabTechID() {
        return labTechID;
    }

    /**
     * @return the dataList
     */
    public ArrayList<String> getDataList() {
        return dataList;
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
     * @param labReportNo the labReportNo to set
     */
    public void setLabReportNo(int labReportNo) {
        this.labReportNo = labReportNo;
    }

    /**
     * @param testType the testType to set
     */
    public void setTestType(int testType) {
        this.testType = testType;
    }

    /**
     * @param labTechID the labTechID to set
     */
    public void setLabTechID(int labTechID) {
        this.labTechID = labTechID;
    }

    /**
     * @param dataList the dataList to set
     */
    public void setDataList(ArrayList<String> dataList) {
        this.dataList = dataList;
    }
    
    public void addDataToTheList(String data){
        this.dataList.add(data);
    }
}
